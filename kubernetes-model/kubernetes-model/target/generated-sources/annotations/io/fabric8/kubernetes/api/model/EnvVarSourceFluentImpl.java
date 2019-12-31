package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;

public class EnvVarSourceFluentImpl<A extends EnvVarSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements EnvVarSourceFluent<A>{

    private ConfigMapKeySelectorBuilder configMapKeyRef;
    private ObjectFieldSelectorBuilder fieldRef;
    private ResourceFieldSelectorBuilder resourceFieldRef;
    private SecretKeySelectorBuilder secretKeyRef;

    public EnvVarSourceFluentImpl(){
    }
    public EnvVarSourceFluentImpl(EnvVarSource instance){
            this.withConfigMapKeyRef(instance.getConfigMapKeyRef()); 
            this.withFieldRef(instance.getFieldRef()); 
            this.withResourceFieldRef(instance.getResourceFieldRef()); 
            this.withSecretKeyRef(instance.getSecretKeyRef()); 
    }

    
/**
 * This method has been deprecated, please use method buildConfigMapKeyRef instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMapKeySelector getConfigMapKeyRef(){
            return this.configMapKeyRef!=null?this.configMapKeyRef.build():null;
    }

    public ConfigMapKeySelector buildConfigMapKeyRef(){
            return this.configMapKeyRef!=null?this.configMapKeyRef.build():null;
    }

    public A withConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef){
            _visitables.remove(this.configMapKeyRef);
            if (configMapKeyRef!=null){ this.configMapKeyRef= new ConfigMapKeySelectorBuilder(configMapKeyRef); _visitables.add(this.configMapKeyRef);} return (A) this;
    }

    public Boolean hasConfigMapKeyRef(){
            return this.configMapKeyRef != null;
    }

    public A withNewConfigMapKeyRef(String key,String name,Boolean optional){
            return (A)withConfigMapKeyRef(new ConfigMapKeySelector(key, name, optional));
    }

    public EnvVarSourceFluent.ConfigMapKeyRefNested<A> withNewConfigMapKeyRef(){
            return new ConfigMapKeyRefNestedImpl();
    }

    public EnvVarSourceFluent.ConfigMapKeyRefNested<A> withNewConfigMapKeyRefLike(ConfigMapKeySelector item){
            return new ConfigMapKeyRefNestedImpl(item);
    }

    public EnvVarSourceFluent.ConfigMapKeyRefNested<A> editConfigMapKeyRef(){
            return withNewConfigMapKeyRefLike(getConfigMapKeyRef());
    }

    public EnvVarSourceFluent.ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRef(){
            return withNewConfigMapKeyRefLike(getConfigMapKeyRef() != null ? getConfigMapKeyRef(): new ConfigMapKeySelectorBuilder().build());
    }

    public EnvVarSourceFluent.ConfigMapKeyRefNested<A> editOrNewConfigMapKeyRefLike(ConfigMapKeySelector item){
            return withNewConfigMapKeyRefLike(getConfigMapKeyRef() != null ? getConfigMapKeyRef(): item);
    }

    
/**
 * This method has been deprecated, please use method buildFieldRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectFieldSelector getFieldRef(){
            return this.fieldRef!=null?this.fieldRef.build():null;
    }

    public ObjectFieldSelector buildFieldRef(){
            return this.fieldRef!=null?this.fieldRef.build():null;
    }

    public A withFieldRef(ObjectFieldSelector fieldRef){
            _visitables.remove(this.fieldRef);
            if (fieldRef!=null){ this.fieldRef= new ObjectFieldSelectorBuilder(fieldRef); _visitables.add(this.fieldRef);} return (A) this;
    }

    public Boolean hasFieldRef(){
            return this.fieldRef != null;
    }

    public A withNewFieldRef(String apiVersion,String fieldPath){
            return (A)withFieldRef(new ObjectFieldSelector(apiVersion, fieldPath));
    }

    public EnvVarSourceFluent.FieldRefNested<A> withNewFieldRef(){
            return new FieldRefNestedImpl();
    }

    public EnvVarSourceFluent.FieldRefNested<A> withNewFieldRefLike(ObjectFieldSelector item){
            return new FieldRefNestedImpl(item);
    }

    public EnvVarSourceFluent.FieldRefNested<A> editFieldRef(){
            return withNewFieldRefLike(getFieldRef());
    }

    public EnvVarSourceFluent.FieldRefNested<A> editOrNewFieldRef(){
            return withNewFieldRefLike(getFieldRef() != null ? getFieldRef(): new ObjectFieldSelectorBuilder().build());
    }

    public EnvVarSourceFluent.FieldRefNested<A> editOrNewFieldRefLike(ObjectFieldSelector item){
            return withNewFieldRefLike(getFieldRef() != null ? getFieldRef(): item);
    }

    
/**
 * This method has been deprecated, please use method buildResourceFieldRef instead.
 * @return The buildable object.
 */
@Deprecated public ResourceFieldSelector getResourceFieldRef(){
            return this.resourceFieldRef!=null?this.resourceFieldRef.build():null;
    }

