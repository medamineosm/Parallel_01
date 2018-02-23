package com.parallel.Service.UserAccessService;

import com.parallel.Service.UserAccessService.RegistrationService;
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
public class RegistrationServiceTest {
    @Autowired private RegistrationService registrationService;

    @Test
    public void doRegistration() throws Exception {
        assertNotNull(null,registrationService.doRegistration("m.amine.osm@gmail.com", "testtest", "testtest"));
        assertNull(registrationService.doRegistration("m.amine.osm@gmail.com", "1234123", "test"));
        assertNotNull(null,registrationService.doRegistration("m.amine.osm@gmail.com", "testtest", "testtest"));
    }

}