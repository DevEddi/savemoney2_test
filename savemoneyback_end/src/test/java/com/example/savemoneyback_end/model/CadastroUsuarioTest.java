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
    public  void VerificaCasoNadaEscolhe(){
        cadastrousuario.setTipoUsuario("Nenhum");
        assertEquals( "Erro", cadastrousuario.cadastroNovoUsuario());
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

    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoAutonomo(){
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("autonomo");
        cadastrousuario.setLucroEmpresa(59999);
        assertEquals( "Voce se classifica como Autonomo", cadastrousuario.cadastroNovoUsuario());
    }
    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoAutonomoValorMaior(){
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("autonomo");
        cadastrousuario.setLucroEmpresa(60001);
        assertEquals( "Voce nao se classifica", cadastrousuario.cadastroNovoUsuario());
    }

    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoMEI(){
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("mei");
        cadastrousuario.setLucroEmpresa(79999);
        assertEquals( "Voce se classifica como MEI", cadastrousuario.cadastroNovoUsuario());
    }
    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoMEIValorMaior(){
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("mei");
        cadastrousuario.setLucroEmpresa(80001);
        assertEquals( "Voce nao se classifica", cadastrousuario.cadastroNovoUsuario());
    }
    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoSociedade(){
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("sociedade");
        cadastrousuario.setLucroEmpresa(999999);
        assertEquals( "Voce nao se classifica", cadastrousuario.cadastroNovoUsuario());
    }
    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoSociedadeValorMaior(){
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("sociedade");
        cadastrousuario.setLucroEmpresa(1000001);
        assertEquals( "Voce se classfica como Sociedade", cadastrousuario.cadastroNovoUsuario());
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