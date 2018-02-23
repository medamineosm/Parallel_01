package com.parallel.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HashTag {

    @Id
    private String value;
}
