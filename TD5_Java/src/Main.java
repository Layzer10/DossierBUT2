//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Orthodromie orthodromie= new Orthodromie();
        Alize alize= new Alize();

        Multicoque multicoque= new Multicoque("Moi",orthodromie);
        Monocoque monocoque= new Monocoque("Lui",alize);
    }
}