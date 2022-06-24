package com.microserver.MicroServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @Autowired
    private NameSender nameSender;
    @GetMapping("/name")
    public NameSender displayName(){
        return new NameSender(nameSender.getFirstName(),nameSender.getLastName());
    }
}
