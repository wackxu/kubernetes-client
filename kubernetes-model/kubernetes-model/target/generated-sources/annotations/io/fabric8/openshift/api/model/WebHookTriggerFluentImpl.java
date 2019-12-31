package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class WebHookTriggerFluentImpl<A extends WebHookTriggerFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements WebHookTriggerFluent<A>{

    private Boolean allowEnv;
    private String secret;
    private SecretLocalReferenceBuilder secretReference;

    public WebHookTriggerFluentImpl(){
    }
    public WebHookTriggerFluentImpl(WebHookTrigger instance){
            this.withAllowEnv(instance.getAllowEnv()); 
            this.withSecret(instance.getSecret()); 
            this.withSecretReference(instance.getSecretReference()); 
    }

    public Boolean isAllowEnv(){
            return this.allowEnv;
    }

    public A withAllowEnv(Boolean allowEnv){
            this.allowEnv=allowEnv; return (A) this;
    }

    public Boolean hasAllowEnv(){
            return this.allowEnv != null;
    }

    public A withNewAllowEnv(String arg1){
            return (A)withAllowEnv(new Boolean(arg1));
    }

    public A withNewAllowEnv(boolean arg1){
            return (A)withAllowEnv(new Boolean(arg1));
    }

    public String getSecret(){
            return this.secret;
    }

    public A withSecret(String secret){
            this.secret=secret; return (A) this;
    }

    public Boolean hasSecret(){
            return this.secret != null;
    }

    
/**
 * This method has been deprecated, please use method buildSecretReference instead.
 * @return The buildable object.
 */
@Deprecated public SecretLocalReference getSecretReference(){
            return this.secretReference!=null?this.secretReference.build():null;
    }

    public SecretLocalReference buildSecretReference(){
            return this.secretReference!=null?this.secretReference.build():null;
    }

    public A withSecretReference(SecretLocalReference secretReference){
            _visitables.remove(this.secretReference);
            if (secretReference!=null){ this.secretReference= new SecretLocalReferenceBuilder(secretReference); _visitables.add(this.secretReference);} return (A) this;
    }

    public Boolean hasSecretReference(){
            return this.secretReference != null;
    }

    public A withNewSecretReference(String name){
            return (A)withSecretReference(new SecretLocalReference(name));
    }

    public WebHookTriggerFluent.SecretReferenceNested<A> withNewSecretReference(){
            return new SecretReferenceNestedImpl();
    }

    public WebHookTriggerFluent.SecretReferenceNested<A> withNewSecretReferenceLike(SecretLocalReference item){
            return new SecretReferenceNestedImpl(item);
    }

    public WebHookTriggerFluent.SecretReferenceNested<A> editSecretReference(){
            return withNewSecretReferenceLike(getSecretReference());
    }

    public WebHookTriggerFluent.SecretReferenceNested<A> editOrNewSecretReference(){
            return withNewSecretReferenceLike(getSecretReference() != null ? getSecretReference(): new SecretLocalReferenceBuilder().build());
    }

    public WebHookTriggerFluent.SecretReferenceNested<A> editOrNewSecretReferenceLike(SecretLocalReference item){
            return withNewSecretReferenceLike(getSecretReference() != null ? getSecretReference(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            WebHookTriggerFluentImpl that = (WebHookTriggerFluentImpl) o;
            if (allowEnv != null ? !allowEnv.equals(that.allowEnv) :that.allowEnv != null) return false;
            if (secret != null ? !secret.equals(that.secret) :that.secret != null) return false;
            if (secretReference != null ? !secretReference.equals(that.secretReference) :that.secretReference != null) return false;
            return true;
    }


    public class SecretReferenceNestedImpl<N> extends SecretLocalReferenceFluentImpl<WebHookTriggerFluent.SecretReferenceNested<N>> implements WebHookTriggerFluent.SecretReferenceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretLocalReferenceBuilder builder;
    
            SecretReferenceNestedImpl(SecretLocalReference item){
                    this.builder = new SecretLocalReferenceBuilder(this, item);
            }
            SecretReferenceNestedImpl(){
                    this.builder = new SecretLocalReferenceBuilder(this);
            }
    
    public N and(){
            return (N) WebHookTriggerFluentImpl.this.withSecretReference(builder.build());
    }
    public N endSecretReference(){
            return and();
    }

}


}
