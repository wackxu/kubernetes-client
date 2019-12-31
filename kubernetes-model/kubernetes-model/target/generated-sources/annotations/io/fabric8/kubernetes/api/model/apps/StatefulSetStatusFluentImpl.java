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

public class StatefulSetStatusFluentImpl<A extends StatefulSetStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements StatefulSetStatusFluent<A>{

    private Integer collisionCount;
    private List<StatefulSetConditionBuilder> conditions;
    private Integer currentReplicas;
    private String currentRevision;
    private Long observedGeneration;
    private Integer readyReplicas;
    private Integer replicas;
    private String updateRevision;
    private Integer updatedReplicas;

    public StatefulSetStatusFluentImpl(){
    }
    public StatefulSetStatusFluentImpl(StatefulSetStatus instance){
            this.withCollisionCount(instance.getCollisionCount()); 
            this.withConditions(instance.getConditions()); 
            this.withCurrentReplicas(instance.getCurrentReplicas()); 
            this.withCurrentRevision(instance.getCurrentRevision()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withReadyReplicas(instance.getReadyReplicas()); 
            this.withReplicas(instance.getReplicas()); 
            this.withUpdateRevision(instance.getUpdateRevision()); 
            this.withUpdatedReplicas(instance.getUpdatedReplicas()); 
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

    public A addToConditions(int index,StatefulSetCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<StatefulSetConditionBuilder>();}
            StatefulSetConditionBuilder builder = new StatefulSetConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,StatefulSetCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<StatefulSetConditionBuilder>();}
            StatefulSetConditionBuilder builder = new StatefulSetConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(StatefulSetCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<StatefulSetConditionBuilder>();}
            for (StatefulSetCondition item : items) {StatefulSetConditionBuilder builder = new StatefulSetConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<StatefulSetCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<StatefulSetConditionBuilder>();}
            for (StatefulSetCondition item : items) {StatefulSetConditionBuilder builder = new StatefulSetConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(StatefulSetCondition... items){
            for (StatefulSetCondition item : items) {StatefulSetConditionBuilder builder = new StatefulSetConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<StatefulSetCondition> items){
            for (StatefulSetCondition item : items) {StatefulSetConditionBuilder builder = new StatefulSetConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<StatefulSetCondition> getConditions(){
            return build(conditions);
    }

    public List<StatefulSetCondition> buildConditions(){
            return build(conditions);
    }

    public StatefulSetCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public StatefulSetCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public StatefulSetCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public StatefulSetCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<StatefulSetConditionBuilder> predicate){
            for (StatefulSetConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<StatefulSetCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<StatefulSetConditionBuilder>(); for (StatefulSetCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<StatefulSetConditionBuilder>();} return (A) this;
    }

    public A withConditions(StatefulSetCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (StatefulSetCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)addToConditions(new StatefulSetCondition(lastTransitionTime, message, reason, status, type));
    }

    public StatefulSetStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public StatefulSetStatusFluent.ConditionsNested<A> addNewConditionLike(StatefulSetCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public StatefulSetStatusFluent.ConditionsNested<A> setNewConditionLike(int index,StatefulSetCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public StatefulSetStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public StatefulSetStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public StatefulSetStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public StatefulSetStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<StatefulSetConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public Integer getCurrentReplicas(){
            return this.currentReplicas;
    }

    public A withCurrentReplicas(Integer currentReplicas){
            this.currentReplicas=currentReplicas; return (A) this;
    }

    public Boolean hasCurrentReplicas(){
            return this.currentReplicas != null;
    }

    public String getCurrentRevision(){
            return this.currentRevision;
    }

    public A withCurrentRevision(String currentRevision){
            this.currentRevision=currentRevision; return (A) this;
    }

    public Boolean hasCurrentRevision(){
            return this.currentRevision != null;
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

    public String getUpdateRevision(){
            return this.updateRevision;
    }

    public A withUpdateRevision(String updateRevision){
            this.updateRevision=updateRevision; return (A) this;
    }

    public Boolean hasUpdateRevision(){
            return this.updateRevision != null;
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
            StatefulSetStatusFluentImpl that = (StatefulSetStatusFluentImpl) o;
            if (collisionCount != null ? !collisionCount.equals(that.collisionCount) :that.collisionCount != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (currentReplicas != null ? !currentReplicas.equals(that.currentReplicas) :that.currentReplicas != null) return false;
            if (currentRevision != null ? !currentRevision.equals(that.currentRevision) :that.currentRevision != null) return false;
            if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
            if (readyReplicas != null ? !readyReplicas.equals(that.readyReplicas) :that.readyReplicas != null) return false;
            if (replicas != null ? !replicas.equals(that.replicas) :that.replicas != null) return false;
            if (updateRevision != null ? !updateRevision.equals(that.updateRevision) :that.updateRevision != null) return false;
            if (updatedReplicas != null ? !updatedReplicas.equals(that.updatedReplicas) :that.updatedReplicas != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends StatefulSetConditionFluentImpl<StatefulSetStatusFluent.ConditionsNested<N>> implements StatefulSetStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,StatefulSetCondition item){
                    this.index = index;
                    this.builder = new StatefulSetConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new StatefulSetConditionBuilder(this);
            }
    
    public N and(){
            return (N) StatefulSetStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}


}
