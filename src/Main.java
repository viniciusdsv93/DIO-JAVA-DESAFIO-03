public class Main {
  public static void main(String[] args) {
    Cliente marcos = new Cliente("Marcos");
    Cliente vanessa = new Cliente("Vanessa");

    Conta cc = new ContaCorrente(marcos);
    Conta cp = new ContaPoupanca(vanessa);

    cc.depositar(150);
    cc.transferir(80, cp);

    System.out.println("CC:");
    cc.imprimirExtrato();

    System.out.println("CP:");
    cp.imprimirExtrato();
  }
}
