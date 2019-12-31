package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface SourceStrategyOptionsFluent<A extends SourceStrategyOptionsFluent<A>> extends Fluent<A>{


    public Boolean isIncremental();
    public A withIncremental(Boolean incremental);
    public Boolean hasIncremental();
    public A withNewIncremental(String arg1);
    public A withNewIncremental(boolean arg1);



}
