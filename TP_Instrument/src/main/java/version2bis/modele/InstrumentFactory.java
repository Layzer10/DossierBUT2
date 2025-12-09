package version2bis.modele;

public class InstrumentFactory {

    public static Instrument createInstrument(String Sn, double price, InstrumentSpec instrumentSpec){
         if(instrumentSpec instanceof GuitarSpec){
             return new Guitar(Sn, price, (GuitarSpec) instrumentSpec);
        }
        if (instrumentSpec instanceof MandolinSpec){

             return new Mandolin(Sn, price, (MandolinSpec) instrumentSpec);
        }
        return null;
    }
}
