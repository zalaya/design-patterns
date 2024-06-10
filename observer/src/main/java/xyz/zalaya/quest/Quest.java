package xyz.zalaya.quest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Quest {
    private String title;
    private String description;
    private boolean completed;
}
