package guru.springframework.msscbrewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 2019-05-25.
 */
@ControllerAdvice // advises Spring MVC this is an exception handler, it's applied globally - added to all controllers, removes duplication in controllers
public class MvcExceptionHandler {

    // controller>@Valid fails>throws ConstraintViolationException
    @ExceptionHandler(ConstraintViolationException.class) // handles standard exception from javax.validation api
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException e){
        // a simple list of strings, you could send back a nice response body
        List<String> errors = new ArrayList<>(e.getConstraintViolations().size());

        e.getConstraintViolations().forEach(constraintViolation -> { // many ways to do this
            errors.add(constraintViolation.getPropertyPath() + " : " + constraintViolation.getMessage());
        });
        // return info in body of response
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    // BindException could be thrown when Spring tries binding the @RequestBody to BeerDto 
    @ExceptionHandler(BindException.class)
    public ResponseEntity<List> handleBindException(BindException ex){
        // ex.getAllErrors()>returns list of errors>an object gets converted to JSON
        return new ResponseEntity(ex.getAllErrors(), HttpStatus.BAD_REQUEST);
    }
}
