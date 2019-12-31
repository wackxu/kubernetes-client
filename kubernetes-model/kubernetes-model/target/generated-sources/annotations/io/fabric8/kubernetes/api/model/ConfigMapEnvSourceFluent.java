package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ConfigMapEnvSourceFluent<A extends ConfigMapEnvSourceFluent<A>> extends Fluent<A>{


    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public Boolean isOptional();
    public A withOptional(Boolean optional);
    public Boolean hasOptional();
    public A withNewOptional(String arg1);
    public A withNewOptional(boolean arg1);



}
