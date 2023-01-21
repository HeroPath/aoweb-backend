package com.gianca1994.aowebbackend.combatSystem.pvp;

import com.gianca1994.aowebbackend.config.SvConfig;
import com.gianca1994.aowebbackend.resources.classes.Class;
import com.gianca1994.aowebbackend.resources.equipment.Equipment;
import com.gianca1994.aowebbackend.resources.inventory.Inventory;
import com.gianca1994.aowebbackend.resources.role.Role;
import com.gianca1994.aowebbackend.resources.title.Title;
import com.gianca1994.aowebbackend.resources.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PvpFunctionsTest {

    private User userTest1 = new User(
            "testusername", "testpassword", "testusername@test.com", new Role(),
            new Class(),
            new Title(),
            new Inventory(),
            new Equipment(),
            1, 1, 1, 1, 1
    );

    private User userTest2 = new User(
            "testusername2", "testpassword2", "testusername2@test.com", new Role(),
            new Class(),
            new Title(),
            new Inventory(),
            new Equipment(),
            1, 1, 1, 1, 1
    );

    private final PvpFunctions pvpFunctionsTest = new PvpFunctions();

    @Test
    void getUserGoldAmountWin() {
    }

    @Test
    void givenUserDefender_whenCalculateUserAttackerGoldAmountWin_thenReturnUserAttackerGoldAmountWin() {
        userTest2.setGold(100);
        assertThat(pvpFunctionsTest.getUserGoldAmountWin(userTest2)).isEqualTo(25);
        userTest2.setGold(0);
        assertThat(pvpFunctionsTest.getUserGoldAmountWin(userTest2)).isEqualTo(0);
    }

    @Test
    void givenUserDefender_whenCalculateUserAttackerGoldAmountLose_thenReturnUserAttackerGoldAmountLose() {
        userTest2.setGold(100);
        assertThat(pvpFunctionsTest.getUserGoldAmountLose(userTest2)).isEqualTo(75);
        userTest2.setGold(0);
        assertThat(pvpFunctionsTest.getUserGoldAmountLose(userTest2)).isEqualTo(0);
    }

    @Test
    void givenUserAttacker_whenCalculateUserAttackerGoldLoseForLoseCombat_thenReturnUserAttackerGoldLoseForLoseCombat() {
        userTest1.setGold(100);
        assertThat(pvpFunctionsTest.getUserGoldLoseForLoseCombat(userTest1)).isEqualTo(10);
        userTest1.setGold(0);
        assertThat(pvpFunctionsTest.getUserGoldLoseForLoseCombat(userTest1)).isEqualTo(0);
    }

    @Test
    void givenUserAttackerAndUserDefender_whenCheckBothUsersAlive_thenReturnTrue() {
        userTest1.setHp(1);
        userTest2.setHp(1);
        assertThat(pvpFunctionsTest.checkBothUsersAlive(userTest1, userTest2)).isTrue();
    }

    @Test
    void givenUserAttackerAndUserDefender_whenCheckBothUsersAlive_thenReturnFalse() {
        userTest1.setHp(0);
        userTest2.setHp(1);
        assertThat(pvpFunctionsTest.checkBothUsersAlive(userTest1, userTest2)).isFalse();
        userTest1.setHp(1);
        userTest2.setHp(0);
        assertThat(pvpFunctionsTest.checkBothUsersAlive(userTest1, userTest2)).isFalse();
        userTest1.setHp(0);
        userTest2.setHp(0);
        assertThat(pvpFunctionsTest.checkBothUsersAlive(userTest1, userTest2)).isFalse();
    }

    @Test
    void whenCalculatePointsTitleWin_thenReturnPointsTitleWin() {
        assertThat(pvpFunctionsTest.calculatePointsTitleWinOrLose()).isBetween(
                SvConfig.PVP_MIN_RATE_POINT_TITLE, SvConfig.PVP_MAX_RATE_POINT_TITLE
                );
    }
}