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

public interface CinderPersistentVolumeSourceFluent<A extends CinderPersistentVolumeSourceFluent<A>> extends Fluent<A>{


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
@Deprecated public SecretReference getSecretRef();
    public SecretReference buildSecretRef();
    public A withSecretRef(SecretReference secretRef);
    public Boolean hasSecretRef();
    public A withNewSecretRef(String name,String namespace);
    public CinderPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public CinderPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(SecretReference item);
    public CinderPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public CinderPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public CinderPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(SecretReference item);
    public String getVolumeID();
    public A withVolumeID(String volumeID);
    public Boolean hasVolumeID();

    public interface SecretRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretReferenceFluent<CinderPersistentVolumeSourceFluent.SecretRefNested<N>>{

        
    public N and();    public N endSecretRef();
}


}
