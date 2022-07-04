package com.Hotel.entity;

import java.sql.Timestamp;
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
@Table(name = "bookroom")
public class BookRoomEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String customer_name;
	
	private int customer_id_card;
	
	private Timestamp from_date;
	
	private Timestamp to_date;
	
	private Timestamp payment_date;
	
	private long room_id;
	
	private long user_id;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "user_id", insertable = false, updatable = false)
	private UsersEntity user1;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "room_id", insertable = false, updatable = false)
	private RoomEntity room;
	
	@JsonIgnore
	@OneToMany(mappedBy = "bookroom",fetch = FetchType.LAZY)
	private List<BillEntity> listBill;

}
