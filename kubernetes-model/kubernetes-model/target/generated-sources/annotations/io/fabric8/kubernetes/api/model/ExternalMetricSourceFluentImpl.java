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

public class ExternalMetricSourceFluentImpl<A extends ExternalMetricSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ExternalMetricSourceFluent<A>{

    private String metricName;
    private LabelSelectorBuilder metricSelector;
    private QuantityBuilder targetAverageValue;
    private QuantityBuilder targetValue;

    public ExternalMetricSourceFluentImpl(){
    }
    public ExternalMetricSourceFluentImpl(ExternalMetricSource instance){
            this.withMetricName(instance.getMetricName()); 
            this.withMetricSelector(instance.getMetricSelector()); 
            this.withTargetAverageValue(instance.getTargetAverageValue()); 
            this.withTargetValue(instance.getTargetValue()); 
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

    public ExternalMetricSourceFluent.MetricSelectorNested<A> withNewMetricSelector(){
            return new MetricSelectorNestedImpl();
    }

    public ExternalMetricSourceFluent.MetricSelectorNested<A> withNewMetricSelectorLike(LabelSelector item){
            return new MetricSelectorNestedImpl(item);
    }

    public ExternalMetricSourceFluent.MetricSelectorNested<A> editMetricSelector(){
            return withNewMetricSelectorLike(getMetricSelector());
    }

    public ExternalMetricSourceFluent.MetricSelectorNested<A> editOrNewMetricSelector(){
            return withNewMetricSelectorLike(getMetricSelector() != null ? getMetricSelector(): new LabelSelectorBuilder().build());
    }

    public ExternalMetricSourceFluent.MetricSelectorNested<A> editOrNewMetricSelectorLike(LabelSelector item){
            return withNewMetricSelectorLike(getMetricSelector() != null ? getMetricSelector(): item);
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

    public ExternalMetricSourceFluent.TargetAverageValueNested<A> withNewTargetAverageValue(){
            return new TargetAverageValueNestedImpl();
    }

    public ExternalMetricSourceFluent.TargetAverageValueNested<A> withNewTargetAverageValueLike(Quantity item){
            return new TargetAverageValueNestedImpl(item);
    }

    public ExternalMetricSourceFluent.TargetAverageValueNested<A> editTargetAverageValue(){
            return withNewTargetAverageValueLike(getTargetAverageValue());
    }

    public ExternalMetricSourceFluent.TargetAverageValueNested<A> editOrNewTargetAverageValue(){
            return withNewTargetAverageValueLike(getTargetAverageValue() != null ? getTargetAverageValue(): new QuantityBuilder().build());
    }

    public ExternalMetricSourceFluent.TargetAverageValueNested<A> editOrNewTargetAverageValueLike(Quantity item){
            return withNewTargetAverageValueLike(getTargetAverageValue() != null ? getTargetAverageValue(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTargetValue instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getTargetValue(){
            return this.targetValue!=null?this.targetValue.build():null;
    }

    public Quantity buildTargetValue(){
            return this.targetValue!=null?this.targetValue.build():null;
    }

    public A withTargetValue(Quantity targetValue){
            _visitables.remove(this.targetValue);
            if (targetValue!=null){ this.targetValue= new QuantityBuilder(targetValue); _visitables.add(this.targetValue);} return (A) this;
    }

    public Boolean hasTargetValue(){
            return this.targetValue != null;
    }

    public A withNewTargetValue(String amount,String format){
            return (A)withTargetValue(new Quantity(amount, format));
    }

    public A withNewTargetValue(String amount){
            return (A)withTargetValue(new Quantity(amount));
    }

    public ExternalMetricSourceFluent.TargetValueNested<A> withNewTargetValue(){
            return new TargetValueNestedImpl();
    }

    public ExternalMetricSourceFluent.TargetValueNested<A> withNewTargetValueLike(Quantity item){
            return new TargetValueNestedImpl(item);
    }

    public ExternalMetricSourceFluent.TargetValueNested<A> editTargetValue(){
            return withNewTargetValueLike(getTargetValue());
    }

    public ExternalMetricSourceFluent.TargetValueNested<A> editOrNewTargetValue(){
            return withNewTargetValueLike(getTargetValue() != null ? getTargetValue(): new QuantityBuilder().build());
    }

    public ExternalMetricSourceFluent.TargetValueNested<A> editOrNewTargetValueLike(Quantity item){
            return withNewTargetValueLike(getTargetValue() != null ? getTargetValue(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExternalMetricSourceFluentImpl that = (ExternalMetricSourceFluentImpl) o;
            if (metricName != null ? !metricName.equals(that.metricName) :that.metricName != null) return false;
            if (metricSelector != null ? !metricSelector.equals(that.metricSelector) :that.metricSelector != null) return false;
            if (targetAverageValue != null ? !targetAverageValue.equals(that.targetAverageValue) :that.targetAverageValue != null) return false;
            if (targetValue != null ? !targetValue.equals(that.targetValue) :that.targetValue != null) return false;
            return true;
    }


    public class MetricSelectorNestedImpl<N> extends LabelSelectorFluentImpl<ExternalMetricSourceFluent.MetricSelectorNested<N>> implements ExternalMetricSourceFluent.MetricSelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            MetricSelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            MetricSelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) ExternalMetricSourceFluentImpl.this.withMetricSelector(builder.build());
    }
    public N endMetricSelector(){
            return and();
    }

}
    public class TargetAverageValueNestedImpl<N> extends QuantityFluentImpl<ExternalMetricSourceFluent.TargetAverageValueNested<N>> implements ExternalMetricSourceFluent.TargetAverageValueNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            TargetAverageValueNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            TargetAverageValueNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) ExternalMetricSourceFluentImpl.this.withTargetAverageValue(builder.build());
    }
    public N endTargetAverageValue(){
            return and();
    }

}
    public class TargetValueNestedImpl<N> extends QuantityFluentImpl<ExternalMetricSourceFluent.TargetValueNested<N>> implements ExternalMetricSourceFluent.TargetValueNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            TargetValueNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            TargetValueNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) ExternalMetricSourceFluentImpl.this.withTargetValue(builder.build());
    }
    public N endTargetValue(){
            return and();
    }

}


}
