package spring_dmdev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_alishev.ClassicalMusic;
import spring_alishev.MusicPlayer;
import spring_alishev.RapMusic;
import spring_dmdev.database.pool.ConnectionPool;
import spring_dmdev.database.repository.CompanyRepository;
import spring_dmdev.database.repository.UserRepository;
import spring_dmdev.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        var bin = context.getBean("pool1", ConnectionPool.class);

        System.out.println(bin.getProperties());

    }
}
