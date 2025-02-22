package guru.springframework.msscbrewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by jt on 2019-04-23.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 { // JT puts V2 on class name - avoids intellisense mistakes
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle; // type change on beerStyle = breaking change
    private Long upc;
}
