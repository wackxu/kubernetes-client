package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface MicroTimeFluent<A extends MicroTimeFluent<A>> extends Fluent<A>{


    public String getTime();
    public A withTime(String time);
    public Boolean hasTime();



}
