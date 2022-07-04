package com.Hotel.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HotelException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private String message;
}
