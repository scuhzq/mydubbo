import com.hzq.IDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerSecond {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer-second.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        IDemoService demoService = (IDemoService) context.getBean("demoService");
        System.out.println(demoService.sayHello("from ConsumerSecond."));
        System.out.println("ConsumerSecond 服务已经调用...");
        System.in.read();
    }
}
