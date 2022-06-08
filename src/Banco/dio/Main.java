package Banco.dio;

public class Main {
  public static void main(String[] args) {
    Cliente Ysrael = new Cliente() ;
    Ysrael.setNome("Ysrael ");
    Ysrael.setCpf("11111111111");

    Conta cc = new ContaCorrente(Ysrael) ;
    Conta poupança = new ContaPoupanca(Ysrael) ;
    cc.depositar(900);
    cc.transferir(100, poupança);
    cc.imprimirExtrato();
    poupança.imprimirExtrato();
  }
}
