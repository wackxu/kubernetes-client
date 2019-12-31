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

public class ObjectMetricStatusFluentImpl<A extends ObjectMetricStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ObjectMetricStatusFluent<A>{

    private QuantityBuilder averageValue;
    private QuantityBuilder currentValue;
    private String metricName;
    private LabelSelectorBuilder selector;
    private CrossVersionObjectReferenceBuilder target;

    public ObjectMetricStatusFluentImpl(){
    }
    public ObjectMetricStatusFluentImpl(ObjectMetricStatus instance){
            this.withAverageValue(instance.getAverageValue()); 
            this.withCurrentValue(instance.getCurrentValue()); 
            this.withMetricName(instance.getMetricName()); 
            this.withSelector(instance.getSelector()); 
            this.withTarget(instance.getTarget()); 
    }

    
/**
 * This method has been deprecated, please use method buildAverageValue instead.
 * @return The buildable object.
 */
@Deprecated public Quantity getAverageValue(){
            return this.averageValue!=null?this.averageValue.build():null;
    }

    public Quantity buildAverageValue(){
            return this.averageValue!=null?this.averageValue.build():null;
    }

    public A withAverageValue(Quantity averageValue){
            _visitables.remove(this.averageValue);
            if (averageValue!=null){ this.averageValue= new QuantityBuilder(averageValue); _visitables.add(this.averageValue);} return (A) this;
    }

    public Boolean hasAverageValue(){
            return this.averageValue != null;
    }

    public A withNewAverageValue(String amount,String format){
            return (A)withAverageValue(new Quantity(amount, format));
    }

    public A withNewAverageValue(String amount){
            return (A)withAverageValue(new Quantity(amount));
    }

    public ObjectMetricStatusFluent.AverageValueNested<A> withNewAverageValue(){
            return new AverageValueNestedImpl();
    }

    public ObjectMetricStatusFluent.AverageValueNested<A> withNewAverageValueLike(Quantity item){
            return new AverageValueNestedImpl(item);
    }

    public ObjectMetricStatusFluent.AverageValueNested<A> editAverageValue(){
            return withNewAverageValueLike(getAverageValue());
    }

    public ObjectMetricStatusFluent.AverageValueNested<A> editOrNewAverageValue(){
            return withNewAverageValueLike(getAverageValue() != null ? getAverageValue(): new QuantityBuilder().build());
    }

