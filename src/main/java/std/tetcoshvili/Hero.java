package std.tetcoshvili;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

import static org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS;

@Component
//@Scope("prototype")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=TARGET_CLASS)
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(value = "prototype")
public class Hero {

    int id;
    private String name;

    public Hero() {

        this.name = "Sven";


        Random random = new Random();
        id = random.nextInt(1000);
        name = "Sven";
        System.out.println(this.id); // Какой id созданного объекта
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
