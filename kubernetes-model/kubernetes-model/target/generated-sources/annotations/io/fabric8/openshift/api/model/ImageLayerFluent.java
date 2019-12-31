package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ImageLayerFluent<A extends ImageLayerFluent<A>> extends Fluent<A>{


    public String getMediaType();
    public A withMediaType(String mediaType);
    public Boolean hasMediaType();
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public Long getSize();
    public A withSize(Long size);
    public Boolean hasSize();
    public A withNewSize(String arg1);
    public A withNewSize(long arg1);



}
