import com.spring.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Orange
 * @create 2021-08-21  12:24
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring上下文的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //我们的对象现在都在spring中的管理了，我们要使用，之间去里面取出来就可以！
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);
    }


}
