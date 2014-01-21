package at.apa_it.ACD.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tenants")
public class Tenant extends BasePersistable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4902218720424071604L;

	@NotNull
	@Column(name="description", nullable=false, length=255)
	private String description;
	
	@NotNull
	@Column(name="enabled", nullable=false, length=1)
	private boolean enabled;
	
	@NotNull
	@Column(name="uqid", nullable=false, length=255)
	private String uqid;
	
	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<User> user;
	
	public Tenant() {
		// TODO Auto-generated constructor stub
	}
	
	public Tenant(String description, boolean enabled, String uqid) {
		super();
		this.description = description;
		this.enabled = enabled;
		this.uqid = uqid;
		this.user = new ArrayList<User>();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getUqid() {
		return uqid;
	}

	public void setUqid(String uqid) {
		this.uqid = uqid;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}
}
