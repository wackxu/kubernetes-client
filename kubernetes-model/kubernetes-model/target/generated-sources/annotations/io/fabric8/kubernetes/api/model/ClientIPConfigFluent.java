package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ClientIPConfigFluent<A extends ClientIPConfigFluent<A>> extends Fluent<A>{


    public Integer getTimeoutSeconds();
    public A withTimeoutSeconds(Integer timeoutSeconds);
    public Boolean hasTimeoutSeconds();



}
