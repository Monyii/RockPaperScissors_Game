package com.monii.rockpaperscissors_game;

import com.monii.rockpaperscissors_game.model.Paper;
import com.monii.rockpaperscissors_game.model.Rock;
import com.monii.rockpaperscissors_game.model.Scissors;
import lombok.Getter;
import org.springframework.stereotype.Controller;

@Controller
public class GameController {
    @Getter
    private Rock rock;
    @Getter
    private Paper paper;
    @Getter
    private Scissors scissors;
}
