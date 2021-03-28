package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Data
@NoArgsConstructor 
// ..\m2\repository\org\projectlombok\lombok\1.18.18\lombok-1.18.18.jar!\lombok\NoArgsConstructor.class
@AllArgsConstructor
@Builder
public class BeerDto {
// Lombok enhances the class with annotation processing:-
// mssc-brewery\target\classes\guru\springframework\msscbrewery\web\model\BeerDto.class
    
    @Null
    private UUID id;

    @NotBlank
    private String beerName;

    @NotBlank
    private String beerStyle;

    @Positive
    private Long upc;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastUpdatedDate;
}
