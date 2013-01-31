package org.cejug.pojo.administracao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.cejug.persistence.util.Identified;

/**
 * Classe Entity Usuario.
 *
 * @author helio frota
 *
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable, Identified {

    private static final long serialVersionUID = -7778321679159096376L;
    
    @Id
    private String id;
    
    private String nome;
    
    private String email;
    
    private String fone;
    
    @OneToMany
    @JoinTable(name = "usuario_grupo",
            joinColumns =
            @JoinColumn(name = "usuario_id"),
            inverseJoinColumns =
            @JoinColumn(name = "grupo_id"))
    private List< Grupo> grupos;

    public Usuario() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Usuario other = (Usuario) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id: " + id + " nome: " + nome + " email: " + email;
    }
}