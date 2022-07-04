package zaifi.springframework.jokes.app.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeGeneratorImpl implements JokeGenerator {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeGeneratorImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String generateJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}