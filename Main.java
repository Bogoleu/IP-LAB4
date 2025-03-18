public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Ion", "ion@gmail.com", "parola123", "0722222222");
        System.out.println(persoana.login("email", "parola"));
        System.out.println(persoana.login("ion@gmail.com", "parola123"));
    }
}
