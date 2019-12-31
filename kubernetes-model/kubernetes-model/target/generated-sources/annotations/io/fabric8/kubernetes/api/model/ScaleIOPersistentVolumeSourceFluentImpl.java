package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class ScaleIOPersistentVolumeSourceFluentImpl<A extends ScaleIOPersistentVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ScaleIOPersistentVolumeSourceFluent<A>{

    private String fsType;
    private String gateway;
    private String protectionDomain;
    private Boolean readOnly;
    private SecretReferenceBuilder secretRef;
    private Boolean sslEnabled;
    private String storageMode;
    private String storagePool;
    private String system;
    private String volumeName;

    public ScaleIOPersistentVolumeSourceFluentImpl(){
    }
    public ScaleIOPersistentVolumeSourceFluentImpl(ScaleIOPersistentVolumeSource instance){
            this.withFsType(instance.getFsType()); 
            this.withGateway(instance.getGateway()); 
            this.withProtectionDomain(instance.getProtectionDomain()); 
            this.withReadOnly(instance.getReadOnly()); 
            this.withSecretRef(instance.getSecretRef()); 
            this.withSslEnabled(instance.getSslEnabled()); 
            this.withStorageMode(instance.getStorageMode()); 
            this.withStoragePool(instance.getStoragePool()); 
            this.withSystem(instance.getSystem()); 
            this.withVolumeName(instance.getVolumeName()); 
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

    public String getGateway(){
            return this.gateway;
    }

    public A withGateway(String gateway){
            this.gateway=gateway; return (A) this;
    }

    public Boolean hasGateway(){
            return this.gateway != null;
    }

    public String getProtectionDomain(){
            return this.protectionDomain;
    }

    public A withProtectionDomain(String protectionDomain){
            this.protectionDomain=protectionDomain; return (A) this;
    }

    public Boolean hasProtectionDomain(){
            return this.protectionDomain != null;
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

    public ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef(){
            return new SecretRefNestedImpl();
    }

    public ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(SecretReference item){
            return new SecretRefNestedImpl(item);
    }

    public ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef(){
            return withNewSecretRefLike(getSecretRef());
    }

    public ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef(){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new SecretReferenceBuilder().build());
    }

    public ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(SecretReference item){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
    }

    public Boolean isSslEnabled(){
            return this.sslEnabled;
    }

    public A withSslEnabled(Boolean sslEnabled){
            this.sslEnabled=sslEnabled; return (A) this;
    }

    public Boolean hasSslEnabled(){
            return this.sslEnabled != null;
    }

    public A withNewSslEnabled(String arg1){
            return (A)withSslEnabled(new Boolean(arg1));
    }

    public A withNewSslEnabled(boolean arg1){
            return (A)withSslEnabled(new Boolean(arg1));
    }

    public String getStorageMode(){
            return this.storageMode;
    }

    public A withStorageMode(String storageMode){
            this.storageMode=storageMode; return (A) this;
    }

    public Boolean hasStorageMode(){
            return this.storageMode != null;
    }

    public String getStoragePool(){
            return this.storagePool;
    }

    public A withStoragePool(String storagePool){
            this.storagePool=storagePool; return (A) this;
    }

    public Boolean hasStoragePool(){
            return this.storagePool != null;
    }

    public String getSystem(){
            return this.system;
    }

    public A withSystem(String system){
            this.system=system; return (A) this;
    }

    public Boolean hasSystem(){
            return this.system != null;
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScaleIOPersistentVolumeSourceFluentImpl that = (ScaleIOPersistentVolumeSourceFluentImpl) o;
            if (fsType != null ? !fsType.equals(that.fsType) :that.fsType != null) return false;
            if (gateway != null ? !gateway.equals(that.gateway) :that.gateway != null) return false;
            if (protectionDomain != null ? !protectionDomain.equals(that.protectionDomain) :that.protectionDomain != null) return false;
            if (readOnly != null ? !readOnly.equals(that.readOnly) :that.readOnly != null) return false;
            if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
            if (sslEnabled != null ? !sslEnabled.equals(that.sslEnabled) :that.sslEnabled != null) return false;
            if (storageMode != null ? !storageMode.equals(that.storageMode) :that.storageMode != null) return false;
            if (storagePool != null ? !storagePool.equals(that.storagePool) :that.storagePool != null) return false;
            if (system != null ? !system.equals(that.system) :that.system != null) return false;
            if (volumeName != null ? !volumeName.equals(that.volumeName) :that.volumeName != null) return false;
            return true;
    }


    public class SecretRefNestedImpl<N> extends SecretReferenceFluentImpl<ScaleIOPersistentVolumeSourceFluent.SecretRefNested<N>> implements ScaleIOPersistentVolumeSourceFluent.SecretRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretReferenceBuilder builder;
    
            SecretRefNestedImpl(SecretReference item){
                    this.builder = new SecretReferenceBuilder(this, item);
            }
            SecretRefNestedImpl(){
                    this.builder = new SecretReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ScaleIOPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef(){
            return and();
    }

}


}
