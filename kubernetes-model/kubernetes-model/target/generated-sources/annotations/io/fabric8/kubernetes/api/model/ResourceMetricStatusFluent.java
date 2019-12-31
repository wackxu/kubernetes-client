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
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface ResourceMetricStatusFluent<A extends ResourceMetricStatusFluent<A>> extends Fluent<A>{


    public Integer getCurrentAverageUtilization();
    public A withCurrentAverageUtilization(Integer currentAverageUtilization);
    public Boolean hasCurrentAverageUtilization();
    
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
    public ResourceMetricStatusFluent.CurrentAverageValueNested<A> withNewCurrentAverageValue();
    public ResourceMetricStatusFluent.CurrentAverageValueNested<A> withNewCurrentAverageValueLike(Quantity item);
    public ResourceMetricStatusFluent.CurrentAverageValueNested<A> editCurrentAverageValue();
    public ResourceMetricStatusFluent.CurrentAverageValueNested<A> editOrNewCurrentAverageValue();
    public ResourceMetricStatusFluent.CurrentAverageValueNested<A> editOrNewCurrentAverageValueLike(Quantity item);
    public String getName();
    public A withName(String name);
    public Boolean hasName();

    public interface CurrentAverageValueNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<ResourceMetricStatusFluent.CurrentAverageValueNested<N>>{

        
    public N and();    public N endCurrentAverageValue();
}


}
