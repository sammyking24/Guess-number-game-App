package sammycode.service;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sammycode.Game;
import sammycode.MassageGenerator;

@Slf4j
@Service
public class GameServiceImpl implements GameService{

//    ===fields===
    private final Game game;
    private final MassageGenerator massageGenerator;

//   ===== CONSTRUCTORS =====
    @Autowired
    public GameServiceImpl(Game game, MassageGenerator massageGenerator) {
        this.game = game;
        this.massageGenerator = massageGenerator;
    }

//    ====  init ===
    @PostConstruct
    public void init(){
        log.info("number = {}", game.getNumber());
        log.info("mainMessage = {}",massageGenerator.getMainMessage());


    }

//    ======  FIELDS   ====
    @Override
    public boolean isGameOver() {
        return game.isGameWon() || game.isGameLose();
    }

    @Override
    public String getMainMessage() {
        return massageGenerator.getMainMessage();
    }

    @Override
    public String getResultMessage() {
        return massageGenerator.getResultMessage();
    }

    @Override
    public void checkGuess(int guess) {
        game.setGuess(guess);
        game.check();

    }

    @Override
    public void reset() {
        game.reset();
    }
}
