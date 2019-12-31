package io.fabric8.kubernetes.api.model.apps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class ReplicaSetStatusFluentImpl<A extends ReplicaSetStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ReplicaSetStatusFluent<A>{

    private Integer availableReplicas;
    private List<ReplicaSetConditionBuilder> conditions;
    private Integer fullyLabeledReplicas;
    private Long observedGeneration;
    private Integer readyReplicas;
    private Integer replicas;

    public ReplicaSetStatusFluentImpl(){
    }
    public ReplicaSetStatusFluentImpl(ReplicaSetStatus instance){
            this.withAvailableReplicas(instance.getAvailableReplicas()); 
            this.withConditions(instance.getConditions()); 
            this.withFullyLabeledReplicas(instance.getFullyLabeledReplicas()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withReadyReplicas(instance.getReadyReplicas()); 
            this.withReplicas(instance.getReplicas()); 
    }

    public Integer getAvailableReplicas(){
            return this.availableReplicas;
    }

    public A withAvailableReplicas(Integer availableReplicas){
            this.availableReplicas=availableReplicas; return (A) this;
    }

    public Boolean hasAvailableReplicas(){
            return this.availableReplicas != null;
    }

    public A addToConditions(int index,ReplicaSetCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<ReplicaSetConditionBuilder>();}
            ReplicaSetConditionBuilder builder = new ReplicaSetConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,ReplicaSetCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<ReplicaSetConditionBuilder>();}
            ReplicaSetConditionBuilder builder = new ReplicaSetConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(ReplicaSetCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<ReplicaSetConditionBuilder>();}
            for (ReplicaSetCondition item : items) {ReplicaSetConditionBuilder builder = new ReplicaSetConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<ReplicaSetCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<ReplicaSetConditionBuilder>();}
            for (ReplicaSetCondition item : items) {ReplicaSetConditionBuilder builder = new ReplicaSetConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(ReplicaSetCondition... items){
            for (ReplicaSetCondition item : items) {ReplicaSetConditionBuilder builder = new ReplicaSetConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<ReplicaSetCondition> items){
            for (ReplicaSetCondition item : items) {ReplicaSetConditionBuilder builder = new ReplicaSetConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<ReplicaSetCondition> getConditions(){
            return build(conditions);
    }

    public List<ReplicaSetCondition> buildConditions(){
            return build(conditions);
    }

    public ReplicaSetCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public ReplicaSetCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public ReplicaSetCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public ReplicaSetCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<ReplicaSetConditionBuilder> predicate){
            for (ReplicaSetConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<ReplicaSetCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<ReplicaSetConditionBuilder>(); for (ReplicaSetCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<ReplicaSetConditionBuilder>();} return (A) this;
    }

    public A withConditions(ReplicaSetCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (ReplicaSetCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)addToConditions(new ReplicaSetCondition(lastTransitionTime, message, reason, status, type));
    }

    public ReplicaSetStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public ReplicaSetStatusFluent.ConditionsNested<A> addNewConditionLike(ReplicaSetCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public ReplicaSetStatusFluent.ConditionsNested<A> setNewConditionLike(int index,ReplicaSetCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public ReplicaSetStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public ReplicaSetStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public ReplicaSetStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public ReplicaSetStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<ReplicaSetConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public Integer getFullyLabeledReplicas(){
            return this.fullyLabeledReplicas;
    }

    public A withFullyLabeledReplicas(Integer fullyLabeledReplicas){
            this.fullyLabeledReplicas=fullyLabeledReplicas; return (A) this;
    }

    public Boolean hasFullyLabeledReplicas(){
            return this.fullyLabeledReplicas != null;
    }

    public Long getObservedGeneration(){
            return this.observedGeneration;
    }

    public A withObservedGeneration(Long observedGeneration){
            this.observedGeneration=observedGeneration; return (A) this;
    }

    public Boolean hasObservedGeneration(){
            return this.observedGeneration != null;
    }

    public A withNewObservedGeneration(String arg1){
            return (A)withObservedGeneration(new Long(arg1));
    }

    public A withNewObservedGeneration(long arg1){
            return (A)withObservedGeneration(new Long(arg1));
    }

    public Integer getReadyReplicas(){
            return this.readyReplicas;
    }

    public A withReadyReplicas(Integer readyReplicas){
            this.readyReplicas=readyReplicas; return (A) this;
    }

    public Boolean hasReadyReplicas(){
            return this.readyReplicas != null;
    }

    public Integer getReplicas(){
            return this.replicas;
    }

    public A withReplicas(Integer replicas){
            this.replicas=replicas; return (A) this;
    }

    public Boolean hasReplicas(){
            return this.replicas != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ReplicaSetStatusFluentImpl that = (ReplicaSetStatusFluentImpl) o;
            if (availableReplicas != null ? !availableReplicas.equals(that.availableReplicas) :that.availableReplicas != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (fullyLabeledReplicas != null ? !fullyLabeledReplicas.equals(that.fullyLabeledReplicas) :that.fullyLabeledReplicas != null) return false;
            if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
            if (readyReplicas != null ? !readyReplicas.equals(that.readyReplicas) :that.readyReplicas != null) return false;
            if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends ReplicaSetConditionFluentImpl<ReplicaSetStatusFluent.ConditionsNested<N>> implements ReplicaSetStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicaSetConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,ReplicaSetCondition item){
                    this.index = index;
                    this.builder = new ReplicaSetConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new ReplicaSetConditionBuilder(this);
            }
    
    public N and(){
            return (N) ReplicaSetStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}


}
