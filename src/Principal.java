import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;
import javax.persistence.*;
import br.com.empresa.dao.HibernateUtil;
import br.com.empresa.vo.ContatoVO;
import br.com.empresa.vo.FormaContatoVO;
import java.util.*;
public class Principal {

    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
        Principal p = new Principal();
        ConsultarContato metodo1 = new ConsultarContato();
        criarContato metodo2 = new criarContato();
        AtualizarContato metodo3 = new AtualizarContato();
        ExcluirContato metodo4 = new ExcluirContato();
        
        ConsultarFormaContato metodo5 = new ConsultarFormaContato();
        CriarFormaContato metodo6 = new CriarFormaContato();
        AtualizarFormaContato metodo7 = new AtualizarFormaContato();
        ExcluirFormaContato metodo8 = new ExcluirFormaContato();
        
        
            System.out.println("Informe um número");
            int metodos =leitor.nextInt();
          
        if(metodos == 1) {
        	System.out.println("Informe um número para  a consulta");
        	BigInteger id = leitor.nextBigInteger();
        	metodo1.consultarContatoPorId(id);
        }else if(metodos ==2) {
        	System.out.println("Você escolheu um novo cadastro Primeiramente escolha um nome");
        	String nomecon = leitor.next();
        	System.out.println("Informe uma data");
        	String datanas = leitor.next();
        	System.out.println("Informe um endereço");
        	String endere = leitor.next();
        	System.out.println("Informe uma observação(op)");
        	String obs = leitor.next();
        	
        	metodo2.criarContato(nomecon,datanas,endere,obs);
        }else if(metodos ==3) {
        	System.out.println("Informe qual o id do contato que voce deseja editar");
        	BigInteger id = leitor.nextBigInteger();
        	
        	System.out.println("novo nome");
        	String nomecon = leitor.next();
        	metodo3.editarContato(id,nomecon);
        }else if(metodos ==4) {
        	System.out.println("Informe um id que deseja excluir");
        	BigInteger id = leitor.nextBigInteger();
        	metodo4.excluirContato(id);
        }else if(metodos == 5) {
        	System.out.println("Informe o id do seu tipo de contato");
        	BigInteger id = leitor.nextBigInteger();
        	metodo5.consultarFormaContatoPorId(id);
        }else if(metodos == 6) {
        	ContatoVO contat = new ContatoVO();
        	System.out.println("Informe o tipo de contato");
        	String tipcon = leitor.next();
        	System.out.println("Informe o ddd do número");
        	String ddd = leitor.next();
        	System.out.println("Informe o numero do contato");
        	String nomcon = leitor.next();
        	System.out.println("Informe o email do contato");
        	String emacon = leitor.next();
        	System.out.println("Informe o id do contato");
        	BigInteger id = leitor.nextBigInteger();
        	contat.setId(id);
        	
        	metodo6.criarFormaContato(tipcon,ddd,nomcon,emacon,contat);
        }else if(metodos ==7) {
        	System.out.println("Informe um id");
        	BigInteger id = leitor.nextBigInteger();
        	System.out.println("Informe um número para ser mudado");
        	String nomcon = leitor.next();
        	metodo7.atualizarFormaContato(id, nomcon);
        }else if(metodos ==8) {
        	System.out.println("Informe um id para ser excluido");
        	BigInteger id = leitor.nextBigInteger();
        	metodo8.excluirFormaContato(id);
        }
    }

 
}

