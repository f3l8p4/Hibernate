import java.math.BigInteger;

import javax.persistence.*;
import br.com.empresa.dao.*;
import br.com.empresa.vo.*;
public class ExcluirContato {
	public void excluirContato(BigInteger id) {
		EntityManager em = HibernateUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			ContatoVO contato = em.find(ContatoVO.class, id);
			em.remove(contato);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		
	}
}
