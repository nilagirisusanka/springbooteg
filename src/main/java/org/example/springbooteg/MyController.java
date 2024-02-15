package org.example.springbooteg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

        @GetMapping("/hello")
        //this is my endpoint hello
        //@GetMapping gets all HTTP get requests
        public String helloeveryone(){
            return "hello everyone, welcome to spring boot and happy learning";
        }
    @GetMapping("/hai")
    //this is end point hai
    public String hai(){
            //return a message "have a nice day"
        return "have a nice day";

    }

}

