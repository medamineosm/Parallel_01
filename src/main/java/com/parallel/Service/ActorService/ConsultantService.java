package com.parallel.Service.ActorService;

import com.parallel.Model.Actors.Consultant;
import com.parallel.Model.Actors.Person;
import com.parallel.Model.Enumerations.LANGUAGES;
import com.parallel.Repository.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.EnumSet;
import java.util.Enumeration;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@Service
public class ConsultantService {
    private final ConsultantRepository consultantRepository;

    @Autowired
    public ConsultantService(ConsultantRepository consultantRepository) {
        this.consultantRepository = consultantRepository;
    }

    public Consultant toConsultant(Person person){
        return consultantRepository.save(new Consultant(person));
    }


}
