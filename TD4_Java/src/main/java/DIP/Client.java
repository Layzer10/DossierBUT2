package DIP;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Developer> Devloperlist=new ArrayList<>();
        Devloperlist.add(new BackEndDeveloper());
        Devloperlist.add(new FrontEndDeveloper());
        ProjectDIP projectDIP = new ProjectDIP(Devloperlist);
        projectDIP.implement();

    }
}
