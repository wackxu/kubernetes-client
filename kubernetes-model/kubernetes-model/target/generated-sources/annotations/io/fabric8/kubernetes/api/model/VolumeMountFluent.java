package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface VolumeMountFluent<A extends VolumeMountFluent<A>> extends Fluent<A>{


    public String getMountPath();
    public A withMountPath(String mountPath);
    public Boolean hasMountPath();
    public String getMountPropagation();
    public A withMountPropagation(String mountPropagation);
    public Boolean hasMountPropagation();
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public Boolean isReadOnly();
    public A withReadOnly(Boolean readOnly);
    public Boolean hasReadOnly();
    public A withNewReadOnly(String arg1);
    public A withNewReadOnly(boolean arg1);
    public String getSubPath();
    public A withSubPath(String subPath);
    public Boolean hasSubPath();



}
