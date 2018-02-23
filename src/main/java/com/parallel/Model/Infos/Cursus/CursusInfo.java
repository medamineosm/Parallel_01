package com.parallel.Model.Infos.Cursus;

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
public abstract class CursusInfo {
    protected String nameSchool;
    protected Date startDateFormation;
    protected Date endDateFormation;
    protected String diplomeName;
}
