public class ContoBancario {
    int conto;
    int saldo;

    ContoBancario(int conto, int saldo) {
        this.conto = conto;
        this.saldo = 0;
    }

    public int deposito(int importo) {
        return this.saldo = this.saldo + importo;
    }

    public int prelevo(int prelevo) {
        return this.saldo = this.saldo - prelevo;
    }

    public int getSaldo() {
        return this.saldo;
    }
}
