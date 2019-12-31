package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface VsphereVirtualDiskVolumeSourceFluent<A extends VsphereVirtualDiskVolumeSourceFluent<A>> extends Fluent<A>{


    public String getFsType();
    public A withFsType(String fsType);
    public Boolean hasFsType();
    public String getStoragePolicyID();
    public A withStoragePolicyID(String storagePolicyID);
    public Boolean hasStoragePolicyID();
    public String getStoragePolicyName();
    public A withStoragePolicyName(String storagePolicyName);
    public Boolean hasStoragePolicyName();
    public String getVolumePath();
    public A withVolumePath(String volumePath);
    public Boolean hasVolumePath();



}
