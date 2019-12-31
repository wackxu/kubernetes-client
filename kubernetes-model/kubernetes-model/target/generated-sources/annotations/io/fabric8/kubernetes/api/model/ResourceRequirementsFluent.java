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

public interface ResourceRequirementsFluent<A extends ResourceRequirementsFluent<A>> extends Fluent<A>{


    public A addToLimits(String key,Quantity value);
    public A addToLimits(Map<String,Quantity> map);
    public A removeFromLimits(String key);
    public A removeFromLimits(Map<String,Quantity> map);
    public Map<String,Quantity> getLimits();
    public A withLimits(Map<String,Quantity> limits);
    public Boolean hasLimits();
    public A addToRequests(String key,Quantity value);
    public A addToRequests(Map<String,Quantity> map);
    public A removeFromRequests(String key);
    public A removeFromRequests(Map<String,Quantity> map);
    public Map<String,Quantity> getRequests();
    public A withRequests(Map<String,Quantity> requests);
    public Boolean hasRequests();



}
