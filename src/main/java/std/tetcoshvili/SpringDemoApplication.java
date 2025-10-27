package std.tetcoshvili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.logging.Logger;

@SpringBootApplication
public class SpringDemoApplication {
	private static final Logger log = Logger.getLogger(SpringDemoApplication.class.getName());
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDemoApplication.class, args);

		String[] beanDefinitionNames = run.getBeanDefinitionNames();

		log.info(Arrays.toString(beanDefinitionNames));
		log.info(String.valueOf(beanDefinitionNames.length));

		Hero hero = (Hero) run.getBean("hero");
		Hero hero2 = (Hero) run.getBean("hero");
		log.info(hero.toString());
		log.info(hero2.toString());
	}

}
