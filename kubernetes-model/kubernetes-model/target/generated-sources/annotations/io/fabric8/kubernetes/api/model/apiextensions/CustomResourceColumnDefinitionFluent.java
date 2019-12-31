package io.fabric8.kubernetes.api.model.apiextensions;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface CustomResourceColumnDefinitionFluent<A extends CustomResourceColumnDefinitionFluent<A>> extends Fluent<A>{


    public String getJSONPath();
    public A withJSONPath(String jSONPath);
    public Boolean hasJSONPath();
    public String getDescription();
    public A withDescription(String description);
    public Boolean hasDescription();
    public String getFormat();
    public A withFormat(String format);
    public Boolean hasFormat();
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public Integer getPriority();
    public A withPriority(Integer priority);
    public Boolean hasPriority();
    public String getType();
    public A withType(String type);
    public Boolean hasType();



}
