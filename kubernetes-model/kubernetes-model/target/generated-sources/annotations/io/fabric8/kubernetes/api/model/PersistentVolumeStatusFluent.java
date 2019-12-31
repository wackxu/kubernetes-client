package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface PersistentVolumeStatusFluent<A extends PersistentVolumeStatusFluent<A>> extends Fluent<A>{


    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();
    public String getPhase();
    public A withPhase(String phase);
    public Boolean hasPhase();
    public String getReason();
    public A withReason(String reason);
    public Boolean hasReason();



}
