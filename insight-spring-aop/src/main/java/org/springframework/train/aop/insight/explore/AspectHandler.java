package org.springframework.train.aop.insight.explore;

public class AspectHandler {

    public void begin() {
        System.out.println("目标对象方法执行前执行: begin");
    }

    public void after() {
        System.out.println("目标对象方法执行后执行: after");
    }

    public void afterReturning() {
        System.out.println("afterReturning");
    }

    public void afterThrowing() {
        System.out.println("afterThrowing");
    }
}
