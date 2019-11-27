package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class ExceptionTestDemo01 implements ExceptionDemoMethod {


    @Override
    public void test(String s) {
        try {
            System.out.println(s.length());
            Collection<String> collection =   new ArrayList<>();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }finally {

        }
    }
    public int geNum(int num){
        try{
            return num;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            int a = 20;
            return a;

        }
    }
}
