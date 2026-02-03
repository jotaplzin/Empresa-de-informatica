package com.pbe.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity  
@Table(name="pessoa")

public class Pessoa {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)



    // Atributo Do banco de Dados
    private long id;
    @NotBlank
    private String nome;
    private String cpf;
    private String rg;

    @Email
    private String email;

    private LocalDate nascimento;
    private BigDecimal salario;
    private String ra;

    //Getters e Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = 
}
