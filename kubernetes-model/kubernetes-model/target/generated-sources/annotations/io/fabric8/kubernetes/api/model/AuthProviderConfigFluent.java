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

public interface AuthProviderConfigFluent<A extends AuthProviderConfigFluent<A>> extends Fluent<A>{


    public A addToConfig(String key,String value);
    public A addToConfig(Map<String,String> map);
    public A removeFromConfig(String key);
    public A removeFromConfig(Map<String,String> map);
    public Map<String,String> getConfig();
    public A withConfig(Map<String,String> config);
    public Boolean hasConfig();
    public String getName();
    public A withName(String name);
    public Boolean hasName();



}
