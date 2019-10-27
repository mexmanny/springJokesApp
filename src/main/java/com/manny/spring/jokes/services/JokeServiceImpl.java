package com.manny.spring.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    //created final so it can't be changed
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    //initialized it here in the constructor that way when the class runs, Spring will create it once and we will be
    // reusing the class wont be using it in every request,
    // that way we don't have overhead each time we create the object

    public JokeServiceImpl() {
        this.chuckNorrisQuotes= new ChuckNorrisQuotes();
    };

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
