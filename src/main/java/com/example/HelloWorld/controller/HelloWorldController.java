package com.example.HelloWorld.controller;

import com.example.HelloWorld.DTO.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @GetMapping()
    public String sayHello(){
        return "Hello from Bridge Labz!";
    }

    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    @PostMapping("/post")

    public String getNameWithPostMethod(@RequestBody UserDTO user){
        return  "Hello "+user.getfirstName() +" "+user.getlastName()+" from Bridge labz";
    }

}
