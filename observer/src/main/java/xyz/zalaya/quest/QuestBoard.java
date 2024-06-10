package xyz.zalaya.quest;

import lombok.Getter;
import xyz.zalaya.knight.Adventurer;

import java.util.ArrayList;
import java.util.List;

@Getter
public class QuestBoard {
    private final List<Adventurer> adventurers;
    private Quest quest;

    public QuestBoard() {
        adventurers = new ArrayList<>();
        quest = null;
    }

    public void addAdventurer(Adventurer adventurer) {
        adventurers.add(adventurer);
    }

    public void removeAdventurer(Adventurer adventurer) {
        adventurers.remove(adventurer);
    }

    public void postQuest(Quest quest) {
        this.quest = quest;
        notifyAdventurers();
    }

    public void notifyAdventurers() {
        adventurers.forEach(Adventurer::update);
    }
}
