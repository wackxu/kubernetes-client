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

public interface PodsMetricSourceFluent<A extends PodsMetricSourceFluent<A>> extends Fluent<A>{


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
    public PodsMetricSourceFluent.SelectorNested<A> withNewSelector();
    public PodsMetricSourceFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item);
    public PodsMetricSourceFluent.SelectorNested<A> editSelector();
    public PodsMetricSourceFluent.SelectorNested<A> editOrNewSelector();
    public PodsMetricSourceFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item);
    
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
    public PodsMetricSourceFluent.TargetAverageValueNested<A> withNewTargetAverageValue();
    public PodsMetricSourceFluent.TargetAverageValueNested<A> withNewTargetAverageValueLike(Quantity item);
    public PodsMetricSourceFluent.TargetAverageValueNested<A> editTargetAverageValue();
    public PodsMetricSourceFluent.TargetAverageValueNested<A> editOrNewTargetAverageValue();
    public PodsMetricSourceFluent.TargetAverageValueNested<A> editOrNewTargetAverageValueLike(Quantity item);

    public interface SelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<PodsMetricSourceFluent.SelectorNested<N>>{

        
    public N and();    public N endSelector();
}
    public interface TargetAverageValueNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<PodsMetricSourceFluent.TargetAverageValueNested<N>>{

        
    public N and();    public N endTargetAverageValue();
}


}
