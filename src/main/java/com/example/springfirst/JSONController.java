package com.example.springfirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/json")
public class JSONController {

    @GetMapping("/people")
    public List<Person> getPeople() {
        Person person1 = new Person();
        person1.firstName = "Hello";
        person1.lastName = "World";

        Person person2 = new Person();
        person2.firstName = "John";
        person2.lastName = "Cena";

        return Arrays.asList(person1, person2);
    }

    public static class Person {
        private String firstName;
        private String lastName;

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

}