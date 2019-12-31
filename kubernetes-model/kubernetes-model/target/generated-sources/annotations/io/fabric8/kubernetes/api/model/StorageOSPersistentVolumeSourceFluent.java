package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface StorageOSPersistentVolumeSourceFluent<A extends StorageOSPersistentVolumeSourceFluent<A>> extends Fluent<A>{


    public String getFsType();
    public A withFsType(String fsType);
    public Boolean hasFsType();
    public Boolean isReadOnly();
    public A withReadOnly(Boolean readOnly);
    public Boolean hasReadOnly();
    public A withNewReadOnly(String arg1);
    public A withNewReadOnly(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getSecretRef();
    public ObjectReference buildSecretRef();
    public A withSecretRef(ObjectReference secretRef);
    public Boolean hasSecretRef();
    public StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(ObjectReference item);
    public StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(ObjectReference item);
    public String getVolumeName();
    public A withVolumeName(String volumeName);
    public Boolean hasVolumeName();
    public String getVolumeNamespace();
    public A withVolumeNamespace(String volumeNamespace);
    public Boolean hasVolumeNamespace();

    public interface SecretRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<StorageOSPersistentVolumeSourceFluent.SecretRefNested<N>>{

        
    public N and();    public N endSecretRef();
}


}
