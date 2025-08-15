import com.xs.dao.UserDao;
import com.xs.service.IUserService;
import com.xs.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void tset() {
        UserService userService = new UserService();

        //依赖spring注入，需要从spring容器中获取UserService
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
        IUserService service = ioc.getBean(IUserService.class);
        service.getUser();
    }
}
