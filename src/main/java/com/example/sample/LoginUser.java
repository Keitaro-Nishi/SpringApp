package com.example.sample;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="userdata")
//@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class LoginUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String custid;

	private String password;

	private Collection<? extends GrantedAuthority> reserve;

	public LoginUser() {
	}
	
	public LoginUser(String custid, String password, Collection<? extends GrantedAuthority> reserve) {
        this.custid = custid;
        this.password = password;
        this.reserve = reserve;
    }

	public String getCustid() {
		return this.custid;
	}

	public void setCustid(String custid) {
		this.userid = custid;
	}
	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Collection<? extends GrantedAuthority> getReserve() {
		return this.reserve;
	}

	public void setReserve(Collection<? extends GrantedAuthority> reserve) {
		this.reserve = reserve;
	}
}
