package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface StepInfoFluent<A extends StepInfoFluent<A>> extends Fluent<A>{


    public Long getDurationMilliseconds();
    public A withDurationMilliseconds(Long durationMilliseconds);
    public Boolean hasDurationMilliseconds();
    public A withNewDurationMilliseconds(String arg1);
    public A withNewDurationMilliseconds(long arg1);
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public String getStartTime();
    public A withStartTime(String startTime);
    public Boolean hasStartTime();



}
