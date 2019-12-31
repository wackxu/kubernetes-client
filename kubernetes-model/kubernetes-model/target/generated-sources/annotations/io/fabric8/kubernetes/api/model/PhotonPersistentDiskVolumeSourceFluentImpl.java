package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class PhotonPersistentDiskVolumeSourceFluentImpl<A extends PhotonPersistentDiskVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PhotonPersistentDiskVolumeSourceFluent<A>{

    private String fsType;
    private String pdID;

    public PhotonPersistentDiskVolumeSourceFluentImpl(){
    }
    public PhotonPersistentDiskVolumeSourceFluentImpl(PhotonPersistentDiskVolumeSource instance){
            this.withFsType(instance.getFsType()); 
            this.withPdID(instance.getPdID()); 
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

    public String getPdID(){
            return this.pdID;
    }

    public A withPdID(String pdID){
            this.pdID=pdID; return (A) this;
    }

    public Boolean hasPdID(){
            return this.pdID != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PhotonPersistentDiskVolumeSourceFluentImpl that = (PhotonPersistentDiskVolumeSourceFluentImpl) o;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (pdID != null ? !pdID.equals(that.pdID) :that.pdID != null) return false;
            return true;
    }




}
