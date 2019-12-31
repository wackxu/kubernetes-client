package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.Deprecated;
import javax.validation.Valid;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.lang.Object;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import java.util.Map;
import com.fasterxml.jackson.core.JsonParser;

public interface ResourceFieldSelectorFluent<A extends ResourceFieldSelectorFluent<A>> extends Fluent<A>{


    public String getContainerName();
    public A withContainerName(String containerName);
    public Boolean hasContainerName();
    
/**
 * This method has been deprecated, please use method buildDivisor instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getDivisor();
    public Quantity buildDivisor();
    public A withDivisor(Quantity divisor);
    public Boolean hasDivisor();
    public A withNewDivisor(String amount,String format);
    public A withNewDivisor(String amount);
    public ResourceFieldSelectorFluent.DivisorNested<A> withNewDivisor();
    public ResourceFieldSelectorFluent.DivisorNested<A> withNewDivisorLike(Quantity item);
    public ResourceFieldSelectorFluent.DivisorNested<A> editDivisor();
    public ResourceFieldSelectorFluent.DivisorNested<A> editOrNewDivisor();
    public ResourceFieldSelectorFluent.DivisorNested<A> editOrNewDivisorLike(Quantity item);
    public String getResource();
    public A withResource(String resource);
    public Boolean hasResource();

    public interface DivisorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,QuantityFluent<ResourceFieldSelectorFluent.DivisorNested<N>>{

        
    public N and();    public N endDivisor();
}


}
