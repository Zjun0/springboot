package com.zj.springboot.Method.StructuralModel.Adapter;

import com.zj.springboot.Method.StructuralModel.Adapter.Impl.Adapter;
import com.zj.springboot.Method.StructuralModel.Adapter.inter.Targetable;

/**
 * @author: zj
 * @date: ${date}
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
