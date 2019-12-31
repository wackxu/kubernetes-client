package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class CinderPersistentVolumeSourceFluentImpl<A extends CinderPersistentVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CinderPersistentVolumeSourceFluent<A>{

    private String fsType;
    private Boolean readOnly;
    private SecretReferenceBuilder secretRef;
    private String volumeID;

    public CinderPersistentVolumeSourceFluentImpl(){
    }
    public CinderPersistentVolumeSourceFluentImpl(CinderPersistentVolumeSource instance){
            this.withFsType(instance.getFsType()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withVolumeID(instance.getVolumeID()); 
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
@Deprecated public SecretReference getSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public SecretReference buildSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public A withSecretRef(SecretReference secretRef){
            _visitables.remove(this.secretRef);
            if (secretRef!=null){ this.secretRef= new SecretReferenceBuilder(secretRef); _visitables.add(this.secretRef);} return (A) this;
    }

    public Boolean hasSecretRef(){
            return this.secretRef != null;
    }

    public A withNewSecretRef(String name,String namespace){
            return (A)withSecretRef(new SecretReference(name, namespace));
    }

    public CinderPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef(){
            return new SecretRefNestedImpl();
    }

    public CinderPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(SecretReference item){
            return new SecretRefNestedImpl(item);
    }

    public CinderPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef(){
            return withNewSecretRefLike(getSecretRef());
    }

    public CinderPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef(){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new SecretReferenceBuilder().build());
    }

    public CinderPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(SecretReference item){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
    }

    public String getVolumeID(){
            return this.volumeID;
    }

    public A withVolumeID(String volumeID){
            this.volumeID=volumeID; return (A) this;
    }

    public Boolean hasVolumeID(){
            return this.volumeID != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CinderPersistentVolumeSourceFluentImpl that = (CinderPersistentVolumeSourceFluentImpl) o;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
            if (volumeID != null ? !volumeID.equals(that.volumeID) :that.volumeID != null) return false;
            return true;
    }


    public class SecretRefNestedImpl<N> extends SecretReferenceFluentImpl<CinderPersistentVolumeSourceFluent.SecretRefNested<N>> implements CinderPersistentVolumeSourceFluent.SecretRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretReferenceBuilder builder;
    
            SecretRefNestedImpl(SecretReference item){
                    this.builder = new SecretReferenceBuilder(this, item);
            }
            SecretRefNestedImpl(){
                    this.builder = new SecretReferenceBuilder(this);
            }
    
    public N and(){
            return (N) CinderPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef(){
            return and();
    }

}


}
