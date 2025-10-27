package std.tetcoshvili;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HeroSingleton {

    private final Hero hero;

    @Autowired
    public HeroSingleton(Hero hero) {
        this.hero = hero;
        System.out.println(this.hero.getId());
    }

}