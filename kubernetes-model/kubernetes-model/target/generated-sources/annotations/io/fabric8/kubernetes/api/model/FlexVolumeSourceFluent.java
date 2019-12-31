package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface FlexVolumeSourceFluent<A extends FlexVolumeSourceFluent<A>> extends Fluent<A>{


    public String getDriver();
    public A withDriver(String driver);
    public Boolean hasDriver();
    public String getFsType();
    public A withFsType(String fsType);
    public Boolean hasFsType();
    public A addToOptions(String key,String value);
    public A addToOptions(Map<String,String> map);
    public A removeFromOptions(String key);
    public A removeFromOptions(Map<String,String> map);
    public Map<String,String> getOptions();
    public A withOptions(Map<String,String> options);
    public Boolean hasOptions();
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
    public FlexVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public FlexVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(LocalObjectReference item);
    public FlexVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public FlexVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public FlexVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(LocalObjectReference item);

    public interface SecretRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<FlexVolumeSourceFluent.SecretRefNested<N>>{

        
    public N and();    public N endSecretRef();
}


}
