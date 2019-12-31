package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface BinaryBuildSourceFluent<A extends BinaryBuildSourceFluent<A>> extends Fluent<A>{


    public String getAsFile();
    public A withAsFile(String asFile);
    public Boolean hasAsFile();



}
