package com.Hotel.services;

import java.util.List;

public interface IBaseService<T> {
	public List<T> findAll();
	
	public T update(long id,T dto);
	
	public List<T> delete(long id);
	
	public T save(T dto);
	
	public T findById(long id);
}
