package com.hotmart.DesafioTreinamentoJava.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "funcionario")
public class Funcionario {

    //    +----------------+-------------+------+-----+---------+----------------+
    //    | Field          | Type        | Null | Key | Default | Extra          |
    //    +----------------+-------------+------+-----+---------+----------------+
    //    | id             | int(11)     | NO   | PRI | NULL    | auto_increment |
    //    | nome           | varchar(60) | NO   |     | NULL    |                |
    //    | cpf            | varchar(60) | NO   |     | NULL    |                |
    //    | dataNascimento | date        | NO   |     | NULL    |                |
    //    | sexo           | varchar(1)  | NO   |     | NULL    |                |
    //    | idEndereco     | int(11)     | YES  | MUL | NULL    |                |
    //    | idSupervisor   | int(11)     | YES  | MUL | NULL    |                |
    //    +----------------+-------------+------+-----+---------+----------------+

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private Date dataNascimento;

    private String sexo;

    private Long idEndereco;

    private Long idSupervisor;

    public Funcionario(String nome, String cpf, Date dataNascimento,
            String sexo) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public Funcionario(String nome, String cpf, String sexo) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public Long getIdSupervisor() {
        return idSupervisor;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public void setIdSupervisor(Long idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
