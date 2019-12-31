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

public class ScopeSelectorFluentImpl<A extends ScopeSelectorFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ScopeSelectorFluent<A>{

    private List<ScopedResourceSelectorRequirementBuilder> matchExpressions;

    public ScopeSelectorFluentImpl(){
    }
    public ScopeSelectorFluentImpl(ScopeSelector instance){
            this.withMatchExpressions(instance.getMatchExpressions()); 
    }

    public A addToMatchExpressions(int index,ScopedResourceSelectorRequirement item){
            if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<ScopedResourceSelectorRequirementBuilder>();}
            ScopedResourceSelectorRequirementBuilder builder = new ScopedResourceSelectorRequirementBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.matchExpressions.add(index >= 0 ? index : matchExpressions.size(), builder); return (A)this;
    }

    public A setToMatchExpressions(int index,ScopedResourceSelectorRequirement item){
            if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<ScopedResourceSelectorRequirementBuilder>();}
            ScopedResourceSelectorRequirementBuilder builder = new ScopedResourceSelectorRequirementBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= matchExpressions.size()) { matchExpressions.add(builder); } else { matchExpressions.set(index, builder);}
             return (A)this;
    }

    public A addToMatchExpressions(ScopedResourceSelectorRequirement... items){
            if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<ScopedResourceSelectorRequirementBuilder>();}
            for (ScopedResourceSelectorRequirement item : items) {ScopedResourceSelectorRequirementBuilder builder = new ScopedResourceSelectorRequirementBuilder(item);_visitables.add(builder);this.matchExpressions.add(builder);} return (A)this;
    }

    public A addAllToMatchExpressions(Collection<ScopedResourceSelectorRequirement> items){
            if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<ScopedResourceSelectorRequirementBuilder>();}
            for (ScopedResourceSelectorRequirement item : items) {ScopedResourceSelectorRequirementBuilder builder = new ScopedResourceSelectorRequirementBuilder(item);_visitables.add(builder);this.matchExpressions.add(builder);} return (A)this;
    }

    public A removeFromMatchExpressions(ScopedResourceSelectorRequirement... items){
            for (ScopedResourceSelectorRequirement item : items) {ScopedResourceSelectorRequirementBuilder builder = new ScopedResourceSelectorRequirementBuilder(item);_visitables.remove(builder);if (this.matchExpressions != null) {this.matchExpressions.remove(builder);}} return (A)this;
    }

    public A removeAllFromMatchExpressions(Collection<ScopedResourceSelectorRequirement> items){
            for (ScopedResourceSelectorRequirement item : items) {ScopedResourceSelectorRequirementBuilder builder = new ScopedResourceSelectorRequirementBuilder(item);_visitables.remove(builder);if (this.matchExpressions != null) {this.matchExpressions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildMatchExpressions instead.
 * @return The buildable object.
 */
@Deprecated public List<ScopedResourceSelectorRequirement> getMatchExpressions(){
            return build(matchExpressions);
    }

    public List<ScopedResourceSelectorRequirement> buildMatchExpressions(){
            return build(matchExpressions);
    }

    public ScopedResourceSelectorRequirement buildMatchExpression(int index){
            return this.matchExpressions.get(index).build();
    }

    public ScopedResourceSelectorRequirement buildFirstMatchExpression(){
            return this.matchExpressions.get(0).build();
    }

    public ScopedResourceSelectorRequirement buildLastMatchExpression(){
            return this.matchExpressions.get(matchExpressions.size() - 1).build();
    }

    public ScopedResourceSelectorRequirement buildMatchingMatchExpression(io.fabric8.kubernetes.api.builder.Predicate<ScopedResourceSelectorRequirementBuilder> predicate){
            for (ScopedResourceSelectorRequirementBuilder item: matchExpressions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withMatchExpressions(List<ScopedResourceSelectorRequirement> matchExpressions){
            if (this.matchExpressions != null) { _visitables.removeAll(this.matchExpressions);}
            if (matchExpressions != null) {this.matchExpressions = new ArrayList<ScopedResourceSelectorRequirementBuilder>(); for (ScopedResourceSelectorRequirement item : matchExpressions){this.addToMatchExpressions(item);}} else { this.matchExpressions = new ArrayList<ScopedResourceSelectorRequirementBuilder>();} return (A) this;
    }

    public A withMatchExpressions(ScopedResourceSelectorRequirement... matchExpressions){
            if (this.matchExpressions != null) {this.matchExpressions.clear();}
            if (matchExpressions != null) {for (ScopedResourceSelectorRequirement item :matchExpressions){ this.addToMatchExpressions(item);}} return (A) this;
    }

    public Boolean hasMatchExpressions(){
            return matchExpressions != null && !matchExpressions.isEmpty();
    }

    public ScopeSelectorFluent.MatchExpressionsNested<A> addNewMatchExpression(){
            return new MatchExpressionsNestedImpl();
    }

    public ScopeSelectorFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(ScopedResourceSelectorRequirement item){
            return new MatchExpressionsNestedImpl(-1, item);
    }

    public ScopeSelectorFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(int index,ScopedResourceSelectorRequirement item){
            return new MatchExpressionsNestedImpl(index, item);
    }

    public ScopeSelectorFluent.MatchExpressionsNested<A> editMatchExpression(int index){
            if (matchExpressions.size() <= index) throw new RuntimeException("Can't edit matchExpressions. Index exceeds size.");
            return setNewMatchExpressionLike(index, buildMatchExpression(index));
    }

    public ScopeSelectorFluent.MatchExpressionsNested<A> editFirstMatchExpression(){
            if (matchExpressions.size() == 0) throw new RuntimeException("Can't edit first matchExpressions. The list is empty.");
            return setNewMatchExpressionLike(0, buildMatchExpression(0));
    }

    public ScopeSelectorFluent.MatchExpressionsNested<A> editLastMatchExpression(){
            int index = matchExpressions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last matchExpressions. The list is empty.");
            return setNewMatchExpressionLike(index, buildMatchExpression(index));
    }

    public ScopeSelectorFluent.MatchExpressionsNested<A> editMatchingMatchExpression(io.fabric8.kubernetes.api.builder.Predicate<ScopedResourceSelectorRequirementBuilder> predicate){
            int index = -1;
            for (int i=0;i<matchExpressions.size();i++) { 
            if (predicate.apply(matchExpressions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching matchExpressions. No match found.");
            return setNewMatchExpressionLike(index, buildMatchExpression(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScopeSelectorFluentImpl that = (ScopeSelectorFluentImpl) o;
            if (matchExpressions != null ? !matchExpressions.equals(that.matchExpressions) :that.matchExpressions != null) return false;
            return true;
    }


    public class MatchExpressionsNestedImpl<N> extends ScopedResourceSelectorRequirementFluentImpl<ScopeSelectorFluent.MatchExpressionsNested<N>> implements ScopeSelectorFluent.MatchExpressionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ScopedResourceSelectorRequirementBuilder builder;
        private final int index;
    
            MatchExpressionsNestedImpl(int index,ScopedResourceSelectorRequirement item){
                    this.index = index;
                    this.builder = new ScopedResourceSelectorRequirementBuilder(this, item);
            }
            MatchExpressionsNestedImpl(){
                    this.index = -1;
                    this.builder = new ScopedResourceSelectorRequirementBuilder(this);
            }
    
    public N and(){
            return (N) ScopeSelectorFluentImpl.this.setToMatchExpressions(index, builder.build());
    }
    public N endMatchExpression(){
            return and();
    }

}


}
