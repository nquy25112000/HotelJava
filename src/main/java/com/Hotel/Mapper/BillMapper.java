package com.Hotel.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.Hotel.dto.BillDTO;
import com.Hotel.entity.BillEntity;

@Mapper(componentModel = "spring")
public interface BillMapper {
	List<BillDTO> listBillEntityToBillDTO(List<BillEntity> list);

	BillEntity billDTOtoBillEntity(BillDTO dto);

	BillDTO billEntityToBillDTO(BillEntity entity);
}
