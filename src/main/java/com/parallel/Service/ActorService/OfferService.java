package com.parallel.Service.ActorService;

import com.parallel.Model.Actors.Consultant;
import com.parallel.Model.Enumerations.CANAL_Type;
import com.parallel.Model.Offer;
import com.parallel.Repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@Service
public class OfferService {
    private final OfferRepository offerRepository;

    @Autowired
    public OfferService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public Offer createOrGetOffer(Consultant consultant, String title, String description, CANAL_Type canal_type){
        Offer offerFromDatabase = offerRepository.findOne(consultant.getPerson().getEmail());

        if(offerFromDatabase == null)
            return offerRepository.save(new Offer(consultant, title, description, canal_type));
        else
            return offerFromDatabase;
    }

}