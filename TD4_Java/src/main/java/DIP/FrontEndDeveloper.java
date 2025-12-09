package DIP;

public class FrontEndDeveloper implements Developer {
    public void writeJavaScript(){
        System.out.println("Je suis un frontEndDeveloper et je developpe en javascript");
    }


    @Override
    public void developp() {
        writeJavaScript();
    }
}
