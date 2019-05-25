import com.hzq.IDemoService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.ReferenceBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerFirst {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer-first.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        IDemoService demoService = (IDemoService) context.getBean("demoService");
        System.out.println(demoService.sayHello("from ConsumerFirst."));
        System.out.println("ConsumerFirst 服务已经调用...");
        System.in.read();
    }
}