    public ResourceFieldSelector buildResourceFieldRef(){
            return this.resourceFieldRef!=null?this.resourceFieldRef.build():null;
    }

    public A withResourceFieldRef(ResourceFieldSelector resourceFieldRef){
            _visitables.remove(this.resourceFieldRef);
            if (resourceFieldRef!=null){ this.resourceFieldRef= new ResourceFieldSelectorBuilder(resourceFieldRef); _visitables.add(this.resourceFieldRef);} return (A) this;
    }

    public Boolean hasResourceFieldRef(){
            return this.resourceFieldRef != null;
    }

    public EnvVarSourceFluent.ResourceFieldRefNested<A> withNewResourceFieldRef(){
            return new ResourceFieldRefNestedImpl();
    }

    public EnvVarSourceFluent.ResourceFieldRefNested<A> withNewResourceFieldRefLike(ResourceFieldSelector item){
            return new ResourceFieldRefNestedImpl(item);
    }

    public EnvVarSourceFluent.ResourceFieldRefNested<A> editResourceFieldRef(){
            return withNewResourceFieldRefLike(getResourceFieldRef());
    }

    public EnvVarSourceFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRef(){
            return withNewResourceFieldRefLike(getResourceFieldRef() != null ? getResourceFieldRef(): new ResourceFieldSelectorBuilder().build());
    }

