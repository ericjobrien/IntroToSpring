package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring.model.Pokemon;
import spring.repository.PokemonDAO;

import java.util.List;

//@Component
@Service
public class PokemonService {
    //Field Injection - add @Autowired above the field
    //This is advised against, beause spring then needs to do extra reflection in order to get this to work
    PokemonDAO pokemonDAO;

    @Autowired //spring is creating the DAO for us
    public PokemonService(PokemonDAO pokemonDAO) {
        System.out.println("Making a new pokeServ");
        this.pokemonDAO = pokemonDAO;
    }

    //Setter Injection
//    @Autowired
//    public void setPokemonDAO(PokemonDAO pokemonDAO){
//        this.pokemonDAO = pokemonDAO;
//    }

    public List<Pokemon> getAllPokemon(){
        return pokemonDAO.getAllPokemon();
    }

    public Pokemon getPokemon(Integer id) {
        return pokemonDAO.getAllPokemon().get(id);
    }
}
