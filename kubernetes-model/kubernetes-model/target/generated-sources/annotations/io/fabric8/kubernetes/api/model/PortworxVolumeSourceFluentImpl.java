package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class PortworxVolumeSourceFluentImpl<A extends PortworxVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PortworxVolumeSourceFluent<A>{

    private String fsType;
    private Boolean readOnly;
    private String volumeID;

    public PortworxVolumeSourceFluentImpl(){
    }
    public PortworxVolumeSourceFluentImpl(PortworxVolumeSource instance){
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withVolumeID(instance.getVolumeID()); 
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

    public String getVolumeID(){
            return this.volumeID;
    }

    public A withVolumeID(String volumeID){
            this.volumeID=volumeID; return (A) this;
    }

    public Boolean hasVolumeID(){
            return this.volumeID != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PortworxVolumeSourceFluentImpl that = (PortworxVolumeSourceFluentImpl) o;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (volumeID != null ? !volumeID.equals(that.volumeID) :that.volumeID != null) return false;
            return true;
    }




}
