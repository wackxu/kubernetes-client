package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class VolumeMountFluentImpl<A extends VolumeMountFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements VolumeMountFluent<A>{

    private String mountPath;
    private String mountPropagation;
    private String name;
    private Boolean readOnly;
    private String subPath;

    public VolumeMountFluentImpl(){
    }
    public VolumeMountFluentImpl(VolumeMount instance){
            this.withMountPath(instance.getMountPath()); 
            this.withMountPropagation(instance.getMountPropagation()); 
            this.withName(instance.getName()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSubPath(instance.getSubPath()); 
    }

    public String getMountPath(){
            return this.mountPath;
    }

    public A withMountPath(String mountPath){
            this.mountPath=mountPath; return (A) this;
    }

    public Boolean hasMountPath(){
            return this.mountPath != null;
    }

    public String getMountPropagation(){
            return this.mountPropagation;
    }

    public A withMountPropagation(String mountPropagation){
            this.mountPropagation=mountPropagation; return (A) this;
    }

    public Boolean hasMountPropagation(){
            return this.mountPropagation != null;
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

    public String getSubPath(){
            return this.subPath;
    }

    public A withSubPath(String subPath){
            this.subPath=subPath; return (A) this;
    }

    public Boolean hasSubPath(){
            return this.subPath != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VolumeMountFluentImpl that = (VolumeMountFluentImpl) o;
            if (mountPath != null ? !mountPath.equals(that.mountPath) :that.mountPath != null) return false;
            if (mountPropagation != null ? !mountPropagation.equals(that.mountPropagation) :that.mountPropagation != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (subPath != null ? !subPath.equals(that.subPath) :that.subPath != null) return false;
            return true;
    }




}
