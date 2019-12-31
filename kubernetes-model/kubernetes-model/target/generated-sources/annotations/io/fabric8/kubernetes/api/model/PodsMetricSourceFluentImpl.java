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
import javax.validation.Valid;
import java.lang.Object;

public class PodsMetricSourceFluentImpl<A extends PodsMetricSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodsMetricSourceFluent<A>{

    private String metricName;
    private LabelSelectorBuilder selector;
    private QuantityBuilder targetAverageValue;

    public PodsMetricSourceFluentImpl(){
    }
    public PodsMetricSourceFluentImpl(PodsMetricSource instance){
            this.withMetricName(instance.getMetricName()); 
            this.withSelector(instance.getSelector()); 
            this.withTargetAverageValue(instance.getTargetAverageValue()); 
    }

    public String getMetricName(){
            return this.metricName;
    }

    public A withMetricName(String metricName){
            this.metricName=metricName; return (A) this;
    }

    public Boolean hasMetricName(){
            return this.metricName != null;
    }

    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector(){
            return this.selector!=null?this.selector.build():null;
    }

    public LabelSelector buildSelector(){
            return this.selector!=null?this.selector.build():null;
    }

    public A withSelector(LabelSelector selector){
            _visitables.remove(this.selector);
            if (selector!=null){ this.selector= new LabelSelectorBuilder(selector); _visitables.add(this.selector);} return (A) this;
    }

    public Boolean hasSelector(){
            return this.selector != null;
    }

    public PodsMetricSourceFluent.SelectorNested<A> withNewSelector(){
            return new SelectorNestedImpl();
    }

    public PodsMetricSourceFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item){
            return new SelectorNestedImpl(item);
    }

    public PodsMetricSourceFluent.SelectorNested<A> editSelector(){
            return withNewSelectorLike(getSelector());
    }

    public PodsMetricSourceFluent.SelectorNested<A> editOrNewSelector(){
            return withNewSelectorLike(getSelector() != null ? getSelector(): new LabelSelectorBuilder().build());
    }

    public PodsMetricSourceFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item){
            return withNewSelectorLike(getSelector() != null ? getSelector(): item);
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

    public PodsMetricSourceFluent.TargetAverageValueNested<A> withNewTargetAverageValue(){
            return new TargetAverageValueNestedImpl();
    }

    public PodsMetricSourceFluent.TargetAverageValueNested<A> withNewTargetAverageValueLike(Quantity item){
            return new TargetAverageValueNestedImpl(item);
    }

    public PodsMetricSourceFluent.TargetAverageValueNested<A> editTargetAverageValue(){
            return withNewTargetAverageValueLike(getTargetAverageValue());
    }

    public PodsMetricSourceFluent.TargetAverageValueNested<A> editOrNewTargetAverageValue(){
            return withNewTargetAverageValueLike(getTargetAverageValue() != null ? getTargetAverageValue(): new QuantityBuilder().build());
    }

    public PodsMetricSourceFluent.TargetAverageValueNested<A> editOrNewTargetAverageValueLike(Quantity item){
            return withNewTargetAverageValueLike(getTargetAverageValue() != null ? getTargetAverageValue(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodsMetricSourceFluentImpl that = (PodsMetricSourceFluentImpl) o;
            if (metricName != null ? !metricName.equals(that.metricName) :that.metricName != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (targetAverageValue != null ? !targetAverageValue.equals(that.targetAverageValue) :that.targetAverageValue != null) return false;
            return true;
    }


    public class SelectorNestedImpl<N> extends LabelSelectorFluentImpl<PodsMetricSourceFluent.SelectorNested<N>> implements PodsMetricSourceFluent.SelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            SelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            SelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) PodsMetricSourceFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector(){
            return and();
    }

}
    public class TargetAverageValueNestedImpl<N> extends QuantityFluentImpl<PodsMetricSourceFluent.TargetAverageValueNested<N>> implements PodsMetricSourceFluent.TargetAverageValueNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            TargetAverageValueNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            TargetAverageValueNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) PodsMetricSourceFluentImpl.this.withTargetAverageValue(builder.build());
    }
    public N endTargetAverageValue(){
            return and();
    }

}


}
