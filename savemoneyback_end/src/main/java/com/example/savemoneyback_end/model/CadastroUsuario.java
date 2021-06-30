package com.example.savemoneyback_end.model;

public class CadastroUsuario {


    private int idade;
    private String tipoUsuario;
    private int dataNascimento;
    private int lucroEmpresa;
    private String tipoEmpresaJuridica;

    public String cadastroNovoUsuario() {
        if (tipoUsuario == "pessoaFisica") {                           //1
            if (idade < 18) {                                          //2
                return "Nao pode criar uma conta";                     //3
            } else {
                return "Ok, maior de 18 anos";                          //4
            }
        } else if (tipoUsuario == "pessoaJuridica") {                   //5
            if (tipoEmpresaJuridica == "autonomo") {                    //6
                if (lucroEmpresa <= 60000) {                           //7
                    return "Voce se classifica como Autonomo";         //8
                } else {
                    return "Voce nao se classifica";                   //9
                }
            } else if (tipoEmpresaJuridica == "mei") {                //10
                if (lucroEmpresa <= 80000) {                          //11
                    return "Voce se classifica como MEI";             //12
                } else {
                    return "Voce nao se classifica";                  //13
                }
            } else if (tipoEmpresaJuridica == "sociedade") {          //14
                if (lucroEmpresa <= 1000000) {                        //15
                    return "Voce nao se classifica";                  //16
                } else {
                    return "Voce se classfica como Sociedade";        //17
                } }
        }return "Erro";                                                //18
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