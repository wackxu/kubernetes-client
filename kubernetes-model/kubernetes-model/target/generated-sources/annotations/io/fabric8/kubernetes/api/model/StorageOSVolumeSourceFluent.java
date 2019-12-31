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

public interface StorageOSVolumeSourceFluent<A extends StorageOSVolumeSourceFluent<A>> extends Fluent<A>{


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
@Deprecated public LocalObjectReference getSecretRef();
    public LocalObjectReference buildSecretRef();
    public A withSecretRef(LocalObjectReference secretRef);
    public Boolean hasSecretRef();
    public A withNewSecretRef(String name);
    public StorageOSVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public StorageOSVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(LocalObjectReference item);
    public StorageOSVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public StorageOSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public StorageOSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(LocalObjectReference item);
    public String getVolumeName();
    public A withVolumeName(String volumeName);
    public Boolean hasVolumeName();
    public String getVolumeNamespace();
    public A withVolumeNamespace(String volumeNamespace);
    public Boolean hasVolumeNamespace();

    public interface SecretRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<StorageOSVolumeSourceFluent.SecretRefNested<N>>{

        
    public N and();    public N endSecretRef();
}


}
