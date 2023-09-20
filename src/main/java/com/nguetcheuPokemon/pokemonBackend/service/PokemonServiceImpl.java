package com.nguetcheuPokemon.pokemonBackend.service;

import com.nguetcheuPokemon.pokemonBackend.entity.Pokemon;
import com.nguetcheuPokemon.pokemonBackend.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService{

    @Autowired
    private PokemonRepository pokemonRepository;

    @Override
    public List<Pokemon> getPokemonList() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon getPokemonById(Long pokemonId) {
        return pokemonRepository.findById(pokemonId).get();
    }

    @Override
    public Pokemon savePokemon(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @Override
    public Pokemon updatePokemon(Long pokemonId, Pokemon pokemon) {
        Pokemon Thepokemon = pokemonRepository.findById(pokemonId).get();
        return pokemonRepository.save(Thepokemon);
    }

    @Override
    public void deletePokemonById(Long pokemonId) {
        pokemonRepository.deleteById(pokemonId);
    }
}
