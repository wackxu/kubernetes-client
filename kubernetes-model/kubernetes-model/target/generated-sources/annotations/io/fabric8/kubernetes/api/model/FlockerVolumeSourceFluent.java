package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface FlockerVolumeSourceFluent<A extends FlockerVolumeSourceFluent<A>> extends Fluent<A>{


    public String getDatasetName();
    public A withDatasetName(String datasetName);
    public Boolean hasDatasetName();
    public String getDatasetUUID();
    public A withDatasetUUID(String datasetUUID);
    public Boolean hasDatasetUUID();



}
