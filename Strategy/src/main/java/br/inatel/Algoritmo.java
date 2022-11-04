package br.inatel;

import java.util.ArrayList;

public abstract class Algoritmo {

 public Ordenador ordenador;

 public ArrayList ordenaVetor(ArrayList<Integer> listaInt){
   return  ordenador.ordenacao(listaInt);
 }

 public Ordenador getOrdenador() {
  return ordenador;
 }

 public void setOrdenador(Ordenador ordenador) {
  this.ordenador = ordenador;
 }

}
