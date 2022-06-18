package com.gianca1994.aowebbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @Column
    private String username;

    @Column
    @JsonIgnore
    private String password;

    @Column
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id",
                    referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id",
                    referencedColumnName = "id"))
    private Role role;

    @Column
    private short level;
    @Column
    private long experience;
    @Column
    private long experienceToNextLevel;

    @Column
    private long gold;
    @Column
    private int diamond;


    @Column
    private long maxDmg;
    @Column
    private long minDmg;

    @Column
    private int maxHp;
    @Column
    private int hp;
    @Column
    private int strength;
    @Column
    private int dexterity;
    @Column
    private int intelligence;
    @Column
    private int vitality;
    @Column
    private int luck;

    public User(String username, String password, String email, Role role, short level, long experience, long experienceToNextLevel, long gold, int diamond, long maxDmg, long minDmg, int maxHp, int hp, int strength, int dexterity, int intelligence, int vitality, int luck) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.level = level;
        this.experience = experience;
        this.experienceToNextLevel = experienceToNextLevel;
        this.gold = gold;
        this.diamond = diamond;
        this.maxDmg = maxDmg;
        this.minDmg = minDmg;
        this.maxHp = maxHp;
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.vitality = vitality;
        this.luck = luck;
    }
}
