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

public class DeploymentStatusFluentImpl<A extends DeploymentStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeploymentStatusFluent<A>{

    private Integer availableReplicas;
    private Integer collisionCount;
    private List<DeploymentConditionBuilder> conditions;
    private Long observedGeneration;
    private Integer readyReplicas;
    private Integer replicas;
    private Integer unavailableReplicas;
    private Integer updatedReplicas;

    public DeploymentStatusFluentImpl(){
    }
    public DeploymentStatusFluentImpl(DeploymentStatus instance){
            this.withAvailableReplicas(instance.getAvailableReplicas()); 
            this.withCollisionCount(instance.getCollisionCount()); 
            this.withConditions(instance.getConditions()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withReadyReplicas(instance.getReadyReplicas()); 
            this.withReplicas(instance.getReplicas()); 
            this.withUnavailableReplicas(instance.getUnavailableReplicas()); 
            this.withUpdatedReplicas(instance.getUpdatedReplicas()); 
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

    public Integer getCollisionCount(){
            return this.collisionCount;
    }

    public A withCollisionCount(Integer collisionCount){
            this.collisionCount=collisionCount; return (A) this;
    }

    public Boolean hasCollisionCount(){
            return this.collisionCount != null;
    }

    public A addToConditions(int index,DeploymentCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<DeploymentConditionBuilder>();}
            DeploymentConditionBuilder builder = new DeploymentConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,DeploymentCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<DeploymentConditionBuilder>();}
            DeploymentConditionBuilder builder = new DeploymentConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(DeploymentCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<DeploymentConditionBuilder>();}
            for (DeploymentCondition item : items) {DeploymentConditionBuilder builder = new DeploymentConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<DeploymentCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<DeploymentConditionBuilder>();}
            for (DeploymentCondition item : items) {DeploymentConditionBuilder builder = new DeploymentConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(DeploymentCondition... items){
            for (DeploymentCondition item : items) {DeploymentConditionBuilder builder = new DeploymentConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<DeploymentCondition> items){
            for (DeploymentCondition item : items) {DeploymentConditionBuilder builder = new DeploymentConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<DeploymentCondition> getConditions(){
            return build(conditions);
    }

    public List<DeploymentCondition> buildConditions(){
            return build(conditions);
    }

    public DeploymentCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public DeploymentCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public DeploymentCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public DeploymentCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<DeploymentConditionBuilder> predicate){
            for (DeploymentConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<DeploymentCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<DeploymentConditionBuilder>(); for (DeploymentCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<DeploymentConditionBuilder>();} return (A) this;
    }

    public A withConditions(DeploymentCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (DeploymentCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public DeploymentStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public DeploymentStatusFluent.ConditionsNested<A> addNewConditionLike(DeploymentCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public DeploymentStatusFluent.ConditionsNested<A> setNewConditionLike(int index,DeploymentCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public DeploymentStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public DeploymentStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public DeploymentStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public DeploymentStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<DeploymentConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
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

    public Integer getUnavailableReplicas(){
            return this.unavailableReplicas;
    }

    public A withUnavailableReplicas(Integer unavailableReplicas){
            this.unavailableReplicas=unavailableReplicas; return (A) this;
    }

    public Boolean hasUnavailableReplicas(){
            return this.unavailableReplicas != null;
    }

    public Integer getUpdatedReplicas(){
            return this.updatedReplicas;
    }

    public A withUpdatedReplicas(Integer updatedReplicas){
            this.updatedReplicas=updatedReplicas; return (A) this;
    }

    public Boolean hasUpdatedReplicas(){
            return this.updatedReplicas != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentStatusFluentImpl that = (DeploymentStatusFluentImpl) o;
            if (availableReplicas != null ? !availableReplicas.equals(that.availableReplicas) :that.availableReplicas != null) return false;
            if (collisionCount != null ? !collisionCount.equals(that.collisionCount) :that.collisionCount != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
            if (readyReplicas != null ? !readyReplicas.equals(that.readyReplicas) :that.readyReplicas != null) return false;
            if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
            if (unavailableReplicas != null ? !unavailableReplicas.equals(that.unavailableReplicas) :that.unavailableReplicas != null) return false;
            if (updatedReplicas != null ? !updatedReplicas.equals(that.updatedReplicas) :that.updatedReplicas != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends DeploymentConditionFluentImpl<DeploymentStatusFluent.ConditionsNested<N>> implements DeploymentStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,DeploymentCondition item){
                    this.index = index;
                    this.builder = new DeploymentConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new DeploymentConditionBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}


}
