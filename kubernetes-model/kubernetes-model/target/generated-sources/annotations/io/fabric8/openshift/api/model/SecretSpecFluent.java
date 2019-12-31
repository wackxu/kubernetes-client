package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluent;

public interface SecretSpecFluent<A extends SecretSpecFluent<A>> extends Fluent<A>{


    public String getMountPath();
    public A withMountPath(String mountPath);
    public Boolean hasMountPath();
    
/**
 * This method has been deprecated, please use method buildSecretSource instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getSecretSource();
    public LocalObjectReference buildSecretSource();
    public A withSecretSource(LocalObjectReference secretSource);
    public Boolean hasSecretSource();
    public A withNewSecretSource(String name);
    public SecretSpecFluent.SecretSourceNested<A> withNewSecretSource();
    public SecretSpecFluent.SecretSourceNested<A> withNewSecretSourceLike(LocalObjectReference item);
    public SecretSpecFluent.SecretSourceNested<A> editSecretSource();
    public SecretSpecFluent.SecretSourceNested<A> editOrNewSecretSource();
    public SecretSpecFluent.SecretSourceNested<A> editOrNewSecretSourceLike(LocalObjectReference item);

    public interface SecretSourceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<SecretSpecFluent.SecretSourceNested<N>>{

        
    public N and();    public N endSecretSource();
}


}
