package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface NFSVolumeSourceFluent<A extends NFSVolumeSourceFluent<A>> extends Fluent<A>{


    public String getPath();
    public A withPath(String path);
    public Boolean hasPath();
    public Boolean isReadOnly();
    public A withReadOnly(Boolean readOnly);
    public Boolean hasReadOnly();
    public A withNewReadOnly(String arg1);
    public A withNewReadOnly(boolean arg1);
    public String getServer();
    public A withServer(String server);
    public Boolean hasServer();



}
