package org.cejug.pojo.administracao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.cejug.persistence.util.Identified;

/**
 * Classe Entity Grupo.
 *
 * @author helio frota
 *
 */
@Entity
@Table(name = "grupo")
public class Grupo implements Serializable, Identified {

    private static final long serialVersionUID = -8103435399380001559L;
    
    @Id
    private String id;
    
    private String nome;

    public Grupo() {
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Grupo other = (Grupo) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
}