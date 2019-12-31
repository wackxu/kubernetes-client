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

public class ExternalMetricStatusFluentImpl<A extends ExternalMetricStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ExternalMetricStatusFluent<A>{

    private QuantityBuilder currentAverageValue;
    private QuantityBuilder currentValue;
    private String metricName;
    private LabelSelectorBuilder metricSelector;

    public ExternalMetricStatusFluentImpl(){
    }
    public ExternalMetricStatusFluentImpl(ExternalMetricStatus instance){
            this.withCurrentAverageValue(instance.getCurrentAverageValue()); 
            this.withCurrentValue(instance.getCurrentValue()); 
            this.withMetricName(instance.getMetricName()); 
            this.withMetricSelector(instance.getMetricSelector()); 
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

    public ExternalMetricStatusFluent.CurrentAverageValueNested<A> withNewCurrentAverageValue(){
            return new CurrentAverageValueNestedImpl();
    }

    public ExternalMetricStatusFluent.CurrentAverageValueNested<A> withNewCurrentAverageValueLike(Quantity item){
            return new CurrentAverageValueNestedImpl(item);
    }

    public ExternalMetricStatusFluent.CurrentAverageValueNested<A> editCurrentAverageValue(){
            return withNewCurrentAverageValueLike(getCurrentAverageValue());
    }

    public ExternalMetricStatusFluent.CurrentAverageValueNested<A> editOrNewCurrentAverageValue(){
            return withNewCurrentAverageValueLike(getCurrentAverageValue() != null ? getCurrentAverageValue(): new QuantityBuilder().build());
    }

    public ExternalMetricStatusFluent.CurrentAverageValueNested<A> editOrNewCurrentAverageValueLike(Quantity item){
            return withNewCurrentAverageValueLike(getCurrentAverageValue() != null ? getCurrentAverageValue(): item);
    }

    
/**
 * This method has been deprecated, please use method buildCurrentValue instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getCurrentValue(){
            return this.currentValue!=null?this.currentValue.build():null;
    }

    public Quantity buildCurrentValue(){
            return this.currentValue!=null?this.currentValue.build():null;
    }

    public A withCurrentValue(Quantity currentValue){
            _visitables.remove(this.currentValue);
            if (currentValue!=null){ this.currentValue= new QuantityBuilder(currentValue); _visitables.add(this.currentValue);} return (A) this;
    }

    public Boolean hasCurrentValue(){
            return this.currentValue != null;
    }

    public A withNewCurrentValue(String amount,String format){
            return (A)withCurrentValue(new Quantity(amount, format));
    }

    public A withNewCurrentValue(String amount){
            return (A)withCurrentValue(new Quantity(amount));
    }

    public ExternalMetricStatusFluent.CurrentValueNested<A> withNewCurrentValue(){
            return new CurrentValueNestedImpl();
    }

    public ExternalMetricStatusFluent.CurrentValueNested<A> withNewCurrentValueLike(Quantity item){
            return new CurrentValueNestedImpl(item);
    }

    public ExternalMetricStatusFluent.CurrentValueNested<A> editCurrentValue(){
            return withNewCurrentValueLike(getCurrentValue());
    }

    public ExternalMetricStatusFluent.CurrentValueNested<A> editOrNewCurrentValue(){
            return withNewCurrentValueLike(getCurrentValue() != null ? getCurrentValue(): new QuantityBuilder().build());
    }

    public ExternalMetricStatusFluent.CurrentValueNested<A> editOrNewCurrentValueLike(Quantity item){
            return withNewCurrentValueLike(getCurrentValue() != null ? getCurrentValue(): item);
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
 * This method has been deprecated, please use method buildMetricSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getMetricSelector(){
            return this.metricSelector!=null?this.metricSelector.build():null;
    }

    public LabelSelector buildMetricSelector(){
            return this.metricSelector!=null?this.metricSelector.build():null;
    }

    public A withMetricSelector(LabelSelector metricSelector){
            _visitables.remove(this.metricSelector);
            if (metricSelector!=null){ this.metricSelector= new LabelSelectorBuilder(metricSelector); _visitables.add(this.metricSelector);} return (A) this;
    }

    public Boolean hasMetricSelector(){
            return this.metricSelector != null;
    }

    public ExternalMetricStatusFluent.MetricSelectorNested<A> withNewMetricSelector(){
            return new MetricSelectorNestedImpl();
    }

    public ExternalMetricStatusFluent.MetricSelectorNested<A> withNewMetricSelectorLike(LabelSelector item){
            return new MetricSelectorNestedImpl(item);
    }

    public ExternalMetricStatusFluent.MetricSelectorNested<A> editMetricSelector(){
            return withNewMetricSelectorLike(getMetricSelector());
    }

    public ExternalMetricStatusFluent.MetricSelectorNested<A> editOrNewMetricSelector(){
            return withNewMetricSelectorLike(getMetricSelector() != null ? getMetricSelector(): new LabelSelectorBuilder().build());
    }

    public ExternalMetricStatusFluent.MetricSelectorNested<A> editOrNewMetricSelectorLike(LabelSelector item){
            return withNewMetricSelectorLike(getMetricSelector() != null ? getMetricSelector(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExternalMetricStatusFluentImpl that = (ExternalMetricStatusFluentImpl) o;
            if (currentAverageValue != null ? !currentAverageValue.equals(that.currentAverageValue) :that.currentAverageValue != null) return false;
            if (currentValue != null ? !currentValue.equals(that.currentValue) :that.currentValue != null) return false;
            if (metricName != null ? !metricName.equals(that.metricName) :that.metricName != null) return false;
            if (metricSelector != null ? !metricSelector.equals(that.metricSelector) :that.metricSelector != null) return false;
            return true;
    }


    public class CurrentAverageValueNestedImpl<N> extends QuantityFluentImpl<ExternalMetricStatusFluent.CurrentAverageValueNested<N>> implements ExternalMetricStatusFluent.CurrentAverageValueNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            CurrentAverageValueNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            CurrentAverageValueNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) ExternalMetricStatusFluentImpl.this.withCurrentAverageValue(builder.build());
    }
    public N endCurrentAverageValue(){
            return and();
    }

}
    public class CurrentValueNestedImpl<N> extends QuantityFluentImpl<ExternalMetricStatusFluent.CurrentValueNested<N>> implements ExternalMetricStatusFluent.CurrentValueNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            CurrentValueNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            CurrentValueNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) ExternalMetricStatusFluentImpl.this.withCurrentValue(builder.build());
    }
    public N endCurrentValue(){
            return and();
    }

}
    public class MetricSelectorNestedImpl<N> extends LabelSelectorFluentImpl<ExternalMetricStatusFluent.MetricSelectorNested<N>> implements ExternalMetricStatusFluent.MetricSelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            MetricSelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            MetricSelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) ExternalMetricStatusFluentImpl.this.withMetricSelector(builder.build());
    }
    public N endMetricSelector(){
            return and();
    }

}


}
