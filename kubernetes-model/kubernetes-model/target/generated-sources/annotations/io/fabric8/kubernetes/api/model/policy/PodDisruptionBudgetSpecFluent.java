package io.fabric8.kubernetes.api.model.policy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.fabric8.kubernetes.api.model.IntOrStringBuilder;
import java.lang.Deprecated;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import io.fabric8.kubernetes.api.model.LabelSelectorBuilder;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.IntOrStringFluent;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.LabelSelectorFluent;
import java.util.Map;

public interface PodDisruptionBudgetSpecFluent<A extends PodDisruptionBudgetSpecFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildMaxUnavailable instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getMaxUnavailable();
    public IntOrString buildMaxUnavailable();
    public A withMaxUnavailable(IntOrString maxUnavailable);
    public Boolean hasMaxUnavailable();
    public A withNewMaxUnavailable(String strVal);
    public A withNewMaxUnavailable(Integer intVal);
    public PodDisruptionBudgetSpecFluent.MaxUnavailableNested<A> withNewMaxUnavailable();
    public PodDisruptionBudgetSpecFluent.MaxUnavailableNested<A> withNewMaxUnavailableLike(IntOrString item);
    public PodDisruptionBudgetSpecFluent.MaxUnavailableNested<A> editMaxUnavailable();
    public PodDisruptionBudgetSpecFluent.MaxUnavailableNested<A> editOrNewMaxUnavailable();
    public PodDisruptionBudgetSpecFluent.MaxUnavailableNested<A> editOrNewMaxUnavailableLike(IntOrString item);
    
/**
 * This method has been deprecated, please use method buildMinAvailable instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getMinAvailable();
    public IntOrString buildMinAvailable();
    public A withMinAvailable(IntOrString minAvailable);
    public Boolean hasMinAvailable();
    public A withNewMinAvailable(String strVal);
    public A withNewMinAvailable(Integer intVal);
    public PodDisruptionBudgetSpecFluent.MinAvailableNested<A> withNewMinAvailable();
    public PodDisruptionBudgetSpecFluent.MinAvailableNested<A> withNewMinAvailableLike(IntOrString item);
    public PodDisruptionBudgetSpecFluent.MinAvailableNested<A> editMinAvailable();
    public PodDisruptionBudgetSpecFluent.MinAvailableNested<A> editOrNewMinAvailable();
    public PodDisruptionBudgetSpecFluent.MinAvailableNested<A> editOrNewMinAvailableLike(IntOrString item);
    
/**
 * This method has been deprecated, please use method buildSelector instead.
 * @return The buildable object.
 */
@Deprecated public LabelSelector getSelector();
    public LabelSelector buildSelector();
    public A withSelector(LabelSelector selector);
    public Boolean hasSelector();
    public PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelector();
    public PodDisruptionBudgetSpecFluent.SelectorNested<A> withNewSelectorLike(LabelSelector item);
    public PodDisruptionBudgetSpecFluent.SelectorNested<A> editSelector();
    public PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelector();
    public PodDisruptionBudgetSpecFluent.SelectorNested<A> editOrNewSelectorLike(LabelSelector item);

    public interface MaxUnavailableNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IntOrStringFluent<PodDisruptionBudgetSpecFluent.MaxUnavailableNested<N>>{

        
    public N and();    public N endMaxUnavailable();
}
    public interface MinAvailableNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IntOrStringFluent<PodDisruptionBudgetSpecFluent.MinAvailableNested<N>>{

        
    public N and();    public N endMinAvailable();
}
    public interface SelectorNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorFluent<PodDisruptionBudgetSpecFluent.SelectorNested<N>>{

        
    public N and();    public N endSelector();
}


}
