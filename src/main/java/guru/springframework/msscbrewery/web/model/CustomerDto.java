package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by jt on 2019-04-21.
 */
@Data // getters, setters, equals + hashcode
@NoArgsConstructor
@AllArgsConstructor
@Builder // implements builder pattern
public class CustomerDto {

    private UUID id;
    private String name;
}
