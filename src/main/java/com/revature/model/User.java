package com.revature.model;

import java.util.List;

public interface User {
	public User login();
	public List<Account> load();
	public void save();
}
