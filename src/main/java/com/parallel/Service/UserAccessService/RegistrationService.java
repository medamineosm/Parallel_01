package com.parallel.Service.UserAccessService;

import com.parallel.Model.Actors.Person;
import com.parallel.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@Service
public class RegistrationService {

    private final PersonRepository personRepository;

    @Autowired
    public RegistrationService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person doRegistration(String email, String password, String passwordConfirm){
        if(password.equals(passwordConfirm)){
            Person person = personRepository.findOne(email);
            if(person == null)
                return personRepository.save(new Person(email, password));
            else
                return person;
        }else {
            return null;
        }
    }


}
