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

public interface EnvFromSourceFluent<A extends EnvFromSourceFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildConfigMapRef instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMapEnvSource getConfigMapRef();
    public ConfigMapEnvSource buildConfigMapRef();
    public A withConfigMapRef(ConfigMapEnvSource configMapRef);
    public Boolean hasConfigMapRef();
    public A withNewConfigMapRef(String name,Boolean optional);
    public EnvFromSourceFluent.ConfigMapRefNested<A> withNewConfigMapRef();
    public EnvFromSourceFluent.ConfigMapRefNested<A> withNewConfigMapRefLike(ConfigMapEnvSource item);
    public EnvFromSourceFluent.ConfigMapRefNested<A> editConfigMapRef();
    public EnvFromSourceFluent.ConfigMapRefNested<A> editOrNewConfigMapRef();
    public EnvFromSourceFluent.ConfigMapRefNested<A> editOrNewConfigMapRefLike(ConfigMapEnvSource item);
    public String getPrefix();
    public A withPrefix(String prefix);
    public Boolean hasPrefix();
    
/**
 * This method has been deprecated, please use method buildSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public SecretEnvSource getSecretRef();
    public SecretEnvSource buildSecretRef();
    public A withSecretRef(SecretEnvSource secretRef);
    public Boolean hasSecretRef();
    public A withNewSecretRef(String name,Boolean optional);
    public EnvFromSourceFluent.SecretRefNested<A> withNewSecretRef();
    public EnvFromSourceFluent.SecretRefNested<A> withNewSecretRefLike(SecretEnvSource item);
    public EnvFromSourceFluent.SecretRefNested<A> editSecretRef();
    public EnvFromSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public EnvFromSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(SecretEnvSource item);

    public interface ConfigMapRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapEnvSourceFluent<EnvFromSourceFluent.ConfigMapRefNested<N>>{

        
    public N and();    public N endConfigMapRef();
}
    public interface SecretRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretEnvSourceFluent<EnvFromSourceFluent.SecretRefNested<N>>{

        
    public N and();    public N endSecretRef();
}


}
