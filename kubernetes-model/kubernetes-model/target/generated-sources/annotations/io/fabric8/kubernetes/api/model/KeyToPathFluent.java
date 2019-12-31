package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface KeyToPathFluent<A extends KeyToPathFluent<A>> extends Fluent<A>{


    public String getKey();
    public A withKey(String key);
    public Boolean hasKey();
    public Integer getMode();
    public A withMode(Integer mode);
    public Boolean hasMode();
    public String getPath();
    public A withPath(String path);
    public Boolean hasPath();



}
