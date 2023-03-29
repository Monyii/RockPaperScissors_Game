package com.monii.rockpaperscissors_game;

import com.monii.rockpaperscissors_game.model.Paper;
import com.monii.rockpaperscissors_game.model.Rock;
import com.monii.rockpaperscissors_game.model.Scissors;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {
    @GetMapping(path = "/RPSGame")
    public String gamePage(/*@RequestParam("rock") Rock rock, @RequestParam("paper")Paper paper, @RequestParam("scissors")Scissors scissors*/) {
        return "game-page";
    }

    @GetMapping(path = "/rockPage")
    public String getRockPage() {
        return "rock-page";
    }

    @GetMapping(path = "/paperPage")
    public String getPaperPage() {
        return "paper-page";
    }

    @GetMapping(path = "/scissorsPage")
    public String getScissorsPage() {
        return "scissors-page";
    }
}
