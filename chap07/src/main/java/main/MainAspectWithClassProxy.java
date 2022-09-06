package main;

import chap07.Calculator;
import chap07.RecCalculator;
import config.AppCtxWithClassProxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspectWithClassProxy {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtxWithClassProxy.class);

        Calculator cal = ctx.getBean("calculator", RecCalculator.class);
        long fiveFact = cal.factorial(5);
        System.out.println("cal.factorial(5) = "+ fiveFact);
        System.out.println(cal.getClass().getName());
        ctx.close();
    }
}
