package Banco.dio;

import java.util.List;

public class Banco {
  private String nome;
  private List<Conta> contas;

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public java.util.List<Conta> getContas(){
    return contas;
  }

  public void setContas(java.util.List<Conta> contas) {
    this.contas = contas;
  }
}
