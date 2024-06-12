package xyz.zalaya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.zalaya.character.Character;
import xyz.zalaya.character.implementation.Knight;
import xyz.zalaya.character.implementation.Wizard;
import xyz.zalaya.order.Order;

public class BattleTest {
    @Test
    @DisplayName("Execute knight attack order")
    public void testExecuteKnightAttackOrder() {
        Character knight = new Knight();
        Order order = knight::attack;
        Battle battle = new Battle();

        battle.executeOrder(order);

        Assertions.assertEquals(1, battle.getOrders().size());
    }

    @Test
    @DisplayName("Execute knight defend order")
    public void testExecuteKnightDefendOrder() {
        Character knight = new Knight();
        Order order = knight::defend;
        Battle battle = new Battle();

        battle.executeOrder(order);

        Assertions.assertEquals(1, battle.getOrders().size());
    }

    @Test
    @DisplayName("Execute knight attack and defend orders")
    public void testExecuteKnightAttackAndDefendOrders() {
        Character knight = new Knight();
        Order attackOrder = knight::attack;
        Order defendOrder = knight::defend;
        Battle battle = new Battle();

        battle.executeOrder(attackOrder);
        battle.executeOrder(defendOrder);

        Assertions.assertEquals(2, battle.getOrders().size());
    }

    @Test
    @DisplayName("Execute wizard attack order")
    public void testExecuteWizardAttackOrder() {
        Character wizard = new Wizard();
        Order order = wizard::attack;
        Battle battle = new Battle();

        battle.executeOrder(order);

        Assertions.assertEquals(1, battle.getOrders().size());
    }

    @Test
    @DisplayName("Execute wizard defend order")
    public void testExecuteWizardDefendOrder() {
        Character wizard = new Wizard();
        Order order = wizard::defend;
        Battle battle = new Battle();

        battle.executeOrder(order);

        Assertions.assertEquals(1, battle.getOrders().size());
    }

    @Test
    @DisplayName("Execute wizard attack and defend orders")
    public void testExecuteWizardAttackAndDefendOrders() {
        Character wizard = new Wizard();
        Order attackOrder = wizard::attack;
        Order defendOrder = wizard::defend;
        Battle battle = new Battle();

        battle.executeOrder(attackOrder);
        battle.executeOrder(defendOrder);

        Assertions.assertEquals(2, battle.getOrders().size());
    }
}
