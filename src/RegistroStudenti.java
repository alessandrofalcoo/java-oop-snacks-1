public class RegistroStudenti {
    private Studente[] studenti;

    RegistroStudenti() {
        studenti = new Studente[] {};
    }

    public void aggiungiStudente(String nome, String cognome, int age) {
        int count = studenti.length;
        Studente[] pippo = new Studente[count + 1];

        for (int i = 0; i < count; i++) {
            pippo[i] = studenti[i];
        }
        pippo[count] = new Studente(nome, cognome, age);

        studenti = pippo;
    }

    public void stampaRegistro() {
        for (int i = 0; i < studenti.length; i++) {
            System.out.println(studenti[i].nome);
            System.out.println(studenti[i].cognome);
            System.out.println(studenti[i].age);
        }
    }
}
