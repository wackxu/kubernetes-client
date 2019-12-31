package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface AttachedVolumeFluent<A extends AttachedVolumeFluent<A>> extends Fluent<A>{


    public String getDevicePath();
    public A withDevicePath(String devicePath);
    public Boolean hasDevicePath();
    public String getName();
    public A withName(String name);
    public Boolean hasName();



}
