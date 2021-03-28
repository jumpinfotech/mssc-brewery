package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Customer;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper // interfaces by type=more organised, a single @Mapper interface is also legal
public interface CustomerMapper {

    // can name methods anything,
    // mapstruct docs have same convention as here except MapStruct docs had (CustomerDto customerDto):-
    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
