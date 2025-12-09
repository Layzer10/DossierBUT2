package version3.modele;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> lisInstruments;

    public Inventory() {
        lisInstruments =new LinkedList<>();
    }

    public void addInstrument(String Sn, double price, InstrumentSpec instrumentSpec){
            lisInstruments.add(new Instrument(Sn,price,instrumentSpec) );
    }

    public Instrument getInstrument(String Sn){
        for(Iterator i = lisInstruments.iterator(); i.hasNext();){
            Instrument instrument=(Instrument)i.next();
            if(instrument.getSerialNumber().equals(Sn)){
                return instrument;
            }
        }
        return null;
    }

    public List search(InstrumentSpec searchSpec){
        List matchingInstruments = new LinkedList<>();
        for(Iterator i = lisInstruments.iterator(); i.hasNext();){

            Instrument instrument=(Instrument)i.next();
            InstrumentSpec instrumentSpec=instrument.getInstrumentSpec();

            if (instrumentSpec.matches(searchSpec)){
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments ;
    }


}
