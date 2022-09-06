package config;

import aspect.ExeTimeAspect;
import chap07.RecCalculator;
import org.springframework.context.annotation.Bean;

public class AppCtxWithClassProxy {

    @Bean
    public ExeTimeAspect exeTimeAspect() {
        return new ExeTimeAspect();
    }

    @Bean
    public RecCalculator calculator() {
        return new RecCalculator();
    }
}
