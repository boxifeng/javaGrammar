package com.becc.inner;

public class Body {
    public class Heart {
        String blood;

        public void beat(){

            System.out.println("心脏跳动");
            System.out.println("我叫"+name);
        }
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody() {
        System.out.println("这是外部类方法");
        Heart heart = new Heart();
        heart.beat();

    }
}
