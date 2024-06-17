package xyz.zalaya;

public class BreadFactory {

    public Bread create(BreadType type) {
        return switch (type) {
            case BAGUETTE -> new Baguette();
            case BRIOCHE -> new Brioche();
        };
    }

}
