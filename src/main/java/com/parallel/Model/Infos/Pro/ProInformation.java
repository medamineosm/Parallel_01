package com.parallel.Model.Infos.Pro;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Created by Ouasmine on 23/02/2018.
 */
@NoArgsConstructor
@Getter
@Setter
public abstract class ProInformation {
    protected Date startDateExperience;
    protected Date endDateExperience;
    protected String title;
    protected String companyName;
    protected String description;
    protected String linkedInProfile;
    protected String facebookProfile;
    protected String twitterProfile;
    protected String portfolio;
}
