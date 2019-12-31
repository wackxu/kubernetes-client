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

public interface NodeSelectorTermFluent<A extends NodeSelectorTermFluent<A>> extends Fluent<A>{


    public A addToMatchExpressions(int index,NodeSelectorRequirement item);
    public A setToMatchExpressions(int index,NodeSelectorRequirement item);
    public A addToMatchExpressions(NodeSelectorRequirement... items);
    public A addAllToMatchExpressions(Collection<NodeSelectorRequirement> items);
    public A removeFromMatchExpressions(NodeSelectorRequirement... items);
    public A removeAllFromMatchExpressions(Collection<NodeSelectorRequirement> items);
    
/**
 * This method has been deprecated, please use method buildMatchExpressions instead.
 * @return The buildable object.
 */
@Deprecated public List<NodeSelectorRequirement> getMatchExpressions();
    public List<NodeSelectorRequirement> buildMatchExpressions();
    public NodeSelectorRequirement buildMatchExpression(int index);
    public NodeSelectorRequirement buildFirstMatchExpression();
    public NodeSelectorRequirement buildLastMatchExpression();
    public NodeSelectorRequirement buildMatchingMatchExpression(io.fabric8.kubernetes.api.builder.Predicate<NodeSelectorRequirementBuilder> predicate);
    public A withMatchExpressions(List<NodeSelectorRequirement> matchExpressions);
    public A withMatchExpressions(NodeSelectorRequirement... matchExpressions);
    public Boolean hasMatchExpressions();
    public NodeSelectorTermFluent.MatchExpressionsNested<A> addNewMatchExpression();
    public NodeSelectorTermFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(NodeSelectorRequirement item);
    public NodeSelectorTermFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(int index,NodeSelectorRequirement item);
    public NodeSelectorTermFluent.MatchExpressionsNested<A> editMatchExpression(int index);
    public NodeSelectorTermFluent.MatchExpressionsNested<A> editFirstMatchExpression();
    public NodeSelectorTermFluent.MatchExpressionsNested<A> editLastMatchExpression();
    public NodeSelectorTermFluent.MatchExpressionsNested<A> editMatchingMatchExpression(io.fabric8.kubernetes.api.builder.Predicate<NodeSelectorRequirementBuilder> predicate);
    public A addToMatchFields(int index,NodeSelectorRequirement item);
    public A setToMatchFields(int index,NodeSelectorRequirement item);
    public A addToMatchFields(NodeSelectorRequirement... items);
    public A addAllToMatchFields(Collection<NodeSelectorRequirement> items);
    public A removeFromMatchFields(NodeSelectorRequirement... items);
    public A removeAllFromMatchFields(Collection<NodeSelectorRequirement> items);
    
/**
 * This method has been deprecated, please use method buildMatchFields instead.
 * @return The buildable object.
 */
@Deprecated public List<NodeSelectorRequirement> getMatchFields();
    public List<NodeSelectorRequirement> buildMatchFields();
    public NodeSelectorRequirement buildMatchField(int index);
    public NodeSelectorRequirement buildFirstMatchField();
    public NodeSelectorRequirement buildLastMatchField();
    public NodeSelectorRequirement buildMatchingMatchField(io.fabric8.kubernetes.api.builder.Predicate<NodeSelectorRequirementBuilder> predicate);
    public A withMatchFields(List<NodeSelectorRequirement> matchFields);
    public A withMatchFields(NodeSelectorRequirement... matchFields);
    public Boolean hasMatchFields();
    public NodeSelectorTermFluent.MatchFieldsNested<A> addNewMatchField();
    public NodeSelectorTermFluent.MatchFieldsNested<A> addNewMatchFieldLike(NodeSelectorRequirement item);
    public NodeSelectorTermFluent.MatchFieldsNested<A> setNewMatchFieldLike(int index,NodeSelectorRequirement item);
    public NodeSelectorTermFluent.MatchFieldsNested<A> editMatchField(int index);
    public NodeSelectorTermFluent.MatchFieldsNested<A> editFirstMatchField();
    public NodeSelectorTermFluent.MatchFieldsNested<A> editLastMatchField();
    public NodeSelectorTermFluent.MatchFieldsNested<A> editMatchingMatchField(io.fabric8.kubernetes.api.builder.Predicate<NodeSelectorRequirementBuilder> predicate);

    public interface MatchExpressionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSelectorRequirementFluent<NodeSelectorTermFluent.MatchExpressionsNested<N>>{

        
    public N and();    public N endMatchExpression();
}
    public interface MatchFieldsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeSelectorRequirementFluent<NodeSelectorTermFluent.MatchFieldsNested<N>>{

        
    public N and();    public N endMatchField();
}


}
