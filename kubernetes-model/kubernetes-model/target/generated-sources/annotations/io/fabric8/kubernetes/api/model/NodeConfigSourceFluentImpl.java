package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class NodeConfigSourceFluentImpl<A extends NodeConfigSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NodeConfigSourceFluent<A>{

    private ConfigMapNodeConfigSourceBuilder configMap;

    public NodeConfigSourceFluentImpl(){
    }
    public NodeConfigSourceFluentImpl(NodeConfigSource instance){
            this.withConfigMap(instance.getConfigMap()); 
    }

    
/**
 * This method has been deprecated, please use method buildConfigMap instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMapNodeConfigSource getConfigMap(){
            return this.configMap!=null?this.configMap.build():null;
    }

    public ConfigMapNodeConfigSource buildConfigMap(){
            return this.configMap!=null?this.configMap.build():null;
    }

    public A withConfigMap(ConfigMapNodeConfigSource configMap){
            _visitables.remove(this.configMap);
            if (configMap!=null){ this.configMap= new ConfigMapNodeConfigSourceBuilder(configMap); _visitables.add(this.configMap);} return (A) this;
    }

    public Boolean hasConfigMap(){
            return this.configMap != null;
    }

    public A withNewConfigMap(String kubeletConfigKey,String name,String namespace,String resourceVersion,String uid){
            return (A)withConfigMap(new ConfigMapNodeConfigSource(kubeletConfigKey, name, namespace, resourceVersion, uid));
    }

    public NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMap(){
            return new ConfigMapNestedImpl();
    }

    public NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMapLike(ConfigMapNodeConfigSource item){
            return new ConfigMapNestedImpl(item);
    }

    public NodeConfigSourceFluent.ConfigMapNested<A> editConfigMap(){
            return withNewConfigMapLike(getConfigMap());
    }

    public NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMap(){
            return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): new ConfigMapNodeConfigSourceBuilder().build());
    }

    public NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMapLike(ConfigMapNodeConfigSource item){
            return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeConfigSourceFluentImpl that = (NodeConfigSourceFluentImpl) o;
            if (configMap != null ? !configMap.equals(that.configMap) :that.configMap != null) return false;
            return true;
    }


    public class ConfigMapNestedImpl<N> extends ConfigMapNodeConfigSourceFluentImpl<NodeConfigSourceFluent.ConfigMapNested<N>> implements NodeConfigSourceFluent.ConfigMapNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapNodeConfigSourceBuilder builder;
    
            ConfigMapNestedImpl(ConfigMapNodeConfigSource item){
                    this.builder = new ConfigMapNodeConfigSourceBuilder(this, item);
            }
            ConfigMapNestedImpl(){
                    this.builder = new ConfigMapNodeConfigSourceBuilder(this);
            }
    
    public N and(){
            return (N) NodeConfigSourceFluentImpl.this.withConfigMap(builder.build());
    }
    public N endConfigMap(){
            return and();
    }

}


}
