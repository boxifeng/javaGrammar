package demo;

public class Test {
    public static void main(String[] args) throws NullPointerException {
        String s = "";
        ExceptionTestDemo01 exceptionTestDemo01 = new ExceptionTestDemo01();
        ExceptionTestDemo02 exceptionTestDemo02 = new ExceptionTestDemo02();
        exceptionTestMethod(exceptionTestDemo01,s);
        exceptionTestDemo02.test(s);
        System.out.println(exceptionTestDemo01.geNum(100));
    }
    public static void exceptionTestMethod(ExceptionTestDemo01 edm,String s)  {
        edm.test(s);
    }
}
