package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface NamespaceStatusFluent<A extends NamespaceStatusFluent<A>> extends Fluent<A>{


    public String getPhase();
    public A withPhase(String phase);
    public Boolean hasPhase();



}
