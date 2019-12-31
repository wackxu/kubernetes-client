package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface SourceControlUserFluent<A extends SourceControlUserFluent<A>> extends Fluent<A>{


    public String getEmail();
    public A withEmail(String email);
    public Boolean hasEmail();
    public String getName();
    public A withName(String name);
    public Boolean hasName();



}
