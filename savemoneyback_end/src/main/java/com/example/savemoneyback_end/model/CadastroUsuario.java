package com.example.savemoneyback_end.model;

public class CadastroUsuario {
    private int idade;
    private String tipoUsuario;
    private int dataNascimento;
    private int lucroEmpresa;
    private String tipoEmpresaJuridica;
    private String resultado;

    public String cadastroNovoUsuario() throws Exception{
        if(tipoUsuario == "invalido"){ //1
            throw new NullPointerException ("Erro"); //2
        }
        else if (tipoUsuario == "pessoaFisica") { //3
            if (idade < 18) {   //4
                resultado = "Nao pode criar uma conta";//5
            } else {
                resultado = "Ok, maior de 18 anos"; //6
            }
        } else {
            if (tipoEmpresaJuridica == "autonomo") {      //7
                if (lucroEmpresa <= 60000) {    //8
                    resultado = "Voce se classifica como Autonomo"; //9
                } else {
                    resultado = "Voce nao se classifica"; //10
                }
            } else if (tipoEmpresaJuridica == "mei") {   //11
                if (lucroEmpresa <= 80000) {        //12
                    resultado = "Voce se classifica como MEI"; //13
                } else {
                    resultado = "Voce nao se classifica"; //14
                }
            } else if (tipoEmpresaJuridica == "sociedade") {    //15
                if (lucroEmpresa <= 1000000) {        //16
                    resultado = "Voce nao se classifica"; //17
                } else {
                    resultado = "Voce se classfica como Sociedade"; //18
                }
            } else if (tipoEmpresaJuridica == "epp") {  //19
                    resultado = "Voce se classfica como Empresa de Pequeno Porte";  //20
                }
            } return resultado; //21
        } //22



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
