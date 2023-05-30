import java.math.BigInteger;

import javax.persistence.EntityManager;

import br.com.empresa.dao.HibernateUtil;
import br.com.empresa.vo.ContatoVO;
import br.com.empresa.vo.FormaContatoVO;

public class ConsultarFormaContato {
    public void consultarFormaContatoPorId(BigInteger id) {
        EntityManager em = HibernateUtil.getEntityManager();
        FormaContatoVO contato = em.find(FormaContatoVO.class,id);

        System.out.println(contato.getEmacon());
       
        em.close();
    }
}
