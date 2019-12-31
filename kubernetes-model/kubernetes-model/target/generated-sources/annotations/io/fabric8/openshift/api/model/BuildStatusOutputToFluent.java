package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface BuildStatusOutputToFluent<A extends BuildStatusOutputToFluent<A>> extends Fluent<A>{


    public String getImageDigest();
    public A withImageDigest(String imageDigest);
    public Boolean hasImageDigest();



}
