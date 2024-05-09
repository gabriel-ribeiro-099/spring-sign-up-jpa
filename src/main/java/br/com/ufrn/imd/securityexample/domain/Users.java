package br.com.ufrn.imd.securityexample.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "JPA-DB")
public class Users {


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;

	@Column(nullable = false, length = 100)
	private String email;
	@Column(nullable = false, unique = true, length = 100)
	private String username;
	@Column(nullable = false, length = 100)
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}