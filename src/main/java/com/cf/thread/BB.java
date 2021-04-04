package com.cf.thread;

/**
 * @author chengfan
 * @date 2021-04-01 23:06:19
 */
public class BB implements AAA {
    @Override
    public void aaa() {

    }

    public static void main(String[] args) {
        AAA a = new BB();
        a.aaa();
        AAA.bb();
    }
}
