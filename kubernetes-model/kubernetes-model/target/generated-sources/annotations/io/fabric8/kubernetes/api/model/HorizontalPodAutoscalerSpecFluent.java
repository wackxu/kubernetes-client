package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Integer;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface HorizontalPodAutoscalerSpecFluent<A extends HorizontalPodAutoscalerSpecFluent<A>> extends Fluent<A>{


    public Integer getMaxReplicas();
    public A withMaxReplicas(Integer maxReplicas);
    public Boolean hasMaxReplicas();
    public A addToMetrics(int index,MetricSpec item);
    public A setToMetrics(int index,MetricSpec item);
    public A addToMetrics(MetricSpec... items);
    public A addAllToMetrics(Collection<MetricSpec> items);
    public A removeFromMetrics(MetricSpec... items);
    public A removeAllFromMetrics(Collection<MetricSpec> items);
    
/**
 * This method has been deprecated, please use method buildMetrics instead.
 * @return The buildable object.
 */
@Deprecated public List<MetricSpec> getMetrics();
    public List<MetricSpec> buildMetrics();
    public MetricSpec buildMetric(int index);
    public MetricSpec buildFirstMetric();
    public MetricSpec buildLastMetric();
    public MetricSpec buildMatchingMetric(io.fabric8.kubernetes.api.builder.Predicate<MetricSpecBuilder> predicate);
    public A withMetrics(List<MetricSpec> metrics);
    public A withMetrics(MetricSpec... metrics);
    public Boolean hasMetrics();
    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetric();
    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetricLike(MetricSpec item);
    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> setNewMetricLike(int index,MetricSpec item);
    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMetric(int index);
    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editFirstMetric();
    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editLastMetric();
    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMatchingMetric(io.fabric8.kubernetes.api.builder.Predicate<MetricSpecBuilder> predicate);
    public Integer getMinReplicas();
    public A withMinReplicas(Integer minReplicas);
    public Boolean hasMinReplicas();
    
/**
 * This method has been deprecated, please use method buildScaleTargetRef instead.
 * @return The buildable object.
 */
@Deprecated public CrossVersionObjectReference getScaleTargetRef();
    public CrossVersionObjectReference buildScaleTargetRef();
    public A withScaleTargetRef(CrossVersionObjectReference scaleTargetRef);
    public Boolean hasScaleTargetRef();
    public A withNewScaleTargetRef(String apiVersion,String kind,String name);
    public HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef();
    public HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(CrossVersionObjectReference item);
    public HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef();
    public HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef();
    public HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(CrossVersionObjectReference item);

    public interface MetricsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MetricSpecFluent<HorizontalPodAutoscalerSpecFluent.MetricsNested<N>>{

        
    public N and();    public N endMetric();
}
    public interface ScaleTargetRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CrossVersionObjectReferenceFluent<HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>>{

        
    public N and();    public N endScaleTargetRef();
}


}
