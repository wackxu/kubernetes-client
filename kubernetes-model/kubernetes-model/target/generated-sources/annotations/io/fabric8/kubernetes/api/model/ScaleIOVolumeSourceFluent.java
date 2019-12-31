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

public interface ScaleIOVolumeSourceFluent<A extends ScaleIOVolumeSourceFluent<A>> extends Fluent<A>{


    public String getFsType();
    public A withFsType(String fsType);
    public Boolean hasFsType();
    public String getGateway();
    public A withGateway(String gateway);
    public Boolean hasGateway();
    public String getProtectionDomain();
    public A withProtectionDomain(String protectionDomain);
    public Boolean hasProtectionDomain();
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
    public ScaleIOVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public ScaleIOVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(LocalObjectReference item);
    public ScaleIOVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public ScaleIOVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public ScaleIOVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(LocalObjectReference item);
    public Boolean isSslEnabled();
    public A withSslEnabled(Boolean sslEnabled);
    public Boolean hasSslEnabled();
    public A withNewSslEnabled(String arg1);
    public A withNewSslEnabled(boolean arg1);
    public String getStorageMode();
    public A withStorageMode(String storageMode);
    public Boolean hasStorageMode();
    public String getStoragePool();
    public A withStoragePool(String storagePool);
    public Boolean hasStoragePool();
    public String getSystem();
    public A withSystem(String system);
    public Boolean hasSystem();
    public String getVolumeName();
    public A withVolumeName(String volumeName);
    public Boolean hasVolumeName();

    public interface SecretRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<ScaleIOVolumeSourceFluent.SecretRefNested<N>>{

        
    public N and();    public N endSecretRef();
}


}
