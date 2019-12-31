package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface NodeAddressFluent<A extends NodeAddressFluent<A>> extends Fluent<A>{


    public String getAddress();
    public A withAddress(String address);
    public Boolean hasAddress();
    public String getType();
    public A withType(String type);
    public Boolean hasType();



}
