package sammycode;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGeneratorImpl implements NumberGenerator {

//  ===  Fields ===
    private final Random random = new Random();

    @Getter
    private final int maxNumber;

    @Getter
    private final int minNumber;
//    ====  constructor  ====

@Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    //    ===  public method ====
    @Override
    public int next() {
//        example: min=5 max-min=5 max=20 --> max-min1=5 --> range 0-15 + min ->5-20
        return random.nextInt(maxNumber - minNumber) + minNumber;
    }

}
