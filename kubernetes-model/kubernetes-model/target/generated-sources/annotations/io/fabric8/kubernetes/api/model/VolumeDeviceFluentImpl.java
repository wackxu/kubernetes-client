package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class VolumeDeviceFluentImpl<A extends VolumeDeviceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements VolumeDeviceFluent<A>{

    private String devicePath;
    private String name;

    public VolumeDeviceFluentImpl(){
    }
    public VolumeDeviceFluentImpl(VolumeDevice instance){
            this.withDevicePath(instance.getDevicePath()); 
            this.withName(instance.getName()); 
    }

    public String getDevicePath(){
            return this.devicePath;
    }

    public A withDevicePath(String devicePath){
            this.devicePath=devicePath; return (A) this;
    }

    public Boolean hasDevicePath(){
            return this.devicePath != null;
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VolumeDeviceFluentImpl that = (VolumeDeviceFluentImpl) o;
            if (devicePath != null ? !devicePath.equals(that.devicePath) :that.devicePath != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            return true;
    }




}
