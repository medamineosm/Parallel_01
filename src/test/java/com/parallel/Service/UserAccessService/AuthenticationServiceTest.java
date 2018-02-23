package com.parallel.Service.UserAccessService;

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
public class AuthenticationServiceTest {
    @Autowired private AuthenticationService authenticationService;

    @Test
    public void doLogin() throws Exception {
        assertTrue(authenticationService.doLogin("m.amine.osm@gmail.com","testtest"));
        assertFalse(authenticationService.doLogin("m.amine.osm@gmail.com","test"));
    }

}