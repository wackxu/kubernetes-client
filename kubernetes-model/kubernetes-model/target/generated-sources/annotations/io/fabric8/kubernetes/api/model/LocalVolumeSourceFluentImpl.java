package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class LocalVolumeSourceFluentImpl<A extends LocalVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements LocalVolumeSourceFluent<A>{

    private String fsType;
    private String path;

    public LocalVolumeSourceFluentImpl(){
    }
    public LocalVolumeSourceFluentImpl(LocalVolumeSource instance){
            this.withFsType(instance.getFsType()); 
            this.withPath(instance.getPath()); 
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

    public String getPath(){
            return this.path;
    }

    public A withPath(String path){
            this.path=path; return (A) this;
    }

    public Boolean hasPath(){
            return this.path != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LocalVolumeSourceFluentImpl that = (LocalVolumeSourceFluentImpl) o;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            return true;
    }




}
