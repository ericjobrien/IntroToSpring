package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.model.Pokemon;
import spring.service.PokemonService;

import java.util.List;

 /*
    Spring web MVC:
    It's the first module we look at apart from Spring Core
    It's the HTTP request driven module for web services
    in particular, REST
     */

@RestController
public class PokemonController {

    private PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public List<Pokemon> getAllPokemon() {
        return pokemonService.getAllPokemon();
    }

    @GetMapping(value = "{id}")
    public Pokemon getPokemon(@PathVariable Integer id) {
        return pokemonService.getPokemon(id);
    }

}
