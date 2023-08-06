package cloudinary.example.clodinaryDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/hello/{name}")
    public String helloController(@PathVariable String name){
      return "hello...." + name;
    }

}
