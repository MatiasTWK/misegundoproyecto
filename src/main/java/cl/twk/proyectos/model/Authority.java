package cl.twk.proyectos.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "authority")
public class Authority implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 67307926093843844L;
	
	@Id
	@GeneratedValue
	private Long idAuthority;
	
	@Column
	private String authority;
	
	@ManyToMany(mappedBy = "authority", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private Set<User> user;

	public Long getIdAuthority() {
		return idAuthority;
	}

	public void setIdAuthority(Long idAuthority) {
		this.idAuthority = idAuthority;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}
}