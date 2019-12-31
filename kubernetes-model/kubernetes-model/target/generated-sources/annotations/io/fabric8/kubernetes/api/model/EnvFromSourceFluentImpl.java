package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class EnvFromSourceFluentImpl<A extends EnvFromSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements EnvFromSourceFluent<A>{

    private ConfigMapEnvSourceBuilder configMapRef;
    private String prefix;
    private SecretEnvSourceBuilder secretRef;

    public EnvFromSourceFluentImpl(){
    }
    public EnvFromSourceFluentImpl(EnvFromSource instance){
            this.withConfigMapRef(instance.getConfigMapRef()); 
            this.withPrefix(instance.getPrefix()); 
            this.withSecretRef(instance.getSecretRef()); 
    }

    
/**
 * This method has been deprecated, please use method buildConfigMapRef instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMapEnvSource getConfigMapRef(){
            return this.configMapRef!=null?this.configMapRef.build():null;
    }

    public ConfigMapEnvSource buildConfigMapRef(){
            return this.configMapRef!=null?this.configMapRef.build():null;
    }

    public A withConfigMapRef(ConfigMapEnvSource configMapRef){
            _visitables.remove(this.configMapRef);
            if (configMapRef!=null){ this.configMapRef= new ConfigMapEnvSourceBuilder(configMapRef); _visitables.add(this.configMapRef);} return (A) this;
    }

    public Boolean hasConfigMapRef(){
            return this.configMapRef != null;
    }

    public A withNewConfigMapRef(String name,Boolean optional){
            return (A)withConfigMapRef(new ConfigMapEnvSource(name, optional));
    }

    public EnvFromSourceFluent.ConfigMapRefNested<A> withNewConfigMapRef(){
            return new ConfigMapRefNestedImpl();
    }

    public EnvFromSourceFluent.ConfigMapRefNested<A> withNewConfigMapRefLike(ConfigMapEnvSource item){
            return new ConfigMapRefNestedImpl(item);
    }

    public EnvFromSourceFluent.ConfigMapRefNested<A> editConfigMapRef(){
            return withNewConfigMapRefLike(getConfigMapRef());
    }

    public EnvFromSourceFluent.ConfigMapRefNested<A> editOrNewConfigMapRef(){
            return withNewConfigMapRefLike(getConfigMapRef() != null ? getConfigMapRef(): new ConfigMapEnvSourceBuilder().build());
    }

    public EnvFromSourceFluent.ConfigMapRefNested<A> editOrNewConfigMapRefLike(ConfigMapEnvSource item){
            return withNewConfigMapRefLike(getConfigMapRef() != null ? getConfigMapRef(): item);
    }

    public String getPrefix(){
            return this.prefix;
    }

    public A withPrefix(String prefix){
            this.prefix=prefix; return (A) this;
    }

    public Boolean hasPrefix(){
            return this.prefix != null;
    }

    
/**
 * This method has been deprecated, please use method buildSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public SecretEnvSource getSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public SecretEnvSource buildSecretRef(){
            return this.secretRef!=null?this.secretRef.build():null;
    }

    public A withSecretRef(SecretEnvSource secretRef){
            _visitables.remove(this.secretRef);
            if (secretRef!=null){ this.secretRef= new SecretEnvSourceBuilder(secretRef); _visitables.add(this.secretRef);} return (A) this;
    }

    public Boolean hasSecretRef(){
            return this.secretRef != null;
    }

    public A withNewSecretRef(String name,Boolean optional){
            return (A)withSecretRef(new SecretEnvSource(name, optional));
    }

    public EnvFromSourceFluent.SecretRefNested<A> withNewSecretRef(){
            return new SecretRefNestedImpl();
    }

    public EnvFromSourceFluent.SecretRefNested<A> withNewSecretRefLike(SecretEnvSource item){
            return new SecretRefNestedImpl(item);
    }

    public EnvFromSourceFluent.SecretRefNested<A> editSecretRef(){
            return withNewSecretRefLike(getSecretRef());
    }

    public EnvFromSourceFluent.SecretRefNested<A> editOrNewSecretRef(){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): new SecretEnvSourceBuilder().build());
    }

    public EnvFromSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(SecretEnvSource item){
            return withNewSecretRefLike(getSecretRef() != null ? getSecretRef(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EnvFromSourceFluentImpl that = (EnvFromSourceFluentImpl) o;
            if (configMapRef != null ? !configMapRef.equals(that.configMapRef) :that.configMapRef != null) return false;
            if (prefix != null ? !prefix.equals(that.prefix) :that.prefix != null) return false;
            if (secretRef != null ? !secretRef.equals(that.secretRef) :that.secretRef != null) return false;
            return true;
    }


    public class ConfigMapRefNestedImpl<N> extends ConfigMapEnvSourceFluentImpl<EnvFromSourceFluent.ConfigMapRefNested<N>> implements EnvFromSourceFluent.ConfigMapRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapEnvSourceBuilder builder;
    
            ConfigMapRefNestedImpl(ConfigMapEnvSource item){
                    this.builder = new ConfigMapEnvSourceBuilder(this, item);
            }
            ConfigMapRefNestedImpl(){
                    this.builder = new ConfigMapEnvSourceBuilder(this);
            }
    
    public N and(){
            return (N) EnvFromSourceFluentImpl.this.withConfigMapRef(builder.build());
    }
    public N endConfigMapRef(){
            return and();
    }

}
    public class SecretRefNestedImpl<N> extends SecretEnvSourceFluentImpl<EnvFromSourceFluent.SecretRefNested<N>> implements EnvFromSourceFluent.SecretRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretEnvSourceBuilder builder;
    
            SecretRefNestedImpl(SecretEnvSource item){
                    this.builder = new SecretEnvSourceBuilder(this, item);
            }
            SecretRefNestedImpl(){
                    this.builder = new SecretEnvSourceBuilder(this);
            }
    
    public N and(){
            return (N) EnvFromSourceFluentImpl.this.withSecretRef(builder.build());
    }
    public N endSecretRef(){
            return and();
    }

}


}
