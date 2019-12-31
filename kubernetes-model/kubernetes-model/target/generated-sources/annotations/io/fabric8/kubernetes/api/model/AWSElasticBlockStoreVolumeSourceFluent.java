package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface AWSElasticBlockStoreVolumeSourceFluent<A extends AWSElasticBlockStoreVolumeSourceFluent<A>> extends Fluent<A>{


    public String getFsType();
    public A withFsType(String fsType);
    public Boolean hasFsType();
    public Integer getPartition();
    public A withPartition(Integer partition);
    public Boolean hasPartition();
    public Boolean isReadOnly();
    public A withReadOnly(Boolean readOnly);
    public Boolean hasReadOnly();
    public A withNewReadOnly(String arg1);
    public A withNewReadOnly(boolean arg1);
    public String getVolumeID();
    public A withVolumeID(String volumeID);
    public Boolean hasVolumeID();



}
