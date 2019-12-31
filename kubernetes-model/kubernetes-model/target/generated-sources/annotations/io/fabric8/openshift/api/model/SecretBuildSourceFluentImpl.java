package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluentImpl;
import java.lang.Object;
import java.lang.Boolean;

public class SecretBuildSourceFluentImpl<A extends SecretBuildSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SecretBuildSourceFluent<A>{

    private String destinationDir;
    private LocalObjectReferenceBuilder secret;

    public SecretBuildSourceFluentImpl(){
    }
    public SecretBuildSourceFluentImpl(SecretBuildSource instance){
            this.withDestinationDir(instance.getDestinationDir()); 
            this.withSecret(instance.getSecret()); 
    }

    public String getDestinationDir(){
            return this.destinationDir;
    }

    public A withDestinationDir(String destinationDir){
            this.destinationDir=destinationDir; return (A) this;
    }

    public Boolean hasDestinationDir(){
            return this.destinationDir != null;
    }

    
/**
 * This method has been deprecated, please use method buildSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getSecret(){
            return this.secret!=null?this.secret.build():null;
    }

    public LocalObjectReference buildSecret(){
            return this.secret!=null?this.secret.build():null;
    }

    public A withSecret(LocalObjectReference secret){
            _visitables.remove(this.secret);
            if (secret!=null){ this.secret= new LocalObjectReferenceBuilder(secret); _visitables.add(this.secret);} return (A) this;
    }

    public Boolean hasSecret(){
            return this.secret != null;
    }

    public A withNewSecret(String name){
            return (A)withSecret(new LocalObjectReference(name));
    }

    public SecretBuildSourceFluent.SecretNested<A> withNewSecret(){
            return new SecretNestedImpl();
    }

    public SecretBuildSourceFluent.SecretNested<A> withNewSecretLike(LocalObjectReference item){
            return new SecretNestedImpl(item);
    }

    public SecretBuildSourceFluent.SecretNested<A> editSecret(){
            return withNewSecretLike(getSecret());
    }

    public SecretBuildSourceFluent.SecretNested<A> editOrNewSecret(){
            return withNewSecretLike(getSecret() != null ? getSecret(): new LocalObjectReferenceBuilder().build());
    }

    public SecretBuildSourceFluent.SecretNested<A> editOrNewSecretLike(LocalObjectReference item){
            return withNewSecretLike(getSecret() != null ? getSecret(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretBuildSourceFluentImpl that = (SecretBuildSourceFluentImpl) o;
            if (destinationDir != null ? !destinationDir.equals(that.destinationDir) :that.destinationDir != null) return false;
            if (secret != null ? !secret.equals(that.secret) :that.secret != null) return false;
            return true;
    }


    public class SecretNestedImpl<N> extends LocalObjectReferenceFluentImpl<SecretBuildSourceFluent.SecretNested<N>> implements SecretBuildSourceFluent.SecretNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            SecretNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            SecretNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) SecretBuildSourceFluentImpl.this.withSecret(builder.build());
    }
    public N endSecret(){
            return and();
    }

}


}
