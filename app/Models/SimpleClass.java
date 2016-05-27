package Models;

/**
 * Created by carlos on 27/05/16.
 */


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import play.data.validation.Constraints.Required;


@Entity
public class SimpleClass {


    @Id
    @GeneratedValue
    private Long id;

    public SimpleClass(){

    }


}
