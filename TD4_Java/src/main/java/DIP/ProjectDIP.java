package DIP;

import java.util.List;

public class ProjectDIP {

    List <Developer> developerlist;

    Client client= new Client();

    public ProjectDIP(List <Developer> developerlist) {
        this.developerlist=developerlist;
    }

    public void implement(){
        for(Developer dev: developerlist){
            dev.developp();
        }
    }
}
