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

public class PodsMetricStatusFluentImpl<A extends PodsMetricStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodsMetricStatusFluent<A>{

    private QuantityBuilder currentAverageValue;
    private String metricName;
    private LabelSelectorBuilder selector;

    public PodsMetricStatusFluentImpl(){
    }
    public PodsMetricStatusFluentImpl(PodsMetricStatus instance){
            this.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            this.withMetricName(instance.getMetricName()); 
            this.withSelector(instance.getSelector()); 
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

    public PodsMetricStatusFluent.CurrentAverageValueNested<A> withNewCurrentAverageValue(){
            return new CurrentAverageValueNestedImpl();
    }

    public PodsMetricStatusFluent.CurrentAverageValueNested<A> withNewCurrentAverageValueLike(Quantity item){
            return new CurrentAverageValueNestedImpl(item);
    }

    public PodsMetricStatusFluent.CurrentAverageValueNested<A> editCurrentAverageValue(){
            return withNewCurrentAverageValueLike(getCurrentAverageValue());
    }

    public PodsMetricStatusFluent.CurrentAverageValueNested<A> editOrNewCurrentAverageValue(){
            return withNewCurrentAverageValueLike(getCurrentAverageValue() != null ? getCurrentAverageValue(): new QuantityBuilder().build());
    }

    public PodsMetricStatusFluent.CurrentAverageValueNested<A> editOrNewCurrentAverageValueLike(Quantity item){
            return withNewCurrentAverageValueLike(getCurrentAverageValue() != null ? getCurrentAverageValue(): item);
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

    public PodsMetricStatusFluent.SelectorNested<A> withNewSelector(){
            return new SelectorNestedImpl();
    }

    public PodsMetricStatusFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item){
            return new SelectorNestedImpl(item);
    }

    public PodsMetricStatusFluent.SelectorNested<A> editSelector(){
            return withNewSelectorLike(getSelector());
    }

    public PodsMetricStatusFluent.SelectorNested<A> editOrNewSelector(){
            return withNewSelectorLike(getSelector() != null ? getSelector(): new LabelSelectorBuilder().build());
    }

    public PodsMetricStatusFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item){
            return withNewSelectorLike(getSelector() != null ? getSelector(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodsMetricStatusFluentImpl that = (PodsMetricStatusFluentImpl) o;
            if (currentAverageValue != null ? !currentAverageValue.equals(that.currentAverageValue) :that.currentAverageValue != null) return false;
            if (metricName != null ? !metricName.equals(that.metricName) :that.metricName != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            return true;
    }


    public class CurrentAverageValueNestedImpl<N> extends QuantityFluentImpl<PodsMetricStatusFluent.CurrentAverageValueNested<N>> implements PodsMetricStatusFluent.CurrentAverageValueNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            CurrentAverageValueNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            CurrentAverageValueNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) PodsMetricStatusFluentImpl.this.withCurrentAverageValue(builder.build());
    }
    public N endCurrentAverageValue(){
            return and();
    }

}
    public class SelectorNestedImpl<N> extends LabelSelectorFluentImpl<PodsMetricStatusFluent.SelectorNested<N>> implements PodsMetricStatusFluent.SelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            SelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            SelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) PodsMetricStatusFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector(){
            return and();
    }

}


}
