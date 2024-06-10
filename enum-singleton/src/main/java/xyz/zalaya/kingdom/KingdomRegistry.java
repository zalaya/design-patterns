package xyz.zalaya.kingdom;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum KingdomRegistry {
    INSTANCE;

    private final List<Kingdom> kingdoms;

    KingdomRegistry() {
        kingdoms = new ArrayList<>();
    }

    public void add(Kingdom kingdom) {
        kingdoms.add(kingdom);
    }

    public void remove(Kingdom kingdom) {
        kingdoms.remove(kingdom);
    }
}