    public EnvVarSourceFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(ResourceFieldSelector item){
            return withNewResourceFieldRefLike(getResourceFieldRef() != null ? getResourceFieldRef(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSecretKeyRef instead.
 * @return The buildable object.
 */
@Deprecated public SecretKeySelector getSecretKeyRef(){
            return this.secretKeyRef!=null?this.secretKeyRef.build():null;
    }

    public SecretKeySelector buildSecretKeyRef(){
            return this.secretKeyRef!=null?this.secretKeyRef.build():null;
    }

    public A withSecretKeyRef(SecretKeySelector secretKeyRef){
            _visitables.remove(this.secretKeyRef);
            if (secretKeyRef!=null){ this.secretKeyRef= new SecretKeySelectorBuilder(secretKeyRef); _visitables.add(this.secretKeyRef);} return (A) this;
    }

    public Boolean hasSecretKeyRef(){
            return this.secretKeyRef != null;
    }

    public A withNewSecretKeyRef(String key,String name,Boolean optional){
            return (A)withSecretKeyRef(new SecretKeySelector(key, name, optional));
    }

    public EnvVarSourceFluent.SecretKeyRefNested<A> withNewSecretKeyRef(){
            return new SecretKeyRefNestedImpl();
    }

    public EnvVarSourceFluent.SecretKeyRefNested<A> withNewSecretKeyRefLike(SecretKeySelector item){
            return new SecretKeyRefNestedImpl(item);
    }

    public EnvVarSourceFluent.SecretKeyRefNested<A> editSecretKeyRef(){
            return withNewSecretKeyRefLike(getSecretKeyRef());
    }

    public EnvVarSourceFluent.SecretKeyRefNested<A> editOrNewSecretKeyRef(){
            return withNewSecretKeyRefLike(getSecretKeyRef() != null ? getSecretKeyRef(): new SecretKeySelectorBuilder().build());
    }

    public EnvVarSourceFluent.SecretKeyRefNested<A> editOrNewSecretKeyRefLike(SecretKeySelector item){
            return withNewSecretKeyRefLike(getSecretKeyRef() != null ? getSecretKeyRef(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            EnvVarSourceFluentImpl that = (EnvVarSourceFluentImpl) o;
            if (configMapKeyRef != null ? !configMapKeyRef.equals(that.configMapKeyRef) :that.configMapKeyRef != null) return false;
            if (fieldRef != null ? !fieldRef.equals(that.fieldRef) :that.fieldRef != null) return false;
            if (resourceFieldRef != null ? !resourceFieldRef.equals(that.resourceFieldRef) :that.resourceFieldRef != null) return false;
            if (secretKeyRef != null ? !secretKeyRef.equals(that.secretKeyRef) :that.secretKeyRef != null) return false;
            return true;
    }


    public class ConfigMapKeyRefNestedImpl<N> extends ConfigMapKeySelectorFluentImpl<EnvVarSourceFluent.ConfigMapKeyRefNested<N>> implements EnvVarSourceFluent.ConfigMapKeyRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapKeySelectorBuilder builder;
    
            ConfigMapKeyRefNestedImpl(ConfigMapKeySelector item){
                    this.builder = new ConfigMapKeySelectorBuilder(this, item);
            }
            ConfigMapKeyRefNestedImpl(){
                    this.builder = new ConfigMapKeySelectorBuilder(this);
            }
    
    public N and(){
            return (N) EnvVarSourceFluentImpl.this.withConfigMapKeyRef(builder.build());
    }
    public N endConfigMapKeyRef(){
            return and();
    }

}
    public class FieldRefNestedImpl<N> extends ObjectFieldSelectorFluentImpl<EnvVarSourceFluent.FieldRefNested<N>> implements EnvVarSourceFluent.FieldRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectFieldSelectorBuilder builder;
    
            FieldRefNestedImpl(ObjectFieldSelector item){
                    this.builder = new ObjectFieldSelectorBuilder(this, item);
            }
            FieldRefNestedImpl(){
                    this.builder = new ObjectFieldSelectorBuilder(this);
            }
    
    public N and(){
            return (N) EnvVarSourceFluentImpl.this.withFieldRef(builder.build());
    }
    public N endFieldRef(){
            return and();
    }

}
    public class ResourceFieldRefNestedImpl<N> extends ResourceFieldSelectorFluentImpl<EnvVarSourceFluent.ResourceFieldRefNested<N>> implements EnvVarSourceFluent.ResourceFieldRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceFieldSelectorBuilder builder;
    
            ResourceFieldRefNestedImpl(ResourceFieldSelector item){
                    this.builder = new ResourceFieldSelectorBuilder(this, item);
            }
            ResourceFieldRefNestedImpl(){
                    this.builder = new ResourceFieldSelectorBuilder(this);
            }
    
    public N and(){
            return (N) EnvVarSourceFluentImpl.this.withResourceFieldRef(builder.build());
    }
    public N endResourceFieldRef(){
            return and();
    }

}
    public class SecretKeyRefNestedImpl<N> extends SecretKeySelectorFluentImpl<EnvVarSourceFluent.SecretKeyRefNested<N>> implements EnvVarSourceFluent.SecretKeyRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretKeySelectorBuilder builder;
    
            SecretKeyRefNestedImpl(SecretKeySelector item){
                    this.builder = new SecretKeySelectorBuilder(this, item);
            }
            SecretKeyRefNestedImpl(){
                    this.builder = new SecretKeySelectorBuilder(this);
            }
    
    public N and(){
            return (N) EnvVarSourceFluentImpl.this.withSecretKeyRef(builder.build());
    }
    public N endSecretKeyRef(){
            return and();
    }

}


}
