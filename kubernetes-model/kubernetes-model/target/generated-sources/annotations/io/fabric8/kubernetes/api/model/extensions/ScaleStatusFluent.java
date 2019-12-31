package io.fabric8.kubernetes.api.model.extensions;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public interface ScaleStatusFluent<A extends ScaleStatusFluent<A>> extends Fluent<A>{


    public Integer getReplicas();
    public A withReplicas(Integer replicas);
    public Boolean hasReplicas();
    public A addToSelector(String key,String value);
    public A addToSelector(Map<String,String> map);
    public A removeFromSelector(String key);
    public A removeFromSelector(Map<String,String> map);
    public Map<String,String> getSelector();
    public A withSelector(Map<String,String> selector);
    public Boolean hasSelector();
    public String getTargetSelector();
    public A withTargetSelector(String targetSelector);
    public Boolean hasTargetSelector();



}
