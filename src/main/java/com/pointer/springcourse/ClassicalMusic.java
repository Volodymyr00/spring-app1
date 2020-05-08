package com.pointer.springcourse;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Singleton;

@Singleton
public class ClassicalMusic implements Music {
@PostConstruct
    public void doMyInit() {
        System.out.println("Do my INIT");

    }
@PreDestroy
    public void doMyDestroy() {
        System.out.println("Do my destroy");
    }

    @Override

    public String getSong() {
        return "Amazing Symphony";
    }
}
