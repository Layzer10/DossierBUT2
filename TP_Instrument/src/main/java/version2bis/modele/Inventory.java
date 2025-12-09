package version2bis.modele;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> lisInstruments;

    public Inventory() {
        lisInstruments =new LinkedList<>();
    }

    public void addinstrument(String Sn, double price, InstrumentSpec instrumentSpec){
            lisInstruments.add(InstrumentFactory.createInstrument(Sn,price,instrumentSpec));
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

    public List search(InstrumentSpec shearchSpec){
        List shearch=new LinkedList<>();
        for(Iterator i = lisInstruments.iterator(); i.hasNext();){
            Instrument instrument=(Instrument)i.next();
            InstrumentSpec instrumentSpec=instrument.getInstrumentSpec();
            if(instrumentSpec.matches(shearchSpec)){
                shearch.add(instrument);
            }
        }
        return shearch;
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec instrumentSpec){
        lisInstruments.add(InstrumentFactory.createInstrument(serialNumber,price,instrumentSpec));
    }
}
