import java.math.BigInteger;
import javax.persistence.*;
import br.com.empresa.vo.*;
import br.com.empresa.dao.*;
public class AtualizarContato {
	public void editarContato(BigInteger id,String nomecon) {
		EntityManager em = HibernateUtil.getEntityManager();
		
		try {
			em.getTransaction().begin();
			ContatoVO contato = em.find(ContatoVO.class,id);
			contato.setNomcon(nomecon);
			em.merge(contato);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
	}
}
