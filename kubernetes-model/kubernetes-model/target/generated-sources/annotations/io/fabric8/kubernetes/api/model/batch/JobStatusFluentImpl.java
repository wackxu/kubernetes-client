package io.fabric8.kubernetes.api.model.batch;

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
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class JobStatusFluentImpl<A extends JobStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements JobStatusFluent<A>{

    private Integer active;
    private String completionTime;
    private List<JobConditionBuilder> conditions;
    private Integer failed;
    private String startTime;
    private Integer succeeded;

    public JobStatusFluentImpl(){
    }
    public JobStatusFluentImpl(JobStatus instance){
            this.withActive(instance.getActive()); 
            this.withCompletionTime(instance.getCompletionTime()); 
            this.withConditions(instance.getConditions()); 
            this.withFailed(instance.getFailed()); 
            this.withStartTime(instance.getStartTime()); 
            this.withSucceeded(instance.getSucceeded()); 
    }

    public Integer getActive(){
            return this.active;
    }

    public A withActive(Integer active){
            this.active=active; return (A) this;
    }

    public Boolean hasActive(){
            return this.active != null;
    }

    public String getCompletionTime(){
            return this.completionTime;
    }

    public A withCompletionTime(String completionTime){
            this.completionTime=completionTime; return (A) this;
    }

    public Boolean hasCompletionTime(){
            return this.completionTime != null;
    }

    public A addToConditions(int index,JobCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<JobConditionBuilder>();}
            JobConditionBuilder builder = new JobConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,JobCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<JobConditionBuilder>();}
            JobConditionBuilder builder = new JobConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(JobCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<JobConditionBuilder>();}
            for (JobCondition item : items) {JobConditionBuilder builder = new JobConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<JobCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<JobConditionBuilder>();}
            for (JobCondition item : items) {JobConditionBuilder builder = new JobConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(JobCondition... items){
            for (JobCondition item : items) {JobConditionBuilder builder = new JobConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<JobCondition> items){
            for (JobCondition item : items) {JobConditionBuilder builder = new JobConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<JobCondition> getConditions(){
            return build(conditions);
    }

    public List<JobCondition> buildConditions(){
            return build(conditions);
    }

    public JobCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public JobCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public JobCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public JobCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<JobConditionBuilder> predicate){
            for (JobConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<JobCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<JobConditionBuilder>(); for (JobCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<JobConditionBuilder>();} return (A) this;
    }

    public A withConditions(JobCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (JobCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public JobStatusFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public JobStatusFluent.ConditionsNested<A> addNewConditionLike(JobCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public JobStatusFluent.ConditionsNested<A> setNewConditionLike(int index,JobCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public JobStatusFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public JobStatusFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public JobStatusFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public JobStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<JobConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public Integer getFailed(){
            return this.failed;
    }

    public A withFailed(Integer failed){
            this.failed=failed; return (A) this;
    }

    public Boolean hasFailed(){
            return this.failed != null;
    }

    public String getStartTime(){
            return this.startTime;
    }

    public A withStartTime(String startTime){
            this.startTime=startTime; return (A) this;
    }

    public Boolean hasStartTime(){
            return this.startTime != null;
    }

    public Integer getSucceeded(){
            return this.succeeded;
    }

    public A withSucceeded(Integer succeeded){
            this.succeeded=succeeded; return (A) this;
    }

    public Boolean hasSucceeded(){
            return this.succeeded != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JobStatusFluentImpl that = (JobStatusFluentImpl) o;
            if (active != null ? !active.equals(that.active) :that.active != null) return false;
            if (completionTime != null ? !completionTime.equals(that.completionTime) :that.completionTime != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (failed != null ? !failed.equals(that.failed) :that.failed != null) return false;
            if (startTime != null ? !startTime.equals(that.startTime) :that.startTime != null) return false;
            if (succeeded != null ? !succeeded.equals(that.succeeded) :that.succeeded != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends JobConditionFluentImpl<JobStatusFluent.ConditionsNested<N>> implements JobStatusFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,JobCondition item){
                    this.index = index;
                    this.builder = new JobConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new JobConditionBuilder(this);
            }
    
    public N and(){
            return (N) JobStatusFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}


}
