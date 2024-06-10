package xyz.zalaya;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class KingdomRegistry {
    private static KingdomRegistry instance;

    private final List<Kingdom> kingdoms;

    private KingdomRegistry() {
        kingdoms = new ArrayList<>();
    }

    public static synchronized KingdomRegistry getInstance() {
        if (instance == null) {
            instance = new KingdomRegistry();
        }

        return instance;
    }

    public void add(Kingdom kingdom) {
        kingdoms.add(kingdom);
    }

    public void remove(Kingdom kingdom) {
        kingdoms.remove(kingdom);
    }
}
