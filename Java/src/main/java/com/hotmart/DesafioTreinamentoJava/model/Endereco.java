package com.hotmart.DesafioTreinamentoJava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "endereco")
public class Endereco {

    //    +--------+-------------+------+-----+---------+----------------+
    //    | Field  | Type        | Null | Key | Default | Extra          |
    //    +--------+-------------+------+-----+---------+----------------+
    //    | id     | int(11)     | NO   | PRI | NULL    | auto_increment |
    //    | pais   | varchar(45) | NO   |     | NULL    |                |
    //    | uf     | varchar(45) | NO   |     | NULL    |                |
    //    | cidade | varchar(45) | NO   |     | NULL    |                |
    //    | rua    | varchar(45) | NO   |     | NULL    |                |
    //    | cep    | varchar(45) | NO   |     | NULL    |                |
    //    +--------+-------------+------+-----+---------+----------------+

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pais;

    private String uf;

    private String cidade;

    private String rua;

    private String cep;

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public Long getId() {
        return id;
    }

    public String getPais() {
        return pais;
    }

    public String getRua() {
        return rua;
    }

    public String getUf() {
        return uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}
