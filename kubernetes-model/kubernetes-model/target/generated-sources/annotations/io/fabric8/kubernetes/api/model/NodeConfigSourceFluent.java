package io.fabric8.kubernetes.api.model;

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

public interface NodeConfigSourceFluent<A extends NodeConfigSourceFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildConfigMap instead.
 * @return The buildable object.
 */
@Deprecated public ConfigMapNodeConfigSource getConfigMap();
    public ConfigMapNodeConfigSource buildConfigMap();
    public A withConfigMap(ConfigMapNodeConfigSource configMap);
    public Boolean hasConfigMap();
    public A withNewConfigMap(String kubeletConfigKey,String name,String namespace,String resourceVersion,String uid);
    public NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMap();
    public NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMapLike(ConfigMapNodeConfigSource item);
    public NodeConfigSourceFluent.ConfigMapNested<A> editConfigMap();
    public NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMap();
    public NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMapLike(ConfigMapNodeConfigSource item);

    public interface ConfigMapNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapNodeConfigSourceFluent<NodeConfigSourceFluent.ConfigMapNested<N>>{

        
    public N and();    public N endConfigMap();
}


}
