import java.math.BigInteger;

import javax.persistence.EntityManager;

import br.com.empresa.dao.HibernateUtil;
import br.com.empresa.vo.ContatoVO;
import br.com.empresa.vo.FormaContatoVO;
import br.com.empresa.vo.*;
public class CriarFormaContato {
	public void criarFormaContato(String tipcon,String ddd,String nomcon,String emacon,ContatoVO contat) {
		EntityManager em = HibernateUtil.getEntityManager();
		FormaContatoVO contato = new FormaContatoVO();
		ContatoVO contatoVO = new ContatoVO(); 
		contato.setTipcon(tipcon);
		contato.setDddcon(ddd);
		contato.setNomcon(nomcon);
		contato.setEmacon(emacon);
		contato.setContat(contat);
		
		try {
	        em.getTransaction().begin();
	        em.persist(contato);
	        em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
