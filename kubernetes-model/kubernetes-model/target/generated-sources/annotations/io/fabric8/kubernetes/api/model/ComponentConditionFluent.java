package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ComponentConditionFluent<A extends ComponentConditionFluent<A>> extends Fluent<A>{


    public String getError();
    public A withError(String error);
    public Boolean hasError();
    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();
    public String getStatus();
    public A withStatus(String status);
    public Boolean hasStatus();
    public String getType();
    public A withType(String type);
    public Boolean hasType();



}
