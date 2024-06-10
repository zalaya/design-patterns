package xyz.zalaya.quest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.zalaya.knight.Knight;

public class QuestBoardTest {
    @Test
    @DisplayName("Test create quest board")
    public void testCreateQuestBoard() {
        QuestBoard questBoard = new QuestBoard();

        questBoard.addAdventurer(new Knight("Lancelot"));
        questBoard.addAdventurer(new Knight("Galahad"));
        questBoard.addAdventurer(new Knight("Percival"));

        Assertions.assertNotNull(questBoard);
        Assertions.assertEquals(3, questBoard.getAdventurers().size());
        Assertions.assertNull(questBoard.getQuest());
    }

    @Test
    @DisplayName("Test post quest")
    public void testPostQuest() {
        QuestBoard questBoard = new QuestBoard();

        questBoard.addAdventurer(new Knight("Lancelot"));
        questBoard.addAdventurer(new Knight("Galahad"));
        questBoard.addAdventurer(new Knight("Percival"));

        Quest quest = new Quest(
            "Find the Holy Grail",
            "Find the Holy Grail in the Castle of Aaargh",
            false
        );

        questBoard.postQuest(quest);

        Assertions.assertEquals(quest, questBoard.getQuest());
        Assertions.assertFalse(quest.isCompleted());
        Assertions.assertEquals(3, questBoard.getAdventurers().size());
    }

    @Test
    @DisplayName("Test add adventurer")
    public void testAddAdventurer() {
        QuestBoard questBoard = new QuestBoard();

        questBoard.addAdventurer(new Knight("Lancelot"));
        questBoard.addAdventurer(new Knight("Galahad"));
        questBoard.addAdventurer(new Knight("Percival"));

        Knight knight = new Knight("Arthur");

        questBoard.addAdventurer(knight);

        Assertions.assertEquals(4, questBoard.getAdventurers().size());
    }

    @Test
    @DisplayName("Test remove adventurer")
    public void testRemoveAdventurer() {
        QuestBoard questBoard = new QuestBoard();

        questBoard.addAdventurer(new Knight("Lancelot"));
        questBoard.addAdventurer(new Knight("Galahad"));
        questBoard.addAdventurer(new Knight("Percival"));

        Knight knight = new Knight("Arthur");

        questBoard.addAdventurer(knight);
        questBoard.removeAdventurer(knight);

        Assertions.assertEquals(3, questBoard.getAdventurers().size());
    }

    @Test
    @DisplayName("Test notify adventurers")
    public void testNotifyAdventurers() {
        QuestBoard questBoard = new QuestBoard();

        questBoard.addAdventurer(new Knight("Lancelot"));
        questBoard.addAdventurer(new Knight("Galahad"));
        questBoard.addAdventurer(new Knight("Percival"));

        questBoard.postQuest(new Quest(
            "Find the Holy Grail",
            "Find the Holy Grail in the Castle of Aaargh",
            false
        ));

        questBoard.notifyAdventurers();
    }

    @Test
    @DisplayName("Test notify adventurers with no quest")
    public void testNotifyAdventurersWithNoQuest() {
        QuestBoard questBoard = new QuestBoard();

        questBoard.addAdventurer(new Knight("Lancelot"));
        questBoard.addAdventurer(new Knight("Galahad"));
        questBoard.addAdventurer(new Knight("Percival"));

        questBoard.notifyAdventurers();
    }
}
