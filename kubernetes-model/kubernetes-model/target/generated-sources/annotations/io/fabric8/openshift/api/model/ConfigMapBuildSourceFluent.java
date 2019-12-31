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

public interface ConfigMapBuildSourceFluent<A extends ConfigMapBuildSourceFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildConfigMap instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getConfigMap();
    public LocalObjectReference buildConfigMap();
    public A withConfigMap(LocalObjectReference configMap);
    public Boolean hasConfigMap();
    public A withNewConfigMap(String name);
    public ConfigMapBuildSourceFluent.ConfigMapNested<A> withNewConfigMap();
    public ConfigMapBuildSourceFluent.ConfigMapNested<A> withNewConfigMapLike(LocalObjectReference item);
    public ConfigMapBuildSourceFluent.ConfigMapNested<A> editConfigMap();
    public ConfigMapBuildSourceFluent.ConfigMapNested<A> editOrNewConfigMap();
    public ConfigMapBuildSourceFluent.ConfigMapNested<A> editOrNewConfigMapLike(LocalObjectReference item);
    public String getDestinationDir();
    public A withDestinationDir(String destinationDir);
    public Boolean hasDestinationDir();

    public interface ConfigMapNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<ConfigMapBuildSourceFluent.ConfigMapNested<N>>{

        
    public N and();    public N endConfigMap();
}


}
