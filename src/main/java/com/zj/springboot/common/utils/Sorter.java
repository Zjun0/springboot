package com.zj.springboot.common.utils;

import java.util.Comparator;

/**
 * @author: zj
 * @date: ${date}
 */
public interface Sorter {
    /**
     * 排序
     * @param list 待排序的数组
     * @param <T>
     */
    public <T extends Comparable<T>> void sort(T[] list);

    public <T> void sort(T[] list, Comparator<T> comp);
}
