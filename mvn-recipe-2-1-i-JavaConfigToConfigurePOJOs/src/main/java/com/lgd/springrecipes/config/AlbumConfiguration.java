package com.lgd.springrecipes.config;

import com.lgd.springrecipes.Album;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Here I am create a CLASS which is decorated with some annotations
//@Configuration - Tells SPRING this CLASS contains configuration
//@Bean - sets out the values an 'Album' bean should have when it is instantiated

@Configuration
public class AlbumConfiguration {

    @Bean
    public Album album(){

        Album album = new Album();
        album.setBand("The Beatles");
        album.setTitle("Abbey Road");
        return album;

    }

}
