package br.com.empresa.vo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="contat")

public class ContatoVO implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 950830301425656073L;

	@Id
    @Basic(optional = false)
    @Column(name="id",nullable=false)
    @SequenceGenerator(name="sq_contat",sequenceName = "sq_contat", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sq_contat")
    private BigInteger id;

    @Basic(optional = false)
    @NotNull
    @Size(min=1,max=200)
    @Column(name="nomcon",nullable = false,length=100)
    private String nomcon;

    @Basic(optional = false)
    @Column(name = "datnas", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dathis;

    @Basic(optional = true)
    @NotNull
    @Size(min=1,max=500)
    @Column(name="endere",nullable = false,length=100)
    private String endere;

    @Basic(optional = false)
    @Column(name = "observ", nullable = false, columnDefinition="TEXT")
    private String observ;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNomcon() {
        return nomcon;
    }

    public void setNomcon(String nomcon) {
        this.nomcon = nomcon;
    }

    public Date getDathis() {
        return dathis;
    }

    public void setDathis(Date dathis) {
        this.dathis = dathis;
    }

    public String getEndere() {
        return endere;
    }

    public void setEndere(String endere) {
        this.endere = endere;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public ContatoVO() {
        super();
    }

    @Override
    public String toString() {
        return "ContatoVO [id=" + id + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContatoVO other = (ContatoVO) obj;
        return Objects.equals(id, other.id);
    }
}
