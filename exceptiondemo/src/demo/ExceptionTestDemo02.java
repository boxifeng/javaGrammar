package demo;

import java.util.Objects;

public class ExceptionTestDemo02 implements ExceptionDemoMethod {
    @Override
    public void test(String s) throws NullPointerException {
        Objects.requireNonNull(s,"传递参数为空");
        System.out.println(s.length());
    }
}
