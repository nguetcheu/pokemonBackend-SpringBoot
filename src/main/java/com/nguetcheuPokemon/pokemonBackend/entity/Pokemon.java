package com.nguetcheuPokemon.pokemonBackend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hp")
    private int hp;

    @Column(name = "cp")
    private int cp;

    @Column(name = "name")
    private String name;

    @Column(name = "picture")
    private String picture;

    @ElementCollection
    @CollectionTable(name = "pokemon_types")
    private List<String> types;

    @Column(name = "created")
    private Date Created;
}
