package br.com.empresa.vo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="forcon")
public class FormaContatoVO implements Serializable {
    private static final long serialVersionUID = 1183551324637211668L;

    @Id
    @Basic(optional = false)
    @Column(name="id",nullable=false)
    @SequenceGenerator(name="sq_forcon",sequenceName = "sq_forcon", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "sq_forcon")
    private BigInteger id;

    @Basic(optional = true)
    @NotNull
    @Size(max=1)
    @Column(name="tipcon",nullable = false,length=1)
    private String tipcon;

    @Basic(optional = true)
    @NotNull
    @Size(max=2)
    @Column(name="dddcon",nullable = false,length=2)
    private String dddcon;

    @Basic(optional = true)
    @NotNull
    @Size(max=10)
    @Column(name="numcon",nullable = false,length=10)
    private String nomcon;

    @Basic(optional = true)
    @NotNull
    @Size(min=1,max=400)
    @Column(name="emacon",nullable = false,length=100)
    private String emacon;



    @JoinColumn(name = "contat",referencedColumnName = "id",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private ContatoVO contat;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getTipcon() {
        return tipcon;
    }

    public void setTipcon(String tipcon) {
        this.tipcon = tipcon;
    }

    public String getDddcon() {
        return dddcon;
    }

    public void setDddcon(String dddcon) {
        this.dddcon = dddcon;
    }

    public String getNomcon() {
        return nomcon;
    }

    public void setNomcon(String nomcon) {
        this.nomcon = nomcon;
    }

    public String getEmacon() {
        return emacon;
    }

    public void setEmacon(String emacon) {
        this.emacon = emacon;
    }

    public ContatoVO getContat() {
        return contat;
    }

    public void setContat(ContatoVO contat) {
        this.contat = contat;
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
        FormaContatoVO other = (FormaContatoVO) obj;
        return Objects.equals(id, other.id);
    }

    public FormaContatoVO(BigInteger id) {
        super();
        this.id = id;
    }

    public FormaContatoVO() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "FormaContato [id=" + id + "]";
    }


}
