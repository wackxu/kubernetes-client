package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface SELinuxOptionsFluent<A extends SELinuxOptionsFluent<A>> extends Fluent<A>{


    public String getLevel();
    public A withLevel(String level);
    public Boolean hasLevel();
    public String getRole();
    public A withRole(String role);
    public Boolean hasRole();
    public String getType();
    public A withType(String type);
    public Boolean hasType();
    public String getUser();
    public A withUser(String user);
    public Boolean hasUser();



}
