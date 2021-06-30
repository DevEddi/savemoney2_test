package com.example.savemoneyback_end.model;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CadastroUsuarioTest {

    CadastroUsuario cadastrousuario;

    @BeforeEach
    public void setUp(){
        cadastrousuario = new CadastroUsuario();
    }

    @Test
    public  void VerificaCasoNadaEscolhe() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("invalido");
        });
        assertEquals("invalido", exception.getMessage());
    }
    @Test
    public  void VerificaCasoSejaUmaPessoaMenorDe18Anos() throws Exception {
        cadastrousuario.setTipoUsuario("pessoaFisica");
        cadastrousuario.setIdade(17);
        assertEquals( "Nao pode criar uma conta", cadastrousuario.cadastroNovoUsuario());
    }

    @Test
    public  void VerificaCasoSejaUmaPessoaMaiorDe18Anos() throws Exception {
        cadastrousuario.setTipoUsuario("pessoaFisica");
        cadastrousuario.setIdade(19);
        assertEquals( "Ok, maior de 18 anos", cadastrousuario.cadastroNovoUsuario());
    }

    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoAutonomo() throws Exception {
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("autonomo");
        cadastrousuario.setLucroEmpresa(59999);
        assertEquals( "Voce se classifica como Autonomo", cadastrousuario.cadastroNovoUsuario());
    }
    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoAutonomoValorMaior() throws Exception {
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("autonomo");
        cadastrousuario.setLucroEmpresa(60001);
        assertEquals( "Voce nao se classifica", cadastrousuario.cadastroNovoUsuario());
    }

    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoMEI() throws Exception {
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("mei");
        cadastrousuario.setLucroEmpresa(79999);
        assertEquals( "Voce se classifica como MEI", cadastrousuario.cadastroNovoUsuario());
    }
    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoMEIValorMaior() throws Exception {
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("mei");
        cadastrousuario.setLucroEmpresa(80001);
        assertEquals( "Voce nao se classifica", cadastrousuario.cadastroNovoUsuario());
    }
    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoSociedade() throws Exception {
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("sociedade");
        cadastrousuario.setLucroEmpresa(999999);
        assertEquals( "Voce nao se classifica", cadastrousuario.cadastroNovoUsuario());
    }
    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoSociedadeValorMaior() throws Exception {
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("sociedade");
        cadastrousuario.setLucroEmpresa(1000001);
        assertEquals( "Voce se classfica como Sociedade", cadastrousuario.cadastroNovoUsuario());
    }
    @Test
    public  void VerificaCasoSejaUmaPessoaJuridicaDoTipoEpp() throws Exception {
        cadastrousuario.setTipoUsuario("pessoaJuridica");
        cadastrousuario.setTipoEmpresaJuridica("epp");
        assertEquals( "Voce se classfica como Empresa de Pequeno Porte", cadastrousuario.cadastroNovoUsuario());
    }

}
