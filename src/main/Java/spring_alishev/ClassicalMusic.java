package spring_alishev;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private final List<String> list = List.of("классика1", "классика2", "классика3");
    @Override
    public String getSong() {
        return list.get(new Random().nextInt(0, 2));
    }
}
