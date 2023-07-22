package demo.ignat.aspect;

import demo.ignat.model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.logging.Logger;

@Aspect
@Order(1)
@Component
public class SecurityAspect {

    private Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Around(value = "@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Security Aspect: Calling the intercepted method");

        Object[] args = joinPoint.getArgs();
        if (Objects.isNull(args[0])) {
            logger.info("Security Aspect: Access denied");
            Comment okComment = new Comment("OK");
            logger.info("Security Aspect: Setting new comment " + okComment.getText());
            joinPoint.proceed(new Object[]{okComment});
            return true;
        } else {
            Object returnedValue = joinPoint.proceed();
            logger.info("Security Aspect: Method executed and returned " + returnedValue);
            return returnedValue;
        }
    }

}
