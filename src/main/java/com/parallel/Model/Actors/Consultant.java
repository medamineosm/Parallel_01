package com.parallel.Model.Actors;

import com.parallel.Model.Enumerations.LANGUAGES;
import com.parallel.Model.Infos.Cursus.Formation;
import com.parallel.Model.Infos.Pro.Experience;
import com.parallel.Model.Infos.Pro.Job;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Set;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Consultant {

    @Id
    private String id;
    @DBRef
    private Person person;
    private Set<Formation> formations;
    private Set<Experience> experiences;
    private Job job;
    private Set<LANGUAGES> languages;

    public Consultant(Person person) {
        this.person = new Person(person);
        this.id = this.person.getEmail();
    }

    @Override
    public String toString() {
        return "Consultant{" +
                "id='" + id + '\'' +
                ", person=" + person +
                ", formations=" + formations +
                ", experiences=" + experiences +
                ", job=" + job +
                ", languages=" + languages +
                '}';
    }
}
