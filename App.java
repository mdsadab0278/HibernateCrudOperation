package in.sp.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.sp.entities.User;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	User user1 =new User();
    	user1.setId(4);
    	user1.setName("Kohli");
    	user1.setEmail("danis0@gmail.com");
    	user1.setPassword("Anushka0987");
    	user1.setGender("FeMale");
    	user1.setCity("Banglore");
    	
    	
        Configuration cfg=new Configuration();
        cfg.configure("/in/sp/config/hibernate.cfg.xml");
        
        
        SessionFactory sessionFactory =cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
//       
//        -----------insert operation------------
//        try {
//        	session.save(user1);
//        	transaction.commit();
//        	System.out.println("Users Data Added Successfully.");
//        }
//        catch(Exception e) {
//        	transaction.rollback();
//        	e.printStackTrace();
//        	System.out.println("Users Data Not  Added Due To Some Error.");
//        }
// 
//     ---------------------select operation---------------------
        
//        try {
//        	User user=session.get(User.class, 1L);
//        	if(user !=null) {
//            	System.out.println(user.getId());
//            	System.out.println(user.getName());
//            	System.out.println(user.getEmail());
//            	System.out.println(user.getPassword());
//            	System.out.println(user.getGender());
//            	System.out.println(user.getCity());
//        	}
//        	else
//        	{
//        		System.out.println("User Not Found");
//        	}
//        }catch(Exception e) {
//        	e.printStackTrace();
//        }
        
        
        
        
// ---------------------Update Operation------------------------------        
        
       
//        
//        try {
//        	
//        	User user=session.get(User.class, 1L);
//        	user.setCity("Ranchi");
//        	
//        	session.saveOrUpdate(user);
//        	transaction.commit();
//        	System.out.println("Users Data Updated Successfully.");
//        }
//        catch(Exception e) {
//        	transaction.rollback();
//        	e.printStackTrace();
//        	System.out.println("Users Data Not Updated Due To Some Error.");
//        }
//        
        
        
//   ------------------------Delete Operation--------------------------------
        
        try {
        	
        	User user=new User();
        	user.setId(2L);
        	
        	
        	session.delete(user);
        	transaction.commit();
        	System.out.println("Users Data Deleted Successfully.");
        }
        catch(Exception e) {
        	transaction.rollback();
        	e.printStackTrace();
        	System.out.println("Users Data Not  Deleted Due To Some Error.");
        }
        
        
    }
}
