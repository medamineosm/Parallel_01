package com.parallel.Service.ActorService;

import com.parallel.Model.Actors.Consultant;
import com.parallel.Model.Actors.Person;
import com.parallel.Model.Enumerations.CANAL_Type;
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
public class OfferServiceTest {
    @Autowired private OfferService offerService;
    @Autowired private ConsultantService consultantService;

    @Test
    public void createOffer() throws Exception {
        Consultant consultant = consultantService.toConsultant(new Person("m.amine.osm@gmail.com", "testtest"));
        assertNotNull(offerService.createOrGetOffer(
                consultant,
                "Je peux vous aider à améliorer votre référencement web (SEO",
                "Vous avez un site / blog intéressant, mais vous n’arrivez pas à vous positionner correctement dans les moteurs de recherche ?\n" +
                        "\n" +
                        "Je peux vous aider de plusieurs façons.\n" +
                        "Niveau 1 : Je peux auditer votre site internet et vous fournir mes recommandations.\n" +
                        "Niveau 2 : Idem que niveau 1, mais je m’occupe de mettre en place les recommandations.",
                CANAL_Type.Email));

    }
}