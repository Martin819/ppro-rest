package cz.uhk.ppro.rest;

import cz.uhk.ppro.rest.model.Greeting;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Aspect
@Component
public class LogAspect {
@Around("execution (* cz.uhk.ppro.rest.services.GreetingService.*(..))")
    public Object log(ProceedingJoinPoint jp) throws Throwable {
        System.out.println(Calendar.getInstance().getTime() + " --  Trida: " + String.valueOf(jp.getTarget().getClass()) + " --> Metoda: " + String.valueOf(jp.getSignature().getName()));
        Object ret = jp.proceed();
        System.out.println(String.valueOf(ret.getClass()));
        return ret;
        //return new Greeting(123, "Test greeting");
    }

}
