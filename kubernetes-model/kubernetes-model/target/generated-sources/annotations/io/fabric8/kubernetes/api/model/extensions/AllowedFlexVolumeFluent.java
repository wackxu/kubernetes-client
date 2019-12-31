package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface AllowedFlexVolumeFluent<A extends AllowedFlexVolumeFluent<A>> extends Fluent<A>{


    public String getDriver();
    public A withDriver(String driver);
    public Boolean hasDriver();



}
