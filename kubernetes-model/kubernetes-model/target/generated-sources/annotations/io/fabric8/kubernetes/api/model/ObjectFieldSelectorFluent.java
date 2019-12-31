package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import javax.validation.constraints.NotNull;

public interface ObjectFieldSelectorFluent<A extends ObjectFieldSelectorFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getFieldPath();
    public A withFieldPath(String fieldPath);
    public Boolean hasFieldPath();



}
