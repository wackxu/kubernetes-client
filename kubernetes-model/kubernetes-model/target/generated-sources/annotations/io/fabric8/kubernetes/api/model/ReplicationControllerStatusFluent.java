package io.fabric8.kubernetes.api.model;

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

public interface ReplicationControllerStatusFluent<A extends ReplicationControllerStatusFluent<A>> extends Fluent<A>{


    public Integer getAvailableReplicas();
    public A withAvailableReplicas(Integer availableReplicas);
    public Boolean hasAvailableReplicas();
    public A addToConditions(int index,ReplicationControllerCondition item);
    public A setToConditions(int index,ReplicationControllerCondition item);
    public A addToConditions(ReplicationControllerCondition... items);
    public A addAllToConditions(Collection<ReplicationControllerCondition> items);
    public A removeFromConditions(ReplicationControllerCondition... items);
    public A removeAllFromConditions(Collection<ReplicationControllerCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<ReplicationControllerCondition> getConditions();
    public List<ReplicationControllerCondition> buildConditions();
    public ReplicationControllerCondition buildCondition(int index);
    public ReplicationControllerCondition buildFirstCondition();
    public ReplicationControllerCondition buildLastCondition();
    public ReplicationControllerCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<ReplicationControllerConditionBuilder> predicate);
    public A withConditions(List<ReplicationControllerCondition> conditions);
    public A withConditions(ReplicationControllerCondition... conditions);
    public Boolean hasConditions();
    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type);
    public ReplicationControllerStatusFluent.ConditionsNested<A> addNewCondition();
    public ReplicationControllerStatusFluent.ConditionsNested<A> addNewConditionLike(ReplicationControllerCondition item);
    public ReplicationControllerStatusFluent.ConditionsNested<A> setNewConditionLike(int index,ReplicationControllerCondition item);
    public ReplicationControllerStatusFluent.ConditionsNested<A> editCondition(int index);
    public ReplicationControllerStatusFluent.ConditionsNested<A> editFirstCondition();
    public ReplicationControllerStatusFluent.ConditionsNested<A> editLastCondition();
    public ReplicationControllerStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<ReplicationControllerConditionBuilder> predicate);
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

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ReplicationControllerConditionFluent<ReplicationControllerStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}


}
