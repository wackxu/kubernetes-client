package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class AzureFilePersistentVolumeSourceFluentImpl<A extends AzureFilePersistentVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements AzureFilePersistentVolumeSourceFluent<A>{

    private Boolean readOnly;
    private String secretName;
    private String secretNamespace;
    private String shareName;

    public AzureFilePersistentVolumeSourceFluentImpl(){
    }
    public AzureFilePersistentVolumeSourceFluentImpl(AzureFilePersistentVolumeSource instance){
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretName(instance.getSecretName()); 
            this.withSecretNamespace(instance.getSecretNamespace()); 
            this.withShareName(instance.getShareName()); 
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

    public String getSecretName(){
            return this.secretName;
    }

    public A withSecretName(String secretName){
            this.secretName=secretName; return (A) this;
    }

    public Boolean hasSecretName(){
            return this.secretName != null;
    }

    public String getSecretNamespace(){
            return this.secretNamespace;
    }

    public A withSecretNamespace(String secretNamespace){
            this.secretNamespace=secretNamespace; return (A) this;
    }

    public Boolean hasSecretNamespace(){
            return this.secretNamespace != null;
    }

    public String getShareName(){
            return this.shareName;
    }

    public A withShareName(String shareName){
            this.shareName=shareName; return (A) this;
    }

    public Boolean hasShareName(){
            return this.shareName != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            AzureFilePersistentVolumeSourceFluentImpl that = (AzureFilePersistentVolumeSourceFluentImpl) o;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (secretName != null ? !secretName.equals(that.secretName) :that.secretName != null) return false;
            if (secretNamespace != null ? !secretNamespace.equals(that.secretNamespace) :that.secretNamespace != null) return false;
            if (shareName != null ? !shareName.equals(that.shareName) :that.shareName != null) return false;
            return true;
    }




}
