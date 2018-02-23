package com.parallel.Model.Actors;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@ToString
@Getter
@Setter
@AllArgsConstructor
@Document
public class Person {

    @Id
    protected String email;
    protected String lastName;
    protected String firstName;
    protected int age;
    protected String address;
    protected Date dateRegistration;
    protected String password;

    public Person() {
        this.dateRegistration = new Date();
    }

    public Person(String email, String password) {
        this();
        this.email = email;
        this.password = password;
    }

    public Person(Person person) {
        this.email = person.email;
        this.lastName = person.lastName;
        this.firstName = person.firstName;
        this.age = person.age;
        this.address = person.address;
        this.dateRegistration = person.dateRegistration;
        this.password = person.password;
    }
}
