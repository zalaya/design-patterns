package xyz.zalaya.kingdom;

public class Kingdom {
    private final KingdomAttributes attributes;

    private static Kingdom instance;

    private Kingdom(KingdomAttributes attributes) {
        this.attributes = attributes;
    }

    public static Kingdom getInstance(KingdomAttributes attributes) {
        if (instance == null) {
            instance = new  Kingdom(attributes);
        }

        return instance;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Kingdom name: ").append(attributes.getName()).append("\n");
        builder.append("Kingdom population: ").append(attributes.getPopulation()).append("\n");
        builder.append("Kingdom area: ").append(attributes.getArea()).append("\n");

        return builder.toString();
    }
}
