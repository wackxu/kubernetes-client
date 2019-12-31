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

public interface ExternalMetricStatusFluent<A extends ExternalMetricStatusFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildCurrentAverageValue instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getCurrentAverageValue();
    public Quantity buildCurrentAverageValue();
    public A withCurrentAverageValue(Quantity currentAverageValue);
    public Boolean hasCurrentAverageValue();
    public A withNewCurrentAverageValue(String amount,String format);
    public A withNewCurrentAverageValue(String amount);
    public ExternalMetricStatusFluent.CurrentAverageValueNested<A> withNewCurrentAverageValue();
    public ExternalMetricStatusFluent.CurrentAverageValueNested<A> withNewCurrentAverageValueLike(Quantity item);
    public ExternalMetricStatusFluent.CurrentAverageValueNested<A> editCurrentAverageValue();
    public ExternalMetricStatusFluent.CurrentAverageValueNested<A> editOrNewCurrentAverageValue();
    public ExternalMetricStatusFluent.CurrentAverageValueNested<A> editOrNewCurrentAverageValueLike(Quantity item);
    
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
    public ExternalMetricStatusFluent.CurrentValueNested<A> withNewCurrentValue();
    public ExternalMetricStatusFluent.CurrentValueNested<A> withNewCurrentValueLike(Quantity item);
    public ExternalMetricStatusFluent.CurrentValueNested<A> editCurrentValue();
    public ExternalMetricStatusFluent.CurrentValueNested<A> editOrNewCurrentValue();
    public ExternalMetricStatusFluent.CurrentValueNested<A> editOrNewCurrentValueLike(Quantity item);
    public String getMetricName();
    public A withMetricName(String metricName);
    public Boolean hasMetricName();
    
/**
 * This method has been deprecated, please use method buildMetricSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getMetricSelector();
    public LabelSelector buildMetricSelector();
    public A withMetricSelector(LabelSelector metricSelector);
    public Boolean hasMetricSelector();
    public ExternalMetricStatusFluent.MetricSelectorNested<A> withNewMetricSelector();
    public ExternalMetricStatusFluent.MetricSelectorNested<A> withNewMetricSelectorLike(LabelSelector item);
    public ExternalMetricStatusFluent.MetricSelectorNested<A> editMetricSelector();
    public ExternalMetricStatusFluent.MetricSelectorNested<A> editOrNewMetricSelector();
    public ExternalMetricStatusFluent.MetricSelectorNested<A> editOrNewMetricSelectorLike(LabelSelector item);

    public interface CurrentAverageValueNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<ExternalMetricStatusFluent.CurrentAverageValueNested<N>>{

        
    public N and();    public N endCurrentAverageValue();
}
    public interface CurrentValueNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<ExternalMetricStatusFluent.CurrentValueNested<N>>{

        
    public N and();    public N endCurrentValue();
}
    public interface MetricSelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<ExternalMetricStatusFluent.MetricSelectorNested<N>>{

        
    public N and();    public N endMetricSelector();
}


}
