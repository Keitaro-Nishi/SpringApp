package com.example.sample;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class LoginUserDetails extends org.springframework.security.core.userdetails.User{
	private final LoginUser loginUser;
	
	public LoginUserDetails(LoginUser loginUser) {
		super(loginUser.getCustid(), loginUser.getPassword(), loginUser.getReserve());
		this.loginUser = loginUser;
	}

	public LoginUser getLoginUser() {
		return loginUser;
	}
}