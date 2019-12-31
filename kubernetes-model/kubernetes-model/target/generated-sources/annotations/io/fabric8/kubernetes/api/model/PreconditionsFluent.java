package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface PreconditionsFluent<A extends PreconditionsFluent<A>> extends Fluent<A>{


    public String getUid();
    public A withUid(String uid);
    public Boolean hasUid();



}
