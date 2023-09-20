package com.nguetcheuPokemon.pokemonBackend.repository;

import com.nguetcheuPokemon.pokemonBackend.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
