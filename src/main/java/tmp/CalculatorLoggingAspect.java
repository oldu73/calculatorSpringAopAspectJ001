package tmp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CalculatorLoggingAspect {

    private Log log = LogFactory.getLog(this.getClass());

    @Before("execution(* tmp.ArithmeticCalculator.add(..))")
    public void logBefore() {
        log.info("Début de la méthode add()");
    }

}
