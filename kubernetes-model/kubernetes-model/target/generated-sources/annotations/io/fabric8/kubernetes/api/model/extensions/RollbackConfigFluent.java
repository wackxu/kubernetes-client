package io.fabric8.kubernetes.api.model.extensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface RollbackConfigFluent<A extends RollbackConfigFluent<A>> extends Fluent<A>{


    public Long getRevision();
    public A withRevision(Long revision);
    public Boolean hasRevision();
    public A withNewRevision(String arg1);
    public A withNewRevision(long arg1);



}
