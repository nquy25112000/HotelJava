package com.Hotel.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Hotel.dto.MessageDTO;

@ControllerAdvice
public class ExceptionHandle {
	
    @ExceptionHandler(value = HotelException.class)
    public ResponseEntity<MessageDTO> exceptionBadRequest(HotelException ex) {
    	MessageDTO message = new MessageDTO(ex.getMessage());
        return new ResponseEntity<MessageDTO>(message,HttpStatus.BAD_REQUEST);
    }
 

}

