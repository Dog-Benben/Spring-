import com.spring.config.SpringConfig;
import com.spring.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Orange
 * @create 2021-08-31  23:35
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的calss对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
        int i=10;
//        int n=i++%5;
        int m=++i%5;
        System.out.println(i);
//        System.out.println(n);
        System.out.println(m);
    }

}
