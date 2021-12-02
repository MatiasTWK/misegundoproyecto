package cl.twk.proyectos.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "persistent_logins")
public class PersistentLogins implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7255653582507524291L;
	@Id
	@GeneratedValue
	@Column(length = 64)
	private String series;

	@Column(length = 50, nullable = false)
	private String username;

	@Column(length = 64, nullable = false)
	private String token;

	@UpdateTimestamp
	private Date last_used;

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getLast_used() {
		return last_used;
	}

	public void setLast_used(Date last_used) {
		this.last_used = last_used;
	}
}
