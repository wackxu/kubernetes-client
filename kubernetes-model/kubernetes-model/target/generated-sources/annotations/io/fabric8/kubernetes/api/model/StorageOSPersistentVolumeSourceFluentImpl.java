package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class StorageOSPersistentVolumeSourceFluentImpl<A extends StorageOSPersistentVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements StorageOSPersistentVolumeSourceFluent<A>{

    private String fsType;
    private Boolean readOnly;
    private ObjectReferenceBuilder secretRef;
    private String volumeName;
    private String volumeNamespace;

    public StorageOSPersistentVolumeSourceFluentImpl(){
    }
    public StorageOSPersistentVolumeSourceFluentImpl(StorageOSPersistentVolumeSource instance){
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
@Deprecated public ObjectReference getSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public ObjectReference buildSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public A withSecretRef(ObjectReference secretRef){
            _visitables.remove(this.secretRef);
            if (secretRef!=null){ this.secretRef= new ObjectReferenceBuilder(secretRef); _visitables.add(this.secretRef);} return (A) this;
    }

    public Boolean hasSecretRef(){
            return this.secretRef != null;
    }

    public StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef(){
            return new SecretRefNestedImpl();
    }

    public StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(ObjectReference item){
            return new SecretRefNestedImpl(item);
    }

    public StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef(){
            return withNewSecretRefLike(getSecretRef());
    }

    public StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef(){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new ObjectReferenceBuilder().build());
    }

    public StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(ObjectReference item){
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
            StorageOSPersistentVolumeSourceFluentImpl that = (StorageOSPersistentVolumeSourceFluentImpl) o;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
            if (volumeName != null ? !volumeName.equals(that.volumeName) :that.volumeName != null) return false;
            if (volumeNamespace != null ? !volumeNamespace.equals(that.volumeNamespace) :that.volumeNamespace != null) return false;
            return true;
    }


    public class SecretRefNestedImpl<N> extends ObjectReferenceFluentImpl<StorageOSPersistentVolumeSourceFluent.SecretRefNested<N>> implements StorageOSPersistentVolumeSourceFluent.SecretRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            SecretRefNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            SecretRefNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) StorageOSPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef(){
            return and();
    }

}


}
