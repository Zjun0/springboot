package com.zj.springboot.Method.StructuralModel.Adapter.Impl;

import com.zj.springboot.Method.StructuralModel.Adapter.Source;
import com.zj.springboot.Method.StructuralModel.Adapter.inter.Targetable;

/**
 * @author: zj
 * @date: ${date}
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
