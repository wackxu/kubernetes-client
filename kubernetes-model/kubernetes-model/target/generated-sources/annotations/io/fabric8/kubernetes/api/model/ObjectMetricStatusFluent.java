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

public interface ObjectMetricStatusFluent<A extends ObjectMetricStatusFluent<A>> extends Fluent<A>{


    
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
    public ObjectMetricStatusFluent.AverageValueNested<A> withNewAverageValue();
    public ObjectMetricStatusFluent.AverageValueNested<A> withNewAverageValueLike(Quantity item);
    public ObjectMetricStatusFluent.AverageValueNested<A> editAverageValue();
    public ObjectMetricStatusFluent.AverageValueNested<A> editOrNewAverageValue();
    public ObjectMetricStatusFluent.AverageValueNested<A> editOrNewAverageValueLike(Quantity item);
    
/**
 * This method has been deprecated, please use method buildCurrentValue instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getCurrentValue();
    public Quantity buildCurrentValue();
    public A withCurrentValue(Quantity currentValue);
    public Boolean hasCurrentValue();
    public A withNewCurrentValue(String amount,String format);
    public A withNewCurrentValue(String amount);
    public ObjectMetricStatusFluent.CurrentValueNested<A> withNewCurrentValue();
    public ObjectMetricStatusFluent.CurrentValueNested<A> withNewCurrentValueLike(Quantity item);
    public ObjectMetricStatusFluent.CurrentValueNested<A> editCurrentValue();
    public ObjectMetricStatusFluent.CurrentValueNested<A> editOrNewCurrentValue();
    public ObjectMetricStatusFluent.CurrentValueNested<A> editOrNewCurrentValueLike(Quantity item);
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
    public ObjectMetricStatusFluent.SelectorNested<A> withNewSelector();
    public ObjectMetricStatusFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item);
    public ObjectMetricStatusFluent.SelectorNested<A> editSelector();
    public ObjectMetricStatusFluent.SelectorNested<A> editOrNewSelector();
    public ObjectMetricStatusFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item);
    
/**
 * This method has been deprecated, please use method buildTarget instead.
 * @return The buildable object.
 */
@Deprecated public CrossVersionObjectReference getTarget();
    public CrossVersionObjectReference buildTarget();
    public A withTarget(CrossVersionObjectReference target);
    public Boolean hasTarget();
    public A withNewTarget(String apiVersion,String kind,String name);
    public ObjectMetricStatusFluent.TargetNested<A> withNewTarget();
    public ObjectMetricStatusFluent.TargetNested<A> withNewTargetLike(CrossVersionObjectReference item);
    public ObjectMetricStatusFluent.TargetNested<A> editTarget();
    public ObjectMetricStatusFluent.TargetNested<A> editOrNewTarget();
    public ObjectMetricStatusFluent.TargetNested<A> editOrNewTargetLike(CrossVersionObjectReference item);

    public interface AverageValueNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<ObjectMetricStatusFluent.AverageValueNested<N>>{

        
    public N and();    public N endAverageValue();
}
    public interface CurrentValueNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<ObjectMetricStatusFluent.CurrentValueNested<N>>{

        
    public N and();    public N endCurrentValue();
}
    public interface SelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<ObjectMetricStatusFluent.SelectorNested<N>>{

        
    public N and();    public N endSelector();
}
    public interface TargetNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CrossVersionObjectReferenceFluent<ObjectMetricStatusFluent.TargetNested<N>>{

        
    public N and();    public N endTarget();
}


}
