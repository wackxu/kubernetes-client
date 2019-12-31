package io.fabric8.openshift.api.model;

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

public interface WebHookTriggerFluent<A extends WebHookTriggerFluent<A>> extends Fluent<A>{


    public Boolean isAllowEnv();
    public A withAllowEnv(Boolean allowEnv);
    public Boolean hasAllowEnv();
    public A withNewAllowEnv(String arg1);
    public A withNewAllowEnv(boolean arg1);
    public String getSecret();
    public A withSecret(String secret);
    public Boolean hasSecret();
    
/**
 * This method has been deprecated, please use method buildSecretReference instead.
 * @return The buildable object.
 */
@Deprecated public SecretLocalReference getSecretReference();
    public SecretLocalReference buildSecretReference();
    public A withSecretReference(SecretLocalReference secretReference);
    public Boolean hasSecretReference();
    public A withNewSecretReference(String name);
    public WebHookTriggerFluent.SecretReferenceNested<A> withNewSecretReference();
    public WebHookTriggerFluent.SecretReferenceNested<A> withNewSecretReferenceLike(SecretLocalReference item);
    public WebHookTriggerFluent.SecretReferenceNested<A> editSecretReference();
    public WebHookTriggerFluent.SecretReferenceNested<A> editOrNewSecretReference();
    public WebHookTriggerFluent.SecretReferenceNested<A> editOrNewSecretReferenceLike(SecretLocalReference item);

    public interface SecretReferenceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretLocalReferenceFluent<WebHookTriggerFluent.SecretReferenceNested<N>>{

        
    public N and();    public N endSecretReference();
}


}
