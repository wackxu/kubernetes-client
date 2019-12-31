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

public interface ResourceMetricSourceFluent<A extends ResourceMetricSourceFluent<A>> extends Fluent<A>{


    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public Integer getTargetAverageUtilization();
    public A withTargetAverageUtilization(Integer targetAverageUtilization);
    public Boolean hasTargetAverageUtilization();
    
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
    public ResourceMetricSourceFluent.TargetAverageValueNested<A> withNewTargetAverageValue();
    public ResourceMetricSourceFluent.TargetAverageValueNested<A> withNewTargetAverageValueLike(Quantity item);
    public ResourceMetricSourceFluent.TargetAverageValueNested<A> editTargetAverageValue();
    public ResourceMetricSourceFluent.TargetAverageValueNested<A> editOrNewTargetAverageValue();
    public ResourceMetricSourceFluent.TargetAverageValueNested<A> editOrNewTargetAverageValueLike(Quantity item);

    public interface TargetAverageValueNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<ResourceMetricSourceFluent.TargetAverageValueNested<N>>{

        
    public N and();    public N endTargetAverageValue();
}


}
