package com.java.study.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = {
                new Worker("Serhii",14,3000),
                new Worker("Andrii",17,2000),
                new Worker("Sanya",18,2000),
                new Worker("Kevin",12,4000)
        };
        task3(workers,2);
    }
    public static void task1(){
        String[] arr = {"Jane","Jack","Arni","Artem","Vova","Misha","Robert","Michael","Mike","Jane","Jack","Jane","Tina","Nastya","Andrii"};
        System.out.println(Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Comparator.comparingLong(Map.Entry::getValue)).get().getKey());
    }
    public static void task2(Worker[] workers){
        System.out.println(Arrays.stream(workers).mapToInt(s->s.getSallary()).average().getAsDouble());
    }
    public static void task3(Worker[] workers,int N){
        System.out.println(Arrays.stream(workers).sorted((s,v)-> v.getAge()-s.getAge()).limit(N).map(s->s.getName()).collect(Collectors.joining(", ",N+" The oldest worker`s : ",";")));

    }

}
