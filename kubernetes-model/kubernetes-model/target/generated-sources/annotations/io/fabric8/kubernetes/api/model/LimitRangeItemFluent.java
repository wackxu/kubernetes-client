package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public interface LimitRangeItemFluent<A extends LimitRangeItemFluent<A>> extends Fluent<A>{


    public A addToDefault(String key,Quantity value);
    public A addToDefault(Map<String,Quantity> map);
    public A removeFromDefault(String key);
    public A removeFromDefault(Map<String,Quantity> map);
    public Map<String,Quantity> getDefault();
    public A withDefault(Map<String,Quantity> _default);
    public Boolean hasDefault();
    public A addToDefaultRequest(String key,Quantity value);
    public A addToDefaultRequest(Map<String,Quantity> map);
    public A removeFromDefaultRequest(String key);
    public A removeFromDefaultRequest(Map<String,Quantity> map);
    public Map<String,Quantity> getDefaultRequest();
    public A withDefaultRequest(Map<String,Quantity> defaultRequest);
    public Boolean hasDefaultRequest();
    public A addToMax(String key,Quantity value);
    public A addToMax(Map<String,Quantity> map);
    public A removeFromMax(String key);
    public A removeFromMax(Map<String,Quantity> map);
    public Map<String,Quantity> getMax();
    public A withMax(Map<String,Quantity> max);
    public Boolean hasMax();
    public A addToMaxLimitRequestRatio(String key,Quantity value);
    public A addToMaxLimitRequestRatio(Map<String,Quantity> map);
    public A removeFromMaxLimitRequestRatio(String key);
    public A removeFromMaxLimitRequestRatio(Map<String,Quantity> map);
    public Map<String,Quantity> getMaxLimitRequestRatio();
    public A withMaxLimitRequestRatio(Map<String,Quantity> maxLimitRequestRatio);
    public Boolean hasMaxLimitRequestRatio();
    public A addToMin(String key,Quantity value);
    public A addToMin(Map<String,Quantity> map);
    public A removeFromMin(String key);
    public A removeFromMin(Map<String,Quantity> map);
    public Map<String,Quantity> getMin();
    public A withMin(Map<String,Quantity> min);
    public Boolean hasMin();
    public String getType();
    public A withType(String type);
    public Boolean hasType();



}
