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

public interface SecretBuildSourceFluent<A extends SecretBuildSourceFluent<A>> extends Fluent<A>{


    public String getDestinationDir();
    public A withDestinationDir(String destinationDir);
    public Boolean hasDestinationDir();
    
/**
 * This method has been deprecated, please use method buildSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getSecret();
    public LocalObjectReference buildSecret();
    public A withSecret(LocalObjectReference secret);
    public Boolean hasSecret();
    public A withNewSecret(String name);
    public SecretBuildSourceFluent.SecretNested<A> withNewSecret();
    public SecretBuildSourceFluent.SecretNested<A> withNewSecretLike(LocalObjectReference item);
    public SecretBuildSourceFluent.SecretNested<A> editSecret();
    public SecretBuildSourceFluent.SecretNested<A> editOrNewSecret();
    public SecretBuildSourceFluent.SecretNested<A> editOrNewSecretLike(LocalObjectReference item);

    public interface SecretNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<SecretBuildSourceFluent.SecretNested<N>>{

        
    public N and();    public N endSecret();
}


}
