package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

public class HorizontalPodAutoscalerStatusFluentImpl<A extends HorizontalPodAutoscalerStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements HorizontalPodAutoscalerStatusFluent<A>{

    private List<HorizontalPodAutoscalerConditionBuilder> conditions;
    private List<MetricStatusBuilder> currentMetrics;
    private Integer currentReplicas;
    private Integer desiredReplicas;
    private String lastScaleTime;
    private Long observedGeneration;

    public HorizontalPodAutoscalerStatusFluentImpl(){
    }
    public HorizontalPodAutoscalerStatusFluentImpl(HorizontalPodAutoscalerStatus instance){
            this.withConditions(instance.getConditions()); 
            this.withCurrentMetrics(instance.getCurrentMetrics()); 
            this.withCurrentReplicas(instance.getCurrentReplicas()); 
            this.withDesiredReplicas(instance.getDesiredReplicas()); 
            this.withLastScaleTime(instance.getLastScaleTime()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
    }

    public A addToConditions(int index,HorizontalPodAutoscalerCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<HorizontalPodAutoscalerConditionBuilder>();}
            HorizontalPodAutoscalerConditionBuilder builder = new HorizontalPodAutoscalerConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,HorizontalPodAutoscalerCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<HorizontalPodAutoscalerConditionBuilder>();}
            HorizontalPodAutoscalerConditionBuilder builder = new HorizontalPodAutoscalerConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(HorizontalPodAutoscalerCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<HorizontalPodAutoscalerConditionBuilder>();}
            for (HorizontalPodAutoscalerCondition item : items) {HorizontalPodAutoscalerConditionBuilder builder = new HorizontalPodAutoscalerConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<HorizontalPodAutoscalerCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<HorizontalPodAutoscalerConditionBuilder>();}
            for (HorizontalPodAutoscalerCondition item : items) {HorizontalPodAutoscalerConditionBuilder builder = new HorizontalPodAutoscalerConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(HorizontalPodAutoscalerCondition... items){
            for (HorizontalPodAutoscalerCondition item : items) {HorizontalPodAutoscalerConditionBuilder builder = new HorizontalPodAutoscalerConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<HorizontalPodAutoscalerCondition> items){
            for (HorizontalPodAutoscalerCondition item : items) {HorizontalPodAutoscalerConditionBuilder builder = new HorizontalPodAutoscalerConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<HorizontalPodAutoscalerCondition> getConditions(){
            return build(conditions);
    }

    public List<HorizontalPodAutoscalerCondition> buildConditions(){
            return build(conditions);
    }

    public HorizontalPodAutoscalerCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public HorizontalPodAutoscalerCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public HorizontalPodAutoscalerCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public HorizontalPodAutoscalerCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<HorizontalPodAutoscalerConditionBuilder> predicate){
            for (HorizontalPodAutoscalerConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<HorizontalPodAutoscalerCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<HorizontalPodAutoscalerConditionBuilder>(); for (HorizontalPodAutoscalerCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<HorizontalPodAutoscalerConditionBuilder>();} return (A) this;
    }

    public A withConditions(HorizontalPodAutoscalerCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (HorizontalPodAutoscalerCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)addToConditions(new HorizontalPodAutoscalerCondition(lastTransitionTime, message, reason, status, type));
    }

    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> addNewConditionLike(HorizontalPodAutoscalerCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> setNewConditionLike(int index,HorizontalPodAutoscalerCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public HorizontalPodAutoscalerStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<HorizontalPodAutoscalerConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public A addToCurrentMetrics(int index,MetricStatus item){
            if (this.currentMetrics == null) {this.currentMetrics = new ArrayList<MetricStatusBuilder>();}
            MetricStatusBuilder builder = new MetricStatusBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.currentMetrics.add(index >= 0 ? index : currentMetrics.size(), builder); return (A)this;
    }

    public A setToCurrentMetrics(int index,MetricStatus item){
            if (this.currentMetrics == null) {this.currentMetrics = new ArrayList<MetricStatusBuilder>();}
            MetricStatusBuilder builder = new MetricStatusBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= currentMetrics.size()) { currentMetrics.add(builder); } else { currentMetrics.set(index, builder);}
             return (A)this;
    }

    public A addToCurrentMetrics(MetricStatus... items){
            if (this.currentMetrics == null) {this.currentMetrics = new ArrayList<MetricStatusBuilder>();}
            for (MetricStatus item : items) {MetricStatusBuilder builder = new MetricStatusBuilder(item);_visitables.add(builder);this.currentMetrics.add(builder);} return (A)this;
    }

    public A addAllToCurrentMetrics(Collection<MetricStatus> items){
            if (this.currentMetrics == null) {this.currentMetrics = new ArrayList<MetricStatusBuilder>();}
            for (MetricStatus item : items) {MetricStatusBuilder builder = new MetricStatusBuilder(item);_visitables.add(builder);this.currentMetrics.add(builder);} return (A)this;
    }

    public A removeFromCurrentMetrics(MetricStatus... items){
            for (MetricStatus item : items) {MetricStatusBuilder builder = new MetricStatusBuilder(item);_visitables.remove(builder);if (this.currentMetrics != null) {this.currentMetrics.remove(builder);}} return (A)this;
    }

    public A removeAllFromCurrentMetrics(Collection<MetricStatus> items){
            for (MetricStatus item : items) {MetricStatusBuilder builder = new MetricStatusBuilder(item);_visitables.remove(builder);if (this.currentMetrics != null) {this.currentMetrics.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildCurrentMetrics instead.
 * @return The buildable object.
 */
@Deprecated public List<MetricStatus> getCurrentMetrics(){
            return build(currentMetrics);
    }

    public List<MetricStatus> buildCurrentMetrics(){
            return build(currentMetrics);
    }

    public MetricStatus buildCurrentMetric(int index){
            return this.currentMetrics.get(index).build();
    }

    public MetricStatus buildFirstCurrentMetric(){
            return this.currentMetrics.get(0).build();
    }

    public MetricStatus buildLastCurrentMetric(){
            return this.currentMetrics.get(currentMetrics.size() - 1).build();
    }

    public MetricStatus buildMatchingCurrentMetric(io.fabric8.kubernetes.api.builder.Predicate<MetricStatusBuilder> predicate){
            for (MetricStatusBuilder item: currentMetrics) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withCurrentMetrics(List<MetricStatus> currentMetrics){
            if (this.currentMetrics != null) { _visitables.removeAll(this.currentMetrics);}
            if (currentMetrics != null) {this.currentMetrics = new ArrayList<MetricStatusBuilder>(); for (MetricStatus item : currentMetrics){this.addToCurrentMetrics(item);}} else { this.currentMetrics = new ArrayList<MetricStatusBuilder>();} return (A) this;
    }

    public A withCurrentMetrics(MetricStatus... currentMetrics){
            if (this.currentMetrics != null) {this.currentMetrics.clear();}
            if (currentMetrics != null) {for (MetricStatus item :currentMetrics){ this.addToCurrentMetrics(item);}} return (A) this;
    }

    public Boolean hasCurrentMetrics(){
            return currentMetrics != null && !currentMetrics.isEmpty();
    }

    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetric(){
            return new CurrentMetricsNestedImpl();
    }

    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> addNewCurrentMetricLike(MetricStatus item){
            return new CurrentMetricsNestedImpl(-1, item);
    }

    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> setNewCurrentMetricLike(int index,MetricStatus item){
            return new CurrentMetricsNestedImpl(index, item);
    }

    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editCurrentMetric(int index){
            if (currentMetrics.size() <= index) throw new RuntimeException("Can't edit currentMetrics. Index exceeds size.");
            return setNewCurrentMetricLike(index, buildCurrentMetric(index));
    }

    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editFirstCurrentMetric(){
            if (currentMetrics.size() == 0) throw new RuntimeException("Can't edit first currentMetrics. The list is empty.");
            return setNewCurrentMetricLike(0, buildCurrentMetric(0));
    }

    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editLastCurrentMetric(){
            int index = currentMetrics.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last currentMetrics. The list is empty.");
            return setNewCurrentMetricLike(index, buildCurrentMetric(index));
    }

    public HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<A> editMatchingCurrentMetric(io.fabric8.kubernetes.api.builder.Predicate<MetricStatusBuilder> predicate){
            int index = -1;
            for (int i=0;i<currentMetrics.size();i++) { 
            if (predicate.apply(currentMetrics.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching currentMetrics. No match found.");
            return setNewCurrentMetricLike(index, buildCurrentMetric(index));
    }

    public Integer getCurrentReplicas(){
            return this.currentReplicas;
    }

    public A withCurrentReplicas(Integer currentReplicas){
            this.currentReplicas=currentReplicas; return (A) this;
    }

    public Boolean hasCurrentReplicas(){
            return this.currentReplicas != null;
    }

    public Integer getDesiredReplicas(){
            return this.desiredReplicas;
    }

    public A withDesiredReplicas(Integer desiredReplicas){
            this.desiredReplicas=desiredReplicas; return (A) this;
    }

    public Boolean hasDesiredReplicas(){
            return this.desiredReplicas != null;
    }

    public String getLastScaleTime(){
            return this.lastScaleTime;
    }

    public A withLastScaleTime(String lastScaleTime){
            this.lastScaleTime=lastScaleTime; return (A) this;
    }

    public Boolean hasLastScaleTime(){
            return this.lastScaleTime != null;
    }

    public Long getObservedGeneration(){
            return this.observedGeneration;
    }

    public A withObservedGeneration(Long observedGeneration){
            this.observedGeneration=observedGeneration; return (A) this;
    }

    public Boolean hasObservedGeneration(){
            return this.observedGeneration != null;
    }

    public A withNewObservedGeneration(String arg1){
            return (A)withObservedGeneration(new Long(arg1));
    }

    public A withNewObservedGeneration(long arg1){
            return (A)withObservedGeneration(new Long(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HorizontalPodAutoscalerStatusFluentImpl that = (HorizontalPodAutoscalerStatusFluentImpl) o;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (currentMetrics != null ? !currentMetrics.equals(that.currentMetrics) :that.currentMetrics != null) return false;
            if (currentReplicas != null ? !currentReplicas.equals(that.currentReplicas) :that.currentReplicas != null) return false;
            if (desiredReplicas != null ? !desiredReplicas.equals(that.desiredReplicas) :that.desiredReplicas != null) return false;
            if (lastScaleTime != null ? !lastScaleTime.equals(that.lastScaleTime) :that.lastScaleTime != null) return false;
            if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends HorizontalPodAutoscalerConditionFluentImpl<HorizontalPodAutoscalerStatusFluent.ConditionsNested<N>> implements HorizontalPodAutoscalerStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HorizontalPodAutoscalerConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,HorizontalPodAutoscalerCondition item){
                    this.index = index;
                    this.builder = new HorizontalPodAutoscalerConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new HorizontalPodAutoscalerConditionBuilder(this);
            }
    
    public N and(){
            return (N) HorizontalPodAutoscalerStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}
    public class CurrentMetricsNestedImpl<N> extends MetricStatusFluentImpl<HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<N>> implements HorizontalPodAutoscalerStatusFluent.CurrentMetricsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MetricStatusBuilder builder;
        private final int index;
    
            CurrentMetricsNestedImpl(int index,MetricStatus item){
                    this.index = index;
                    this.builder = new MetricStatusBuilder(this, item);
            }
            CurrentMetricsNestedImpl(){
                    this.index = -1;
                    this.builder = new MetricStatusBuilder(this);
            }
    
    public N and(){
            return (N) HorizontalPodAutoscalerStatusFluentImpl.this.setToCurrentMetrics(index, builder.build());
    }
    public N endCurrentMetric(){
            return and();
    }

}


}
