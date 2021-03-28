package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {DateMapper.class}) // two-way objects>quick + less error prone>maven clean then compile.
// Has @Component>this setting was in the pom.xml + builder pattern leveraged
//..\target\generated-sources\annotations\guru\springframework\msscbrewery\web\mappers\BeerMapperImpl.java

// compiled:-
//..\target\classes\guru\springframework\msscbrewery\web\mappers\BeerMapperImpl.class
//..\target\classes\guru\springframework\msscbrewery\web\mappers\BeerMapper.class

public interface BeerMapper {


    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
