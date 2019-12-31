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

public class NodeSelectorTermFluentImpl<A extends NodeSelectorTermFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NodeSelectorTermFluent<A>{

    private List<NodeSelectorRequirementBuilder> matchExpressions;
    private List<NodeSelectorRequirementBuilder> matchFields;

    public NodeSelectorTermFluentImpl(){
    }
    public NodeSelectorTermFluentImpl(NodeSelectorTerm instance){
            this.withMatchExpressions(instance.getMatchExpressions()); 
            this.withMatchFields(instance.getMatchFields()); 
    }

    public A addToMatchExpressions(int index,NodeSelectorRequirement item){
            if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<NodeSelectorRequirementBuilder>();}
            NodeSelectorRequirementBuilder builder = new NodeSelectorRequirementBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.matchExpressions.add(index >= 0 ? index : matchExpressions.size(), builder); return (A)this;
    }

    public A setToMatchExpressions(int index,NodeSelectorRequirement item){
            if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<NodeSelectorRequirementBuilder>();}
            NodeSelectorRequirementBuilder builder = new NodeSelectorRequirementBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= matchExpressions.size()) { matchExpressions.add(builder); } else { matchExpressions.set(index, builder);}
             return (A)this;
    }

    public A addToMatchExpressions(NodeSelectorRequirement... items){
            if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<NodeSelectorRequirementBuilder>();}
            for (NodeSelectorRequirement item : items) {NodeSelectorRequirementBuilder builder = new NodeSelectorRequirementBuilder(item);_visitables.add(builder);this.matchExpressions.add(builder);} return (A)this;
    }

    public A addAllToMatchExpressions(Collection<NodeSelectorRequirement> items){
            if (this.matchExpressions == null) {this.matchExpressions = new ArrayList<NodeSelectorRequirementBuilder>();}
            for (NodeSelectorRequirement item : items) {NodeSelectorRequirementBuilder builder = new NodeSelectorRequirementBuilder(item);_visitables.add(builder);this.matchExpressions.add(builder);} return (A)this;
    }

    public A removeFromMatchExpressions(NodeSelectorRequirement... items){
            for (NodeSelectorRequirement item : items) {NodeSelectorRequirementBuilder builder = new NodeSelectorRequirementBuilder(item);_visitables.remove(builder);if (this.matchExpressions != null) {this.matchExpressions.remove(builder);}} return (A)this;
    }

    public A removeAllFromMatchExpressions(Collection<NodeSelectorRequirement> items){
            for (NodeSelectorRequirement item : items) {NodeSelectorRequirementBuilder builder = new NodeSelectorRequirementBuilder(item);_visitables.remove(builder);if (this.matchExpressions != null) {this.matchExpressions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildMatchExpressions instead.
 * @return The buildable object.
 */
@Deprecated public List<NodeSelectorRequirement> getMatchExpressions(){
            return build(matchExpressions);
    }

    public List<NodeSelectorRequirement> buildMatchExpressions(){
            return build(matchExpressions);
    }

    public NodeSelectorRequirement buildMatchExpression(int index){
            return this.matchExpressions.get(index).build();
    }

    public NodeSelectorRequirement buildFirstMatchExpression(){
            return this.matchExpressions.get(0).build();
    }

    public NodeSelectorRequirement buildLastMatchExpression(){
            return this.matchExpressions.get(matchExpressions.size() - 1).build();
    }

    public NodeSelectorRequirement buildMatchingMatchExpression(io.fabric8.kubernetes.api.builder.Predicate<NodeSelectorRequirementBuilder> predicate){
            for (NodeSelectorRequirementBuilder item: matchExpressions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withMatchExpressions(List<NodeSelectorRequirement> matchExpressions){
            if (this.matchExpressions != null) { _visitables.removeAll(this.matchExpressions);}
            if (matchExpressions != null) {this.matchExpressions = new ArrayList<NodeSelectorRequirementBuilder>(); for (NodeSelectorRequirement item : matchExpressions){this.addToMatchExpressions(item);}} else { this.matchExpressions = new ArrayList<NodeSelectorRequirementBuilder>();} return (A) this;
    }

    public A withMatchExpressions(NodeSelectorRequirement... matchExpressions){
            if (this.matchExpressions != null) {this.matchExpressions.clear();}
            if (matchExpressions != null) {for (NodeSelectorRequirement item :matchExpressions){ this.addToMatchExpressions(item);}} return (A) this;
    }

    public Boolean hasMatchExpressions(){
            return matchExpressions != null && !matchExpressions.isEmpty();
    }

    public NodeSelectorTermFluent.MatchExpressionsNested<A> addNewMatchExpression(){
            return new MatchExpressionsNestedImpl();
    }

    public NodeSelectorTermFluent.MatchExpressionsNested<A> addNewMatchExpressionLike(NodeSelectorRequirement item){
            return new MatchExpressionsNestedImpl(-1, item);
    }

    public NodeSelectorTermFluent.MatchExpressionsNested<A> setNewMatchExpressionLike(int index,NodeSelectorRequirement item){
            return new MatchExpressionsNestedImpl(index, item);
    }

    public NodeSelectorTermFluent.MatchExpressionsNested<A> editMatchExpression(int index){
            if (matchExpressions.size() <= index) throw new RuntimeException("Can't edit matchExpressions. Index exceeds size.");
            return setNewMatchExpressionLike(index, buildMatchExpression(index));
    }

    public NodeSelectorTermFluent.MatchExpressionsNested<A> editFirstMatchExpression(){
            if (matchExpressions.size() == 0) throw new RuntimeException("Can't edit first matchExpressions. The list is empty.");
            return setNewMatchExpressionLike(0, buildMatchExpression(0));
    }

    public NodeSelectorTermFluent.MatchExpressionsNested<A> editLastMatchExpression(){
            int index = matchExpressions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last matchExpressions. The list is empty.");
            return setNewMatchExpressionLike(index, buildMatchExpression(index));
    }

    public NodeSelectorTermFluent.MatchExpressionsNested<A> editMatchingMatchExpression(io.fabric8.kubernetes.api.builder.Predicate<NodeSelectorRequirementBuilder> predicate){
            int index = -1;
            for (int i=0;i<matchExpressions.size();i++) { 
            if (predicate.apply(matchExpressions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching matchExpressions. No match found.");
            return setNewMatchExpressionLike(index, buildMatchExpression(index));
    }

    public A addToMatchFields(int index,NodeSelectorRequirement item){
            if (this.matchFields == null) {this.matchFields = new ArrayList<NodeSelectorRequirementBuilder>();}
            NodeSelectorRequirementBuilder builder = new NodeSelectorRequirementBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.matchFields.add(index >= 0 ? index : matchFields.size(), builder); return (A)this;
    }

    public A setToMatchFields(int index,NodeSelectorRequirement item){
            if (this.matchFields == null) {this.matchFields = new ArrayList<NodeSelectorRequirementBuilder>();}
            NodeSelectorRequirementBuilder builder = new NodeSelectorRequirementBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= matchFields.size()) { matchFields.add(builder); } else { matchFields.set(index, builder);}
             return (A)this;
    }

    public A addToMatchFields(NodeSelectorRequirement... items){
            if (this.matchFields == null) {this.matchFields = new ArrayList<NodeSelectorRequirementBuilder>();}
            for (NodeSelectorRequirement item : items) {NodeSelectorRequirementBuilder builder = new NodeSelectorRequirementBuilder(item);_visitables.add(builder);this.matchFields.add(builder);} return (A)this;
    }

    public A addAllToMatchFields(Collection<NodeSelectorRequirement> items){
            if (this.matchFields == null) {this.matchFields = new ArrayList<NodeSelectorRequirementBuilder>();}
            for (NodeSelectorRequirement item : items) {NodeSelectorRequirementBuilder builder = new NodeSelectorRequirementBuilder(item);_visitables.add(builder);this.matchFields.add(builder);} return (A)this;
    }

    public A removeFromMatchFields(NodeSelectorRequirement... items){
            for (NodeSelectorRequirement item : items) {NodeSelectorRequirementBuilder builder = new NodeSelectorRequirementBuilder(item);_visitables.remove(builder);if (this.matchFields != null) {this.matchFields.remove(builder);}} return (A)this;
    }

    public A removeAllFromMatchFields(Collection<NodeSelectorRequirement> items){
            for (NodeSelectorRequirement item : items) {NodeSelectorRequirementBuilder builder = new NodeSelectorRequirementBuilder(item);_visitables.remove(builder);if (this.matchFields != null) {this.matchFields.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildMatchFields instead.
 * @return The buildable object.
 */
@Deprecated public List<NodeSelectorRequirement> getMatchFields(){
            return build(matchFields);
    }

    public List<NodeSelectorRequirement> buildMatchFields(){
            return build(matchFields);
    }

    public NodeSelectorRequirement buildMatchField(int index){
            return this.matchFields.get(index).build();
    }

    public NodeSelectorRequirement buildFirstMatchField(){
            return this.matchFields.get(0).build();
    }

    public NodeSelectorRequirement buildLastMatchField(){
            return this.matchFields.get(matchFields.size() - 1).build();
    }

    public NodeSelectorRequirement buildMatchingMatchField(io.fabric8.kubernetes.api.builder.Predicate<NodeSelectorRequirementBuilder> predicate){
            for (NodeSelectorRequirementBuilder item: matchFields) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withMatchFields(List<NodeSelectorRequirement> matchFields){
            if (this.matchFields != null) { _visitables.removeAll(this.matchFields);}
            if (matchFields != null) {this.matchFields = new ArrayList<NodeSelectorRequirementBuilder>(); for (NodeSelectorRequirement item : matchFields){this.addToMatchFields(item);}} else { this.matchFields = new ArrayList<NodeSelectorRequirementBuilder>();} return (A) this;
    }

    public A withMatchFields(NodeSelectorRequirement... matchFields){
            if (this.matchFields != null) {this.matchFields.clear();}
            if (matchFields != null) {for (NodeSelectorRequirement item :matchFields){ this.addToMatchFields(item);}} return (A) this;
    }

    public Boolean hasMatchFields(){
            return matchFields != null && !matchFields.isEmpty();
    }

    public NodeSelectorTermFluent.MatchFieldsNested<A> addNewMatchField(){
            return new MatchFieldsNestedImpl();
    }

    public NodeSelectorTermFluent.MatchFieldsNested<A> addNewMatchFieldLike(NodeSelectorRequirement item){
            return new MatchFieldsNestedImpl(-1, item);
    }

    public NodeSelectorTermFluent.MatchFieldsNested<A> setNewMatchFieldLike(int index,NodeSelectorRequirement item){
            return new MatchFieldsNestedImpl(index, item);
    }

    public NodeSelectorTermFluent.MatchFieldsNested<A> editMatchField(int index){
            if (matchFields.size() <= index) throw new RuntimeException("Can't edit matchFields. Index exceeds size.");
            return setNewMatchFieldLike(index, buildMatchField(index));
    }

    public NodeSelectorTermFluent.MatchFieldsNested<A> editFirstMatchField(){
            if (matchFields.size() == 0) throw new RuntimeException("Can't edit first matchFields. The list is empty.");
            return setNewMatchFieldLike(0, buildMatchField(0));
    }

    public NodeSelectorTermFluent.MatchFieldsNested<A> editLastMatchField(){
            int index = matchFields.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last matchFields. The list is empty.");
            return setNewMatchFieldLike(index, buildMatchField(index));
    }

    public NodeSelectorTermFluent.MatchFieldsNested<A> editMatchingMatchField(io.fabric8.kubernetes.api.builder.Predicate<NodeSelectorRequirementBuilder> predicate){
            int index = -1;
            for (int i=0;i<matchFields.size();i++) { 
            if (predicate.apply(matchFields.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching matchFields. No match found.");
            return setNewMatchFieldLike(index, buildMatchField(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeSelectorTermFluentImpl that = (NodeSelectorTermFluentImpl) o;
            if (matchExpressions != null ? !matchExpressions.equals(that.matchExpressions) :that.matchExpressions != null) return false;
            if (matchFields != null ? !matchFields.equals(that.matchFields) :that.matchFields != null) return false;
            return true;
    }


    public class MatchExpressionsNestedImpl<N> extends NodeSelectorRequirementFluentImpl<NodeSelectorTermFluent.MatchExpressionsNested<N>> implements NodeSelectorTermFluent.MatchExpressionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeSelectorRequirementBuilder builder;
        private final int index;
    
            MatchExpressionsNestedImpl(int index,NodeSelectorRequirement item){
                    this.index = index;
                    this.builder = new NodeSelectorRequirementBuilder(this, item);
            }
            MatchExpressionsNestedImpl(){
                    this.index = -1;
                    this.builder = new NodeSelectorRequirementBuilder(this);
            }
    
    public N and(){
            return (N) NodeSelectorTermFluentImpl.this.setToMatchExpressions(index, builder.build());
    }
    public N endMatchExpression(){
            return and();
    }

}
    public class MatchFieldsNestedImpl<N> extends NodeSelectorRequirementFluentImpl<NodeSelectorTermFluent.MatchFieldsNested<N>> implements NodeSelectorTermFluent.MatchFieldsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeSelectorRequirementBuilder builder;
        private final int index;
    
            MatchFieldsNestedImpl(int index,NodeSelectorRequirement item){
                    this.index = index;
                    this.builder = new NodeSelectorRequirementBuilder(this, item);
            }
            MatchFieldsNestedImpl(){
                    this.index = -1;
                    this.builder = new NodeSelectorRequirementBuilder(this);
            }
    
    public N and(){
            return (N) NodeSelectorTermFluentImpl.this.setToMatchFields(index, builder.build());
    }
    public N endMatchField(){
            return and();
    }

}


}
