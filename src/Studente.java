public class Studente {
    String nome;
    String cognome;
    int age;

    Studente(String nome, String cognome, int age) {
        this.nome = nome;
        this.cognome = cognome;
        this.age = age;
    }

    public String about() {
        return this.nome + this.cognome + ", " + this.age + " anni";
    }
}
