package io.fabric8.kubernetes.api.builder;


public interface Visitor<T>{


    void visit(T element);



}
