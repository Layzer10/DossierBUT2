package DIP;

public class Project {
    private BackEndDeveloper backEndDeveloper=new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper=new FrontEndDeveloper();

    public void implement(){
        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavaScript();
    }
}
