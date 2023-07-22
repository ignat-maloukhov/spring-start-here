package demo.ignat.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Order(2)
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    //@Around("execution(* demo.ignat.service.*.*(..))")
    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        logger.info("Logging Aspect: Method " +
                methodName +
                " with arguments " +
                Arrays.toString(args) +
                " will execute");

        Object returnedValue = joinPoint.proceed();

        logger.info("Logging Aspect: Method has executed and returns: " +
                returnedValue);

        return returnedValue;
    }

}
