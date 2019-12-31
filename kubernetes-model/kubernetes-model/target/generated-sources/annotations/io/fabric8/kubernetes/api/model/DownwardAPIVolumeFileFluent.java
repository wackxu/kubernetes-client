package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface DownwardAPIVolumeFileFluent<A extends DownwardAPIVolumeFileFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildFieldRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectFieldSelector getFieldRef();
    public ObjectFieldSelector buildFieldRef();
    public A withFieldRef(ObjectFieldSelector fieldRef);
    public Boolean hasFieldRef();
    public A withNewFieldRef(String apiVersion,String fieldPath);
    public DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRef();
    public DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRefLike(ObjectFieldSelector item);
    public DownwardAPIVolumeFileFluent.FieldRefNested<A> editFieldRef();
    public DownwardAPIVolumeFileFluent.FieldRefNested<A> editOrNewFieldRef();
    public DownwardAPIVolumeFileFluent.FieldRefNested<A> editOrNewFieldRefLike(ObjectFieldSelector item);
    public Integer getMode();
    public A withMode(Integer mode);
    public Boolean hasMode();
    public String getPath();
    public A withPath(String path);
    public Boolean hasPath();
    
/**
 * This method has been deprecated, please use method buildResourceFieldRef instead.
 * @return The buildable object.
 */
@Deprecated public ResourceFieldSelector getResourceFieldRef();
    public ResourceFieldSelector buildResourceFieldRef();
    public A withResourceFieldRef(ResourceFieldSelector resourceFieldRef);
    public Boolean hasResourceFieldRef();
    public DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRef();
    public DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRefLike(ResourceFieldSelector item);
    public DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editResourceFieldRef();
    public DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRef();
    public DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(ResourceFieldSelector item);

    public interface FieldRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectFieldSelectorFluent<DownwardAPIVolumeFileFluent.FieldRefNested<N>>{

        
    public N and();    public N endFieldRef();
}
    public interface ResourceFieldRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceFieldSelectorFluent<DownwardAPIVolumeFileFluent.ResourceFieldRefNested<N>>{

        
    public N and();    public N endResourceFieldRef();
}


}
