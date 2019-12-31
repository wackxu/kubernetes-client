package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class StageInfoFluentImpl<A extends StageInfoFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements StageInfoFluent<A>{

    private Long durationMilliseconds;
    private String name;
    private String startTime;
    private List<StepInfoBuilder> steps;

    public StageInfoFluentImpl(){
    }
    public StageInfoFluentImpl(StageInfo instance){
            this.withDurationMilliseconds(instance.getDurationMilliseconds()); 
            this.withName(instance.getName()); 
            this.withStartTime(instance.getStartTime()); 
            this.withSteps(instance.getSteps()); 
    }

    public Long getDurationMilliseconds(){
            return this.durationMilliseconds;
    }

    public A withDurationMilliseconds(Long durationMilliseconds){
            this.durationMilliseconds=durationMilliseconds; return (A) this;
    }

    public Boolean hasDurationMilliseconds(){
            return this.durationMilliseconds != null;
    }

    public A withNewDurationMilliseconds(String arg1){
            return (A)withDurationMilliseconds(new Long(arg1));
    }

    public A withNewDurationMilliseconds(long arg1){
            return (A)withDurationMilliseconds(new Long(arg1));
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
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

    public A addToSteps(int index,StepInfo item){
            if (this.steps == null) {this.steps = new ArrayList<StepInfoBuilder>();}
            StepInfoBuilder builder = new StepInfoBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.steps.add(index >= 0 ? index : steps.size(), builder); return (A)this;
    }

    public A setToSteps(int index,StepInfo item){
            if (this.steps == null) {this.steps = new ArrayList<StepInfoBuilder>();}
            StepInfoBuilder builder = new StepInfoBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= steps.size()) { steps.add(builder); } else { steps.set(index, builder);}
             return (A)this;
    }

    public A addToSteps(StepInfo... items){
            if (this.steps == null) {this.steps = new ArrayList<StepInfoBuilder>();}
            for (StepInfo item : items) {StepInfoBuilder builder = new StepInfoBuilder(item);_visitables.add(builder);this.steps.add(builder);} return (A)this;
    }

    public A addAllToSteps(Collection<StepInfo> items){
            if (this.steps == null) {this.steps = new ArrayList<StepInfoBuilder>();}
            for (StepInfo item : items) {StepInfoBuilder builder = new StepInfoBuilder(item);_visitables.add(builder);this.steps.add(builder);} return (A)this;
    }

    public A removeFromSteps(StepInfo... items){
            for (StepInfo item : items) {StepInfoBuilder builder = new StepInfoBuilder(item);_visitables.remove(builder);if (this.steps != null) {this.steps.remove(builder);}} return (A)this;
    }

    public A removeAllFromSteps(Collection<StepInfo> items){
            for (StepInfo item : items) {StepInfoBuilder builder = new StepInfoBuilder(item);_visitables.remove(builder);if (this.steps != null) {this.steps.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildSteps instead.
 * @return The buildable object.
 */
@Deprecated public List<StepInfo> getSteps(){
            return build(steps);
    }

    public List<StepInfo> buildSteps(){
            return build(steps);
    }

    public StepInfo buildStep(int index){
            return this.steps.get(index).build();
    }

    public StepInfo buildFirstStep(){
            return this.steps.get(0).build();
    }

    public StepInfo buildLastStep(){
            return this.steps.get(steps.size() - 1).build();
    }

    public StepInfo buildMatchingStep(io.fabric8.kubernetes.api.builder.Predicate<StepInfoBuilder> predicate){
            for (StepInfoBuilder item: steps) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withSteps(List<StepInfo> steps){
            if (this.steps != null) { _visitables.removeAll(this.steps);}
            if (steps != null) {this.steps = new ArrayList<StepInfoBuilder>(); for (StepInfo item : steps){this.addToSteps(item);}} else { this.steps = new ArrayList<StepInfoBuilder>();} return (A) this;
    }

    public A withSteps(StepInfo... steps){
            if (this.steps != null) {this.steps.clear();}
            if (steps != null) {for (StepInfo item :steps){ this.addToSteps(item);}} return (A) this;
    }

    public Boolean hasSteps(){
            return steps != null && !steps.isEmpty();
    }

    public A addNewStep(Long durationMilliseconds,String name,String startTime){
            return (A)addToSteps(new StepInfo(durationMilliseconds, name, startTime));
    }

    public StageInfoFluent.StepsNested<A> addNewStep(){
            return new StepsNestedImpl();
    }

    public StageInfoFluent.StepsNested<A> addNewStepLike(StepInfo item){
            return new StepsNestedImpl(-1, item);
    }

    public StageInfoFluent.StepsNested<A> setNewStepLike(int index,StepInfo item){
            return new StepsNestedImpl(index, item);
    }

    public StageInfoFluent.StepsNested<A> editStep(int index){
            if (steps.size() <= index) throw new RuntimeException("Can't edit steps. Index exceeds size.");
            return setNewStepLike(index, buildStep(index));
    }

    public StageInfoFluent.StepsNested<A> editFirstStep(){
            if (steps.size() == 0) throw new RuntimeException("Can't edit first steps. The list is empty.");
            return setNewStepLike(0, buildStep(0));
    }

    public StageInfoFluent.StepsNested<A> editLastStep(){
            int index = steps.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last steps. The list is empty.");
            return setNewStepLike(index, buildStep(index));
    }

    public StageInfoFluent.StepsNested<A> editMatchingStep(io.fabric8.kubernetes.api.builder.Predicate<StepInfoBuilder> predicate){
            int index = -1;
            for (int i=0;i<steps.size();i++) { 
            if (predicate.apply(steps.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching steps. No match found.");
            return setNewStepLike(index, buildStep(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StageInfoFluentImpl that = (StageInfoFluentImpl) o;
            if (durationMilliseconds != null ? !durationMilliseconds.equals(that.durationMilliseconds) :that.durationMilliseconds != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (startTime != null ? !startTime.equals(that.startTime) :that.startTime != null) return false;
            if (steps != null ? !steps.equals(that.steps) :that.steps != null) return false;
            return true;
    }


    public class StepsNestedImpl<N> extends StepInfoFluentImpl<StageInfoFluent.StepsNested<N>> implements StageInfoFluent.StepsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StepInfoBuilder builder;
        private final int index;
    
            StepsNestedImpl(int index,StepInfo item){
                    this.index = index;
                    this.builder = new StepInfoBuilder(this, item);
            }
            StepsNestedImpl(){
                    this.index = -1;
                    this.builder = new StepInfoBuilder(this);
            }
    
    public N and(){
            return (N) StageInfoFluentImpl.this.setToSteps(index, builder.build());
    }
    public N endStep(){
            return and();
    }

}


}
