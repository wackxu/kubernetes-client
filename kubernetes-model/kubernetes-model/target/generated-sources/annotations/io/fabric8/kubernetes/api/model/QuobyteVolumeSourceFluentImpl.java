package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class QuobyteVolumeSourceFluentImpl<A extends QuobyteVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements QuobyteVolumeSourceFluent<A>{

    private String group;
    private Boolean readOnly;
    private String registry;
    private String user;
    private String volume;

    public QuobyteVolumeSourceFluentImpl(){
    }
    public QuobyteVolumeSourceFluentImpl(QuobyteVolumeSource instance){
            this.withGroup(instance.getGroup()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withRegistry(instance.getRegistry()); 
            this.withUser(instance.getUser()); 
            this.withVolume(instance.getVolume()); 
    }

    public String getGroup(){
            return this.group;
    }

    public A withGroup(String group){
            this.group=group; return (A) this;
    }

    public Boolean hasGroup(){
            return this.group != null;
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

    public String getRegistry(){
            return this.registry;
    }

    public A withRegistry(String registry){
            this.registry=registry; return (A) this;
    }

    public Boolean hasRegistry(){
            return this.registry != null;
    }

    public String getUser(){
            return this.user;
    }

    public A withUser(String user){
            this.user=user; return (A) this;
    }

    public Boolean hasUser(){
            return this.user != null;
    }

    public String getVolume(){
            return this.volume;
    }

    public A withVolume(String volume){
            this.volume=volume; return (A) this;
    }

    public Boolean hasVolume(){
            return this.volume != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            QuobyteVolumeSourceFluentImpl that = (QuobyteVolumeSourceFluentImpl) o;
            if (group != null ? !group.equals(that.group) :that.group != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (registry != null ? !registry.equals(that.registry) :that.registry != null) return false;
            if (user != null ? !user.equals(that.user) :that.user != null) return false;
            if (volume != null ? !volume.equals(that.volume) :that.volume != null) return false;
            return true;
    }




}
