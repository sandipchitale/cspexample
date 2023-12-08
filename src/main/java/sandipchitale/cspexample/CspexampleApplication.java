package sandipchitale.cspexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CspexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CspexampleApplication.class, args);
	}

	@Controller
	public static class IndexCOntroller {

		@GetMapping("/")
		public String index() {
			return "index.html";
		}
	}
}
