package cl.twk.proyectos.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "usuarios")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3948863914143345070L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@CreatedDate
	private Date creationDate;
	
	@UpdateTimestamp
	private Date updateDate;
	
	@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
	@JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(updatable = true, name = "usuarios", referencedColumnName = "userId"), inverseJoinColumns = @JoinColumn(updatable = true, name = "authority", referencedColumnName = "idAuthority"))
	private Set<Authority> authority;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Set<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(Set<Authority> authority) {
		this.authority = authority;
	}
}