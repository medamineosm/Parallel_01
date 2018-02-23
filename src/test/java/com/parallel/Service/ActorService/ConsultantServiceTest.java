package com.parallel.Service.ActorService;

import com.parallel.Model.Actors.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ConsultantServiceTest {

    @Autowired
    private ConsultantService consultantService;

    @Test
    public void toConsultant() throws Exception {
        assertNotNull(consultantService.toConsultant(new Person("m.amine.osm@gmail.com", "testtest")));
    }

}