package org.cejug.pojo.administracao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.cejug.persistence.util.Identified;

/**
 * Classe Entity Autenticacao.
 *
 * @author helio frota
 *
 */
@Entity
@Table(name = "autenticacao")
public class Autenticacao implements Serializable, Identified {

    private static final long serialVersionUID = 8055021864264953843L;
    
    @Id
    private String id;
    
    @OneToOne
    private Usuario usuario;
    
    private String email;
    private String senha;

    public Autenticacao() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autenticacao other = (Autenticacao) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
}