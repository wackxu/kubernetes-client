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

public interface PodsMetricStatusFluent<A extends PodsMetricStatusFluent<A>> extends Fluent<A>{


    
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
    public PodsMetricStatusFluent.CurrentAverageValueNested<A> withNewCurrentAverageValue();
    public PodsMetricStatusFluent.CurrentAverageValueNested<A> withNewCurrentAverageValueLike(Quantity item);
    public PodsMetricStatusFluent.CurrentAverageValueNested<A> editCurrentAverageValue();
    public PodsMetricStatusFluent.CurrentAverageValueNested<A> editOrNewCurrentAverageValue();
    public PodsMetricStatusFluent.CurrentAverageValueNested<A> editOrNewCurrentAverageValueLike(Quantity item);
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
    public PodsMetricStatusFluent.SelectorNested<A> withNewSelector();
    public PodsMetricStatusFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item);
    public PodsMetricStatusFluent.SelectorNested<A> editSelector();
    public PodsMetricStatusFluent.SelectorNested<A> editOrNewSelector();
    public PodsMetricStatusFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item);

    public interface CurrentAverageValueNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<PodsMetricStatusFluent.CurrentAverageValueNested<N>>{

        
    public N and();    public N endCurrentAverageValue();
}
    public interface SelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<PodsMetricStatusFluent.SelectorNested<N>>{

        
    public N and();    public N endSelector();
}


}
