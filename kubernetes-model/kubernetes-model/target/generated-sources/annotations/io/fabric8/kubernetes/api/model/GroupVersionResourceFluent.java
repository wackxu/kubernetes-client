package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface GroupVersionResourceFluent<A extends GroupVersionResourceFluent<A>> extends Fluent<A>{


    public String getGroup();
    public A withGroup(String group);
    public Boolean hasGroup();
    public String getResource();
    public A withResource(String resource);
    public Boolean hasResource();
    public String getVersion();
    public A withVersion(String version);
    public Boolean hasVersion();



}
