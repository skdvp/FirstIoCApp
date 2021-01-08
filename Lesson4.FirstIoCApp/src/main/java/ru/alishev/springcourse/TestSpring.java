package ru.alishev.springcourse;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
