public class Main {
    public static void main(String[] args) {
        String[] conturi = {"RO12BANK3456789012345678", "RO98BANK8765432109876543"};

        Client client = new Client("Ion Popescu", "ion.popescu@email.com", "parola123", "0712345678",
                "C12345", "RO00BANK0000000000000000", conturi);

        client.vizualizareConturi();
        client.interogareSold();
    }
}
