import com.sina.dao.ItemsDao;
import com.sina.domain.Items;
import com.sina.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao bean = app.getBean(ItemsDao.class);
        Items byId = bean.findById(1);
        System.out.println(byId);
    }

    @Test
    public void test2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService bean = app.getBean(ItemsService.class);
        Items byId = bean.findById(1);
        System.out.println(byId);
    }
}
