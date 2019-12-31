package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class GlusterfsVolumeSourceFluentImpl<A extends GlusterfsVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GlusterfsVolumeSourceFluent<A>{

    private String endpoints;
    private String path;
    private Boolean readOnly;

    public GlusterfsVolumeSourceFluentImpl(){
    }
    public GlusterfsVolumeSourceFluentImpl(GlusterfsVolumeSource instance){
            this.withEndpoints(instance.getEndpoints()); 
            this.withPath(instance.getPath()); 
            this.withReadOnly(instance.getReadOnly()); 
    }

    public String getEndpoints(){
            return this.endpoints;
    }

    public A withEndpoints(String endpoints){
            this.endpoints=endpoints; return (A) this;
    }

    public Boolean hasEndpoints(){
            return this.endpoints != null;
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
            GlusterfsVolumeSourceFluentImpl that = (GlusterfsVolumeSourceFluentImpl) o;
            if (endpoints != null ? !endpoints.equals(that.endpoints) :that.endpoints != null) return false;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            return true;
    }




}
