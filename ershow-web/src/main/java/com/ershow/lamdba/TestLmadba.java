package com.ershow.lamdba;

import java.util.Comparator;

/**
 * Created by Administrator on 2018/3/26.
 */
public class TestLmadba {

    public static void main(String[] args) {
        Comparator<Apple> byWeight =
                (Apple a1,Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
    }

}
