package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.model.Pokemon;
import spring.service.PokemonService;

import java.util.List;
@ComponentScan
@EnableAutoConfiguration
@Configuration
public class Application {



    public static void main(String[] args) {


        SpringApplication.run(Application.class);
        //this thing is kind of like a big container of all the potential objects
        //that are beans
        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PokemonService pokeServ = context.getBean(PokemonService.class);
        List<Pokemon> pokeList = pokeServ.getAllPokemon();

        for (Pokemon p : pokeList) {
            System.out.println(p);
        }
         */
    }




}
