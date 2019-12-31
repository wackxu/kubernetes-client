package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface MetricStatusFluent<A extends MetricStatusFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildExternal instead.
 * @return The buildable object.
 */
@Deprecated public ExternalMetricStatus getExternal();
    public ExternalMetricStatus buildExternal();
    public A withExternal(ExternalMetricStatus external);
    public Boolean hasExternal();
    public MetricStatusFluent.ExternalNested<A> withNewExternal();
    public MetricStatusFluent.ExternalNested<A> withNewExternalLike(ExternalMetricStatus item);
    public MetricStatusFluent.ExternalNested<A> editExternal();
    public MetricStatusFluent.ExternalNested<A> editOrNewExternal();
    public MetricStatusFluent.ExternalNested<A> editOrNewExternalLike(ExternalMetricStatus item);
    
/**
 * This method has been deprecated, please use method buildObject instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMetricStatus getObject();
    public ObjectMetricStatus buildObject();
    public A withObject(ObjectMetricStatus object);
    public Boolean hasObject();
    public MetricStatusFluent.ObjectNested<A> withNewObject();
    public MetricStatusFluent.ObjectNested<A> withNewObjectLike(ObjectMetricStatus item);
    public MetricStatusFluent.ObjectNested<A> editObject();
    public MetricStatusFluent.ObjectNested<A> editOrNewObject();
    public MetricStatusFluent.ObjectNested<A> editOrNewObjectLike(ObjectMetricStatus item);
    
/**
 * This method has been deprecated, please use method buildPods instead.
 * @return The buildable object.
 */
@Deprecated public PodsMetricStatus getPods();
    public PodsMetricStatus buildPods();
    public A withPods(PodsMetricStatus pods);
    public Boolean hasPods();
    public MetricStatusFluent.PodsNested<A> withNewPods();
    public MetricStatusFluent.PodsNested<A> withNewPodsLike(PodsMetricStatus item);
    public MetricStatusFluent.PodsNested<A> editPods();
    public MetricStatusFluent.PodsNested<A> editOrNewPods();
    public MetricStatusFluent.PodsNested<A> editOrNewPodsLike(PodsMetricStatus item);
    
/**
 * This method has been deprecated, please use method buildResource instead.
 * @return The buildable object.
 */
@Deprecated public ResourceMetricStatus getResource();
    public ResourceMetricStatus buildResource();
    public A withResource(ResourceMetricStatus resource);
    public Boolean hasResource();
    public MetricStatusFluent.ResourceNested<A> withNewResource();
    public MetricStatusFluent.ResourceNested<A> withNewResourceLike(ResourceMetricStatus item);
    public MetricStatusFluent.ResourceNested<A> editResource();
    public MetricStatusFluent.ResourceNested<A> editOrNewResource();
    public MetricStatusFluent.ResourceNested<A> editOrNewResourceLike(ResourceMetricStatus item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface ExternalNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExternalMetricStatusFluent<MetricStatusFluent.ExternalNested<N>>{

        
    public N and();    public N endExternal();
}
    public interface ObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetricStatusFluent<MetricStatusFluent.ObjectNested<N>>{

        
    public N and();    public N endObject();
}
    public interface PodsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodsMetricStatusFluent<MetricStatusFluent.PodsNested<N>>{

        
    public N and();    public N endPods();
}
    public interface ResourceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceMetricStatusFluent<MetricStatusFluent.ResourceNested<N>>{

        
    public N and();    public N endResource();
}


}
