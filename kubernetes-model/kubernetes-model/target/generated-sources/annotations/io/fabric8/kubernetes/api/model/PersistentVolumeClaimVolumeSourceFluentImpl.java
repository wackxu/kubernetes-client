package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class PersistentVolumeClaimVolumeSourceFluentImpl<A extends PersistentVolumeClaimVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PersistentVolumeClaimVolumeSourceFluent<A>{

    private String claimName;
    private Boolean readOnly;

    public PersistentVolumeClaimVolumeSourceFluentImpl(){
    }
    public PersistentVolumeClaimVolumeSourceFluentImpl(PersistentVolumeClaimVolumeSource instance){
            this.withClaimName(instance.getClaimName()); 
            this.withReadOnly(instance.getReadOnly()); 
    }

    public String getClaimName(){
            return this.claimName;
    }

    public A withClaimName(String claimName){
            this.claimName=claimName; return (A) this;
    }

    public Boolean hasClaimName(){
            return this.claimName != null;
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
            PersistentVolumeClaimVolumeSourceFluentImpl that = (PersistentVolumeClaimVolumeSourceFluentImpl) o;
            if (claimName != null ? !claimName.equals(that.claimName) :that.claimName != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            return true;
    }




}
