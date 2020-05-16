package rocks.riedl.adqc.hellogradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RequestMapping("/")
public class HelloGradleController {

  @GetMapping
  public String helloGradle() {
    return "Hello Gradle!";
  }

}
