import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements IConta{
  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected Cliente cliente;
  protected double saldo;

  public Conta(Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }

  public void imprimirExtrato() {
    System.out.println("Agencia: " + this.agencia);
    System.out.println("Numero: " + this.numero);
    System.out.println("Saldo: " + this.saldo);
    System.out.println("Cliente: " + this.cliente.getNome());
    System.out.println("-----------------------------");
  }
}
