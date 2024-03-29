package com.itb.mif3an.academicologinmif3an.model;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private String password;
	private String tipoPrincipalUsuario;
	private boolean codStatusUsuario;
	private LocalDate dataNascimento;
	
	//Relacionamento n:N

	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
				name = "usuarios_papeis",
				joinColumns = @JoinColumn(name="usuario_id", referencedColumnName = "id"),			
				inverseJoinColumns = @JoinColumn(name="papel_id", referencedColumnName = "id")
			)
	
	
	private Collection<Papel> papeis;
	
	private Usuario() {
		
	}
	
	public Usuario(String nome, String sobrenome, String password, String email, Collection<Papel> papeis) {
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.password = password;
		this.papeis = papeis;
		
		
	}
	
	public Collection<Papel> getPapeis() {
		return papeis;
	}
	public void setPapeis(Collection<Papel> papeis) {
		this.papeis = papeis;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipoPrincipalUsuario() {
		return tipoPrincipalUsuario;
	}
	public void setTipoPrincipalUsuario(String tipoPrincipalUsuario) {
		this.tipoPrincipalUsuario = tipoPrincipalUsuario;
	}
	public boolean isCodStatusUsuario() {
		return codStatusUsuario;
	}
	public void setCodStatusUsuario(boolean codStatusUsuario) {
		this.codStatusUsuario = codStatusUsuario;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	


	
	
	

}
