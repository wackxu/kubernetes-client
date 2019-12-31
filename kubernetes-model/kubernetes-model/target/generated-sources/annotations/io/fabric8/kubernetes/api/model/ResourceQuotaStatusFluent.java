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

public interface ResourceQuotaStatusFluent<A extends ResourceQuotaStatusFluent<A>> extends Fluent<A>{


    public A addToHard(String key,Quantity value);
    public A addToHard(Map<String,Quantity> map);
    public A removeFromHard(String key);
    public A removeFromHard(Map<String,Quantity> map);
    public Map<String,Quantity> getHard();
    public A withHard(Map<String,Quantity> hard);
    public Boolean hasHard();
    public A addToUsed(String key,Quantity value);
    public A addToUsed(Map<String,Quantity> map);
    public A removeFromUsed(String key);
    public A removeFromUsed(Map<String,Quantity> map);
    public Map<String,Quantity> getUsed();
    public A withUsed(Map<String,Quantity> used);
    public Boolean hasUsed();



}
