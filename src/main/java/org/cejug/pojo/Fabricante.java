package org.cejug.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Classe Entity Fabricante.
 *
 * @author helio frota
 *
 */
@Entity
@Table(name = "fabricante")
public class Fabricante implements Serializable {

    private static final long serialVersionUID = -3466398603052152979L;
    
    @Id
    @SequenceGenerator(name = "fabricanteIdSeq", sequenceName = "fabricante_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fabricanteIdSeq" )
    @Column(name = "id")
    private Integer id;

    private String nome;

    private int tipo;

    public Fabricante() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTipoLiteral() {
        String tipoLiteral = "";
        if (tipo == 1) {
            tipoLiteral = "Hardware";
        } else if (tipo == 2){
            tipoLiteral = "Software";
        } else {
            tipoLiteral = "Hardware / Software";
        }
        return tipoLiteral;
    }

    @Override
    public String toString() {
        return "id: " + id + " nome: " + nome + " tipo: " + tipo;
    }

}
