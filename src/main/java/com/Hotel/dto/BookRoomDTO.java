package com.Hotel.dto;

import java.sql.Timestamp;

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
public class BookRoomDTO {
	@JsonProperty("id")
	private long id;
	
	@NotEmpty(message = "Please enter customerName")
	@JsonProperty("customer_name")
	private String customer_name;
	
	@NotEmpty(message = "Please enter customerIdCard")
	@JsonProperty("customer_id_card")
	private int customer_id_card;
	
	@NotEmpty(message = "Please enter fromDate")
	@JsonProperty("from_date")
	private Timestamp from_date;
	
	@NotEmpty(message = "Please enter toDate")
	@JsonProperty("to_date")
	private Timestamp to_date;
	
	@NotEmpty(message = "Please enter paymentDate")
	@JsonProperty("payment_date")
	private Timestamp payment_date;
	
	@NotEmpty(message = "Please enter roomId")
	@JsonProperty("room_id")
	private long room_id;
	
	@NotEmpty(message = "Please enter userId")
	@JsonProperty("user_id")
	private long user_id;
}
