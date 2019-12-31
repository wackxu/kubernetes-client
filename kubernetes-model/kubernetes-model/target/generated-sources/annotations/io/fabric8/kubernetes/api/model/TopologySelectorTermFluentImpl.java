package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class TopologySelectorTermFluentImpl<A extends TopologySelectorTermFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TopologySelectorTermFluent<A>{

    private List<TopologySelectorLabelRequirementBuilder> matchLabelExpressions;

    public TopologySelectorTermFluentImpl(){
    }
    public TopologySelectorTermFluentImpl(TopologySelectorTerm instance){
            this.withMatchLabelExpressions(instance.getMatchLabelExpressions()); 
    }

    public A addToMatchLabelExpressions(int index,TopologySelectorLabelRequirement item){
            if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new ArrayList<TopologySelectorLabelRequirementBuilder>();}
            TopologySelectorLabelRequirementBuilder builder = new TopologySelectorLabelRequirementBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.matchLabelExpressions.add(index >= 0 ? index : matchLabelExpressions.size(), builder); return (A)this;
    }

    public A setToMatchLabelExpressions(int index,TopologySelectorLabelRequirement item){
            if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new ArrayList<TopologySelectorLabelRequirementBuilder>();}
            TopologySelectorLabelRequirementBuilder builder = new TopologySelectorLabelRequirementBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= matchLabelExpressions.size()) { matchLabelExpressions.add(builder); } else { matchLabelExpressions.set(index, builder);}
             return (A)this;
    }

    public A addToMatchLabelExpressions(TopologySelectorLabelRequirement... items){
            if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new ArrayList<TopologySelectorLabelRequirementBuilder>();}
            for (TopologySelectorLabelRequirement item : items) {TopologySelectorLabelRequirementBuilder builder = new TopologySelectorLabelRequirementBuilder(item);_visitables.add(builder);this.matchLabelExpressions.add(builder);} return (A)this;
    }

    public A addAllToMatchLabelExpressions(Collection<TopologySelectorLabelRequirement> items){
            if (this.matchLabelExpressions == null) {this.matchLabelExpressions = new ArrayList<TopologySelectorLabelRequirementBuilder>();}
            for (TopologySelectorLabelRequirement item : items) {TopologySelectorLabelRequirementBuilder builder = new TopologySelectorLabelRequirementBuilder(item);_visitables.add(builder);this.matchLabelExpressions.add(builder);} return (A)this;
    }

    public A removeFromMatchLabelExpressions(TopologySelectorLabelRequirement... items){
            for (TopologySelectorLabelRequirement item : items) {TopologySelectorLabelRequirementBuilder builder = new TopologySelectorLabelRequirementBuilder(item);_visitables.remove(builder);if (this.matchLabelExpressions != null) {this.matchLabelExpressions.remove(builder);}} return (A)this;
    }

    public A removeAllFromMatchLabelExpressions(Collection<TopologySelectorLabelRequirement> items){
            for (TopologySelectorLabelRequirement item : items) {TopologySelectorLabelRequirementBuilder builder = new TopologySelectorLabelRequirementBuilder(item);_visitables.remove(builder);if (this.matchLabelExpressions != null) {this.matchLabelExpressions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildMatchLabelExpressions instead.
 * @return The buildable object.
 */
@Deprecated public List<TopologySelectorLabelRequirement> getMatchLabelExpressions(){
            return build(matchLabelExpressions);
    }

    public List<TopologySelectorLabelRequirement> buildMatchLabelExpressions(){
            return build(matchLabelExpressions);
    }

    public TopologySelectorLabelRequirement buildMatchLabelExpression(int index){
            return this.matchLabelExpressions.get(index).build();
    }

    public TopologySelectorLabelRequirement buildFirstMatchLabelExpression(){
            return this.matchLabelExpressions.get(0).build();
    }

    public TopologySelectorLabelRequirement buildLastMatchLabelExpression(){
            return this.matchLabelExpressions.get(matchLabelExpressions.size() - 1).build();
    }

    public TopologySelectorLabelRequirement buildMatchingMatchLabelExpression(io.fabric8.kubernetes.api.builder.Predicate<TopologySelectorLabelRequirementBuilder> predicate){
            for (TopologySelectorLabelRequirementBuilder item: matchLabelExpressions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withMatchLabelExpressions(List<TopologySelectorLabelRequirement> matchLabelExpressions){
            if (this.matchLabelExpressions != null) { _visitables.removeAll(this.matchLabelExpressions);}
            if (matchLabelExpressions != null) {this.matchLabelExpressions = new ArrayList<TopologySelectorLabelRequirementBuilder>(); for (TopologySelectorLabelRequirement item : matchLabelExpressions){this.addToMatchLabelExpressions(item);}} else { this.matchLabelExpressions = new ArrayList<TopologySelectorLabelRequirementBuilder>();} return (A) this;
    }

    public A withMatchLabelExpressions(TopologySelectorLabelRequirement... matchLabelExpressions){
            if (this.matchLabelExpressions != null) {this.matchLabelExpressions.clear();}
            if (matchLabelExpressions != null) {for (TopologySelectorLabelRequirement item :matchLabelExpressions){ this.addToMatchLabelExpressions(item);}} return (A) this;
    }

    public Boolean hasMatchLabelExpressions(){
            return matchLabelExpressions != null && !matchLabelExpressions.isEmpty();
    }

    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpression(){
            return new MatchLabelExpressionsNestedImpl();
    }

    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> addNewMatchLabelExpressionLike(TopologySelectorLabelRequirement item){
            return new MatchLabelExpressionsNestedImpl(-1, item);
    }

    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> setNewMatchLabelExpressionLike(int index,TopologySelectorLabelRequirement item){
            return new MatchLabelExpressionsNestedImpl(index, item);
    }

    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchLabelExpression(int index){
            if (matchLabelExpressions.size() <= index) throw new RuntimeException("Can't edit matchLabelExpressions. Index exceeds size.");
            return setNewMatchLabelExpressionLike(index, buildMatchLabelExpression(index));
    }

    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editFirstMatchLabelExpression(){
            if (matchLabelExpressions.size() == 0) throw new RuntimeException("Can't edit first matchLabelExpressions. The list is empty.");
            return setNewMatchLabelExpressionLike(0, buildMatchLabelExpression(0));
    }

    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editLastMatchLabelExpression(){
            int index = matchLabelExpressions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last matchLabelExpressions. The list is empty.");
            return setNewMatchLabelExpressionLike(index, buildMatchLabelExpression(index));
    }

    public TopologySelectorTermFluent.MatchLabelExpressionsNested<A> editMatchingMatchLabelExpression(io.fabric8.kubernetes.api.builder.Predicate<TopologySelectorLabelRequirementBuilder> predicate){
            int index = -1;
            for (int i=0;i<matchLabelExpressions.size();i++) { 
            if (predicate.apply(matchLabelExpressions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching matchLabelExpressions. No match found.");
            return setNewMatchLabelExpressionLike(index, buildMatchLabelExpression(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TopologySelectorTermFluentImpl that = (TopologySelectorTermFluentImpl) o;
            if (matchLabelExpressions != null ? !matchLabelExpressions.equals(that.matchLabelExpressions) :that.matchLabelExpressions != null) return false;
            return true;
    }


    public class MatchLabelExpressionsNestedImpl<N> extends TopologySelectorLabelRequirementFluentImpl<TopologySelectorTermFluent.MatchLabelExpressionsNested<N>> implements TopologySelectorTermFluent.MatchLabelExpressionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TopologySelectorLabelRequirementBuilder builder;
        private final int index;
    
            MatchLabelExpressionsNestedImpl(int index,TopologySelectorLabelRequirement item){
                    this.index = index;
                    this.builder = new TopologySelectorLabelRequirementBuilder(this, item);
            }
            MatchLabelExpressionsNestedImpl(){
                    this.index = -1;
                    this.builder = new TopologySelectorLabelRequirementBuilder(this);
            }
    
    public N and(){
            return (N) TopologySelectorTermFluentImpl.this.setToMatchLabelExpressions(index, builder.build());
    }
    public N endMatchLabelExpression(){
            return and();
    }

}


}
