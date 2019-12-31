package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
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
import java.util.Collection;
import java.lang.Object;

public class HorizontalPodAutoscalerSpecFluentImpl<A extends HorizontalPodAutoscalerSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements HorizontalPodAutoscalerSpecFluent<A>{

    private Integer maxReplicas;
    private List<MetricSpecBuilder> metrics;
    private Integer minReplicas;
    private CrossVersionObjectReferenceBuilder scaleTargetRef;

    public HorizontalPodAutoscalerSpecFluentImpl(){
    }
    public HorizontalPodAutoscalerSpecFluentImpl(HorizontalPodAutoscalerSpec instance){
            this.withMaxReplicas(instance.getMaxReplicas()); 
            this.withMetrics(instance.getMetrics()); 
            this.withMinReplicas(instance.getMinReplicas()); 
            this.withScaleTargetRef(instance.getScaleTargetRef()); 
    }

    public Integer getMaxReplicas(){
            return this.maxReplicas;
    }

    public A withMaxReplicas(Integer maxReplicas){
            this.maxReplicas=maxReplicas; return (A) this;
    }

    public Boolean hasMaxReplicas(){
            return this.maxReplicas != null;
    }

    public A addToMetrics(int index,MetricSpec item){
            if (this.metrics == null) {this.metrics = new ArrayList<MetricSpecBuilder>();}
            MetricSpecBuilder builder = new MetricSpecBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.metrics.add(index >= 0 ? index : metrics.size(), builder); return (A)this;
    }

