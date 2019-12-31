package io.fabric8.kubernetes.api.model.batch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface JobStatusFluent<A extends JobStatusFluent<A>> extends Fluent<A>{


    public Integer getActive();
    public A withActive(Integer active);
    public Boolean hasActive();
    public String getCompletionTime();
    public A withCompletionTime(String completionTime);
    public Boolean hasCompletionTime();
    public A addToConditions(int index,JobCondition item);
    public A setToConditions(int index,JobCondition item);
    public A addToConditions(JobCondition... items);
    public A addAllToConditions(Collection<JobCondition> items);
    public A removeFromConditions(JobCondition... items);
    public A removeAllFromConditions(Collection<JobCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<JobCondition> getConditions();
    public List<JobCondition> buildConditions();
    public JobCondition buildCondition(int index);
    public JobCondition buildFirstCondition();
    public JobCondition buildLastCondition();
    public JobCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<JobConditionBuilder> predicate);
    public A withConditions(List<JobCondition> conditions);
    public A withConditions(JobCondition... conditions);
    public Boolean hasConditions();
    public JobStatusFluent.ConditionsNested<A> addNewCondition();
    public JobStatusFluent.ConditionsNested<A> addNewConditionLike(JobCondition item);
    public JobStatusFluent.ConditionsNested<A> setNewConditionLike(int index,JobCondition item);
    public JobStatusFluent.ConditionsNested<A> editCondition(int index);
    public JobStatusFluent.ConditionsNested<A> editFirstCondition();
    public JobStatusFluent.ConditionsNested<A> editLastCondition();
    public JobStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<JobConditionBuilder> predicate);
    public Integer getFailed();
    public A withFailed(Integer failed);
    public Boolean hasFailed();
    public String getStartTime();
    public A withStartTime(String startTime);
    public Boolean hasStartTime();
    public Integer getSucceeded();
    public A withSucceeded(Integer succeeded);
    public Boolean hasSucceeded();

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobConditionFluent<JobStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}


}
