package version3.modele;

public class Instrument {
    private String serialNumber;
    private double price;
    private version3.modele.InstrumentSpec instrumentSpec;



    public Instrument(String serialNumber, double price, version3.modele.InstrumentSpec instrumentSpec ) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;

    }


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }

    @Override
    public String toString() {
        return getSerialNumber() + "," + getPrice() + " Spec : \n" + getInstrumentSpec();
    }

}


