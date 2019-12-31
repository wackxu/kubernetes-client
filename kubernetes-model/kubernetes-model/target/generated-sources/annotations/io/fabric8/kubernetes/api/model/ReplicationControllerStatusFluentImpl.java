package io.fabric8.kubernetes.api.model;

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

public class ReplicationControllerStatusFluentImpl<A extends ReplicationControllerStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ReplicationControllerStatusFluent<A>{

    private Integer availableReplicas;
    private List<ReplicationControllerConditionBuilder> conditions;
    private Integer fullyLabeledReplicas;
    private Long observedGeneration;
    private Integer readyReplicas;
    private Integer replicas;

    public ReplicationControllerStatusFluentImpl(){
    }
    public ReplicationControllerStatusFluentImpl(ReplicationControllerStatus instance){
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

    public A addToConditions(int index,ReplicationControllerCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<ReplicationControllerConditionBuilder>();}
            ReplicationControllerConditionBuilder builder = new ReplicationControllerConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,ReplicationControllerCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<ReplicationControllerConditionBuilder>();}
            ReplicationControllerConditionBuilder builder = new ReplicationControllerConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(ReplicationControllerCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<ReplicationControllerConditionBuilder>();}
            for (ReplicationControllerCondition item : items) {ReplicationControllerConditionBuilder builder = new ReplicationControllerConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<ReplicationControllerCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<ReplicationControllerConditionBuilder>();}
            for (ReplicationControllerCondition item : items) {ReplicationControllerConditionBuilder builder = new ReplicationControllerConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(ReplicationControllerCondition... items){
            for (ReplicationControllerCondition item : items) {ReplicationControllerConditionBuilder builder = new ReplicationControllerConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<ReplicationControllerCondition> items){
            for (ReplicationControllerCondition item : items) {ReplicationControllerConditionBuilder builder = new ReplicationControllerConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<ReplicationControllerCondition> getConditions(){
            return build(conditions);
    }

    public List<ReplicationControllerCondition> buildConditions(){
            return build(conditions);
    }

    public ReplicationControllerCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public ReplicationControllerCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public ReplicationControllerCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public ReplicationControllerCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<ReplicationControllerConditionBuilder> predicate){
            for (ReplicationControllerConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<ReplicationControllerCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<ReplicationControllerConditionBuilder>(); for (ReplicationControllerCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<ReplicationControllerConditionBuilder>();} return (A) this;
    }

    public A withConditions(ReplicationControllerCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (ReplicationControllerCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)addToConditions(new ReplicationControllerCondition(lastTransitionTime, message, reason, status, type));
    }

    public ReplicationControllerStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public ReplicationControllerStatusFluent.ConditionsNested<A> addNewConditionLike(ReplicationControllerCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public ReplicationControllerStatusFluent.ConditionsNested<A> setNewConditionLike(int index,ReplicationControllerCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public ReplicationControllerStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public ReplicationControllerStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public ReplicationControllerStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public ReplicationControllerStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<ReplicationControllerConditionBuilder> predicate){
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
            ReplicationControllerStatusFluentImpl that = (ReplicationControllerStatusFluentImpl) o;
            if (availableReplicas != null ? !availableReplicas.equals(that.availableReplicas) :that.availableReplicas != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (fullyLabeledReplicas != null ? !fullyLabeledReplicas.equals(that.fullyLabeledReplicas) :that.fullyLabeledReplicas != null) return false;
            if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
            if (readyReplicas != null ? !readyReplicas.equals(that.readyReplicas) :that.readyReplicas != null) return false;
            if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends ReplicationControllerConditionFluentImpl<ReplicationControllerStatusFluent.ConditionsNested<N>> implements ReplicationControllerStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ReplicationControllerConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,ReplicationControllerCondition item){
                    this.index = index;
                    this.builder = new ReplicationControllerConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new ReplicationControllerConditionBuilder(this);
            }
    
    public N and(){
            return (N) ReplicationControllerStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}


}
