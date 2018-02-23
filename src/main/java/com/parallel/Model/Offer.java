package com.parallel.Model;

import com.parallel.Model.Actors.Consultant;
import com.parallel.Model.Actors.Person;
import com.parallel.Model.Enumerations.CANAL_Type;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Set;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document
public class Offer {
    @Id
    private String id;
    @DBRef
    private Consultant consultant;
    private String title;
    private String description;
    @DBRef
    private Set<HashTag> tags;
    private CANAL_Type CANAL_Type;
    private Date dateDiplayed;

    public Offer(Consultant consultant, String title, String description, CANAL_Type canal_type) {
        this.consultant = consultant;
        this.title = title;
        this.description = description;
        this.CANAL_Type = canal_type;
        this.dateDiplayed = new Date();
        this.id = this.consultant.getPerson().getEmail();
    }
}
