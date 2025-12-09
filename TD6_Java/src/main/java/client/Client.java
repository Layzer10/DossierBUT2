package client;

import composant.Monocoque;
import composant.Voilier;
import strategie.Alize;
import strategie.Orthodromie;

public class Client {
    public static void main(String[] args) {
        Voilier voilier1= new Monocoque("v1",new Orthodromie()) {
        };
        Voilier voilier2= new Monocoque("v2",new Alize()) {
        };
    }
}
