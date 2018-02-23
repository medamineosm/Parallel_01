package com.parallel.Repository;

import com.parallel.Model.Actors.Consultant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@Repository
public interface ConsultantRepository extends MongoRepository<Consultant, String> {
}
