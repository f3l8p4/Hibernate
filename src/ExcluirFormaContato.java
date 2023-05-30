import java.math.BigInteger;

import javax.persistence.EntityManager;

import br.com.empresa.dao.HibernateUtil;
import br.com.empresa.vo.ContatoVO;
import br.com.empresa.vo.FormaContatoVO;

public class ExcluirFormaContato {
	public void excluirFormaContato(BigInteger id) {
		EntityManager em = HibernateUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			FormaContatoVO contato = em.find(FormaContatoVO.class, id);
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
