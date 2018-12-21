package com.hotmart.DesafioTreinamentoJava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "projeto")
public class Projeto {

    //    +----------------+-------------+------+-----+---------+----------------+
    //    | Field          | Type        | Null | Key | Default | Extra          |
    //    +----------------+-------------+------+-----+---------+----------------+
    //    | id             | int(11)     | NO   | PRI | NULL    | auto_increment |
    //    | nome           | varchar(60) | NO   |     | NULL    |                |
    //    | idDepartamento | int(11)     | NO   | MUL | NULL    |                |
    //    +----------------+-------------+------+-----+---------+----------------+

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Long idDepartamento;

    public Long getId() {
        return id;
    }

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
