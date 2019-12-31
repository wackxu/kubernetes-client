package io.fabric8.kubernetes.api.builder;


public interface Predicate<I>{


    Boolean apply(I item);



}
