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

public class ConfigMapBuildSourceFluentImpl<A extends ConfigMapBuildSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ConfigMapBuildSourceFluent<A>{

    private LocalObjectReferenceBuilder configMap;
    private String destinationDir;

    public ConfigMapBuildSourceFluentImpl(){
    }
    public ConfigMapBuildSourceFluentImpl(ConfigMapBuildSource instance){
            this.withConfigMap(instance.getConfigMap()); 
            this.withDestinationDir(instance.getDestinationDir()); 
    }

    
/**
 * This method has been deprecated, please use method buildConfigMap instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getConfigMap(){
            return this.configMap!=null?this.configMap.build():null;
    }

    public LocalObjectReference buildConfigMap(){
            return this.configMap!=null?this.configMap.build():null;
    }

    public A withConfigMap(LocalObjectReference configMap){
            _visitables.remove(this.configMap);
            if (configMap!=null){ this.configMap= new LocalObjectReferenceBuilder(configMap); _visitables.add(this.configMap);} return (A) this;
    }

    public Boolean hasConfigMap(){
            return this.configMap != null;
    }

    public A withNewConfigMap(String name){
            return (A)withConfigMap(new LocalObjectReference(name));
    }

    public ConfigMapBuildSourceFluent.ConfigMapNested<A> withNewConfigMap(){
            return new ConfigMapNestedImpl();
    }

    public ConfigMapBuildSourceFluent.ConfigMapNested<A> withNewConfigMapLike(LocalObjectReference item){
            return new ConfigMapNestedImpl(item);
    }

    public ConfigMapBuildSourceFluent.ConfigMapNested<A> editConfigMap(){
            return withNewConfigMapLike(getConfigMap());
    }

    public ConfigMapBuildSourceFluent.ConfigMapNested<A> editOrNewConfigMap(){
            return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): new LocalObjectReferenceBuilder().build());
    }

    public ConfigMapBuildSourceFluent.ConfigMapNested<A> editOrNewConfigMapLike(LocalObjectReference item){
            return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): item);
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigMapBuildSourceFluentImpl that = (ConfigMapBuildSourceFluentImpl) o;
            if (configMap != null ? !configMap.equals(that.configMap) :that.configMap != null) return false;
            if (destinationDir != null ? !destinationDir.equals(that.destinationDir) :that.destinationDir != null) return false;
            return true;
    }


    public class ConfigMapNestedImpl<N> extends LocalObjectReferenceFluentImpl<ConfigMapBuildSourceFluent.ConfigMapNested<N>> implements ConfigMapBuildSourceFluent.ConfigMapNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            ConfigMapNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            ConfigMapNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ConfigMapBuildSourceFluentImpl.this.withConfigMap(builder.build());
    }
    public N endConfigMap(){
            return and();
    }

}


}
