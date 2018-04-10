package nl.localhost.dockerdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Demo controller, doing not actually anything useful.
 */
@Controller
public class DemoController
{
	@GetMapping("/")
	public ResponseEntity<String> demo()
	{
		StringBuilder sb = new StringBuilder("Hi there from a controller in a Spring Boot application\n");
		sb.append("Running on Java version: ");
		sb.append(System.getProperty("java.version"));
		sb.append("\n");
		sb.append("Hostname: ");
		sb.append(System.getenv("HOSTNAME"));
		sb.append("\n");

		return new ResponseEntity<>(sb.toString(), HttpStatus.OK);
	}
}
