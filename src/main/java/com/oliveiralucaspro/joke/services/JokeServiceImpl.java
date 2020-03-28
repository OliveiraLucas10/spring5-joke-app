package com.oliveiralucaspro.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
	this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJokeString() {
	return chuckNorrisQuotes.getRandomQuote();
    }

}
