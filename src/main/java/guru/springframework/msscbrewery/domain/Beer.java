package guru.springframework.msscbrewery.domain;

import guru.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by jt on 2019-05-25.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer { // Beer entity>mimics persistence layer>pretend this persists to a Database.
    // Take persisted object to api model that is exposed to API consumers>transfer back and forth. 
    
    private UUID id;
     
    private String beerName;
    private BeerStyleEnum beerStyle; // BeerStyleEnum - same enum used - DRY, could have 1 for entities + 1 for web tier, argue either way
    private Long upc;

    // pretend Hibernate is used + we store it in MySQL
    // domain class could use java.sql.Timestamp>good for databases
    // model class>could use something good for public facing interfaces:-
    // private java.time.OffsetDateTime createdDate;
    // ..\src\main\java\guru\springframework\msscbrewery\web\model\BeerDto.java
    // problem=2 different types solution=DateMapper class handles mapping logic
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
}
