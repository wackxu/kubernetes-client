package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Long;
import java.lang.Object;
import java.util.Map;

public interface VolumeProjectionFluent<A extends VolumeProjectionFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildConfigMap instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMapProjection getConfigMap();
    public ConfigMapProjection buildConfigMap();
    public A withConfigMap(ConfigMapProjection configMap);
    public Boolean hasConfigMap();
    public VolumeProjectionFluent.ConfigMapNested<A> withNewConfigMap();
    public VolumeProjectionFluent.ConfigMapNested<A> withNewConfigMapLike(ConfigMapProjection item);
    public VolumeProjectionFluent.ConfigMapNested<A> editConfigMap();
    public VolumeProjectionFluent.ConfigMapNested<A> editOrNewConfigMap();
    public VolumeProjectionFluent.ConfigMapNested<A> editOrNewConfigMapLike(ConfigMapProjection item);
    
/**
 * This method has been deprecated, please use method buildDownwardAPI instead.
 * @return The buildable object.
 */
@Deprecated public DownwardAPIProjection getDownwardAPI();
    public DownwardAPIProjection buildDownwardAPI();
    public A withDownwardAPI(DownwardAPIProjection downwardAPI);
    public Boolean hasDownwardAPI();
    public VolumeProjectionFluent.DownwardAPINested<A> withNewDownwardAPI();
    public VolumeProjectionFluent.DownwardAPINested<A> withNewDownwardAPILike(DownwardAPIProjection item);
    public VolumeProjectionFluent.DownwardAPINested<A> editDownwardAPI();
    public VolumeProjectionFluent.DownwardAPINested<A> editOrNewDownwardAPI();
    public VolumeProjectionFluent.DownwardAPINested<A> editOrNewDownwardAPILike(DownwardAPIProjection item);
    
/**
 * This method has been deprecated, please use method buildSecret instead.
 * @return The buildable object.
 */
@Deprecated public SecretProjection getSecret();
    public SecretProjection buildSecret();
    public A withSecret(SecretProjection secret);
    public Boolean hasSecret();
    public VolumeProjectionFluent.SecretNested<A> withNewSecret();
    public VolumeProjectionFluent.SecretNested<A> withNewSecretLike(SecretProjection item);
    public VolumeProjectionFluent.SecretNested<A> editSecret();
    public VolumeProjectionFluent.SecretNested<A> editOrNewSecret();
    public VolumeProjectionFluent.SecretNested<A> editOrNewSecretLike(SecretProjection item);
    
/**
 * This method has been deprecated, please use method buildServiceAccountToken instead.
 * @return The buildable object.
 */
@Deprecated public ServiceAccountTokenProjection getServiceAccountToken();
    public ServiceAccountTokenProjection buildServiceAccountToken();
    public A withServiceAccountToken(ServiceAccountTokenProjection serviceAccountToken);
    public Boolean hasServiceAccountToken();
    public A withNewServiceAccountToken(String audience,Long expirationSeconds,String path);
    public VolumeProjectionFluent.ServiceAccountTokenNested<A> withNewServiceAccountToken();
    public VolumeProjectionFluent.ServiceAccountTokenNested<A> withNewServiceAccountTokenLike(ServiceAccountTokenProjection item);
    public VolumeProjectionFluent.ServiceAccountTokenNested<A> editServiceAccountToken();
    public VolumeProjectionFluent.ServiceAccountTokenNested<A> editOrNewServiceAccountToken();
    public VolumeProjectionFluent.ServiceAccountTokenNested<A> editOrNewServiceAccountTokenLike(ServiceAccountTokenProjection item);

    public interface ConfigMapNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapProjectionFluent<VolumeProjectionFluent.ConfigMapNested<N>>{

        
    public N and();    public N endConfigMap();
}
    public interface DownwardAPINested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DownwardAPIProjectionFluent<VolumeProjectionFluent.DownwardAPINested<N>>{

        
    public N and();    public N endDownwardAPI();
}
    public interface SecretNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretProjectionFluent<VolumeProjectionFluent.SecretNested<N>>{

        
    public N and();    public N endSecret();
}
    public interface ServiceAccountTokenNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountTokenProjectionFluent<VolumeProjectionFluent.ServiceAccountTokenNested<N>>{

        
    public N and();    public N endServiceAccountToken();
}


}
