package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface EndpointPortFluent<A extends EndpointPortFluent<A>> extends Fluent<A>{


    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public Integer getPort();
    public A withPort(Integer port);
    public Boolean hasPort();
    public String getProtocol();
    public A withProtocol(String protocol);
    public Boolean hasProtocol();



}
