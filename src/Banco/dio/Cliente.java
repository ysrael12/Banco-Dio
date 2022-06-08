package Banco.dio;

public class Cliente {

  private String cpf;
  private String nome;


  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome() {
    return nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
    if (cpf.length() >= 11 && cpf.length() <= 11){
      System.out.println("cpf valido");

    }else{
      System.out.println("cpf invalido");

    }
  }
  public  String getCpf(){
    return cpf;
  }
}
