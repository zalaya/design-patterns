package xyz.zalaya.character;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CharacterAttributes {
    private String name;
    private Integer health;
    private Integer attack;
    private Integer defense;
}
