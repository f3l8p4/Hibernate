import java.math.BigInteger;

import javax.persistence.EntityManager;

import br.com.empresa.dao.HibernateUtil;
import br.com.empresa.vo.ContatoVO;

public class ConsultarContato {
    public void consultarContatoPorId(BigInteger id) {
        EntityManager em = HibernateUtil.getEntityManager();
        ContatoVO contato = em.find(ContatoVO.class,id);

        System.out.println(contato.getEndere());
       
        em.close();
    }
}
