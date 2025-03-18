public class Persoana {
    private String nume;
    private String email;
    private String parola;
    private String telefon;

    public Persoana(String nume, String email, String parola, String telefon) {
        this.nume = nume;
        this.email = email;
        this.parola = parola;
        this.telefon = telefon;
    }
    public boolean login(String email, String parola) {
        if (email==this.email && parola==this.parola) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Persoana{" + " email='" + email + '\'' + ", parola='" + parola  + '}';
    }
}
