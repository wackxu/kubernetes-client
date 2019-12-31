package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ParameterFluent<A extends ParameterFluent<A>> extends Fluent<A>{


    public String getDescription();
    public A withDescription(String description);
    public Boolean hasDescription();
    public String getDisplayName();
    public A withDisplayName(String displayName);
    public Boolean hasDisplayName();
    public String getFrom();
    public A withFrom(String from);
    public Boolean hasFrom();
    public String getGenerate();
    public A withGenerate(String generate);
    public Boolean hasGenerate();
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public Boolean isRequired();
    public A withRequired(Boolean required);
    public Boolean hasRequired();
    public A withNewRequired(String arg1);
    public A withNewRequired(boolean arg1);
    public String getValue();
    public A withValue(String value);
    public Boolean hasValue();



}
