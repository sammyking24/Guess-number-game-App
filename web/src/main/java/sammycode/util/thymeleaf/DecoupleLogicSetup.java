package sammycode.util.thymeleaf;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

@Slf4j
@Component
public class DecoupleLogicSetup  {

//    ===FIELDS===
    private final SpringResourceTemplateResolver templateResolver;

//    ===== constructors =====
    public DecoupleLogicSetup(SpringResourceTemplateResolver templateResolver) {
        this.templateResolver = templateResolver;
    }
//    ===== init ====
   @PostConstruct
    public void init(){
        templateResolver.setUseDecoupledLogic(true);
        log.info("Decoupled template logic enable");
   }
}
