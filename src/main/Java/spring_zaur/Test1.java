package spring_zaur;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = new Cat();
//        Pet pet = context.getBean("myPet", Pet.class);


        Person person = context.getBean("myPerson", Person.class);

        person.callYouPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
