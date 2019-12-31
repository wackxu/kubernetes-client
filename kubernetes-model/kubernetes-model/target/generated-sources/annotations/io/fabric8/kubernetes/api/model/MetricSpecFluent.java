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

public interface MetricSpecFluent<A extends MetricSpecFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildExternal instead.
 * @return The buildable object.
 */
@Deprecated public ExternalMetricSource getExternal();
    public ExternalMetricSource buildExternal();
    public A withExternal(ExternalMetricSource external);
    public Boolean hasExternal();
    public MetricSpecFluent.ExternalNested<A> withNewExternal();
    public MetricSpecFluent.ExternalNested<A> withNewExternalLike(ExternalMetricSource item);
    public MetricSpecFluent.ExternalNested<A> editExternal();
    public MetricSpecFluent.ExternalNested<A> editOrNewExternal();
    public MetricSpecFluent.ExternalNested<A> editOrNewExternalLike(ExternalMetricSource item);
    
/**
 * This method has been deprecated, please use method buildObject instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMetricSource getObject();
    public ObjectMetricSource buildObject();
    public A withObject(ObjectMetricSource object);
    public Boolean hasObject();
    public MetricSpecFluent.ObjectNested<A> withNewObject();
    public MetricSpecFluent.ObjectNested<A> withNewObjectLike(ObjectMetricSource item);
    public MetricSpecFluent.ObjectNested<A> editObject();
    public MetricSpecFluent.ObjectNested<A> editOrNewObject();
    public MetricSpecFluent.ObjectNested<A> editOrNewObjectLike(ObjectMetricSource item);
    
/**
 * This method has been deprecated, please use method buildPods instead.
 * @return The buildable object.
 */
@Deprecated public PodsMetricSource getPods();
    public PodsMetricSource buildPods();
    public A withPods(PodsMetricSource pods);
    public Boolean hasPods();
    public MetricSpecFluent.PodsNested<A> withNewPods();
    public MetricSpecFluent.PodsNested<A> withNewPodsLike(PodsMetricSource item);
    public MetricSpecFluent.PodsNested<A> editPods();
    public MetricSpecFluent.PodsNested<A> editOrNewPods();
    public MetricSpecFluent.PodsNested<A> editOrNewPodsLike(PodsMetricSource item);
    
/**
 * This method has been deprecated, please use method buildResource instead.
 * @return The buildable object.
 */
@Deprecated public ResourceMetricSource getResource();
    public ResourceMetricSource buildResource();
    public A withResource(ResourceMetricSource resource);
    public Boolean hasResource();
    public MetricSpecFluent.ResourceNested<A> withNewResource();
    public MetricSpecFluent.ResourceNested<A> withNewResourceLike(ResourceMetricSource item);
    public MetricSpecFluent.ResourceNested<A> editResource();
    public MetricSpecFluent.ResourceNested<A> editOrNewResource();
    public MetricSpecFluent.ResourceNested<A> editOrNewResourceLike(ResourceMetricSource item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface ExternalNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExternalMetricSourceFluent<MetricSpecFluent.ExternalNested<N>>{

        
    public N and();    public N endExternal();
}
    public interface ObjectNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetricSourceFluent<MetricSpecFluent.ObjectNested<N>>{

        
    public N and();    public N endObject();
}
    public interface PodsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodsMetricSourceFluent<MetricSpecFluent.PodsNested<N>>{

        
    public N and();    public N endPods();
}
    public interface ResourceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceMetricSourceFluent<MetricSpecFluent.ResourceNested<N>>{

        
    public N and();    public N endResource();
}


}
