package com.hotmart.DesafioTreinamentoJava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "departamento")
public class Departamento {

    //    +--------+-------------+------+-----+---------+----------------+
    //    | Field  | Type        | Null | Key | Default | Extra          |
    //    +--------+-------------+------+-----+---------+----------------+
    //    | id     | int(11)     | NO   | PRI | NULL    | auto_increment |
    //    | nome   | varchar(60) | NO   |     | NULL    |                |
    //    | numero | int(11)     | NO   |     | NULL    |                |
    //    +--------+-------------+------+-----+---------+----------------+

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Long numero;

    public Departamento() {}

    public Departamento(String nome, Long numero) {
        super();
        this.nome = nome;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Long getNumero() {
        return numero;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

}
