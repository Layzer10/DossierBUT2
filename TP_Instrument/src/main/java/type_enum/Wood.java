package type_enum;

public enum Wood {
    INDIAN_ROSEWOOD, SITKA, ALDER, MAHOGANY, ADIRONDACK, BRAZILIAN_ROSEWOOD, CEDAR, COCOBOLO, MAPLE;

    public String toString() {
        switch (this) {
            case INDIAN_ROSEWOOD: return "Indian Rosewood";
            case SITKA: return "Sitka";
            case ALDER: return "Alder";
            case MAHOGANY: return "Mahogany";
            case ADIRONDACK: return "Adirondack";
            case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
            case CEDAR: return "Cedar";
            case COCOBOLO: return "Cocobol";
            case MAPLE: return "Maple";
            default: return "Unspecified";
        }
    }
}
