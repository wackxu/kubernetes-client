package io.fabric8.kubernetes.api.model.authorization;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface NonResourceAttributesFluent<A extends NonResourceAttributesFluent<A>> extends Fluent<A>{


    public String getPath();
    public A withPath(String path);
    public Boolean hasPath();
    public String getVerb();
    public A withVerb(String verb);
    public Boolean hasVerb();



}
