package com.example.savemoneyback_end.model;

public class CadastroUsuario {

    private String
    private int idade;
    private String tipoUsuario;
    private int dataNascimento;
    private int lucroEmpresa;
    private




    public void cadastroNovoUsuario() {
        switch(tipoUsuario) {
            case "pessoaFisica":
                    if (idade < 18){
                        return "Não pode criar uma conta";
                    }else{
                        return "Ok, maior de 18 anos";
                    }
                break;
            case "pessoaJuridica":
                switch(tipoEmpresaJuridica) {
                    case "autonomo":
                        if (lucroEmpresa <= 60000){
                            return "Voce se classfica como Autonomo";
                        }else{
                            return "Voce não se classifica";
                        }
                        break;
                    case "mei":
                        if (lucroEmpresa <= 80000){
                            return "Voce se classfica como MEI";
                        }else{
                            return "Voce não se classifica";
                        }
                        break;
                    case "empresarioIndividual":
                        if (lucroEmpresa <= 300000){
                            return "Voce se classfica como MEI";
                        }else{
                            return "Voce não se classifica";
                        }
                        break;
                    case "sociedade":
                        if (lucroEmpresa <= 1000000){
                            return "Voce se classfica como MEI";
                        }else{
                            return "Voce não se classifica";
                        }
                        break;
                    default:
                        // code block
                }


                break;
            default:
                return "Não pode realizar o cadastro";
        }

    }
}
