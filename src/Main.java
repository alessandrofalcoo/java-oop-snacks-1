
public class Main {
    public static void main(String[] args) {
        Studente student = new Studente("Mario ", "Rossi", 20);
        System.out.println(student.about());

        ContoBancario conto = new ContoBancario(0, 0);

        System.out.println(conto.deposito(1000));
        System.out.println(conto.prelevo(234));
    }

}
