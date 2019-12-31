package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public class LabelSelectorFluentImpl<A extends LabelSelectorFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements LabelSelectorFluent<A>{

    private List<LabelSelectorRequirementBuilder> matchExpressions;
    private Map<String,String> matchLabels;

    public LabelSelectorFluentImpl(){
    }
    public LabelSelectorFluentImpl(LabelSelector instance){
            this.withMatchExpressions(instance.getMatchExpressions()); 
            this.withMatchLabels(instance.getMatchLabels()); 
    }

    public A addToMatchExpressions(int index,LabelSelectorRequirement item){
            if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<LabelSelectorRequirementBuilder>();}
            LabelSelectorRequirementBuilder builder = new LabelSelectorRequirementBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.matchExpressions.add(index >= 0 ? index : matchExpressions.size(), builder); return (A)this;
    }

    public A setToMatchExpressions(int index,LabelSelectorRequirement item){
            if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<LabelSelectorRequirementBuilder>();}
            LabelSelectorRequirementBuilder builder = new LabelSelectorRequirementBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= matchExpressions.size()) { matchExpressions.add(builder); } else { matchExpressions.set(index, builder);}
             return (A)this;
    }

    public A addToMatchExpressions(LabelSelectorRequirement... items){
            if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<LabelSelectorRequirementBuilder>();}
            for (LabelSelectorRequirement item : items) {LabelSelectorRequirementBuilder builder = new LabelSelectorRequirementBuilder(item);_visitables.add(builder);this.matchExpressions.add(builder);} return (A)this;
    }

    public A addAllToMatchExpressions(Collection<LabelSelectorRequirement> items){
            if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<LabelSelectorRequirementBuilder>();}
            for (LabelSelectorRequirement item : items) {LabelSelectorRequirementBuilder builder = new LabelSelectorRequirementBuilder(item);_visitables.add(builder);this.matchExpressions.add(builder);} return (A)this;
    }

    public A removeFromMatchExpressions(LabelSelectorRequirement... items){
            for (LabelSelectorRequirement item : items) {LabelSelectorRequirementBuilder builder = new LabelSelectorRequirementBuilder(item);_visitables.remove(builder);if (this.matchExpressions != null) {this.matchExpressions.remove(builder);}} return (A)this;
    }

    public A removeAllFromMatchExpressions(Collection<LabelSelectorRequirement> items){
            for (LabelSelectorRequirement item : items) {LabelSelectorRequirementBuilder builder = new LabelSelectorRequirementBuilder(item);_visitables.remove(builder);if (this.matchExpressions != null) {this.matchExpressions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildMatchExpressions instead.
 * @return The buildable object.
 */
@Deprecated public List<LabelSelectorRequirement> getMatchExpressions(){
            return build(matchExpressions);
    }

    public List<LabelSelectorRequirement> buildMatchExpressions(){
            return build(matchExpressions);
    }

    public LabelSelectorRequirement buildMatchExpression(int index){
            return this.matchExpressions.get(index).build();
    }

    public LabelSelectorRequirement buildFirstMatchExpression(){
            return this.matchExpressions.get(0).build();
    }

    public LabelSelectorRequirement buildLastMatchExpression(){
            return this.matchExpressions.get(matchExpressions.size() - 1).build();
    }

    public LabelSelectorRequirement buildMatchingMatchExpression(io.fabric8.kubernetes.api.builder.Predicate<LabelSelectorRequirementBuilder> predicate){
            for (LabelSelectorRequirementBuilder item: matchExpressions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withMatchExpressions(List<LabelSelectorRequirement> matchExpressions){
            if (this.matchExpressions != null) { _visitables.removeAll(this.matchExpressions);}
            if (matchExpressions != null) {this.matchExpressions = new ArrayList<LabelSelectorRequirementBuilder>(); for (LabelSelectorRequirement item : matchExpressions){this.addToMatchExpressions(item);}} else { this.matchExpressions = new ArrayList<LabelSelectorRequirementBuilder>();} return (A) this;
    }

    public A withMatchExpressions(LabelSelectorRequirement... matchExpressions){
            if (this.matchExpressions != null) {this.matchExpressions.clear();}
            if (matchExpressions != null) {for (LabelSelectorRequirement item :matchExpressions){ this.addToMatchExpressions(item);}} return (A) this;
    }

    public Boolean hasMatchExpressions(){
            return matchExpressions != null && !matchExpressions.isEmpty();
    }

    public LabelSelectorFluent.MatchExpressionsNested<A> addNewMatchExpression(){
            return new MatchExpressionsNestedImpl();
    }

    public LabelSelectorFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(LabelSelectorRequirement item){
            return new MatchExpressionsNestedImpl(-1, item);
    }

    public LabelSelectorFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(int index,LabelSelectorRequirement item){
            return new MatchExpressionsNestedImpl(index, item);
    }

    public LabelSelectorFluent.MatchExpressionsNested<A> editMatchExpression(int index){
            if (matchExpressions.size() <= index) throw new RuntimeException("Can't edit matchExpressions. Index exceeds size.");
            return setNewMatchExpressionLike(index, buildMatchExpression(index));
    }

    public LabelSelectorFluent.MatchExpressionsNested<A> editFirstMatchExpression(){
            if (matchExpressions.size() == 0) throw new RuntimeException("Can't edit first matchExpressions. The list is empty.");
            return setNewMatchExpressionLike(0, buildMatchExpression(0));
    }

    public LabelSelectorFluent.MatchExpressionsNested<A> editLastMatchExpression(){
            int index = matchExpressions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last matchExpressions. The list is empty.");
            return setNewMatchExpressionLike(index, buildMatchExpression(index));
    }

    public LabelSelectorFluent.MatchExpressionsNested<A> editMatchingMatchExpression(io.fabric8.kubernetes.api.builder.Predicate<LabelSelectorRequirementBuilder> predicate){
            int index = -1;
            for (int i=0;i<matchExpressions.size();i++) { 
            if (predicate.apply(matchExpressions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching matchExpressions. No match found.");
            return setNewMatchExpressionLike(index, buildMatchExpression(index));
    }

    public A addToMatchLabels(String key,String value){
            if(this.matchLabels == null && key != null && value != null) { this.matchLabels = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.matchLabels.put(key, value);} return (A)this;
    }

    public A addToMatchLabels(Map<String,String> map){
            if(this.matchLabels == null && map != null) { this.matchLabels = new LinkedHashMap<String,String>(); }
            if(map != null) { this.matchLabels.putAll(map);} return (A)this;
    }

    public A removeFromMatchLabels(String key){
            if(this.matchLabels == null) { return (A) this; }
            if(key != null && this.matchLabels != null) {this.matchLabels.remove(key);} return (A)this;
    }

    public A removeFromMatchLabels(Map<String,String> map){
            if(this.matchLabels == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.matchLabels != null){this.matchLabels.remove(key);}}} return (A)this;
    }

    public Map<String,String> getMatchLabels(){
            return this.matchLabels;
    }

    public A withMatchLabels(Map<String,String> matchLabels){
            if (matchLabels == null) { this.matchLabels =  new LinkedHashMap<String,String>();} else {this.matchLabels = new LinkedHashMap<String,String>(matchLabels);} return (A) this;
    }

    public Boolean hasMatchLabels(){
            return this.matchLabels != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LabelSelectorFluentImpl that = (LabelSelectorFluentImpl) o;
            if (matchExpressions != null ? !matchExpressions.equals(that.matchExpressions) :that.matchExpressions != null) return false;
            if (matchLabels != null ? !matchLabels.equals(that.matchLabels) :that.matchLabels != null) return false;
            return true;
    }


    public class MatchExpressionsNestedImpl<N> extends LabelSelectorRequirementFluentImpl<LabelSelectorFluent.MatchExpressionsNested<N>> implements LabelSelectorFluent.MatchExpressionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LabelSelectorRequirementBuilder builder;
        private final int index;
    
            MatchExpressionsNestedImpl(int index,LabelSelectorRequirement item){
                    this.index = index;
                    this.builder = new LabelSelectorRequirementBuilder(this, item);
            }
            MatchExpressionsNestedImpl(){
                    this.index = -1;
                    this.builder = new LabelSelectorRequirementBuilder(this);
            }
    
    public N and(){
            return (N) LabelSelectorFluentImpl.this.setToMatchExpressions(index, builder.build());
    }
    public N endMatchExpression(){
            return and();
    }

}


}
