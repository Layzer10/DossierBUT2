package version2bis.modele;

import type_enum.Builder;
import type_enum.Type;
import type_enum.Wood;

public abstract class InstrumentSpec {
    private Builder builder;
    private String modele;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.modele = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() { return builder; }
    public String getModele() { return modele; }
    public Type getType() { return type; }
    public Wood getBackWood() { return backWood; }
    public Wood getTopWood() { return topWood; }

    public boolean matches(InstrumentSpec otherSpec) {
        if (builder != otherSpec.builder) return false;
        if (modele != otherSpec.modele) return false;
        if (type != otherSpec.type) return false;
        if (backWood != otherSpec.backWood) return false;
        if (topWood != otherSpec.topWood) return false;
        return true;
    }
}
