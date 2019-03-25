package br.edu.ifpb.progdist.hellospring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {

    @RequestMapping("/hello")
    public String helloSpring(){
        return "Hello, Douglas";
    }
}
