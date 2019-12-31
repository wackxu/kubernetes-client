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

public interface CinderVolumeSourceFluent<A extends CinderVolumeSourceFluent<A>> extends Fluent<A>{


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
    public CinderVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public CinderVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(LocalObjectReference item);
    public CinderVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public CinderVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public CinderVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(LocalObjectReference item);
    public String getVolumeID();
    public A withVolumeID(String volumeID);
    public Boolean hasVolumeID();

    public interface SecretRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<CinderVolumeSourceFluent.SecretRefNested<N>>{

        
    public N and();    public N endSecretRef();
}


}
