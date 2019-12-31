package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface EventSourceFluent<A extends EventSourceFluent<A>> extends Fluent<A>{


    public String getComponent();
    public A withComponent(String component);
    public Boolean hasComponent();
    public String getHost();
    public A withHost(String host);
    public Boolean hasHost();



}
