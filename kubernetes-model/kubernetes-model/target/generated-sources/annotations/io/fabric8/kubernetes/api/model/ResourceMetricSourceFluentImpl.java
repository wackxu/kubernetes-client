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

public class ResourceMetricSourceFluentImpl<A extends ResourceMetricSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ResourceMetricSourceFluent<A>{

    private String name;
    private Integer targetAverageUtilization;
    private QuantityBuilder targetAverageValue;

    public ResourceMetricSourceFluentImpl(){
    }
    public ResourceMetricSourceFluentImpl(ResourceMetricSource instance){
            this.withName(instance.getName()); 
            this.withTargetAverageUtilization(instance.getTargetAverageUtilization()); 
            this.withTargetAverageValue(instance.getTargetAverageValue()); 
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

    public Integer getTargetAverageUtilization(){
            return this.targetAverageUtilization;
    }

    public A withTargetAverageUtilization(Integer targetAverageUtilization){
            this.targetAverageUtilization=targetAverageUtilization; return (A) this;
    }

    public Boolean hasTargetAverageUtilization(){
            return this.targetAverageUtilization != null;
    }

    
/**
 * This method has been deprecated, please use method buildTargetAverageValue instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getTargetAverageValue(){
            return this.targetAverageValue!=null?this.targetAverageValue.build():null;
    }

    public Quantity buildTargetAverageValue(){
            return this.targetAverageValue!=null?this.targetAverageValue.build():null;
    }

    public A withTargetAverageValue(Quantity targetAverageValue){
            _visitables.remove(this.targetAverageValue);
            if (targetAverageValue!=null){ this.targetAverageValue= new QuantityBuilder(targetAverageValue); _visitables.add(this.targetAverageValue);} return (A) this;
    }

    public Boolean hasTargetAverageValue(){
            return this.targetAverageValue != null;
    }

    public A withNewTargetAverageValue(String amount,String format){
            return (A)withTargetAverageValue(new Quantity(amount, format));
    }

    public A withNewTargetAverageValue(String amount){
            return (A)withTargetAverageValue(new Quantity(amount));
    }

    public ResourceMetricSourceFluent.TargetAverageValueNested<A> withNewTargetAverageValue(){
            return new TargetAverageValueNestedImpl();
    }

    public ResourceMetricSourceFluent.TargetAverageValueNested<A> withNewTargetAverageValueLike(Quantity item){
            return new TargetAverageValueNestedImpl(item);
    }

    public ResourceMetricSourceFluent.TargetAverageValueNested<A> editTargetAverageValue(){
            return withNewTargetAverageValueLike(getTargetAverageValue());
    }

    public ResourceMetricSourceFluent.TargetAverageValueNested<A> editOrNewTargetAverageValue(){
            return withNewTargetAverageValueLike(getTargetAverageValue() != null ? getTargetAverageValue(): new QuantityBuilder().build());
    }

    public ResourceMetricSourceFluent.TargetAverageValueNested<A> editOrNewTargetAverageValueLike(Quantity item){
            return withNewTargetAverageValueLike(getTargetAverageValue() != null ? getTargetAverageValue(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceMetricSourceFluentImpl that = (ResourceMetricSourceFluentImpl) o;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (targetAverageUtilization != null ? !targetAverageUtilization.equals(that.targetAverageUtilization) :that.targetAverageUtilization != null) return false;
            if (targetAverageValue != null ? !targetAverageValue.equals(that.targetAverageValue) :that.targetAverageValue != null) return false;
            return true;
    }


    public class TargetAverageValueNestedImpl<N> extends QuantityFluentImpl<ResourceMetricSourceFluent.TargetAverageValueNested<N>> implements ResourceMetricSourceFluent.TargetAverageValueNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            TargetAverageValueNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            TargetAverageValueNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) ResourceMetricSourceFluentImpl.this.withTargetAverageValue(builder.build());
    }
    public N endTargetAverageValue(){
            return and();
    }

}


}
