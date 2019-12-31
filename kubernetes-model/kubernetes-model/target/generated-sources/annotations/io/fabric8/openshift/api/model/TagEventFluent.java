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

public interface TagEventFluent<A extends TagEventFluent<A>> extends Fluent<A>{


    public String getCreated();
    public A withCreated(String created);
    public Boolean hasCreated();
    public String getDockerImageReference();
    public A withDockerImageReference(String dockerImageReference);
    public Boolean hasDockerImageReference();
    public Long getGeneration();
    public A withGeneration(Long generation);
    public Boolean hasGeneration();
    public A withNewGeneration(String arg1);
    public A withNewGeneration(long arg1);
    public String getImage();
    public A withImage(String image);
    public Boolean hasImage();



}
