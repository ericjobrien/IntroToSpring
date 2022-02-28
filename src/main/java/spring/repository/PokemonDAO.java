package spring.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import spring.model.Pokemon;

import java.util.ArrayList;
import java.util.List;
//@Component
@Repository //@Repository combined with @Service does pretty much the same thing as @Component - it's just a particular component
public class PokemonDAO {

    List<Pokemon> pokemonList;

    public PokemonDAO() {
        pokemonList = new ArrayList<Pokemon>();
        pokemonList.add(new Pokemon("Pikachu"));
        pokemonList.add(new Pokemon("Bulbasaur"));
        pokemonList.add(new Pokemon("DMX"));
    }

    public List<Pokemon> getAllPokemon() {
        return pokemonList;
    }

    public Pokemon getPokemon(Integer id) {
        return pokemonList.get(id);
    }
}
