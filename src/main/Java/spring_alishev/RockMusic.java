package spring_alishev;

public class RockMusic implements Music {
    public RockMusic() {
        System.out.println("rock constructor");
    }

    public void init() {
        System.out.println("rock init");
    }

    public void destroy() {
        System.out.println("rock destroy");
    }
    @Override
    public String getSong() {
        return "Последний герой";
    }
}
