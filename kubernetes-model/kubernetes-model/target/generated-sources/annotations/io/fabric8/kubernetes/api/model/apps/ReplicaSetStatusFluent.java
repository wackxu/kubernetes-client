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

public interface ReplicaSetStatusFluent<A extends ReplicaSetStatusFluent<A>> extends Fluent<A>{


    public Integer getAvailableReplicas();
    public A withAvailableReplicas(Integer availableReplicas);
    public Boolean hasAvailableReplicas();
    public A addToConditions(int index,ReplicaSetCondition item);
    public A setToConditions(int index,ReplicaSetCondition item);
    public A addToConditions(ReplicaSetCondition... items);
    public A addAllToConditions(Collection<ReplicaSetCondition> items);
    public A removeFromConditions(ReplicaSetCondition... items);
    public A removeAllFromConditions(Collection<ReplicaSetCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<ReplicaSetCondition> getConditions();
    public List<ReplicaSetCondition> buildConditions();
    public ReplicaSetCondition buildCondition(int index);
    public ReplicaSetCondition buildFirstCondition();
    public ReplicaSetCondition buildLastCondition();
    public ReplicaSetCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<ReplicaSetConditionBuilder> predicate);
    public A withConditions(List<ReplicaSetCondition> conditions);
    public A withConditions(ReplicaSetCondition... conditions);
    public Boolean hasConditions();
    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type);
    public ReplicaSetStatusFluent.ConditionsNested<A> addNewCondition();
    public ReplicaSetStatusFluent.ConditionsNested<A> addNewConditionLike(ReplicaSetCondition item);
    public ReplicaSetStatusFluent.ConditionsNested<A> setNewConditionLike(int index,ReplicaSetCondition item);
    public ReplicaSetStatusFluent.ConditionsNested<A> editCondition(int index);
    public ReplicaSetStatusFluent.ConditionsNested<A> editFirstCondition();
    public ReplicaSetStatusFluent.ConditionsNested<A> editLastCondition();
    public ReplicaSetStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<ReplicaSetConditionBuilder> predicate);
    public Integer getFullyLabeledReplicas();
    public A withFullyLabeledReplicas(Integer fullyLabeledReplicas);
    public Boolean hasFullyLabeledReplicas();
    public Long getObservedGeneration();
    public A withObservedGeneration(Long observedGeneration);
    public Boolean hasObservedGeneration();
    public A withNewObservedGeneration(String arg1);
    public A withNewObservedGeneration(long arg1);
    public Integer getReadyReplicas();
    public A withReadyReplicas(Integer readyReplicas);
    public Boolean hasReadyReplicas();
    public Integer getReplicas();
    public A withReplicas(Integer replicas);
    public Boolean hasReplicas();

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicaSetConditionFluent<ReplicaSetStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}


}
