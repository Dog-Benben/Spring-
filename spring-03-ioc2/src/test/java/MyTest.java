import com.spring.pojo.User;
import com.spring.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Orange
 * @create 2021-08-21  15:34
 */
public class MyTest {
    public static void main(String[] args) {
//        User user = new User();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = (User) context.getBean("user");
        user1.show();

        User user2 = (User) context.getBean("user");
        //说明了容器只有一份实例
        System.out.println(user2 == user1);//true
    }
}
