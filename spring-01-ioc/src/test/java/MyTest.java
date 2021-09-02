import com.spring.dao.UserDaoImpl;
import com.spring.dao.UserDaoMysqlImpl;
import com.spring.dao.UserDaoOracleImpl;
import com.spring.service.UserService;
import com.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Orange
 * @create 2021-08-20  20:55
 *
 * 在我们的业务中，用户需求可能影响到我们原来代码，我们需要根据用户的需求去修改源代码！
 * 例如要求读取不同数据，使用到mysql或oracle读取是数据就要改变UserServiceImpl的代码！
 * 如果代码量十分打，修改一次的成本代价十分昂贵！
 *
 * 我们巧妙使用一个Set接口实现，直接不要改变源代码！
 */
public class MyTest {
    public static void main(String[] args) {
        /**
         这是使用原生的
        //用户实际调用的是业务层，dao层他们不需要接触！
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDaoImpl());
//        ((UserServiceImpl)userService).setUserDao(new UserDaoMysqlImpl());
//        ((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());

        userService.getUSer();
*/
        //使用spring
        //获取ApplicationContext:拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beam.xml");
        //容器在手，天下
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUSer();
    }
}
