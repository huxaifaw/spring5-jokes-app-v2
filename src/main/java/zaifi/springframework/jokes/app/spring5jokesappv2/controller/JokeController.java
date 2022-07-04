package zaifi.springframework.jokes.app.spring5jokesappv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zaifi.springframework.jokes.app.spring5jokesappv2.services.JokeGenerator;

@Controller
public class JokeController {
    private final JokeGenerator jokeGenerator;

    public JokeController(JokeGenerator jokeGenerator) {
        this.jokeGenerator = jokeGenerator;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeGenerator.generateJoke());
        return "index";
    }
}
