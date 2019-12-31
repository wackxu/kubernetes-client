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

public class DaemonSetStatusFluentImpl<A extends DaemonSetStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DaemonSetStatusFluent<A>{

    private Integer collisionCount;
    private List<DaemonSetConditionBuilder> conditions;
    private Integer currentNumberScheduled;
    private Integer desiredNumberScheduled;
    private Integer numberAvailable;
    private Integer numberMisscheduled;
    private Integer numberReady;
    private Integer numberUnavailable;
    private Long observedGeneration;
    private Integer updatedNumberScheduled;

    public DaemonSetStatusFluentImpl(){
    }
    public DaemonSetStatusFluentImpl(DaemonSetStatus instance){
            this.withCollisionCount(instance.getCollisionCount()); 
            this.withConditions(instance.getConditions()); 
            this.withCurrentNumberScheduled(instance.getCurrentNumberScheduled()); 
            this.withDesiredNumberScheduled(instance.getDesiredNumberScheduled()); 
            this.withNumberAvailable(instance.getNumberAvailable()); 
            this.withNumberMisscheduled(instance.getNumberMisscheduled()); 
            this.withNumberReady(instance.getNumberReady()); 
            this.withNumberUnavailable(instance.getNumberUnavailable()); 
            this.withObservedGeneration(instance.getObservedGeneration()); 
            this.withUpdatedNumberScheduled(instance.getUpdatedNumberScheduled()); 
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

    public A addToConditions(int index,DaemonSetCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<DaemonSetConditionBuilder>();}
            DaemonSetConditionBuilder builder = new DaemonSetConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,DaemonSetCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<DaemonSetConditionBuilder>();}
            DaemonSetConditionBuilder builder = new DaemonSetConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(DaemonSetCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<DaemonSetConditionBuilder>();}
            for (DaemonSetCondition item : items) {DaemonSetConditionBuilder builder = new DaemonSetConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<DaemonSetCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<DaemonSetConditionBuilder>();}
            for (DaemonSetCondition item : items) {DaemonSetConditionBuilder builder = new DaemonSetConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(DaemonSetCondition... items){
            for (DaemonSetCondition item : items) {DaemonSetConditionBuilder builder = new DaemonSetConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<DaemonSetCondition> items){
            for (DaemonSetCondition item : items) {DaemonSetConditionBuilder builder = new DaemonSetConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<DaemonSetCondition> getConditions(){
            return build(conditions);
    }

    public List<DaemonSetCondition> buildConditions(){
            return build(conditions);
    }

    public DaemonSetCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public DaemonSetCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public DaemonSetCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public DaemonSetCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<DaemonSetConditionBuilder> predicate){
            for (DaemonSetConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<DaemonSetCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<DaemonSetConditionBuilder>(); for (DaemonSetCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<DaemonSetConditionBuilder>();} return (A) this;
    }

    public A withConditions(DaemonSetCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (DaemonSetCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type){
            return (A)addToConditions(new DaemonSetCondition(lastTransitionTime, message, reason, status, type));
    }

    public DaemonSetStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public DaemonSetStatusFluent.ConditionsNested<A> addNewConditionLike(DaemonSetCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public DaemonSetStatusFluent.ConditionsNested<A> setNewConditionLike(int index,DaemonSetCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public DaemonSetStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public DaemonSetStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public DaemonSetStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public DaemonSetStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<DaemonSetConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public Integer getCurrentNumberScheduled(){
            return this.currentNumberScheduled;
    }

    public A withCurrentNumberScheduled(Integer currentNumberScheduled){
            this.currentNumberScheduled=currentNumberScheduled; return (A) this;
    }

    public Boolean hasCurrentNumberScheduled(){
            return this.currentNumberScheduled != null;
    }

    public Integer getDesiredNumberScheduled(){
            return this.desiredNumberScheduled;
    }

    public A withDesiredNumberScheduled(Integer desiredNumberScheduled){
            this.desiredNumberScheduled=desiredNumberScheduled; return (A) this;
    }

    public Boolean hasDesiredNumberScheduled(){
            return this.desiredNumberScheduled != null;
    }

    public Integer getNumberAvailable(){
            return this.numberAvailable;
    }

    public A withNumberAvailable(Integer numberAvailable){
            this.numberAvailable=numberAvailable; return (A) this;
    }

    public Boolean hasNumberAvailable(){
            return this.numberAvailable != null;
    }

    public Integer getNumberMisscheduled(){
            return this.numberMisscheduled;
    }

    public A withNumberMisscheduled(Integer numberMisscheduled){
            this.numberMisscheduled=numberMisscheduled; return (A) this;
    }

    public Boolean hasNumberMisscheduled(){
            return this.numberMisscheduled != null;
    }

    public Integer getNumberReady(){
            return this.numberReady;
    }

    public A withNumberReady(Integer numberReady){
            this.numberReady=numberReady; return (A) this;
    }

    public Boolean hasNumberReady(){
            return this.numberReady != null;
    }

    public Integer getNumberUnavailable(){
            return this.numberUnavailable;
    }

    public A withNumberUnavailable(Integer numberUnavailable){
            this.numberUnavailable=numberUnavailable; return (A) this;
    }

    public Boolean hasNumberUnavailable(){
            return this.numberUnavailable != null;
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

    public Integer getUpdatedNumberScheduled(){
            return this.updatedNumberScheduled;
    }

    public A withUpdatedNumberScheduled(Integer updatedNumberScheduled){
            this.updatedNumberScheduled=updatedNumberScheduled; return (A) this;
    }

    public Boolean hasUpdatedNumberScheduled(){
            return this.updatedNumberScheduled != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DaemonSetStatusFluentImpl that = (DaemonSetStatusFluentImpl) o;
            if (collisionCount != null ? !collisionCount.equals(that.collisionCount) :that.collisionCount != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (currentNumberScheduled != null ? !currentNumberScheduled.equals(that.currentNumberScheduled) :that.currentNumberScheduled != null) return false;
            if (desiredNumberScheduled != null ? !desiredNumberScheduled.equals(that.desiredNumberScheduled) :that.desiredNumberScheduled != null) return false;
            if (numberAvailable != null ? !numberAvailable.equals(that.numberAvailable) :that.numberAvailable != null) return false;
            if (numberMisscheduled != null ? !numberMisscheduled.equals(that.numberMisscheduled) :that.numberMisscheduled != null) return false;
            if (numberReady != null ? !numberReady.equals(that.numberReady) :that.numberReady != null) return false;
            if (numberUnavailable != null ? !numberUnavailable.equals(that.numberUnavailable) :that.numberUnavailable != null) return false;
            if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
            if (updatedNumberScheduled != null ? !updatedNumberScheduled.equals(that.updatedNumberScheduled) :that.updatedNumberScheduled != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends DaemonSetConditionFluentImpl<DaemonSetStatusFluent.ConditionsNested<N>> implements DaemonSetStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DaemonSetConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,DaemonSetCondition item){
                    this.index = index;
                    this.builder = new DaemonSetConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new DaemonSetConditionBuilder(this);
            }
    
    public N and(){
            return (N) DaemonSetStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}


}
