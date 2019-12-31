package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class NFSVolumeSourceFluentImpl<A extends NFSVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NFSVolumeSourceFluent<A>{

    private String path;
    private Boolean readOnly;
    private String server;

    public NFSVolumeSourceFluentImpl(){
    }
    public NFSVolumeSourceFluentImpl(NFSVolumeSource instance){
            this.withPath(instance.getPath()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withServer(instance.getServer()); 
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

    public String getServer(){
            return this.server;
    }

    public A withServer(String server){
            this.server=server; return (A) this;
    }

    public Boolean hasServer(){
            return this.server != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NFSVolumeSourceFluentImpl that = (NFSVolumeSourceFluentImpl) o;
            if (path != null ? !path.equals(that.path) :that.path != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (server != null ? !server.equals(that.server) :that.server != null) return false;
            return true;
    }




}
