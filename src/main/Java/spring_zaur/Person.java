package spring_zaur;

public class Person {
    private Pet pet;

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    public Person (Pet pet) {
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("constructor");
    }

        public void setPet(Pet pet) {
        System.out.println("set pet");
        this.pet = pet;
    }

    public void callYouPet() {
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }
}
