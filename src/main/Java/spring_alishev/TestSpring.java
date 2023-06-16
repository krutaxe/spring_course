package spring_alishev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        MusicPlayer player1 = context.getBean(MusicPlayer.class);
        MusicPlayer player2 = context.getBean(MusicPlayer.class);

        System.out.println(player1);
        System.out.println(player2);

        context.close();
    }
}
