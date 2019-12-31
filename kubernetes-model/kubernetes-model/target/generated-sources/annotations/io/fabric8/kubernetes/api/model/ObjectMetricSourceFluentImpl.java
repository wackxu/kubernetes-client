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

public class ObjectMetricSourceFluentImpl<A extends ObjectMetricSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ObjectMetricSourceFluent<A>{

    private QuantityBuilder averageValue;
    private String metricName;
    private LabelSelectorBuilder selector;
    private CrossVersionObjectReferenceBuilder target;
    private QuantityBuilder targetValue;

    public ObjectMetricSourceFluentImpl(){
    }
    public ObjectMetricSourceFluentImpl(ObjectMetricSource instance){
            this.withAverageValue(instance.getAverageValue()); 
            this.withMetricName(instance.getMetricName()); 
            this.withSelector(instance.getSelector()); 
            this.withTarget(instance.getTarget()); 
            this.withTargetValue(instance.getTargetValue()); 
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

    public ObjectMetricSourceFluent.AverageValueNested<A> withNewAverageValue(){
            return new AverageValueNestedImpl();
    }

    public ObjectMetricSourceFluent.AverageValueNested<A> withNewAverageValueLike(Quantity item){
            return new AverageValueNestedImpl(item);
    }

    public ObjectMetricSourceFluent.AverageValueNested<A> editAverageValue(){
            return withNewAverageValueLike(getAverageValue());
    }

    public ObjectMetricSourceFluent.AverageValueNested<A> editOrNewAverageValue(){
            return withNewAverageValueLike(getAverageValue() != null ? getAverageValue(): new QuantityBuilder().build());
    }

    public ObjectMetricSourceFluent.AverageValueNested<A> editOrNewAverageValueLike(Quantity item){
            return withNewAverageValueLike(getAverageValue() != null ? getAverageValue(): item);
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

    public ObjectMetricSourceFluent.SelectorNested<A> withNewSelector(){
            return new SelectorNestedImpl();
    }

    public ObjectMetricSourceFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item){
            return new SelectorNestedImpl(item);
    }

    public ObjectMetricSourceFluent.SelectorNested<A> editSelector(){
            return withNewSelectorLike(getSelector());
    }

    public ObjectMetricSourceFluent.SelectorNested<A> editOrNewSelector(){
            return withNewSelectorLike(getSelector() != null ? getSelector(): new LabelSelectorBuilder().build());
    }

    public ObjectMetricSourceFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item){
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

    public ObjectMetricSourceFluent.TargetNested<A> withNewTarget(){
            return new TargetNestedImpl();
    }

    public ObjectMetricSourceFluent.TargetNested<A> withNewTargetLike(CrossVersionObjectReference item){
            return new TargetNestedImpl(item);
    }

    public ObjectMetricSourceFluent.TargetNested<A> editTarget(){
            return withNewTargetLike(getTarget());
    }

    public ObjectMetricSourceFluent.TargetNested<A> editOrNewTarget(){
            return withNewTargetLike(getTarget() != null ? getTarget(): new CrossVersionObjectReferenceBuilder().build());
    }

    public ObjectMetricSourceFluent.TargetNested<A> editOrNewTargetLike(CrossVersionObjectReference item){
            return withNewTargetLike(getTarget() != null ? getTarget(): item);
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

    public ObjectMetricSourceFluent.TargetValueNested<A> withNewTargetValue(){
            return new TargetValueNestedImpl();
    }

    public ObjectMetricSourceFluent.TargetValueNested<A> withNewTargetValueLike(Quantity item){
            return new TargetValueNestedImpl(item);
    }

    public ObjectMetricSourceFluent.TargetValueNested<A> editTargetValue(){
            return withNewTargetValueLike(getTargetValue());
    }

    public ObjectMetricSourceFluent.TargetValueNested<A> editOrNewTargetValue(){
            return withNewTargetValueLike(getTargetValue() != null ? getTargetValue(): new QuantityBuilder().build());
    }

    public ObjectMetricSourceFluent.TargetValueNested<A> editOrNewTargetValueLike(Quantity item){
            return withNewTargetValueLike(getTargetValue() != null ? getTargetValue(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ObjectMetricSourceFluentImpl that = (ObjectMetricSourceFluentImpl) o;
            if (averageValue != null ? !averageValue.equals(that.averageValue) :that.averageValue != null) return false;
            if (metricName != null ? !metricName.equals(that.metricName) :that.metricName != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            if (target != null ? !target.equals(that.target) :that.target != null) return false;
            if (targetValue != null ? !targetValue.equals(that.targetValue) :that.targetValue != null) return false;
            return true;
    }


    public class AverageValueNestedImpl<N> extends QuantityFluentImpl<ObjectMetricSourceFluent.AverageValueNested<N>> implements ObjectMetricSourceFluent.AverageValueNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            AverageValueNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            AverageValueNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) ObjectMetricSourceFluentImpl.this.withAverageValue(builder.build());
    }
    public N endAverageValue(){
            return and();
    }

}
    public class SelectorNestedImpl<N> extends LabelSelectorFluentImpl<ObjectMetricSourceFluent.SelectorNested<N>> implements ObjectMetricSourceFluent.SelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            SelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            SelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) ObjectMetricSourceFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector(){
            return and();
    }

}
    public class TargetNestedImpl<N> extends CrossVersionObjectReferenceFluentImpl<ObjectMetricSourceFluent.TargetNested<N>> implements ObjectMetricSourceFluent.TargetNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CrossVersionObjectReferenceBuilder builder;
    
            TargetNestedImpl(CrossVersionObjectReference item){
                    this.builder = new CrossVersionObjectReferenceBuilder(this, item);
            }
            TargetNestedImpl(){
                    this.builder = new CrossVersionObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ObjectMetricSourceFluentImpl.this.withTarget(builder.build());
    }
    public N endTarget(){
            return and();
    }

}
    public class TargetValueNestedImpl<N> extends QuantityFluentImpl<ObjectMetricSourceFluent.TargetValueNested<N>> implements ObjectMetricSourceFluent.TargetValueNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final QuantityBuilder builder;
    
            TargetValueNestedImpl(Quantity item){
                    this.builder = new QuantityBuilder(this, item);
            }
            TargetValueNestedImpl(){
                    this.builder = new QuantityBuilder(this);
            }
    
    public N and(){
            return (N) ObjectMetricSourceFluentImpl.this.withTargetValue(builder.build());
    }
    public N endTargetValue(){
            return and();
    }

}


}
