package version2bis.modele;

import type_enum.Builder;
import type_enum.Type;
import type_enum.Wood;

public class GuitarSpec extends InstrumentSpec {
    private int numberOfStrings;

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public GuitarSpec(Builder builder, String model, Type type, Wood backwood, Wood topWood, int numberOfStrings){
        super(builder,model,type,backwood,topWood);
        this.numberOfStrings = numberOfStrings;
    }

    public boolean matches(InstrumentSpec instrumentSpec){
        if(!(instrumentSpec instanceof GuitarSpec)){
            return false;
        }
        if(this.getNumberOfStrings() != ((GuitarSpec) instrumentSpec).numberOfStrings){
            return false;

        }
        return super.matches(instrumentSpec);
    }
}
