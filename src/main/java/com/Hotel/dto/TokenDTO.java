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
public class TokenDTO {
	@JsonProperty("id")
	private long id;
	
	@NotEmpty(message = "Please enter tokenCode")
	@JsonProperty("tokenCode")
	private String tokenCode;
	
	@NotEmpty(message = "Please enter userId")
	@JsonProperty("user_id")
	private long user_id;
}