    public ObjectMetricStatusFluent.AverageValueNested<A> editOrNewAverageValueLike(Quantity item){
            return withNewAverageValueLike(getAverageValue() != null ? getAverageValue(): item);
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

    public ObjectMetricStatusFluent.CurrentValueNested<A> withNewCurrentValue(){
            return new CurrentValueNestedImpl();
    }

    public ObjectMetricStatusFluent.CurrentValueNested<A> withNewCurrentValueLike(Quantity item){
            return new CurrentValueNestedImpl(item);
    }

    public ObjectMetricStatusFluent.CurrentValueNested<A> editCurrentValue(){
            return withNewCurrentValueLike(getCurrentValue());
    }

    public ObjectMetricStatusFluent.CurrentValueNested<A> editOrNewCurrentValue(){
            return withNewCurrentValueLike(getCurrentValue() != null ? getCurrentValue(): new QuantityBuilder().build());
    }

    public ObjectMetricStatusFluent.CurrentValueNested<A> editOrNewCurrentValueLike(Quantity item){
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

    public ObjectMetricStatusFluent.SelectorNested<A> withNewSelector(){
            return new SelectorNestedImpl();
    }

    public ObjectMetricStatusFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item){
            return new SelectorNestedImpl(item);
    }

    public ObjectMetricStatusFluent.SelectorNested<A> editSelector(){
            return withNewSelectorLike(getSelector());
    }

    public ObjectMetricStatusFluent.SelectorNested<A> editOrNewSelector(){
            return withNewSelectorLike(getSelector() != null ? getSelector(): new LabelSelectorBuilder().build());
    }

    public ObjectMetricStatusFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item){
            return withNewSelectorLike(getSelector() != null ? getSelector(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTarget instead.
 * @return The buildable object.
 */
@Deprecated public CrossVersionObjectReference getTarget(){
            return this.target!=null?this.target.build():null;
    }

    public CrossVersionObjectReference buildTarget(){
            return this.target!=null?this.target.build():null;
    }

    public A withTarget(CrossVersionObjectReference target){
            _visitables.remove(this.target);
            if (target!=null){ this.target= new CrossVersionObjectReferenceBuilder(target); _visitables.add(this.target);} return (A) this;
    }

    public Boolean hasTarget(){
            return this.target != null;
    }

    public A withNewTarget(String apiVersion,String kind,String name){
            return (A)withTarget(new CrossVersionObjectReference(apiVersion, kind, name));
    }

    public ObjectMetricStatusFluent.TargetNested<A> withNewTarget(){
            return new TargetNestedImpl();
    }

    public ObjectMetricStatusFluent.TargetNested<A> withNewTargetLike(CrossVersionObjectReference item){
            return new TargetNestedImpl(item);
    }

    public ObjectMetricStatusFluent.TargetNested<A> editTarget(){
            return withNewTargetLike(getTarget());
    }

    public ObjectMetricStatusFluent.TargetNested<A> editOrNewTarget(){
            return withNewTargetLike(getTarget() != null ? getTarget(): new CrossVersionObjectReferenceBuilder().build());
    }

    public ObjectMetricStatusFluent.TargetNested<A> editOrNewTargetLike(CrossVersionObjectReference item){
            return withNewTargetLike(getTarget() != null ? getTarget(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ObjectMetricStatusFluentImpl that = (ObjectMetricStatusFluentImpl) o;
            if (averageValue != null ? !averageValue.equals(that.averageValue) :that.averageValue != null) return false;
            if (currentValue != null ? !currentValue.equals(that.currentValue) :that.currentValue != null) return false;
            if (metricName != null ? !metricName.equals(that.metricName) :that.metricName != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (target != null ? !target.equals(that.target) :that.target != null) return false;
            return true;
    }


    public class AverageValueNestedImpl<N> extends QuantityFluentImpl<ObjectMetricStatusFluent.AverageValueNested<N>> implements ObjectMetricStatusFluent.AverageValueNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            AverageValueNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            AverageValueNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) ObjectMetricStatusFluentImpl.this.withAverageValue(builder.build());
    }
    public N endAverageValue(){
            return and();
    }

}
    public class CurrentValueNestedImpl<N> extends QuantityFluentImpl<ObjectMetricStatusFluent.CurrentValueNested<N>> implements ObjectMetricStatusFluent.CurrentValueNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            CurrentValueNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            CurrentValueNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) ObjectMetricStatusFluentImpl.this.withCurrentValue(builder.build());
    }
    public N endCurrentValue(){
            return and();
    }

}
    public class SelectorNestedImpl<N> extends LabelSelectorFluentImpl<ObjectMetricStatusFluent.SelectorNested<N>> implements ObjectMetricStatusFluent.SelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            SelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            SelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) ObjectMetricStatusFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector(){
            return and();
    }

}
    public class TargetNestedImpl<N> extends CrossVersionObjectReferenceFluentImpl<ObjectMetricStatusFluent.TargetNested<N>> implements ObjectMetricStatusFluent.TargetNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CrossVersionObjectReferenceBuilder builder;
    
            TargetNestedImpl(CrossVersionObjectReference item){
                    this.builder = new CrossVersionObjectReferenceBuilder(this, item);
            }
            TargetNestedImpl(){
                    this.builder = new CrossVersionObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ObjectMetricStatusFluentImpl.this.withTarget(builder.build());
    }
    public N endTarget(){
            return and();
    }

}


}
