package com.Hotel.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomTypeDTO {
	

	@JsonProperty("id")
	private long id;
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("price")
	private int price;

	@JsonProperty("hotel_id")
	private long hotel_id;
}
