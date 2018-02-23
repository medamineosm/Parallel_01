package com.parallel.Repository;

import com.parallel.Model.Actors.Consultant;
import com.parallel.Model.Offer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@Repository
public interface OfferRepository extends MongoRepository<Offer, String> {
}
