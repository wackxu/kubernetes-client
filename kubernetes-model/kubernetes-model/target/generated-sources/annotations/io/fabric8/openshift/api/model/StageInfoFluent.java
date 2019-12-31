package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface StageInfoFluent<A extends StageInfoFluent<A>> extends Fluent<A>{


    public Long getDurationMilliseconds();
    public A withDurationMilliseconds(Long durationMilliseconds);
    public Boolean hasDurationMilliseconds();
    public A withNewDurationMilliseconds(String arg1);
    public A withNewDurationMilliseconds(long arg1);
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public String getStartTime();
    public A withStartTime(String startTime);
    public Boolean hasStartTime();
    public A addToSteps(int index,StepInfo item);
    public A setToSteps(int index,StepInfo item);
    public A addToSteps(StepInfo... items);
    public A addAllToSteps(Collection<StepInfo> items);
    public A removeFromSteps(StepInfo... items);
    public A removeAllFromSteps(Collection<StepInfo> items);
    
/**
 * This method has been deprecated, please use method buildSteps instead.
 * @return The buildable object.
 */
@Deprecated public List<StepInfo> getSteps();
    public List<StepInfo> buildSteps();
    public StepInfo buildStep(int index);
    public StepInfo buildFirstStep();
    public StepInfo buildLastStep();
    public StepInfo buildMatchingStep(io.fabric8.kubernetes.api.builder.Predicate<StepInfoBuilder> predicate);
    public A withSteps(List<StepInfo> steps);
    public A withSteps(StepInfo... steps);
    public Boolean hasSteps();
    public A addNewStep(Long durationMilliseconds,String name,String startTime);
    public StageInfoFluent.StepsNested<A> addNewStep();
    public StageInfoFluent.StepsNested<A> addNewStepLike(StepInfo item);
    public StageInfoFluent.StepsNested<A> setNewStepLike(int index,StepInfo item);
    public StageInfoFluent.StepsNested<A> editStep(int index);
    public StageInfoFluent.StepsNested<A> editFirstStep();
    public StageInfoFluent.StepsNested<A> editLastStep();
    public StageInfoFluent.StepsNested<A> editMatchingStep(io.fabric8.kubernetes.api.builder.Predicate<StepInfoBuilder> predicate);

    public interface StepsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StepInfoFluent<StageInfoFluent.StepsNested<N>>{

        
    public N and();    public N endStep();
}


}
