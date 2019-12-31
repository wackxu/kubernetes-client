package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

public interface IntOrStringFluent<A extends IntOrStringFluent<A>> extends Fluent<A>{


    public Integer getIntVal();
    public A withIntVal(Integer IntVal);
    public Boolean hasIntVal();
    public Integer getKind();
    public A withKind(Integer Kind);
    public Boolean hasKind();
    public String getStrVal();
    public A withStrVal(String StrVal);
    public Boolean hasStrVal();
    public A addToAdditionalProperties(String key,Object value);
    public A addToAdditionalProperties(Map<String,Object> map);
    public A removeFromAdditionalProperties(String key);
    public A removeFromAdditionalProperties(Map<String,Object> map);
    public Map<String,Object> getAdditionalProperties();
    public A withAdditionalProperties(Map<String,Object> additionalProperties);
    public Boolean hasAdditionalProperties();



}
