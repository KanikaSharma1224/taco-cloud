package tacos;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
		/*
		 * ApplicationContext ac = SpringApplication.run(TacoCloudApplication.class,
		 * args); for(String name : ac.getBeanDefinitionNames()) {
		 * System.out.println("++++ "+name); }
		 */
		/*
		 * SpringApplication app = new SpringApplication(TacoCloudApplication.class);
		 * app.setBannerMode(Banner.Mode.LOG); app.run(args);
		 */
	}

}
