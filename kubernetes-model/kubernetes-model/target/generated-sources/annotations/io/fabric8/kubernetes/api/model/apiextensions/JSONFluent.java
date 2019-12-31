package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface JSONFluent<A extends JSONFluent<A>> extends Fluent<A>{


    public String getRaw();
    public A withRaw(String raw);
    public Boolean hasRaw();



}
