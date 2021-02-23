package com.example.rxjava_demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.DisposableObserver;

public class Operator {
    Integer idList[] = {1, 2, 4, 5, 6};
    Integer numList[] = {11, 22, 34, 53, 63};
    ArrayList<String> names = new ArrayList<>(Arrays.asList("Karim", "Rahim", "Rifat"));

    @Test
    public void justOperator() {

        Observable<Integer> observable = Observable.just(
                1, 2, 3, 4, 5
        );
        Observer<Integer> subscriber = new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("onSubscribe() is called");
            }

            @Override
            public void onNext(@NonNull Integer values) {
                System.out.print("onNext() :");
                System.out.print(values);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.out.println("onError() is called: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete() is called");
            }
        };

        observable.subscribe(subscriber);
    }

    public void fromOperator() {
        Observable<ArrayList<Integer>> observable = Observable.fromArray(
                new ArrayList<>(Arrays.asList(idList)),
                new ArrayList<>(Arrays.asList(numList))
        );
        Observer<ArrayList<Integer>> subscriber = new Observer<ArrayList<Integer>>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("onSubscribe() is called");
            }

            @Override
            public void onNext(@NonNull ArrayList<Integer> values) {
                System.out.print("\nonNext() : ");
                System.out.print(values);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.out.println("onError() is called: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("\nonComplete() is called");
            }
        };

        observable.subscribe(subscriber);
    }

    public void fromIterableOperator() {
        Observable<String> observable = Observable.fromIterable(names);
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull String s) {
                System.out.print("\nonNext() : ");
                System.out.print(s);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
        observable.subscribe(observer);
    }

    public void rangeOperator(){
        Observable.range(1,20)
                .subscribe(new DisposableObserver<Integer>() {
                    @Override
                    public void onNext(@NonNull Integer i) {
                        System.out.print("\nonNext() : ");
                        System.out.print(i);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
