
public class Main {
    public static void main(String[] args) {
        RegistroStudenti registro = new RegistroStudenti();

        registro.aggiungiStudente("Mario", "Rossi", 20);
        registro.aggiungiStudente("Luca", "Bianchi", 19023);
        registro.aggiungiStudente("Giorgio", "Verdi", 243);
        registro.aggiungiStudente("Giuseppe", "Falco", 60);

        registro.stampaRegistro();

        /*
         * ContoBancario conto = new ContoBancario(0, 0);
         * 
         * System.out.println(conto.deposito(1000));
         * System.out.println(conto.prelevo(234));
         */
    }

}
