package io.fabric8.kubernetes.api.model.batch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface JobConditionFluent<A extends JobConditionFluent<A>> extends Fluent<A>{


    public String getLastProbeTime();
    public A withLastProbeTime(String lastProbeTime);
    public Boolean hasLastProbeTime();
    public String getLastTransitionTime();
    public A withLastTransitionTime(String lastTransitionTime);
    public Boolean hasLastTransitionTime();
    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();
    public String getReason();
    public A withReason(String reason);
    public Boolean hasReason();
    public String getStatus();
    public A withStatus(String status);
    public Boolean hasStatus();
    public String getType();
    public A withType(String type);
    public Boolean hasType();



}
