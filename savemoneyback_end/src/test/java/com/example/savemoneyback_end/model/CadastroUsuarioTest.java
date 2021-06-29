package com.example.savemoneyback_end.model;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastroUsuarioTest {

    CadastroUsuario cadastrousuario;

    @BeforeEach
    public void setUp(){
        cadastrousuario = new CadastroUsuario();
    }

    @Test
    public  void VerificaCasoSejaUmaPessoaMenorDe18Anos(){
        cadastrousuario.setTipoUsuario("pessoaFisica");
        cadastrousuario.setIdade(17);
        assertEquals( "Nao pode criar uma conta", cadastrousuario.cadastroNovoUsuario());
    }

    @Test
    public  void VerificaCasoSejaUmaPessoaMaiorDe18Anos(){
        cadastrousuario.setTipoUsuario("pessoaFisica");
        cadastrousuario.setIdade(19);
        assertEquals( "Ok, maior de 18 anos", cadastrousuario.cadastroNovoUsuario());
    }


}

/*
*
    private String pessoaJuridica;
    private String autonomo;
    private String mei;
    private String sociedade;
    private String pessoaFisica;
* */