package com.gianca1994.aowebbackend.resources.npc.utilities;

import com.gianca1994.aowebbackend.exception.Conflict;
import com.gianca1994.aowebbackend.exception.NotFound;
import com.gianca1994.aowebbackend.resources.npc.Npc;
import com.gianca1994.aowebbackend.resources.npc.dto.request.NpcDTO;
import com.gianca1994.aowebbackend.resources.npc.utilities.NpcConst;

import java.util.Set;

public class NpcServiceValidator {

    public void npcFoundByObject(Npc npc) {
        /**
         *
         */
        if (npc == null) throw new NotFound(NpcConst.NPC_NOT_FOUND);
    }

    public void npcFound(boolean npcExist) {
        /**
         *
         */
        if (!npcExist) throw new NotFound(NpcConst.NPC_NOT_FOUND);
    }

    public void npcNotFoundZone(int npcSize) {
        /**
         * @Author: Gianca1994
         * Explanation: This method is used to filter the npcs by zone
         * @param Set<Npc> npcs
         * @return void
         */
        if (npcSize <= 0) throw new NotFound(NpcConst.NPC_NOT_FOUND_ZONE);
    }

    public void saveNpc(NpcDTO npc) throws Conflict {
        /**
         * @Author: Gianca1994
         * Explanation: This method is used to validate the npc before saving it
         * @param NpcDTO npc
         * @return void
         */
        if (npc.getName().isEmpty()) throw new Conflict(NpcConst.NAME_EMPTY);
        if (npc.getLevel() < 1) throw new Conflict(NpcConst.LEVEL_LESS_THAN_ONE);
        if (npc.getGiveMinExp() < 0) throw new Conflict(NpcConst.GIVE_MIN_EXP_LESS_THAN_ZERO);
        if (npc.getGiveMaxExp() < 0) throw new Conflict(NpcConst.GIVE_MAX_EXP_LESS_THAN_ZERO);
        if (npc.getGiveMinGold() < 0) throw new Conflict(NpcConst.GIVE_MIN_GOLD_LESS_THAN_ZERO);
        if (npc.getGiveMaxGold() < 0) throw new Conflict(NpcConst.GIVE_MAX_GOLD_LESS_THAN_ZERO);
        if (npc.getHp() < 0) throw new Conflict(NpcConst.HP_LESS_THAN_ZERO);
        if (npc.getMaxHp() < 0) throw new Conflict(NpcConst.MAX_HP_LESS_THAN_ZERO);
        if (npc.getMinDmg() < 0) throw new Conflict(NpcConst.MIN_DMG_LESS_THAN_ZERO);
        if (npc.getMaxDmg() < 0) throw new Conflict(NpcConst.MAX_DMG_LESS_THAN_ZERO);
        if (npc.getDefense() < 0) throw new Conflict(NpcConst.DEFENSE_LESS_THAN_ZERO);
        if (npc.getZone().isEmpty()) throw new Conflict(NpcConst.ZONE_EMPTY);
    }
}
