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

public interface TopologySelectorTermFluent<A extends TopologySelectorTermFluent<A>> extends Fluent<A>{


    public A addToMatchLabelExpressions(int index,TopologySelectorLabelRequirement item);
    public A setToMatchLabelExpressions(int index,TopologySelectorLabelRequirement item);
    public A addToMatchLabelExpressions(TopologySelectorLabelRequirement... items);
    public A addAllToMatchLabelExpressions(Collection<TopologySelectorLabelRequirement> items);
    public A removeFromMatchLabelExpressions(TopologySelectorLabelRequirement... items);
    public A removeAllFromMatchLabelExpressions(Collection<TopologySelectorLabelRequirement> items);
    
/**
 * This method has been deprecated, please use method buildMatchLabelExpressions instead.
 * @return The buildable object.
 */
@Deprecated public List<TopologySelectorLabelRequirement> getMatchLabelExpressions();
    public List<TopologySelectorLabelRequirement> buildMatchLabelExpressions();
    public TopologySelectorLabelRequirement buildMatchLabelExpression(int index);
    public TopologySelectorLabelRequirement buildFirstMatchLabelExpression();
    public TopologySelectorLabelRequirement buildLastMatchLabelExpression();
    public TopologySelectorLabelRequirement buildMatchingMatchLabelExpression(io.fabric8.kubernetes.api.builder.Predicate<TopologySelectorLabelRequirementBuilder> predicate);
    public A withMatchLabelExpressions(List<TopologySelectorLabelRequirement> matchLabelExpressions);
    public A withMatchLabelExpressions(TopologySelectorLabelRequirement... matchLabelExpressions);
    public Boolean hasMatchLabelExpressions();
    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpression();
    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpressionLike(TopologySelectorLabelRequirement item);
    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> setNewMatchLabelExpressionLike(int index,TopologySelectorLabelRequirement item);
    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchLabelExpression(int index);
    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editFirstMatchLabelExpression();
    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editLastMatchLabelExpression();
    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchingMatchLabelExpression(io.fabric8.kubernetes.api.builder.Predicate<TopologySelectorLabelRequirementBuilder> predicate);

    public interface MatchLabelExpressionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TopologySelectorLabelRequirementFluent<TopologySelectorTermFluent.MatchLabelExpressionsNested<N>>{

        
    public N and();    public N endMatchLabelExpression();
}


}
