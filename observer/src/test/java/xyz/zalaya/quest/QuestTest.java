package xyz.zalaya.quest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QuestTest {
    @Test
    @DisplayName("Test create quest")
    public void testCreateQuest() {
        Quest quest = new Quest(
            "Find the Holy Grail",
            "Find the Holy Grail in the Castle of Aaargh",
            false
        );

        Assertions.assertEquals("Find the Holy Grail", quest.getTitle());
        Assertions.assertEquals("Find the Holy Grail in the Castle of Aaargh", quest.getDescription());
        Assertions.assertFalse(quest.isCompleted());
    }

    @Test
    @DisplayName("Test complete quest")
    public void testCompleteQuest() {
        Quest quest = new Quest(
            "Find the Holy Grail",
            "Find the Holy Grail in the Castle of Aaargh",
            false
        );

        quest.setCompleted(true);

        Assertions.assertTrue(quest.isCompleted());
    }

    @Test
    @DisplayName("Test incomplete quest")
    public void testIncompleteQuest() {
        Quest quest = new Quest(
            "Find the Holy Grail",
            "Find the Holy Grail in the Castle of Aaargh",
            true
        );

        quest.setCompleted(false);

        Assertions.assertFalse(quest.isCompleted());
    }

    @Test
    @DisplayName("Test change quest title")
    public void testChangeQuestTitle() {
        Quest quest = new Quest(
            "Find the Holy Grail",
            "Find the Holy Grail in the Castle of Aaargh",
            false
        );

        quest.setTitle("Find the Holy Grail in the Castle of Aaargh");

        Assertions.assertEquals("Find the Holy Grail in the Castle of Aaargh", quest.getTitle());
    }

    @Test
    @DisplayName("Test change quest description")
    public void testChangeQuestDescription() {
        Quest quest = new Quest(
            "Find the Holy Grail",
            "Find the Holy Grail in the Castle of Aaargh",
            false
        );

        quest.setDescription("Find the Holy Grail in the Castle of Aaargh, but be careful with the rabbit");

        Assertions.assertEquals("Find the Holy Grail in the Castle of Aaargh, but be careful with the rabbit", quest.getDescription());
    }

    @Test
    @DisplayName("Test change quest title and description")
    public void testChangeQuestTitleAndDescription() {
        Quest quest = new Quest(
            "Find the Holy Grail",
            "Find the Holy Grail in the Castle of Aaargh",
            false
        );

        quest.setTitle("Find the Holy Grail in the Castle of Aaargh");
        quest.setDescription("Find the Holy Grail in the Castle of Aaargh, but be careful with the rabbit");

        Assertions.assertEquals("Find the Holy Grail in the Castle of Aaargh", quest.getTitle());
        Assertions.assertEquals("Find the Holy Grail in the Castle of Aaargh, but be careful with the rabbit", quest.getDescription());
    }

    @Test
    @DisplayName("Test change quest title and description to the same values")
    public void testChangeQuestTitleAndDescriptionToTheSameValues() {
        Quest quest = new Quest(
            "Find the Holy Grail",
            "Find the Holy Grail in the Castle of Aaargh",
            false
        );

        quest.setTitle("Find the Holy Grail");
        quest.setDescription("Find the Holy Grail in the Castle of Aaargh");

        Assertions.assertEquals("Find the Holy Grail", quest.getTitle());
        Assertions.assertEquals("Find the Holy Grail in the Castle of Aaargh", quest.getDescription());
    }
}
