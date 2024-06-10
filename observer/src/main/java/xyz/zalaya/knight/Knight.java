package xyz.zalaya.knight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Knight implements Adventurer {
    private String name;

    public void update() {
        System.out.println("Knight " + name + " has been notified of a new quest!");
    }
}
