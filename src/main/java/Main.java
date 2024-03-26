import org.haut.bean.Animal;
import org.haut.bean.Person;
import org.haut.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("haut.xml"
        );
//获取名为 employee 的 Bean
        //Student student = context.getBean("student", Student.class);
        //Person person = context.getBean("person", Person.class);
        Animal animal =context.getBean("animal", Animal.class);
//通过⽇志打印信息
        System.out.println(animal.toString());
    }
}
