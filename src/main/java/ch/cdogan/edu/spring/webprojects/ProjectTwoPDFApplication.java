package ch.cdogan.edu.spring.webprojects;

import ch.cdogan.edu.spring.Repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(
		basePackages = {"ch.cdogan.edu.spring.Repository"}
)
@EntityScan("ch.cdogan.edu.spring.Entities")
public class ProjectTwoPDFApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectTwoPDFApplication.class, args);
	}
}
