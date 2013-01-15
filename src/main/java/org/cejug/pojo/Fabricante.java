package org.cejug.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Entity class Fabricante.
 *
 * @author helio frota
 *
 */
@NamedQueries({
    @NamedQuery(name = "Fabricante.findAll", query = "select f from Fabricante f order by f.nome asc")
})
@Entity
@Table(name = "fabricante")
@SuppressWarnings("serial")
public class Fabricante implements Serializable {

    /**
     * Attribute id of Fabricante.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * Attribute nome of Fabricante.
     */
    private String nome;

    /**
     * Attribute tipo of Fabricante.
     */
    private int tipo;

    /**
     * Default constructor.
     */
    public Fabricante() {

    }

    /**
     * Gets the id of Fabricante.
     * @return Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id of Fabricante.
     * @param id Integer
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the nome of Fabricante.
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the nome of Fabricante.
     * @param nome String
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets the tipo of Fabricante.
     * @return int
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Sets the tipo of Fabricante.
     * @param tipo int
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * Default toString method.
     */
    @Override
    public String toString() {
        return "id: " + id + " nome: " + nome + " tipo: " + tipo;
    }

}
