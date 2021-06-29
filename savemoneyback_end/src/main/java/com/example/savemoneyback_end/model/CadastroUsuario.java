package com.example.savemoneyback_end.model;

public class CadastroUsuario {


    private int idade;
    private String tipoUsuario;
    private int dataNascimento;
    private int lucroEmpresa;
    private String tipoEmpresaJuridica;
    private String pessoaJuridica;
    private String autonomo;
    private String mei;
    private String sociedade;
    private String pessoaFisica;

    public String cadastroNovoUsuario() {
        if (tipoUsuario == pessoaFisica) {                        //1
            if (idade < 18) {                                       //2
                return "Nao pode criar uma conta";                 //3
            } else {
                return "Ok, maior de 18 anos";                      //4
            }
        } else if (tipoUsuario == pessoaJuridica) {                 //5
            if (tipoEmpresaJuridica == autonomo) {                  //6
                if (lucroEmpresa <= 60000) {                        //7
                    return "Voce se classifica como Autonomo";      //8
                } else {
                    return "Voce nao se classifica";                //9
                }
            } else if (tipoEmpresaJuridica == mei) {                //10
                if (lucroEmpresa <= 80000) {                         //11
                    return "Voce se classfica como MEI";            //12
                } else {
                    return "Voce nao se classifica";                //13
                }
            } else if (tipoEmpresaJuridica == sociedade) {             //14
                if (lucroEmpresa <= 1000000) {                       //15
                    return "Voce se classfica como MEI";            //16
                } else {
                    return "Voce nao se classifica";                //17
                }
            } else {
                return "Falha falta tipo pessoa;";                           //18
            }

        }

        return "Erro";                                                //19
    }

    public String getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(String pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public String getAutonomo() {
        return autonomo;
    }

    public void setAutonomo(String autonomo) {
        this.autonomo = autonomo;
    }

    public String getMei() {
        return mei;
    }

    public void setMei(String mei) {
        this.mei = mei;
    }

    public String getSociedade() {
        return sociedade;
    }

    public void setSociedade(String sociedade) {
        this.sociedade = sociedade;
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

    public String getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(String pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }
}