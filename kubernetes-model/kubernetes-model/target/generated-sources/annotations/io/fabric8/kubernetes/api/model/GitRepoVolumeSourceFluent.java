package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface GitRepoVolumeSourceFluent<A extends GitRepoVolumeSourceFluent<A>> extends Fluent<A>{


    public String getDirectory();
    public A withDirectory(String directory);
    public Boolean hasDirectory();
    public String getRepository();
    public A withRepository(String repository);
    public Boolean hasRepository();
    public String getRevision();
    public A withRevision(String revision);
    public Boolean hasRevision();



}
