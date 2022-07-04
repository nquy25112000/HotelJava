package com.Hotel.dto;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDTO {
	@JsonProperty("id")
	private long id;
	
	@NotEmpty(message = "Please enter name")
	@JsonProperty("name")
	private String name;
	
	@NotEmpty(message = "Please enter status")
	@JsonProperty("status")
	private int status;
	
	@NotEmpty(message = "Please enter hotelId")
	@JsonProperty("hotel_id")
	private long hotel_id;
	
	@NotEmpty(message = "Please enter roomtypeId")
	@JsonProperty("roomtype_id")
	private long roomtype_id;
}
