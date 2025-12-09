package type_enum;

public enum InstrumenType {
    GUITAR, VIOLON, MANDOLIN, BANJO;

    public String toString() {
        switch (this) {
            case GUITAR: return "GUITAR";
            case VIOLON: return "VIOLON";
            case MANDOLIN: return "MANDOLIN";
            case BANJO: return "BANJO";
            default: return "Unspecified";
        }
    }
}
