package com.gianca1994.aowebbackend.config;

public class SvConfig {
    /**
     * @Author: Gianca1994
     * Explanation: This class is used to modify the configuration of the application.
     */
    /////////////////////////// BASIC STATICS ///////////////////////////
    public static final int EXPERIENCE_MULTIPLIER = 100000;
    public static final int GOLD_MULTIPLIER = 10000;
    public static final short LEVEL_MAX = 300;
    /////////////////////////// BASIC STATICS ///////////////////////////

    /////////////////////////// DIAMONDS ///////////////////////////
    public static final int DIAMOND_DROP_CHANCE_PERCENTAGE = 5;
    public static final int MAXIMUM_AMOUNT_DIAMONDS_DROP = 5;
    /////////////////////////// DIAMONDS ///////////////////////////

    /////////////////////////// PVP WIN OR LOSS RATE ///////////////////////////
    public static final float PVP_GOLD_WIN_RATE = 0.25f;
    public static final float PVP_GOLD_LOSS_RATE = 0.1f;
    /////////////////////////// PVP WIN OR LOSS RATE ///////////////////////////

    /////////////////////////// TITLE POINTS ///////////////////////////
    public static final int PVP_MIN_RATE_POINT_TITLE = 50;
    public static final int PVP_MAX_RATE_POINT_TITLE = 100;
    /////////////////////////// TITLE POINTS ///////////////////////////

    /////////////////////////// PVP ///////////////////////////
    public static final float MIN_PERCENTAGE_LIFE_ATTACK_OR_ATTACKED = 0.15f;
    public static final int CRITICAL_DAMAGE_MULTIPLIER = 2;
    public static final int MAX_LEVEL_DIFFERENCE = 5;
    /////////////////////////// PVP ///////////////////////////

    /////////////////////////// ITEM ///////////////////////////
    public static final int MAX_ITEMS_INVENTORY = 24;
    /////////////////////////// ITEM ///////////////////////////

    /////////////////////////// QUEST ///////////////////////////
    public static final int MAX_ACTIVE_QUESTS = 3;
    /////////////////////////// QUEST ///////////////////////////

    /////////////////////////// GUILD ///////////////////////////
    public static final int MAX_MEMBERS_IN_GUILD = 5;
    public static final int LEVEL_TO_CREATE_GUILD = 100;
    public static final int GOLD_TO_CREATE_GUILD = 500000;
    public static final int DIAMOND_TO_CREATE_GUILD = 100;
    public static final int LEVEL_TO_JOIN_GUILD = 10;
    /////////////////////////// GUILD ///////////////////////////

}
