package com.Hotel.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UsersEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String username;
	
	private String password;
	
	private String fullName;
	
	private Date birtDate;
	
	private String adress;
	
	private String phone;
	
	private long hotel_id;
	
	private long role_id;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "hotel_id", insertable = false, updatable = false)
	private HotelEntity hotel2;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "role_id", insertable = false, updatable = false)
	private RoleEntity role;
	
	@JsonIgnore
	@OneToMany(mappedBy = "user1",fetch = FetchType.LAZY)
	private List<BookRoomEntity> listBookRoom;

	@JsonIgnore
	@OneToMany(mappedBy = "user2",fetch = FetchType.LAZY)
	private List<TokenEntity> listToken;

}
