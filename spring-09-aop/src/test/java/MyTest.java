import com.spring.service.UserService;
import com.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Orange
 * @create 2021-09-02  17:21
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意点：动态代理代理的是接口！！！不是实体类
        UserService userSerice = (UserService) context.getBean("userService");
        userSerice.add();
    }
}
