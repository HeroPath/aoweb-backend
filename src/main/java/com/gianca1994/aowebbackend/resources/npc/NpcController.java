package com.gianca1994.aowebbackend.resources.npc;

import com.gianca1994.aowebbackend.exception.Conflict;
import com.gianca1994.aowebbackend.resources.npc.dto.request.NpcDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @Author: Gianca1994
 * Explanation: NpcController
 */

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/npcs")
public class NpcController {

    @Autowired
    private NpcService npcService;

    @GetMapping()
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('STANDARD')")
    public ArrayList<Npc> getAllNpcs() throws Conflict {
        /**
         * @Author: Gianca1994
         * Explanation: This function is in charge of getting all npcs.
         * @param String token
         * @return ArrayList<Npc>
         */
        try {
            return npcService.getAllNpcs();
        } catch (Exception e) {
            throw new Conflict("Error in getting all npcs");
        }
    }

    @GetMapping("/{name}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('STANDARD')")
    public Npc getNpcByName(@PathVariable String name) throws Conflict {
        /**
         * @Author: Gianca1994
         * Explanation: This function is in charge of getting the npc by name.
         * @param String token
         * @param String name
         * @return Npc
         */
        return npcService.getNpcByName(name);
    }

    @GetMapping("/zone/{zone}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('STANDARD')")
    public ArrayList<Npc> filterNpcByZone(@PathVariable String zone) throws Conflict {
        /**
         * @Author: Gianca1994
         * Explanation: This function is in charge of filtering the npcs by zone.
         * @param String zone
         * @return ArrayList<Npc>
         */
        return npcService.filterNpcByZone(zone);
    }

    @PostMapping()
    @PreAuthorize("hasAuthority('ADMIN')")
    public Npc saveNpc(@RequestBody NpcDTO npc) throws Conflict {
        /**
         * @Author: Gianca1994
         * Explanation: This function is in charge of saving the npc.
         * @param String token
         * @param Npc npc
         * @return Npc
         */
        return npcService.saveNpc(npc);
    }
}
