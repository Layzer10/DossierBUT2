package version2bis.modele;

import type_enum.Builder;
import type_enum.Style;
import type_enum.Type;
import type_enum.Wood;

public class MandolinSpec extends InstrumentSpec {

    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Wood backwood, Wood topWood, Style style){
        super(builder,model,type,backwood,topWood);
        this.style = style;
    }

    public boolean matches(InstrumentSpec instrumentSpec){
        return instrumentSpec instanceof MandolinSpec &&
                    this.style == ((MandolinSpec) instrumentSpec).style &&
                     super.matches(instrumentSpec);
    }
}
