package com.nguetcheuPokemon.pokemonBackend.controller;

import com.nguetcheuPokemon.pokemonBackend.entity.Pokemon;
import com.nguetcheuPokemon.pokemonBackend.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/pokemons")
    public List<Pokemon> getPokemonList(){
        return this.pokemonService.getPokemonList();
    }

    @GetMapping("/pokemon/{id}")
    public Pokemon getPokemonById(@PathVariable("id") Long pokemonId){
        return this.pokemonService.getPokemonById(pokemonId);
    }

    @PostMapping("/pokemon")
    public Pokemon savePokemon(@RequestBody Pokemon pokemon){
        return this.pokemonService.savePokemon(pokemon);
    }

    @PutMapping("/pokemon/{id}")
    public Pokemon savePokemon(@RequestBody Pokemon pokemon, @PathVariable("id") Long pokemonId){
        return this.pokemonService.updatePokemon(pokemonId,pokemon);
    }

    @DeleteMapping("/pokemon/{id}")
    public String deletePokemonById(@PathVariable("id") Long pokemonId){
        this.pokemonService.deletePokemonById(pokemonId);
        return "Pokemon delete";
    }
}
