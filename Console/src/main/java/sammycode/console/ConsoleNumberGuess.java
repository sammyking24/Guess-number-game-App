package sammycode.console;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import sammycode.MassageGenerator;
import sammycode.Game;

import java.util.Scanner;

@Slf4j
@Component
public class ConsoleNumberGuess{

//      ==== fields ====

    private final Game game;
    private final MassageGenerator massageGenerator;

//    ===  constructor ===
    public ConsoleNumberGuess(Game game, MassageGenerator massageGenerator) {
        this.game = game;
        this.massageGenerator = massageGenerator;
    }

    // ====  Events ====
   @EventListener(ContextRefreshedEvent.class)
    public void start() {
        log.info("start()--> Container ready for use.");

       Scanner scanner = new Scanner(System.in);

       while (true){
           System.out.println(massageGenerator.getMainMessage());
           System.out.println(massageGenerator.getResultMessage());

           int guss = scanner.nextInt();
           scanner.nextLine();
           game.setGuess(guss);
           game.check();

           if (game.isGameWon() || game.isGameLose()){
               System.out.println(massageGenerator.getResultMessage());
               System.out.println("play again y/n?");

               String playAgainString = scanner.nextLine().trim();
               if (!playAgainString.equalsIgnoreCase("y")){
                   break;
               }
               game.reset();
           }
       }
    }
}
