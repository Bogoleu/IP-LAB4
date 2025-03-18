public class Client extends Persoana {
    private String idClient;
    private String iban;
    private String[] conturi;

    public Client(String nume, String email, String parola, String telefon, String idClient, String iban, String[] conturi) {
        super(nume, email, parola, telefon);
        this.idClient = idClient;
        this.iban = iban;
        this.conturi = conturi;
    }

    public void vizualizareConturi() {
        System.out.println("Conturile clientului " + idClient + ":");
        for (String cont : conturi) {
            System.out.println(cont);
        }
    }

    public void interogareSold() {
        System.out.println("Soldul pentru clientul " + idClient + " este: 1250 RON.");
    }
}
