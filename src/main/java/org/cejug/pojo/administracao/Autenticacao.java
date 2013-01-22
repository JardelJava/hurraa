package org.cejug.pojo.administracao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "autenticacao")
public class Autenticacao implements Serializable {

	private static final long serialVersionUID = 8055021864264953843L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

	@OneToOne
	private Usuario usuario;

	private String email;

	private String senha;

	public Autenticacao() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
