package spring;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hibernate.HibernateConfig;
import hibernate.User;

/**
 * @author 
 *
 */
public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(HibernateConfig.class);

      UserService userService = context.getBean(UserService.class);

      userService.add(new User("Vijay", "P", "vijay.p@example.com"));

      // Get Users
      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println();
      }

      context.close();
   }
}
