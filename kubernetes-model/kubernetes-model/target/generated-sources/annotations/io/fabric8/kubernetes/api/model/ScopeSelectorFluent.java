package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface ScopeSelectorFluent<A extends ScopeSelectorFluent<A>> extends Fluent<A>{


    public A addToMatchExpressions(int index,ScopedResourceSelectorRequirement item);
    public A setToMatchExpressions(int index,ScopedResourceSelectorRequirement item);
    public A addToMatchExpressions(ScopedResourceSelectorRequirement... items);
    public A addAllToMatchExpressions(Collection<ScopedResourceSelectorRequirement> items);
    public A removeFromMatchExpressions(ScopedResourceSelectorRequirement... items);
    public A removeAllFromMatchExpressions(Collection<ScopedResourceSelectorRequirement> items);
    
/**
 * This method has been deprecated, please use method buildMatchExpressions instead.
 * @return The buildable object.
 */
@Deprecated public List<ScopedResourceSelectorRequirement> getMatchExpressions();
    public List<ScopedResourceSelectorRequirement> buildMatchExpressions();
    public ScopedResourceSelectorRequirement buildMatchExpression(int index);
    public ScopedResourceSelectorRequirement buildFirstMatchExpression();
    public ScopedResourceSelectorRequirement buildLastMatchExpression();
    public ScopedResourceSelectorRequirement buildMatchingMatchExpression(io.fabric8.kubernetes.api.builder.Predicate<ScopedResourceSelectorRequirementBuilder> predicate);
    public A withMatchExpressions(List<ScopedResourceSelectorRequirement> matchExpressions);
    public A withMatchExpressions(ScopedResourceSelectorRequirement... matchExpressions);
    public Boolean hasMatchExpressions();
    public ScopeSelectorFluent.MatchExpressionsNested<A> addNewMatchExpression();
    public ScopeSelectorFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(ScopedResourceSelectorRequirement item);
    public ScopeSelectorFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(int index,ScopedResourceSelectorRequirement item);
    public ScopeSelectorFluent.MatchExpressionsNested<A> editMatchExpression(int index);
    public ScopeSelectorFluent.MatchExpressionsNested<A> editFirstMatchExpression();
    public ScopeSelectorFluent.MatchExpressionsNested<A> editLastMatchExpression();
    public ScopeSelectorFluent.MatchExpressionsNested<A> editMatchingMatchExpression(io.fabric8.kubernetes.api.builder.Predicate<ScopedResourceSelectorRequirementBuilder> predicate);

    public interface MatchExpressionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ScopedResourceSelectorRequirementFluent<ScopeSelectorFluent.MatchExpressionsNested<N>>{

        
    public N and();    public N endMatchExpression();
}


}
