import com.xs.config.SpringConfig;
import com.xs.dao.UserDao;
import com.xs.service.IUserService;
import com.xs.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void tset() {
        //依赖spring注入，需要从spring容器中获取UserService
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
        IUserService service = ioc.getBean(IUserService.class);
        service.getUser();
    }

    @Test
    public void tset1() {
        //依赖spring注入，需要从spring容器中获取UserService
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        IUserService service = ioc.getBean(IUserService.class);
        service.getUser();
    }
}