    public A setToMetrics(int index,MetricSpec item){
            if (this.metrics == null) {this.metrics = new ArrayList<MetricSpecBuilder>();}
            MetricSpecBuilder builder = new MetricSpecBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= metrics.size()) { metrics.add(builder); } else { metrics.set(index, builder);}
             return (A)this;
    }

    public A addToMetrics(MetricSpec... items){
            if (this.metrics == null) {this.metrics = new ArrayList<MetricSpecBuilder>();}
            for (MetricSpec item : items) {MetricSpecBuilder builder = new MetricSpecBuilder(item);_visitables.add(builder);this.metrics.add(builder);} return (A)this;
    }

    public A addAllToMetrics(Collection<MetricSpec> items){
            if (this.metrics == null) {this.metrics = new ArrayList<MetricSpecBuilder>();}
            for (MetricSpec item : items) {MetricSpecBuilder builder = new MetricSpecBuilder(item);_visitables.add(builder);this.metrics.add(builder);} return (A)this;
    }

    public A removeFromMetrics(MetricSpec... items){
            for (MetricSpec item : items) {MetricSpecBuilder builder = new MetricSpecBuilder(item);_visitables.remove(builder);if (this.metrics != null) {this.metrics.remove(builder);}} return (A)this;
    }

    public A removeAllFromMetrics(Collection<MetricSpec> items){
            for (MetricSpec item : items) {MetricSpecBuilder builder = new MetricSpecBuilder(item);_visitables.remove(builder);if (this.metrics != null) {this.metrics.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildMetrics instead.
 * @return The buildable object.
 */
@Deprecated public List<MetricSpec> getMetrics(){
            return build(metrics);
    }

    public List<MetricSpec> buildMetrics(){
            return build(metrics);
    }

    public MetricSpec buildMetric(int index){
            return this.metrics.get(index).build();
    }

    public MetricSpec buildFirstMetric(){
            return this.metrics.get(0).build();
    }

    public MetricSpec buildLastMetric(){
            return this.metrics.get(metrics.size() - 1).build();
    }

    public MetricSpec buildMatchingMetric(io.fabric8.kubernetes.api.builder.Predicate<MetricSpecBuilder> predicate){
            for (MetricSpecBuilder item: metrics) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withMetrics(List<MetricSpec> metrics){
            if (this.metrics != null) { _visitables.removeAll(this.metrics);}
            if (metrics != null) {this.metrics = new ArrayList<MetricSpecBuilder>(); for (MetricSpec item : metrics){this.addToMetrics(item);}} else { this.metrics = new ArrayList<MetricSpecBuilder>();} return (A) this;
    }

    public A withMetrics(MetricSpec... metrics){
            if (this.metrics != null) {this.metrics.clear();}
            if (metrics != null) {for (MetricSpec item :metrics){ this.addToMetrics(item);}} return (A) this;
    }

    public Boolean hasMetrics(){
            return metrics != null && !metrics.isEmpty();
    }

    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetric(){
            return new MetricsNestedImpl();
    }

    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetricLike(MetricSpec item){
            return new MetricsNestedImpl(-1, item);
    }

    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> setNewMetricLike(int index,MetricSpec item){
            return new MetricsNestedImpl(index, item);
    }

    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMetric(int index){
            if (metrics.size() <= index) throw new RuntimeException("Can't edit metrics. Index exceeds size.");
            return setNewMetricLike(index, buildMetric(index));
    }

    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editFirstMetric(){
            if (metrics.size() == 0) throw new RuntimeException("Can't edit first metrics. The list is empty.");
            return setNewMetricLike(0, buildMetric(0));
    }

    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editLastMetric(){
            int index = metrics.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last metrics. The list is empty.");
            return setNewMetricLike(index, buildMetric(index));
    }

    public HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMatchingMetric(io.fabric8.kubernetes.api.builder.Predicate<MetricSpecBuilder> predicate){
            int index = -1;
            for (int i=0;i<metrics.size();i++) { 
            if (predicate.apply(metrics.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching metrics. No match found.");
            return setNewMetricLike(index, buildMetric(index));
    }

    public Integer getMinReplicas(){
            return this.minReplicas;
    }

    public A withMinReplicas(Integer minReplicas){
            this.minReplicas=minReplicas; return (A) this;
    }

    public Boolean hasMinReplicas(){
            return this.minReplicas != null;
    }

    
/**
 * This method has been deprecated, please use method buildScaleTargetRef instead.
 * @return The buildable object.
 */
@Deprecated public CrossVersionObjectReference getScaleTargetRef(){
            return this.scaleTargetRef!=null?this.scaleTargetRef.build():null;
    }

    public CrossVersionObjectReference buildScaleTargetRef(){
            return this.scaleTargetRef!=null?this.scaleTargetRef.build():null;
    }

    public A withScaleTargetRef(CrossVersionObjectReference scaleTargetRef){
            _visitables.remove(this.scaleTargetRef);
            if (scaleTargetRef!=null){ this.scaleTargetRef= new CrossVersionObjectReferenceBuilder(scaleTargetRef); _visitables.add(this.scaleTargetRef);} return (A) this;
    }

    public Boolean hasScaleTargetRef(){
            return this.scaleTargetRef != null;
    }

    public A withNewScaleTargetRef(String apiVersion,String kind,String name){
            return (A)withScaleTargetRef(new CrossVersionObjectReference(apiVersion, kind, name));
    }

    public HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef(){
            return new ScaleTargetRefNestedImpl();
    }

    public HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(CrossVersionObjectReference item){
            return new ScaleTargetRefNestedImpl(item);
    }

    public HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef(){
            return withNewScaleTargetRefLike(getScaleTargetRef());
    }

    public HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef(){
            return withNewScaleTargetRefLike(getScaleTargetRef() != null ? getScaleTargetRef(): new CrossVersionObjectReferenceBuilder().build());
    }

    public HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(CrossVersionObjectReference item){
            return withNewScaleTargetRefLike(getScaleTargetRef() != null ? getScaleTargetRef(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            HorizontalPodAutoscalerSpecFluentImpl that = (HorizontalPodAutoscalerSpecFluentImpl) o;
            if (maxReplicas != null ? !maxReplicas.equals(that.maxReplicas) :that.maxReplicas != null) return false;
            if (metrics != null ? !metrics.equals(that.metrics) :that.metrics != null) return false;
            if (minReplicas != null ? !minReplicas.equals(that.minReplicas) :that.minReplicas != null) return false;
            if (scaleTargetRef != null ? !scaleTargetRef.equals(that.scaleTargetRef) :that.scaleTargetRef != null) return false;
            return true;
    }


    public class MetricsNestedImpl<N> extends MetricSpecFluentImpl<HorizontalPodAutoscalerSpecFluent.MetricsNested<N>> implements HorizontalPodAutoscalerSpecFluent.MetricsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final MetricSpecBuilder builder;
        private final int index;
    
            MetricsNestedImpl(int index,MetricSpec item){
                    this.index = index;
                    this.builder = new MetricSpecBuilder(this, item);
            }
            MetricsNestedImpl(){
                    this.index = -1;
                    this.builder = new MetricSpecBuilder(this);
            }
    
    public N and(){
            return (N) HorizontalPodAutoscalerSpecFluentImpl.this.setToMetrics(index, builder.build());
    }
    public N endMetric(){
            return and();
    }

}
    public class ScaleTargetRefNestedImpl<N> extends CrossVersionObjectReferenceFluentImpl<HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>> implements HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CrossVersionObjectReferenceBuilder builder;
    
            ScaleTargetRefNestedImpl(CrossVersionObjectReference item){
                    this.builder = new CrossVersionObjectReferenceBuilder(this, item);
            }
            ScaleTargetRefNestedImpl(){
                    this.builder = new CrossVersionObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) HorizontalPodAutoscalerSpecFluentImpl.this.withScaleTargetRef(builder.build());
    }
    public N endScaleTargetRef(){
            return and();
    }

}


}
