package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface LabelSelectorFluent<A extends LabelSelectorFluent<A>> extends Fluent<A>{


    public A addToMatchExpressions(int index,LabelSelectorRequirement item);
    public A setToMatchExpressions(int index,LabelSelectorRequirement item);
    public A addToMatchExpressions(LabelSelectorRequirement... items);
    public A addAllToMatchExpressions(Collection<LabelSelectorRequirement> items);
    public A removeFromMatchExpressions(LabelSelectorRequirement... items);
    public A removeAllFromMatchExpressions(Collection<LabelSelectorRequirement> items);
    
/**
 * This method has been deprecated, please use method buildMatchExpressions instead.
 * @return The buildable object.
 */
@Deprecated public List<LabelSelectorRequirement> getMatchExpressions();
    public List<LabelSelectorRequirement> buildMatchExpressions();
    public LabelSelectorRequirement buildMatchExpression(int index);
    public LabelSelectorRequirement buildFirstMatchExpression();
    public LabelSelectorRequirement buildLastMatchExpression();
    public LabelSelectorRequirement buildMatchingMatchExpression(io.fabric8.kubernetes.api.builder.Predicate<LabelSelectorRequirementBuilder> predicate);
    public A withMatchExpressions(List<LabelSelectorRequirement> matchExpressions);
    public A withMatchExpressions(LabelSelectorRequirement... matchExpressions);
    public Boolean hasMatchExpressions();
    public LabelSelectorFluent.MatchExpressionsNested<A> addNewMatchExpression();
    public LabelSelectorFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(LabelSelectorRequirement item);
    public LabelSelectorFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(int index,LabelSelectorRequirement item);
    public LabelSelectorFluent.MatchExpressionsNested<A> editMatchExpression(int index);
    public LabelSelectorFluent.MatchExpressionsNested<A> editFirstMatchExpression();
    public LabelSelectorFluent.MatchExpressionsNested<A> editLastMatchExpression();
    public LabelSelectorFluent.MatchExpressionsNested<A> editMatchingMatchExpression(io.fabric8.kubernetes.api.builder.Predicate<LabelSelectorRequirementBuilder> predicate);
    public A addToMatchLabels(String key,String value);
    public A addToMatchLabels(Map<String,String> map);
    public A removeFromMatchLabels(String key);
    public A removeFromMatchLabels(Map<String,String> map);
    public Map<String,String> getMatchLabels();
    public A withMatchLabels(Map<String,String> matchLabels);
    public Boolean hasMatchLabels();

    public interface MatchExpressionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LabelSelectorRequirementFluent<LabelSelectorFluent.MatchExpressionsNested<N>>{

        
    public N and();    public N endMatchExpression();
}


}
