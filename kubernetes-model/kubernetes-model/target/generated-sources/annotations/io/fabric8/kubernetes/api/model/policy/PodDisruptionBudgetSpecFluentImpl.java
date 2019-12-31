package io.fabric8.kubernetes.api.model.policy;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.LabelSelectorFluentImpl;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.fabric8.kubernetes.api.model.IntOrStringBuilder;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import io.fabric8.kubernetes.api.model.LabelSelector;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.IntOrStringFluentImpl;

public class PodDisruptionBudgetSpecFluentImpl<A extends PodDisruptionBudgetSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PodDisruptionBudgetSpecFluent<A>{

    private IntOrStringBuilder maxUnavailable;
    private IntOrStringBuilder minAvailable;
    private LabelSelectorBuilder selector;

    public PodDisruptionBudgetSpecFluentImpl(){
    }
    public PodDisruptionBudgetSpecFluentImpl(PodDisruptionBudgetSpec instance){
            this.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.withMinAvailable(instance.getMinAvailable()); 
            this.withSelector(instance.getSelector()); 
    }

    
/**
 * This method has been deprecated, please use method buildMaxUnavailable instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getMaxUnavailable(){
            return this.maxUnavailable!=null?this.maxUnavailable.build():null;
    }

    public IntOrString buildMaxUnavailable(){
            return this.maxUnavailable!=null?this.maxUnavailable.build():null;
    }

    public A withMaxUnavailable(IntOrString maxUnavailable){
            _visitables.remove(this.maxUnavailable);
            if (maxUnavailable!=null){ this.maxUnavailable= new IntOrStringBuilder(maxUnavailable); _visitables.add(this.maxUnavailable);} return (A) this;
    }

    public Boolean hasMaxUnavailable(){
            return this.maxUnavailable != null;
    }

    public A withNewMaxUnavailable(String strVal){
            return (A)withMaxUnavailable(new IntOrString(strVal));
    }

    public A withNewMaxUnavailable(Integer intVal){
            return (A)withMaxUnavailable(new IntOrString(intVal));
    }

    public PodDisruptionBudgetSpecFluent.MaxUnavailableNested<A> withNewMaxUnavailable(){
            return new MaxUnavailableNestedImpl();
    }

    public PodDisruptionBudgetSpecFluent.MaxUnavailableNested<A> withNewMaxUnavailableLike(IntOrString item){
            return new MaxUnavailableNestedImpl(item);
    }

    public PodDisruptionBudgetSpecFluent.MaxUnavailableNested<A> editMaxUnavailable(){
            return withNewMaxUnavailableLike(getMaxUnavailable());
    }

    public PodDisruptionBudgetSpecFluent.MaxUnavailableNested<A> editOrNewMaxUnavailable(){
            return withNewMaxUnavailableLike(getMaxUnavailable() != null ? getMaxUnavailable(): new IntOrStringBuilder().build());
    }

    public PodDisruptionBudgetSpecFluent.MaxUnavailableNested<A> editOrNewMaxUnavailableLike(IntOrString item){
            return withNewMaxUnavailableLike(getMaxUnavailable() != null ? getMaxUnavailable(): item);
    }

    
/**
 * This method has been deprecated, please use method buildMinAvailable instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getMinAvailable(){
            return this.minAvailable!=null?this.minAvailable.build():null;
    }

    public IntOrString buildMinAvailable(){
            return this.minAvailable!=null?this.minAvailable.build():null;
    }

    public A withMinAvailable(IntOrString minAvailable){
            _visitables.remove(this.minAvailable);
            if (minAvailable!=null){ this.minAvailable= new IntOrStringBuilder(minAvailable); _visitables.add(this.minAvailable);} return (A) this;
    }

    public Boolean hasMinAvailable(){
            return this.minAvailable != null;
    }

    public A withNewMinAvailable(String strVal){
            return (A)withMinAvailable(new IntOrString(strVal));
    }

    public A withNewMinAvailable(Integer intVal){
            return (A)withMinAvailable(new IntOrString(intVal));
    }

    public PodDisruptionBudgetSpecFluent.MinAvailableNested<A> withNewMinAvailable(){
            return new MinAvailableNestedImpl();
    }

    public PodDisruptionBudgetSpecFluent.MinAvailableNested<A> withNewMinAvailableLike(IntOrString item){
            return new MinAvailableNestedImpl(item);
    }

    public PodDisruptionBudgetSpecFluent.MinAvailableNested<A> editMinAvailable(){
            return withNewMinAvailableLike(getMinAvailable());
    }

    public PodDisruptionBudgetSpecFluent.MinAvailableNested<A> editOrNewMinAvailable(){
            return withNewMinAvailableLike(getMinAvailable() != null ? getMinAvailable(): new IntOrStringBuilder().build());
    }

    public PodDisruptionBudgetSpecFluent.MinAvailableNested<A> editOrNewMinAvailableLike(IntOrString item){
            return withNewMinAvailableLike(getMinAvailable() != null ? getMinAvailable(): item);
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

    public PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelector(){
            return new SelectorNestedImpl();
    }

    public PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item){
            return new SelectorNestedImpl(item);
    }

    public PodDisruptionBudgetSpecFluent.SelectorNested<A> editSelector(){
            return withNewSelectorLike(getSelector());
    }

    public PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelector(){
            return withNewSelectorLike(getSelector() != null ? getSelector(): new LabelSelectorBuilder().build());
    }

    public PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item){
            return withNewSelectorLike(getSelector() != null ? getSelector(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PodDisruptionBudgetSpecFluentImpl that = (PodDisruptionBudgetSpecFluentImpl) o;
            if (maxUnavailable != null ? !maxUnavailable.equals(that.maxUnavailable) :that.maxUnavailable != null) return false;
            if (minAvailable != null ? !minAvailable.equals(that.minAvailable) :that.minAvailable != null) return false;
            if (selector != null ? !selector.equals(that.selector) :that.selector != null) return false;
            return true;
    }


    public class MaxUnavailableNestedImpl<N> extends IntOrStringFluentImpl<PodDisruptionBudgetSpecFluent.MaxUnavailableNested<N>> implements PodDisruptionBudgetSpecFluent.MaxUnavailableNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            MaxUnavailableNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            MaxUnavailableNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) PodDisruptionBudgetSpecFluentImpl.this.withMaxUnavailable(builder.build());
    }
    public N endMaxUnavailable(){
            return and();
    }

}
    public class MinAvailableNestedImpl<N> extends IntOrStringFluentImpl<PodDisruptionBudgetSpecFluent.MinAvailableNested<N>> implements PodDisruptionBudgetSpecFluent.MinAvailableNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            MinAvailableNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            MinAvailableNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) PodDisruptionBudgetSpecFluentImpl.this.withMinAvailable(builder.build());
    }
    public N endMinAvailable(){
            return and();
    }

}
    public class SelectorNestedImpl<N> extends LabelSelectorFluentImpl<PodDisruptionBudgetSpecFluent.SelectorNested<N>> implements PodDisruptionBudgetSpecFluent.SelectorNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorBuilder builder;
    
            SelectorNestedImpl(LabelSelector item){
                    this.builder = new LabelSelectorBuilder(this, item);
            }
            SelectorNestedImpl(){
                    this.builder = new LabelSelectorBuilder(this);
            }
    
    public N and(){
            return (N) PodDisruptionBudgetSpecFluentImpl.this.withSelector(builder.build());
    }
    public N endSelector(){
            return and();
    }

}


}
