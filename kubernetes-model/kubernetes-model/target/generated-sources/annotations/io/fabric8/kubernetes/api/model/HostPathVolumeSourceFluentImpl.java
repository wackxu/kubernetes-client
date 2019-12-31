package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class HostPathVolumeSourceFluentImpl<A extends HostPathVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements HostPathVolumeSourceFluent<A>{

    private String path;
    private String type;

    public HostPathVolumeSourceFluentImpl(){
    }
    public HostPathVolumeSourceFluentImpl(HostPathVolumeSource instance){
            this.withPath(instance.getPath()); 
            this.withType(instance.getType()); 
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

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HostPathVolumeSourceFluentImpl that = (HostPathVolumeSourceFluentImpl) o;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }




}
