package com.groupeisi.dao;
import java.util.List;

import javax.ejb.Local;
@Local
public interface Repository <T> {
	public int add(T t);
	public int delete(int id,T t);
	public int update(T t);
	public List<T> list();
	public T get(int id,T t);
	List<T> list(T t);
	
	
}

