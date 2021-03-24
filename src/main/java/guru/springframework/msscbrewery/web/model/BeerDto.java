package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null // client cannot set id
    private UUID id;

    @NotBlank // @NotBlank clicking on this, then philips head in Project window>it's from:- 
    // javax.validation:validation-api:2.0.1.Final>constraints is official bean validation api
    // Look at:-
    // org.hibernate.validator:hibernatae-validator:6.0.16.Final>constraints - hibernate extends the api
    private String beerName;

    @NotBlank
    private String beerStyle;

    @Positive
    private Long upc;
}
