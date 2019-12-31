package io.fabric8.kubernetes.api.model.apps;

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
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface DaemonSetStatusFluent<A extends DaemonSetStatusFluent<A>> extends Fluent<A>{


    public Integer getCollisionCount();
    public A withCollisionCount(Integer collisionCount);
    public Boolean hasCollisionCount();
    public A addToConditions(int index,DaemonSetCondition item);
    public A setToConditions(int index,DaemonSetCondition item);
    public A addToConditions(DaemonSetCondition... items);
    public A addAllToConditions(Collection<DaemonSetCondition> items);
    public A removeFromConditions(DaemonSetCondition... items);
    public A removeAllFromConditions(Collection<DaemonSetCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<DaemonSetCondition> getConditions();
    public List<DaemonSetCondition> buildConditions();
    public DaemonSetCondition buildCondition(int index);
    public DaemonSetCondition buildFirstCondition();
    public DaemonSetCondition buildLastCondition();
    public DaemonSetCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<DaemonSetConditionBuilder> predicate);
    public A withConditions(List<DaemonSetCondition> conditions);
    public A withConditions(DaemonSetCondition... conditions);
    public Boolean hasConditions();
    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type);
    public DaemonSetStatusFluent.ConditionsNested<A> addNewCondition();
    public DaemonSetStatusFluent.ConditionsNested<A> addNewConditionLike(DaemonSetCondition item);
    public DaemonSetStatusFluent.ConditionsNested<A> setNewConditionLike(int index,DaemonSetCondition item);
    public DaemonSetStatusFluent.ConditionsNested<A> editCondition(int index);
    public DaemonSetStatusFluent.ConditionsNested<A> editFirstCondition();
    public DaemonSetStatusFluent.ConditionsNested<A> editLastCondition();
    public DaemonSetStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<DaemonSetConditionBuilder> predicate);
    public Integer getCurrentNumberScheduled();
    public A withCurrentNumberScheduled(Integer currentNumberScheduled);
    public Boolean hasCurrentNumberScheduled();
    public Integer getDesiredNumberScheduled();
    public A withDesiredNumberScheduled(Integer desiredNumberScheduled);
    public Boolean hasDesiredNumberScheduled();
    public Integer getNumberAvailable();
    public A withNumberAvailable(Integer numberAvailable);
    public Boolean hasNumberAvailable();
    public Integer getNumberMisscheduled();
    public A withNumberMisscheduled(Integer numberMisscheduled);
    public Boolean hasNumberMisscheduled();
    public Integer getNumberReady();
    public A withNumberReady(Integer numberReady);
    public Boolean hasNumberReady();
    public Integer getNumberUnavailable();
    public A withNumberUnavailable(Integer numberUnavailable);
    public Boolean hasNumberUnavailable();
    public Long getObservedGeneration();
    public A withObservedGeneration(Long observedGeneration);
    public Boolean hasObservedGeneration();
    public A withNewObservedGeneration(String arg1);
    public A withNewObservedGeneration(long arg1);
    public Integer getUpdatedNumberScheduled();
    public A withUpdatedNumberScheduled(Integer updatedNumberScheduled);
    public Boolean hasUpdatedNumberScheduled();

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DaemonSetConditionFluent<DaemonSetStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}


}
