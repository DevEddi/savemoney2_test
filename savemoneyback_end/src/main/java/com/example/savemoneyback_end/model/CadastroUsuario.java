package com.example.savemoneyback_end.model;

public class CadastroUsuario {


    private int idade;
    private String tipoUsuario;
    private int dataNascimento;
    private int lucroEmpresa;
    private String tipoEmpresaJuridica;




    public String cadastroNovoUsuario() {
        switch(tipoUsuario) {                                              //1
            case "pessoaFisica":                                           //2
                    if (idade < 18){                                       //3
                        return "Nao pode criar uma conta";                 //4
                    }else{
                        return "Ok, maior de 18 anos";                      //5
                    }
            case "pessoaJuridica":                                          //6
                switch(tipoEmpresaJuridica) {                               //7
                    case "autonomo":                                        //8
                        if (lucroEmpresa <= 60000){                         //9
                            return "Voce se classifica como Autonomo";      //10
                        }else{
                            return "Voce nao se classifica";                //11
                        }
                    case "mei":                                             //12
                        if (lucroEmpresa <= 80000){
                            return "Voce se classfica como MEI";            //13
                        }else{
                            return "Voce nao se classifica";                //14
                        }
                    case "empresarioIndividual":                            //15
                        if (lucroEmpresa <= 300000){                        //16
                            return "Voce se classfica como MEI";            //17
                        }else{
                            return "Voce nao se classifica";                //18
                        }

                    case "sociedade":                                       //19
                        if (lucroEmpresa <= 1000000){                       //19
                            return "Voce se classfica como MEI";            //20
                        }else{
                            return "Voce nao se classifica";                //20
                        }
                        /*break; <==== Não sei porque*/
                }

            }

      return "Erro a criar conta";                                          //21
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
