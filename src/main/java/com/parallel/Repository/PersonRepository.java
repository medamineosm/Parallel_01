package com.parallel.Repository;

import com.parallel.Model.Actors.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@Repository
public interface PersonRepository extends MongoRepository<Person, String>{
}
