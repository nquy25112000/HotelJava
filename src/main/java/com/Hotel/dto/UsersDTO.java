package com.Hotel.dto;

import java.sql.Date;

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
public class UsersDTO {

	@JsonProperty("id")
	private long id;

	@NotBlank(message = "Please enter username")
	@JsonProperty("username")
	private String username;

	@NotBlank(message = "Please enter password")
	@JsonProperty("password")
	private String password;

	@NotBlank(message = "Please enter fullName")
	@JsonProperty("fullName")
	private String fullName;

	@NotBlank(message = "Please enter birtDate")
	@JsonProperty("birtDate")
	private Date birtDate;

	@NotBlank(message = "Please enter adress")
	@JsonProperty("adress")
	private String adress;

	@NotBlank(message = "Please enter phone")
	@JsonProperty("phone")
	private String phone;

	@NotBlank(message = "Please enter hotelId")
	@JsonProperty("hotel_id")
	private long hotel_id;

	@NotBlank(message = "Please enter roleId")
	@JsonProperty("role_id")
	private long role_id;
}
