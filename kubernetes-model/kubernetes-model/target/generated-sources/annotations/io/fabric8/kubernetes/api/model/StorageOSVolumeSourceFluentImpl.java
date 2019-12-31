package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class StorageOSVolumeSourceFluentImpl<A extends StorageOSVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements StorageOSVolumeSourceFluent<A>{

    private String fsType;
    private Boolean readOnly;
    private LocalObjectReferenceBuilder secretRef;
    private String volumeName;
    private String volumeNamespace;

    public StorageOSVolumeSourceFluentImpl(){
    }
    public StorageOSVolumeSourceFluentImpl(StorageOSVolumeSource instance){
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withVolumeName(instance.getVolumeName()); 
            this.withVolumeNamespace(instance.getVolumeNamespace()); 
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

    
/**
 * This method has been deprecated, please use method buildSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public LocalObjectReference buildSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public A withSecretRef(LocalObjectReference secretRef){
            _visitables.remove(this.secretRef);
            if (secretRef!=null){ this.secretRef= new LocalObjectReferenceBuilder(secretRef); _visitables.add(this.secretRef);} return (A) this;
    }

    public Boolean hasSecretRef(){
            return this.secretRef != null;
    }

    public A withNewSecretRef(String name){
            return (A)withSecretRef(new LocalObjectReference(name));
    }

    public StorageOSVolumeSourceFluent.SecretRefNested<A> withNewSecretRef(){
            return new SecretRefNestedImpl();
    }

    public StorageOSVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(LocalObjectReference item){
            return new SecretRefNestedImpl(item);
    }

    public StorageOSVolumeSourceFluent.SecretRefNested<A> editSecretRef(){
            return withNewSecretRefLike(getSecretRef());
    }

    public StorageOSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef(){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new LocalObjectReferenceBuilder().build());
    }

    public StorageOSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(LocalObjectReference item){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
    }

    public String getVolumeName(){
            return this.volumeName;
    }

    public A withVolumeName(String volumeName){
            this.volumeName=volumeName; return (A) this;
    }

    public Boolean hasVolumeName(){
            return this.volumeName != null;
    }

    public String getVolumeNamespace(){
            return this.volumeNamespace;
    }

    public A withVolumeNamespace(String volumeNamespace){
            this.volumeNamespace=volumeNamespace; return (A) this;
    }

    public Boolean hasVolumeNamespace(){
            return this.volumeNamespace != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StorageOSVolumeSourceFluentImpl that = (StorageOSVolumeSourceFluentImpl) o;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
            if (volumeName != null ? !volumeName.equals(that.volumeName) :that.volumeName != null) return false;
            if (volumeNamespace != null ? !volumeNamespace.equals(that.volumeNamespace) :that.volumeNamespace != null) return false;
            return true;
    }


    public class SecretRefNestedImpl<N> extends LocalObjectReferenceFluentImpl<StorageOSVolumeSourceFluent.SecretRefNested<N>> implements StorageOSVolumeSourceFluent.SecretRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            SecretRefNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            SecretRefNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) StorageOSVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef(){
            return and();
    }

}


}
