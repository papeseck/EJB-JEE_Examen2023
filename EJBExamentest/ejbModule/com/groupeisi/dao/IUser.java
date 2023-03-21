package com.groupeisi.dao;
import javax.ejb.Local;

import com.groupeisi.entities.User;

@Local
public interface IUser extends Repository<User>{
	public IUser getConnection(String email, String motdepasse);
}
