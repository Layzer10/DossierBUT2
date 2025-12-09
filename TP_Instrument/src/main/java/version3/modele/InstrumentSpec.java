package version3.modele;

import type_enum.Specification;

import java.util.HashMap;

public  class InstrumentSpec {
    private HashMap<Specification, Object> mapSpecifications;

    public InstrumentSpec(HashMap<Specification, Object>spec){
        this.mapSpecifications = spec;

    }

    /**
     * matches return true quand la map du parametre (intrumentSpec) est incluse dans celle de this (de l'objet appelant)
     * @param instrumentSpec
     * @return
     */
    public boolean matches(InstrumentSpec instrumentSpec){

       // parcours des cles du dict de instrumentSpec
       for(Specification cle : instrumentSpec.mapSpecifications.keySet()){

               if (! instrumentSpec.mapSpecifications.get(cle).equals(this.mapSpecifications.get(cle))){
                   return false;
       }
               else {
                   return true;
               }
       }

        return true;
    }
/*
    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackwood() {
        return backwood;
    }

    public void setBackwood(Wood backwood) {
        this.backwood = backwood;
    }

    public Wood getTopwood() {
        return topwood;
    }

    public void setTopwood(Wood topwood) {
        this.topwood = topwood;
    }*/
}
