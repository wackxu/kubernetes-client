package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class VsphereVirtualDiskVolumeSourceFluentImpl<A extends VsphereVirtualDiskVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements VsphereVirtualDiskVolumeSourceFluent<A>{

    private String fsType;
    private String storagePolicyID;
    private String storagePolicyName;
    private String volumePath;

    public VsphereVirtualDiskVolumeSourceFluentImpl(){
    }
    public VsphereVirtualDiskVolumeSourceFluentImpl(VsphereVirtualDiskVolumeSource instance){
            this.withFsType(instance.getFsType()); 
            this.withStoragePolicyID(instance.getStoragePolicyID()); 
            this.withStoragePolicyName(instance.getStoragePolicyName()); 
            this.withVolumePath(instance.getVolumePath()); 
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

    public String getStoragePolicyID(){
            return this.storagePolicyID;
    }

    public A withStoragePolicyID(String storagePolicyID){
            this.storagePolicyID=storagePolicyID; return (A) this;
    }

    public Boolean hasStoragePolicyID(){
            return this.storagePolicyID != null;
    }

    public String getStoragePolicyName(){
            return this.storagePolicyName;
    }

    public A withStoragePolicyName(String storagePolicyName){
            this.storagePolicyName=storagePolicyName; return (A) this;
    }

    public Boolean hasStoragePolicyName(){
            return this.storagePolicyName != null;
    }

    public String getVolumePath(){
            return this.volumePath;
    }

    public A withVolumePath(String volumePath){
            this.volumePath=volumePath; return (A) this;
    }

    public Boolean hasVolumePath(){
            return this.volumePath != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VsphereVirtualDiskVolumeSourceFluentImpl that = (VsphereVirtualDiskVolumeSourceFluentImpl) o;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (storagePolicyID != null ? !storagePolicyID.equals(that.storagePolicyID) :that.storagePolicyID != null) return false;
            if (storagePolicyName != null ? !storagePolicyName.equals(that.storagePolicyName) :that.storagePolicyName != null) return false;
            if (volumePath != null ? !volumePath.equals(that.volumePath) :that.volumePath != null) return false;
            return true;
    }




}
