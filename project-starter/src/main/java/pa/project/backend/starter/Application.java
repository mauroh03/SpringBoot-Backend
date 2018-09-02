package pa.project.backend.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by Mauro Herrera on 01/09/2018.
 */

@SpringBootApplication(scanBasePackages  = {
                "pa.project.backend.client.services",
        		"pa.project.backend.starter"
        		})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        TimeZone.setDefault(TimeZone.getTimeZone("America/Panama"));
        Locale.setDefault(Locale.forLanguageTag("es_PA"));
    }
}
