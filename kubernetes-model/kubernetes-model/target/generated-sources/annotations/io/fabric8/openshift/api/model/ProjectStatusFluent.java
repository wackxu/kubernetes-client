package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ProjectStatusFluent<A extends ProjectStatusFluent<A>> extends Fluent<A>{


    public String getPhase();
    public A withPhase(String phase);
    public Boolean hasPhase();



}
