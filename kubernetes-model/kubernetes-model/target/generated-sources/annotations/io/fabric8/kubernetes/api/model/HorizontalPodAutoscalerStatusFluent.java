package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface HorizontalPodAutoscalerStatusFluent<A extends HorizontalPodAutoscalerStatusFluent<A>> extends Fluent<A>{


    public A addToConditions(int index,HorizontalPodAutoscalerCondition item);
    public A setToConditions(int index,HorizontalPodAutoscalerCondition item);
    public A addToConditions(HorizontalPodAutoscalerCondition... items);
    public A addAllToConditions(Collection<HorizontalPodAutoscalerCondition> items);
    public A removeFromConditions(HorizontalPodAutoscalerCondition... items);
    public A removeAllFromConditions(Collection<HorizontalPodAutoscalerCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<HorizontalPodAutoscalerCondition> getConditions();
    public List<HorizontalPodAutoscalerCondition> buildConditions();
    public HorizontalPodAutoscalerCondition buildCondition(int index);
    public HorizontalPodAutoscalerCondition buildFirstCondition();
    public HorizontalPodAutoscalerCondition buildLastCondition();
    public HorizontalPodAutoscalerCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<HorizontalPodAutoscalerConditionBuilder> predicate);
    public A withConditions(List<HorizontalPodAutoscalerCondition> conditions);
    public A withConditions(HorizontalPodAutoscalerCondition... conditions);
    public Boolean hasConditions();
    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type);
    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewCondition();
    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewConditionLike(HorizontalPodAutoscalerCondition item);
    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> setNewConditionLike(int index,HorizontalPodAutoscalerCondition item);
    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editCondition(int index);
    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editFirstCondition();
    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editLastCondition();
    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<HorizontalPodAutoscalerConditionBuilder> predicate);
    public A addToCurrentMetrics(int index,MetricStatus item);
    public A setToCurrentMetrics(int index,MetricStatus item);
    public A addToCurrentMetrics(MetricStatus... items);
    public A addAllToCurrentMetrics(Collection<MetricStatus> items);
    public A removeFromCurrentMetrics(MetricStatus... items);
    public A removeAllFromCurrentMetrics(Collection<MetricStatus> items);
    
/**
 * This method has been deprecated, please use method buildCurrentMetrics instead.
 * @return The buildable object.
 */
@Deprecated public List<MetricStatus> getCurrentMetrics();
    public List<MetricStatus> buildCurrentMetrics();
    public MetricStatus buildCurrentMetric(int index);
    public MetricStatus buildFirstCurrentMetric();
    public MetricStatus buildLastCurrentMetric();
    public MetricStatus buildMatchingCurrentMetric(io.fabric8.kubernetes.api.builder.Predicate<MetricStatusBuilder> predicate);
    public A withCurrentMetrics(List<MetricStatus> currentMetrics);
    public A withCurrentMetrics(MetricStatus... currentMetrics);
    public Boolean hasCurrentMetrics();
    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetric();
    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetricLike(MetricStatus item);
    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> setNewCurrentMetricLike(int index,MetricStatus item);
    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editCurrentMetric(int index);
    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editFirstCurrentMetric();
    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editLastCurrentMetric();
    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editMatchingCurrentMetric(io.fabric8.kubernetes.api.builder.Predicate<MetricStatusBuilder> predicate);
    public Integer getCurrentReplicas();
    public A withCurrentReplicas(Integer currentReplicas);
    public Boolean hasCurrentReplicas();
    public Integer getDesiredReplicas();
    public A withDesiredReplicas(Integer desiredReplicas);
    public Boolean hasDesiredReplicas();
    public String getLastScaleTime();
    public A withLastScaleTime(String lastScaleTime);
    public Boolean hasLastScaleTime();
    public Long getObservedGeneration();
    public A withObservedGeneration(Long observedGeneration);
    public Boolean hasObservedGeneration();
    public A withNewObservedGeneration(String arg1);
    public A withNewObservedGeneration(long arg1);

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HorizontalPodAutoscalerConditionFluent<HorizontalPodAutoscalerStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}
    public interface CurrentMetricsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,MetricStatusFluent<HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<N>>{

        
    public N and();    public N endCurrentMetric();
}


}
