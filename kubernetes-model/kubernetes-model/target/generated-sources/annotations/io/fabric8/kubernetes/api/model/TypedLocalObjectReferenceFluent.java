package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface TypedLocalObjectReferenceFluent<A extends TypedLocalObjectReferenceFluent<A>> extends Fluent<A>{


    public String getApiGroup();
    public A withApiGroup(String apiGroup);
    public Boolean hasApiGroup();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public String getName();
    public A withName(String name);
    public Boolean hasName();



}
