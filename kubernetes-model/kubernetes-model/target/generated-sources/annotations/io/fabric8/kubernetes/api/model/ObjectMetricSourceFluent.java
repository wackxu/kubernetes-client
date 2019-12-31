package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.Deprecated;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface ObjectMetricSourceFluent<A extends ObjectMetricSourceFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildAverageValue instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getAverageValue();
    public Quantity buildAverageValue();
    public A withAverageValue(Quantity averageValue);
    public Boolean hasAverageValue();
    public A withNewAverageValue(String amount,String format);
    public A withNewAverageValue(String amount);
    public ObjectMetricSourceFluent.AverageValueNested<A> withNewAverageValue();
    public ObjectMetricSourceFluent.AverageValueNested<A> withNewAverageValueLike(Quantity item);
    public ObjectMetricSourceFluent.AverageValueNested<A> editAverageValue();
    public ObjectMetricSourceFluent.AverageValueNested<A> editOrNewAverageValue();
    public ObjectMetricSourceFluent.AverageValueNested<A> editOrNewAverageValueLike(Quantity item);
    public String getMetricName();
    public A withMetricName(String metricName);
    public Boolean hasMetricName();
    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector();
    public LabelSelector buildSelector();
    public A withSelector(LabelSelector selector);
    public Boolean hasSelector();
    public ObjectMetricSourceFluent.SelectorNested<A> withNewSelector();
    public ObjectMetricSourceFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item);
    public ObjectMetricSourceFluent.SelectorNested<A> editSelector();
    public ObjectMetricSourceFluent.SelectorNested<A> editOrNewSelector();
    public ObjectMetricSourceFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item);
    
/**
 * This method has been deprecated, please use method buildTarget instead.
 * @return The buildable object.
 */
@Deprecated public CrossVersionObjectReference getTarget();
    public CrossVersionObjectReference buildTarget();
    public A withTarget(CrossVersionObjectReference target);
    public Boolean hasTarget();
    public A withNewTarget(String apiVersion,String kind,String name);
    public ObjectMetricSourceFluent.TargetNested<A> withNewTarget();
    public ObjectMetricSourceFluent.TargetNested<A> withNewTargetLike(CrossVersionObjectReference item);
    public ObjectMetricSourceFluent.TargetNested<A> editTarget();
    public ObjectMetricSourceFluent.TargetNested<A> editOrNewTarget();
    public ObjectMetricSourceFluent.TargetNested<A> editOrNewTargetLike(CrossVersionObjectReference item);
    
/**
 * This method has been deprecated, please use method buildTargetValue instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getTargetValue();
    public Quantity buildTargetValue();
    public A withTargetValue(Quantity targetValue);
    public Boolean hasTargetValue();
    public A withNewTargetValue(String amount,String format);
    public A withNewTargetValue(String amount);
    public ObjectMetricSourceFluent.TargetValueNested<A> withNewTargetValue();
    public ObjectMetricSourceFluent.TargetValueNested<A> withNewTargetValueLike(Quantity item);
    public ObjectMetricSourceFluent.TargetValueNested<A> editTargetValue();
    public ObjectMetricSourceFluent.TargetValueNested<A> editOrNewTargetValue();
    public ObjectMetricSourceFluent.TargetValueNested<A> editOrNewTargetValueLike(Quantity item);

    public interface AverageValueNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<ObjectMetricSourceFluent.AverageValueNested<N>>{

        
    public N and();    public N endAverageValue();
}
    public interface SelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<ObjectMetricSourceFluent.SelectorNested<N>>{

        
    public N and();    public N endSelector();
}
    public interface TargetNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CrossVersionObjectReferenceFluent<ObjectMetricSourceFluent.TargetNested<N>>{

        
    public N and();    public N endTarget();
}
    public interface TargetValueNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<ObjectMetricSourceFluent.TargetValueNested<N>>{

        
    public N and();    public N endTargetValue();
}


}
