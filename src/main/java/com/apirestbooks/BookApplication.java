package com.apirestbooks;

import com.apirestbooks.dao.BookDAO;
import com.apirestbooks.model.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

    @Bean
    public CommandLineRunner initDatabase(BookDAO bookDAO){
        return args -> {
            bookDAO.save(new Book("Siddhartha", "Hermann Hesse", "Siddhartha est un roman philosophique de Hermann Hesse paru en 1922 en langue allemande. Il met en scène la quête spirituelle d'un personnage du nom de Siddhartha, " +
                    "qu'on ne confondra pas avec Siddhartha Gautama, le Bouddha historique"));
            bookDAO.save(new Book("Le Loup des steppes", "Hermann Hesse", "Le Loup des steppes raconte l’histoire de Harry Haller5, homme désabusé, qui se déclare tiraillé entre deux personnalités : l'une basée sur un besoin d’isolement, de solitude, " +
                    "presque de sauvagerie, un aspect de lui-même qu’il nomme « le loup des steppes », et l’autre sur l'intégration dans la société bourgeoise qu’il affectionne et recherche encore et toujours malgré toutes ses critiques."));
            bookDAO.save( new Book("Ainsi parlait Zarathoustra", "Nietzsche","Ainsi parlait Zarathoustra est une oeuvre philosophique magistrale qui a bouleversé la pensée de l'Occident"));
            bookDAO.save( new Book("Voyage au bout de la nuit","Celine", "Oh ! Vous etes donc tout a fait lache, Ferdinand ! Vous etes repugnant comme rat ..."));
        };
    }

}
