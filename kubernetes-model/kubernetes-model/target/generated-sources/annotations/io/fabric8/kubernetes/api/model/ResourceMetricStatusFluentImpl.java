package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;

public class ResourceMetricStatusFluentImpl<A extends ResourceMetricStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ResourceMetricStatusFluent<A>{

    private Integer currentAverageUtilization;
    private QuantityBuilder currentAverageValue;
    private String name;

    public ResourceMetricStatusFluentImpl(){
    }
    public ResourceMetricStatusFluentImpl(ResourceMetricStatus instance){
            this.withCurrentAverageUtilization(instance.getCurrentAverageUtilization()); 
            this.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            this.withName(instance.getName()); 
    }

    public Integer getCurrentAverageUtilization(){
            return this.currentAverageUtilization;
    }

    public A withCurrentAverageUtilization(Integer currentAverageUtilization){
            this.currentAverageUtilization=currentAverageUtilization; return (A) this;
    }

    public Boolean hasCurrentAverageUtilization(){
            return this.currentAverageUtilization != null;
    }

    
/**
 * This method has been deprecated, please use method buildCurrentAverageValue instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getCurrentAverageValue(){
            return this.currentAverageValue!=null?this.currentAverageValue.build():null;
    }

    public Quantity buildCurrentAverageValue(){
            return this.currentAverageValue!=null?this.currentAverageValue.build():null;
    }

    public A withCurrentAverageValue(Quantity currentAverageValue){
            _visitables.remove(this.currentAverageValue);
            if (currentAverageValue!=null){ this.currentAverageValue= new QuantityBuilder(currentAverageValue); _visitables.add(this.currentAverageValue);} return (A) this;
    }

    public Boolean hasCurrentAverageValue(){
            return this.currentAverageValue != null;
    }

    public A withNewCurrentAverageValue(String amount,String format){
            return (A)withCurrentAverageValue(new Quantity(amount, format));
    }

    public A withNewCurrentAverageValue(String amount){
            return (A)withCurrentAverageValue(new Quantity(amount));
    }

    public ResourceMetricStatusFluent.CurrentAverageValueNested<A> withNewCurrentAverageValue(){
            return new CurrentAverageValueNestedImpl();
    }

    public ResourceMetricStatusFluent.CurrentAverageValueNested<A> withNewCurrentAverageValueLike(Quantity item){
            return new CurrentAverageValueNestedImpl(item);
    }

    public ResourceMetricStatusFluent.CurrentAverageValueNested<A> editCurrentAverageValue(){
            return withNewCurrentAverageValueLike(getCurrentAverageValue());
    }

    public ResourceMetricStatusFluent.CurrentAverageValueNested<A> editOrNewCurrentAverageValue(){
            return withNewCurrentAverageValueLike(getCurrentAverageValue() != null ? getCurrentAverageValue(): new QuantityBuilder().build());
    }

    public ResourceMetricStatusFluent.CurrentAverageValueNested<A> editOrNewCurrentAverageValueLike(Quantity item){
            return withNewCurrentAverageValueLike(getCurrentAverageValue() != null ? getCurrentAverageValue(): item);
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceMetricStatusFluentImpl that = (ResourceMetricStatusFluentImpl) o;
            if (currentAverageUtilization != null ? !currentAverageUtilization.equals(that.currentAverageUtilization) :that.currentAverageUtilization != null) return false;
            if (currentAverageValue != null ? !currentAverageValue.equals(that.currentAverageValue) :that.currentAverageValue != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            return true;
    }


    public class CurrentAverageValueNestedImpl<N> extends QuantityFluentImpl<ResourceMetricStatusFluent.CurrentAverageValueNested<N>> implements ResourceMetricStatusFluent.CurrentAverageValueNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            CurrentAverageValueNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            CurrentAverageValueNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) ResourceMetricStatusFluentImpl.this.withCurrentAverageValue(builder.build());
    }
    public N endCurrentAverageValue(){
            return and();
    }

}


}
