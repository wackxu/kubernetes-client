package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface TolerationFluent<A extends TolerationFluent<A>> extends Fluent<A>{


    public String getEffect();
    public A withEffect(String effect);
    public Boolean hasEffect();
    public String getKey();
    public A withKey(String key);
    public Boolean hasKey();
    public String getOperator();
    public A withOperator(String operator);
    public Boolean hasOperator();
    public Long getTolerationSeconds();
    public A withTolerationSeconds(Long tolerationSeconds);
    public Boolean hasTolerationSeconds();
    public A withNewTolerationSeconds(String arg1);
    public A withNewTolerationSeconds(long arg1);
    public String getValue();
    public A withValue(String value);
    public Boolean hasValue();



}
