import Model.Departamento;
import Model.Funcionario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        //Aponta para o local onde se encontram as configurações feitas no hibernate.cfg.xml
        Configuration cfg = new Configuration().configure("/hibernate.cfg.xml");

        //Cria uma factory
        SessionFactory factory = cfg.buildSessionFactory();

        //Cria uma nova session
        Session session = factory.openSession();

        //Inicia uma nova transaction
        session.beginTransaction();

        //Inserindo departamento
        Departamento departamento = new Departamento();
        departamento.setNome("Suporte");

        session.persist(departamento);
        session.getTransaction().commit();
        //encerrando conexão
        session.close();
        factory.close();
    }
}
