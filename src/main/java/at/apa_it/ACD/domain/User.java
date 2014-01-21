package at.apa_it.ACD.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.metadata.CascadableDescriptor;

@Entity
@Table(name="user")
public class User extends BasePersistable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3059477704677520751L;

	@NotNull
	@Column(name="username", nullable=false, length=255)
	private String username;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")
	private List<AuthToken> authTokens;

	@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")
	private List<Tenant> tenants;

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String username) {
		super();
		this.username = username;
		this.setAuthTokens(new ArrayList<AuthToken>());
		this.tenants = new ArrayList<Tenant>();
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<Tenant> getTenants() {
		return tenants;
	}
	public void setTenants(List<Tenant> tenants) {
		this.tenants = tenants;
	}

	public List<AuthToken> getAuthTokens() {
		return authTokens;
	}

	public void setAuthTokens(List<AuthToken> authTokens) {
		this.authTokens = authTokens;
	}
	
}