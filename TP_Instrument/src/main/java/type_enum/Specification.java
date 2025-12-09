package type_enum;

public enum Specification {
    BUILDER, MODEL, TYPE, BACKWOOD, TOPWOOD;

    public String toString() {
        switch (this) {
            case BUILDER: return "BUILDER";
            case MODEL: return "MODEL";
            case TYPE: return "TYPE";
            case BACKWOOD: return "BACKWOOD";
            case TOPWOOD: return "TOPWOOD";
            default: return "Unspecified";
        }
    }
}
