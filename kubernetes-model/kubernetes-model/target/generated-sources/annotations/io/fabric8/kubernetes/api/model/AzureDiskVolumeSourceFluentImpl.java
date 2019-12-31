package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class AzureDiskVolumeSourceFluentImpl<A extends AzureDiskVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements AzureDiskVolumeSourceFluent<A>{

    private String cachingMode;
    private String diskName;
    private String diskURI;
    private String fsType;
    private String kind;
    private Boolean readOnly;

    public AzureDiskVolumeSourceFluentImpl(){
    }
    public AzureDiskVolumeSourceFluentImpl(AzureDiskVolumeSource instance){
            this.withCachingMode(instance.getCachingMode()); 
            this.withDiskName(instance.getDiskName()); 
            this.withDiskURI(instance.getDiskURI()); 
            this.withFsType(instance.getFsType()); 
            this.withKind(instance.getKind()); 
            this.withReadOnly(instance.getReadOnly()); 
    }

    public String getCachingMode(){
            return this.cachingMode;
    }

    public A withCachingMode(String cachingMode){
            this.cachingMode=cachingMode; return (A) this;
    }

    public Boolean hasCachingMode(){
            return this.cachingMode != null;
    }

    public String getDiskName(){
            return this.diskName;
    }

    public A withDiskName(String diskName){
            this.diskName=diskName; return (A) this;
    }

    public Boolean hasDiskName(){
            return this.diskName != null;
    }

    public String getDiskURI(){
            return this.diskURI;
    }

    public A withDiskURI(String diskURI){
            this.diskURI=diskURI; return (A) this;
    }

    public Boolean hasDiskURI(){
            return this.diskURI != null;
    }

    public String getFsType(){
            return this.fsType;
    }

    public A withFsType(String fsType){
            this.fsType=fsType; return (A) this;
    }

    public Boolean hasFsType(){
            return this.fsType != null;
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    public Boolean isReadOnly(){
            return this.readOnly;
    }

    public A withReadOnly(Boolean readOnly){
            this.readOnly=readOnly; return (A) this;
    }

    public Boolean hasReadOnly(){
            return this.readOnly != null;
    }

    public A withNewReadOnly(String arg1){
            return (A)withReadOnly(new Boolean(arg1));
    }

    public A withNewReadOnly(boolean arg1){
            return (A)withReadOnly(new Boolean(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AzureDiskVolumeSourceFluentImpl that = (AzureDiskVolumeSourceFluentImpl) o;
            if (cachingMode != null ? !cachingMode.equals(that.cachingMode) :that.cachingMode != null) return false;
            if (diskName != null ? !diskName.equals(that.diskName) :that.diskName != null) return false;
            if (diskURI != null ? !diskURI.equals(that.diskURI) :that.diskURI != null) return false;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            return true;
    }




}
