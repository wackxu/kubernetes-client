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

public class SecretSpecFluentImpl<A extends SecretSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SecretSpecFluent<A>{

    private String mountPath;
    private LocalObjectReferenceBuilder secretSource;

    public SecretSpecFluentImpl(){
    }
    public SecretSpecFluentImpl(SecretSpec instance){
            this.withMountPath(instance.getMountPath()); 
            this.withSecretSource(instance.getSecretSource()); 
    }

    public String getMountPath(){
            return this.mountPath;
    }

    public A withMountPath(String mountPath){
            this.mountPath=mountPath; return (A) this;
    }

    public Boolean hasMountPath(){
            return this.mountPath != null;
    }

    
/**
 * This method has been deprecated, please use method buildSecretSource instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getSecretSource(){
            return this.secretSource!=null?this.secretSource.build():null;
    }

    public LocalObjectReference buildSecretSource(){
            return this.secretSource!=null?this.secretSource.build():null;
    }

    public A withSecretSource(LocalObjectReference secretSource){
            _visitables.remove(this.secretSource);
            if (secretSource!=null){ this.secretSource= new LocalObjectReferenceBuilder(secretSource); _visitables.add(this.secretSource);} return (A) this;
    }

    public Boolean hasSecretSource(){
            return this.secretSource != null;
    }

    public A withNewSecretSource(String name){
            return (A)withSecretSource(new LocalObjectReference(name));
    }

    public SecretSpecFluent.SecretSourceNested<A> withNewSecretSource(){
            return new SecretSourceNestedImpl();
    }

    public SecretSpecFluent.SecretSourceNested<A> withNewSecretSourceLike(LocalObjectReference item){
            return new SecretSourceNestedImpl(item);
    }

    public SecretSpecFluent.SecretSourceNested<A> editSecretSource(){
            return withNewSecretSourceLike(getSecretSource());
    }

    public SecretSpecFluent.SecretSourceNested<A> editOrNewSecretSource(){
            return withNewSecretSourceLike(getSecretSource() != null ? getSecretSource(): new LocalObjectReferenceBuilder().build());
    }

    public SecretSpecFluent.SecretSourceNested<A> editOrNewSecretSourceLike(LocalObjectReference item){
            return withNewSecretSourceLike(getSecretSource() != null ? getSecretSource(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SecretSpecFluentImpl that = (SecretSpecFluentImpl) o;
            if (mountPath != null ? !mountPath.equals(that.mountPath) :that.mountPath != null) return false;
            if (secretSource != null ? !secretSource.equals(that.secretSource) :that.secretSource != null) return false;
            return true;
    }


    public class SecretSourceNestedImpl<N> extends LocalObjectReferenceFluentImpl<SecretSpecFluent.SecretSourceNested<N>> implements SecretSpecFluent.SecretSourceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            SecretSourceNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            SecretSourceNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) SecretSpecFluentImpl.this.withSecretSource(builder.build());
    }
    public N endSecretSource(){
            return and();
    }

}


}
