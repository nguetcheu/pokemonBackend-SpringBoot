package com.nguetcheuPokemon.pokemonBackend.service;

import com.nguetcheuPokemon.pokemonBackend.entity.Pokemon;

import java.util.List;

public interface PokemonService {
    List<Pokemon> getPokemonList();

    Pokemon getPokemonById(Long pokemonId);

    Pokemon savePokemon(Pokemon pokemon);

    Pokemon updatePokemon(Long pokemonId, Pokemon pokemon);

    void deletePokemonById(Long pokemonId);
}
