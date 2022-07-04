package com.Hotel.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.Hotel.entity.RoomTypeEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotelDTO {

	@JsonProperty("id")
	private Long id;

	@NotBlank(message = "Please enter Name")
	@JsonProperty("name")
	private String name;

	@NotBlank(message = "Please enter address")
	@JsonProperty("adress")
	private String adress;

	@Size(min = 10, max = 10)
	@NotBlank(message = "Please enter phone")
	@JsonProperty("phone")
	private String phone;

	@NotBlank(message = "Please enter email")
	@JsonProperty("email")
	private String email;

	private List<RoomTypeDTO> listRoomType;
}
