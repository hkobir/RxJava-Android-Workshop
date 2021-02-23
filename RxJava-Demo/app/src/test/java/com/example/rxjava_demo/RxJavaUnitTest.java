package com.example.rxjava_demo;

import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class RxJavaUnitTest extends Operator{
    @Test
    public void show() {
//        justOperator();
//        fromOperator();
//        fromIterableOperator();
        rangeOperator();
    }
}
