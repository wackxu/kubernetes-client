package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface DaemonEndpointFluent<A extends DaemonEndpointFluent<A>> extends Fluent<A>{


    public Integer getPort();
    public A withPort(Integer port);
    public Boolean hasPort();



}
