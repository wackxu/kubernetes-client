package io.fabric8.kubernetes.api.builder;


public interface Function<I,O>{


    O apply(I item);



}
