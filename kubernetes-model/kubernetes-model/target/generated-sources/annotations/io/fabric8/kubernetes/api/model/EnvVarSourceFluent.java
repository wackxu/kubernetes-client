package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface EnvVarSourceFluent<A extends EnvVarSourceFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildConfigMapKeyRef instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMapKeySelector getConfigMapKeyRef();
    public ConfigMapKeySelector buildConfigMapKeyRef();
    public A withConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef);
    public Boolean hasConfigMapKeyRef();
    public A withNewConfigMapKeyRef(String key,String name,Boolean optional);
    public EnvVarSourceFluent.ConfigMapKeyRefNested<A> withNewConfigMapKeyRef();
    public EnvVarSourceFluent.ConfigMapKeyRefNested<A> withNewConfigMapKeyRefLike(ConfigMapKeySelector item);
    public EnvVarSourceFluent.ConfigMapKeyRefNested<A> editConfigMapKeyRef();
    public EnvVarSourceFluent.ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRef();
    public EnvVarSourceFluent.ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRefLike(ConfigMapKeySelector item);
    
/**
 * This method has been deprecated, please use method buildFieldRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectFieldSelector getFieldRef();
    public ObjectFieldSelector buildFieldRef();
    public A withFieldRef(ObjectFieldSelector fieldRef);
    public Boolean hasFieldRef();
    public A withNewFieldRef(String apiVersion,String fieldPath);
    public EnvVarSourceFluent.FieldRefNested<A> withNewFieldRef();
    public EnvVarSourceFluent.FieldRefNested<A> withNewFieldRefLike(ObjectFieldSelector item);
    public EnvVarSourceFluent.FieldRefNested<A> editFieldRef();
    public EnvVarSourceFluent.FieldRefNested<A> editOrNewFieldRef();
    public EnvVarSourceFluent.FieldRefNested<A> editOrNewFieldRefLike(ObjectFieldSelector item);
    
/**
 * This method has been deprecated, please use method buildResourceFieldRef instead.
 * @return The buildable object.
 */
@Deprecated public ResourceFieldSelector getResourceFieldRef();
    public ResourceFieldSelector buildResourceFieldRef();
    public A withResourceFieldRef(ResourceFieldSelector resourceFieldRef);
    public Boolean hasResourceFieldRef();
    public EnvVarSourceFluent.ResourceFieldRefNested<A> withNewResourceFieldRef();
    public EnvVarSourceFluent.ResourceFieldRefNested<A> withNewResourceFieldRefLike(ResourceFieldSelector item);
    public EnvVarSourceFluent.ResourceFieldRefNested<A> editResourceFieldRef();
    public EnvVarSourceFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRef();
    public EnvVarSourceFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(ResourceFieldSelector item);
    
/**
 * This method has been deprecated, please use method buildSecretKeyRef instead.
 * @return The buildable object.
 */
@Deprecated public SecretKeySelector getSecretKeyRef();
    public SecretKeySelector buildSecretKeyRef();
    public A withSecretKeyRef(SecretKeySelector secretKeyRef);
    public Boolean hasSecretKeyRef();
    public A withNewSecretKeyRef(String key,String name,Boolean optional);
    public EnvVarSourceFluent.SecretKeyRefNested<A> withNewSecretKeyRef();
    public EnvVarSourceFluent.SecretKeyRefNested<A> withNewSecretKeyRefLike(SecretKeySelector item);
    public EnvVarSourceFluent.SecretKeyRefNested<A> editSecretKeyRef();
    public EnvVarSourceFluent.SecretKeyRefNested<A> editOrNewSecretKeyRef();
    public EnvVarSourceFluent.SecretKeyRefNested<A> editOrNewSecretKeyRefLike(SecretKeySelector item);

    public interface ConfigMapKeyRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapKeySelectorFluent<EnvVarSourceFluent.ConfigMapKeyRefNested<N>>{

        
    public N and();    public N endConfigMapKeyRef();
}
    public interface FieldRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectFieldSelectorFluent<EnvVarSourceFluent.FieldRefNested<N>>{

        
    public N and();    public N endFieldRef();
}
    public interface ResourceFieldRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceFieldSelectorFluent<EnvVarSourceFluent.ResourceFieldRefNested<N>>{

        
    public N and();    public N endResourceFieldRef();
}
    public interface SecretKeyRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretKeySelectorFluent<EnvVarSourceFluent.SecretKeyRefNested<N>>{

        
    public N and();    public N endSecretKeyRef();
}


}
