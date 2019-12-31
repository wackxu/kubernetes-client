package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ContainerStateRunningFluent<A extends ContainerStateRunningFluent<A>> extends Fluent<A>{


    public String getStartedAt();
    public A withStartedAt(String startedAt);
    public Boolean hasStartedAt();



}
