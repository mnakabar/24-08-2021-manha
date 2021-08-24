package com.company;

public class Pessoa {
 String nome;
 int idade;
 String id;
 double peso;
 double altura;

 public Pessoa (){

 }
 public Pessoa (String nome, int idade, String id){
     nome = nome;
     idade = idade;
     id = id;
 }
 public Pessoa (String nome, int idade, String id, double peso, double altura){
  this.nome = nome;
  this.idade = idade;
  this.id = id;
  this.altura = altura;
  this.peso = peso;
 }
 public double calcularIMC(){
  double imc = this.peso/(this.altura*this.altura);
  if (imc < 20){
   return -1;
  }
  else if ((imc >=20 && imc <= 25)) {
   return 0;
  }
  else {
   return  1;
  }

 }
 public boolean eMaiorDeIdade (){
 if (this.idade < 18){
  return false;
 }
 else {
  return  true;
 }
 }

}
