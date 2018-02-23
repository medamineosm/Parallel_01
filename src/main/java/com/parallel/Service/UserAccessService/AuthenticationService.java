package com.parallel.Service.UserAccessService;

import com.parallel.Model.Actors.Person;
import com.parallel.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@Service
public class AuthenticationService {
    private final PersonRepository personRepository;

    @Autowired
    public AuthenticationService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public boolean doLogin(String email, String password){
        Person person = personRepository.findOne(email);
        return (person != null) && person.getPassword().equals(password);
    }
}
