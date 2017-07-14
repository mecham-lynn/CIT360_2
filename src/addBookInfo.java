
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class addBookInfo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Player addBook = new Book();
        addBook.setTitle("Harry Potter and the Philosophers Stone");
        addBook.setDewey(237);
        addBook.setAuthor("J.K Rowling");
        addBook.setGenre("Fantasy");
        addBook.setCost(24);

        session.save(addBook);
        transaction.commit();

        System.out.println("Book added successfully");

    }
}