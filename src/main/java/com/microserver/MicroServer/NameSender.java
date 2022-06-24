package com.microserver.MicroServer;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("microserverdemo")
public class NameSender {
    private String firstName;
    private String lastName;

    public NameSender(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public NameSender(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
