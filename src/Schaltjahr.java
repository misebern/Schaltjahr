public class Schaltjahr {

    public static void main(String[] args) {

        boolean schaltjahr = istSchaltjahr(2020);
        System.out.println("Ist ein Schaltjahr? " + schaltjahr);

    }

    public static boolean istSchaltjahr (int jahr) {
        boolean schaltjahr = true;

        if (jahr % 400 == 0) {
            schaltjahr = true;
        } else if (jahr % 100 == 0) {
            schaltjahr = false;
        } else if (jahr % 4 == 0) {
            schaltjahr = true;
        }
        return schaltjahr;
    }
}
