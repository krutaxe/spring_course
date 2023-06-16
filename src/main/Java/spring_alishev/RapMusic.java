package spring_alishev;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class RapMusic implements Music {
    private final List<String> list = List.of("реп1", "реп2", "реп3");
    @Override
    public String getSong() {
        return list.get(new Random().nextInt(1, 3));
    }
}
