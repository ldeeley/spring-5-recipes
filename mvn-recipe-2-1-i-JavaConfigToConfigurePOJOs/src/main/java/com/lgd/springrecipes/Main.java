package com.lgd.springrecipes;

import com.lgd.springrecipes.config.AlbumConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Create a Spring Container
    ApplicationContext context = new AnnotationConfigApplicationContext(AlbumConfiguration.class);

    // request a bean of type Album
    Album a = context.getBean(Album.class);
    //print it out
        System.out.println(a);

    }


}
