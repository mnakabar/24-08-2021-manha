package com.company;
import com.company.Pessoa;
public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa("Melissa", 8, "abc123");
        Pessoa pessoa2 = new Pessoa("Bernardo", 23, "bcd543",60.0, 1.65);
        //Pessoa pessoa3 = new Pessoa("Jenifer", 30,);
        //System.out.println("Ësse construtor não existe porque não foi criado");
        double resultadoImc = pessoa2.calcularIMC();
        if (resultadoImc == -1){
            System.out.println("Abaixo do peso.");
        }
        else if ((resultadoImc == 0)){
            System.out.println("Resultado normal");
        }
        else {
            System.out.println("Acima do peso.");
        }
         if (pessoa2.eMaiorDeIdade()){
             System.out.println("É maior de idade.");
         }
         else {
             System.out.println("É menor de idade.");
         }
    }
}
