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
    // Getting data from params
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    // getting data from Path/Url
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    //Sending data using Post method
    @PostMapping("/post")

    public String getNameWithPostMethod(@RequestBody UserDTO user){
        return  "Hello "+user.getfirstName() +" "+user.getlastName()+" from Bridge labz";
    }

    //updating data using Put method
    @PutMapping("/put/{firstName}")
    public  String updateHelloGetFirstNameFromPathAndlastNamebyQueryUsingPut(@PathVariable String firstName, @RequestParam String lastName){
        return "Hello "+firstName+ " " +lastName+ " from Bridge Labz";
    }

}
