package com.example.savemoneyback_end.model;

public class CadastroUsuario {


    private int idade;
    private String tipoUsuario;
    private int dataNascimento;
    private int lucroEmpresa;
    private String tipoEmpresaJuridica;




    public String cadastroNovoUsuario() {
        switch(tipoUsuario) {
            case "pessoaFisica":
                    if (idade < 18){
                        return "Não pode criar uma conta";
                    }else{
                        return "Ok, maior de 18 anos";
                    }
            case "pessoaJuridica":
                switch(tipoEmpresaJuridica) {
                    case "autonomo":
                        if (lucroEmpresa <= 60000){
                            return "Voce se classfica como Autonomo";
                        }else{
                            return "Voce não se classifica";
                        }
                    case "mei":
                        if (lucroEmpresa <= 80000){
                            return "Voce se classfica como MEI";
                        }else{
                            return "Voce não se classifica";
                        }
                    case "empresarioIndividual":
                        if (lucroEmpresa <= 300000){
                            return "Voce se classfica como MEI";
                        }else{
                            return "Voce não se classifica";
                        }

                    case "sociedade":
                        if (lucroEmpresa <= 1000000){
                            return "Voce se classfica como MEI";
                        }else{
                            return "Voce não se classifica";
                        }

                }
                break;
            default:
                return "Não pode realizar o cadastro";
        }

        return null;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getLucroEmpresa() {
        return lucroEmpresa;
    }

    public void setLucroEmpresa(int lucroEmpresa) {
        this.lucroEmpresa = lucroEmpresa;
    }

    public String getTipoEmpresaJuridica() {
        return tipoEmpresaJuridica;
    }

    public void setTipoEmpresaJuridica(String tipoEmpresaJuridica) {
        this.tipoEmpresaJuridica = tipoEmpresaJuridica;
    }
}
