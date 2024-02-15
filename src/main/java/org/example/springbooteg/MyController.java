package org.example.springbooteg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

        @GetMapping("/hello")
        //this is my endpoint hello
        public String helloeveryone(){
            return "Hello everyone, Welcome to Spring Boot and happy learning";
        }
    @GetMapping("/hai")
    //this is end point hai
    public String hai(){
        return "Have a nice day";
    }

}

