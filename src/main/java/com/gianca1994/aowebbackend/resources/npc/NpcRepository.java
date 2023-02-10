package com.gianca1994.aowebbackend.resources.npc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

/**
 * @Author: Gianca1994
 * Explanation: NpcRepository
 */

@Repository
public interface NpcRepository extends JpaRepository<Npc, Long> {
    Npc findByName(String name);
    boolean existsByName(String name);

    @Query("SELECT n FROM Npc n WHERE n.zone = :zone ORDER BY n.level ASC")
    ArrayList<Npc> findByZoneAndOrderByLevel(@Param("zone") String zone);
}
