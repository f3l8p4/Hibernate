import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;

import br.com.empresa.dao.HibernateUtil;
import br.com.empresa.vo.ContatoVO;

public class criarContato {
	public void criarContato(String nomecon,String datanas,String endere,String obs) {
	    EntityManager em = HibernateUtil.getEntityManager();
	    ContatoVO contato = new ContatoVO();
	    
	    String formatoString = "dd/MM/yyyy";
	    SimpleDateFormat formato = new SimpleDateFormat(formatoString);

	    Date data = null;
		// Converte a String para Date
		try {
			data = formato.parse(datanas);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	   
	    contato.setNomcon(nomecon);
	    contato.setDathis(data);
	    contato.setObserv(obs);
	    contato.setEndere(endere);
	    try {
	        em.getTransaction().begin();
	        em.persist(contato);
	        em.getTransaction().commit();
	    }catch(Exception E) {
	        E.printStackTrace();
	        em.getTransaction().rollback();
	    }
	}
}

