package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface AzureDiskVolumeSourceFluent<A extends AzureDiskVolumeSourceFluent<A>> extends Fluent<A>{


    public String getCachingMode();
    public A withCachingMode(String cachingMode);
    public Boolean hasCachingMode();
    public String getDiskName();
    public A withDiskName(String diskName);
    public Boolean hasDiskName();
    public String getDiskURI();
    public A withDiskURI(String diskURI);
    public Boolean hasDiskURI();
    public String getFsType();
    public A withFsType(String fsType);
    public Boolean hasFsType();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public Boolean isReadOnly();
    public A withReadOnly(Boolean readOnly);
    public Boolean hasReadOnly();
    public A withNewReadOnly(String arg1);
    public A withNewReadOnly(boolean arg1);



}
