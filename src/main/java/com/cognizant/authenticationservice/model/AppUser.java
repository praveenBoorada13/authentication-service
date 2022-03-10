package com.cognizant.authenticationservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appuser")
@Getter
@Setter
public class AppUser {
	
	@Id
	@Column(name = "userid", length = 20)
	@NotNull
	@Pattern(regexp = "^[A-Za-z0-9]*$")
	@Getter
	@Setter
	private String userid;
	
	@Pattern(regexp = "^[A-Za-z0-9]*$")
	@Column(name = "username", length = 20)
	@Getter
	@Setter
	private String username;
	
	@Column(name = "password")
	@Getter
	@Setter
	private String password;
	@Getter
	@Setter
	private String authToken;
	@Getter
	@Setter
	private String role;
}
