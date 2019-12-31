package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface StatusCauseFluent<A extends StatusCauseFluent<A>> extends Fluent<A>{


    public String getField();
    public A withField(String field);
    public Boolean hasField();
    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();
    public String getReason();
    public A withReason(String reason);
    public Boolean hasReason();



}
