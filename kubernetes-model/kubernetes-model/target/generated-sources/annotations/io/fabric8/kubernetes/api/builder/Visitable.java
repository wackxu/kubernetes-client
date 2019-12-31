package io.fabric8.kubernetes.api.builder;


public interface Visitable<T>{


    T accept(io.fabric8.kubernetes.api.builder.Visitor visitor);



}
