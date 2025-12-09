package DIP;

public class BackEndDeveloper implements Developer {
    public void writeJava(){
        System.out.println("Je suis un backEndDeveloper et je developpe en java");
    }

    @Override
    public void developp() {
        writeJava();
    }
}
