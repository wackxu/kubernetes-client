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

public interface ExternalMetricSourceFluent<A extends ExternalMetricSourceFluent<A>> extends Fluent<A>{


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
    public ExternalMetricSourceFluent.MetricSelectorNested<A> withNewMetricSelector();
    public ExternalMetricSourceFluent.MetricSelectorNested<A> withNewMetricSelectorLike(LabelSelector item);
    public ExternalMetricSourceFluent.MetricSelectorNested<A> editMetricSelector();
    public ExternalMetricSourceFluent.MetricSelectorNested<A> editOrNewMetricSelector();
    public ExternalMetricSourceFluent.MetricSelectorNested<A> editOrNewMetricSelectorLike(LabelSelector item);
    
/**
 * This method has been deprecated, please use method buildTargetAverageValue instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getTargetAverageValue();
    public Quantity buildTargetAverageValue();
    public A withTargetAverageValue(Quantity targetAverageValue);
    public Boolean hasTargetAverageValue();
    public A withNewTargetAverageValue(String amount,String format);
    public A withNewTargetAverageValue(String amount);
    public ExternalMetricSourceFluent.TargetAverageValueNested<A> withNewTargetAverageValue();
    public ExternalMetricSourceFluent.TargetAverageValueNested<A> withNewTargetAverageValueLike(Quantity item);
    public ExternalMetricSourceFluent.TargetAverageValueNested<A> editTargetAverageValue();
    public ExternalMetricSourceFluent.TargetAverageValueNested<A> editOrNewTargetAverageValue();
    public ExternalMetricSourceFluent.TargetAverageValueNested<A> editOrNewTargetAverageValueLike(Quantity item);
    
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
    public ExternalMetricSourceFluent.TargetValueNested<A> withNewTargetValue();
    public ExternalMetricSourceFluent.TargetValueNested<A> withNewTargetValueLike(Quantity item);
    public ExternalMetricSourceFluent.TargetValueNested<A> editTargetValue();
    public ExternalMetricSourceFluent.TargetValueNested<A> editOrNewTargetValue();
    public ExternalMetricSourceFluent.TargetValueNested<A> editOrNewTargetValueLike(Quantity item);

    public interface MetricSelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<ExternalMetricSourceFluent.MetricSelectorNested<N>>{

        
    public N and();    public N endMetricSelector();
}
    public interface TargetAverageValueNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<ExternalMetricSourceFluent.TargetAverageValueNested<N>>{

        
    public N and();    public N endTargetAverageValue();
}
    public interface TargetValueNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<ExternalMetricSourceFluent.TargetValueNested<N>>{

        
    public N and();    public N endTargetValue();
}


}
