package springcore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student s =(Student) context.getBean("student1");
        System.out.println("Hello World");
        System.out.println(s);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
