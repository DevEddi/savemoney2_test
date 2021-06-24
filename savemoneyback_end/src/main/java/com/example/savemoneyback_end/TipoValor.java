package com.example.savemoneyback_end;

public class TipoValor {

    public String categoriaValor(IReceita valor_receita){

        double valor = valor_receita.getValor_receita();

        if(valor > 50){ //1
            if (valor < 100) { //2
                return "É um bom valor para começar!" ; //3
            }else if (valor < 200) { //4
                return "Devagar vamos longe."; //5
            } else if (valor < 300) { //6
                return "Acumulando e acumulando"; //7
            } else if (valor < 400) { //8
                return "Bora bora!"; //9
            } else if (valor < 500) {  //10
                return "Quase quinhentos, hein.";  //11
            } else if (valor < 600) { //12
                return "Boa, tá no foco!";  //13
            } else if (valor < 700) { //14
                return "Deixou de ir no mercado?"; //15
            } else if (valor < 800) { //16
                return "Grana da viagem, OK!"; //17
            } else if (valor < 900) { //18
                return "Virou economista?"; //19
            } else if (valor == 1000) {  //20
                return "Milzão? Tá bem na fita!"; //21
            } else {
                return "Nossa! Que baita grana."; //22
            }
        }
        return "Nem precisa cadastrar, guarda no cofre."; //23
    }
}
