import cn.stopyc.config.SpringConfig;
import cn.stopyc.dao.Result;
import cn.stopyc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: springmvc_05_all
 * @description:
 * @author: stop.yc
 * @create: 2022-07-19 19:51
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    public void testLogin() {
        Result<Integer> login = userService.login("王五", "e10adc3949ba59abbe56e057f20f883e");

        System.out.println(login);
    }

}
