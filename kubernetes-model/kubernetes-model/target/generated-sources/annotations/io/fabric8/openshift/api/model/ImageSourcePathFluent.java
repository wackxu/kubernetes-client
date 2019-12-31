package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ImageSourcePathFluent<A extends ImageSourcePathFluent<A>> extends Fluent<A>{


    public String getDestinationDir();
    public A withDestinationDir(String destinationDir);
    public Boolean hasDestinationDir();
    public String getSourcePath();
    public A withSourcePath(String sourcePath);
    public Boolean hasSourcePath();



}
