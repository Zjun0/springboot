package com.zj.springboot.Method.StructuralModel.Adapter.Impl;

import com.zj.springboot.Method.StructuralModel.Adapter.Source;
import com.zj.springboot.Method.StructuralModel.Adapter.inter.Targetable;

/**
 * @author: zj
 * @date: ${date}
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method1() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method2() {
        source.method1();
    }
}
