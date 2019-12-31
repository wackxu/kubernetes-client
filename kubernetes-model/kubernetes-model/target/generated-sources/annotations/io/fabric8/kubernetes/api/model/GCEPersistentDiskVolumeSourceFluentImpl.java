package io.fabric8.kubernetes.api.model;

import java.lang.Integer;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class GCEPersistentDiskVolumeSourceFluentImpl<A extends GCEPersistentDiskVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GCEPersistentDiskVolumeSourceFluent<A>{

    private String fsType;
    private Integer partition;
    private String pdName;
    private Boolean readOnly;

    public GCEPersistentDiskVolumeSourceFluentImpl(){
    }
    public GCEPersistentDiskVolumeSourceFluentImpl(GCEPersistentDiskVolumeSource instance){
            this.withFsType(instance.getFsType()); 
            this.withPartition(instance.getPartition()); 
            this.withPdName(instance.getPdName()); 
            this.withReadOnly(instance.getReadOnly()); 
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

    public Integer getPartition(){
            return this.partition;
    }

    public A withPartition(Integer partition){
            this.partition=partition; return (A) this;
    }

    public Boolean hasPartition(){
            return this.partition != null;
    }

    public String getPdName(){
            return this.pdName;
    }

    public A withPdName(String pdName){
            this.pdName=pdName; return (A) this;
    }

    public Boolean hasPdName(){
            return this.pdName != null;
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
            GCEPersistentDiskVolumeSourceFluentImpl that = (GCEPersistentDiskVolumeSourceFluentImpl) o;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (partition != null ? !partition.equals(that.partition) :that.partition != null) return false;
            if (pdName != null ? !pdName.equals(that.pdName) :that.pdName != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            return true;
    }




}
