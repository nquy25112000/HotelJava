package com.Hotel.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillDTO {
	@JsonProperty("id")
	private long id;

	@NotBlank(message = "Please enter total")
	@JsonProperty("total")
	private float total;

	@NotBlank(message = "Please enter bookroomId")
	@JsonProperty("bookroom_id")
	private long bookroom_id;
}
