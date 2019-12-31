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

public interface DeploymentStatusFluent<A extends DeploymentStatusFluent<A>> extends Fluent<A>{


    public Integer getAvailableReplicas();
    public A withAvailableReplicas(Integer availableReplicas);
    public Boolean hasAvailableReplicas();
    public Integer getCollisionCount();
    public A withCollisionCount(Integer collisionCount);
    public Boolean hasCollisionCount();
    public A addToConditions(int index,DeploymentCondition item);
    public A setToConditions(int index,DeploymentCondition item);
    public A addToConditions(DeploymentCondition... items);
    public A addAllToConditions(Collection<DeploymentCondition> items);
    public A removeFromConditions(DeploymentCondition... items);
    public A removeAllFromConditions(Collection<DeploymentCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<DeploymentCondition> getConditions();
    public List<DeploymentCondition> buildConditions();
    public DeploymentCondition buildCondition(int index);
    public DeploymentCondition buildFirstCondition();
    public DeploymentCondition buildLastCondition();
    public DeploymentCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<DeploymentConditionBuilder> predicate);
    public A withConditions(List<DeploymentCondition> conditions);
    public A withConditions(DeploymentCondition... conditions);
    public Boolean hasConditions();
    public DeploymentStatusFluent.ConditionsNested<A> addNewCondition();
    public DeploymentStatusFluent.ConditionsNested<A> addNewConditionLike(DeploymentCondition item);
    public DeploymentStatusFluent.ConditionsNested<A> setNewConditionLike(int index,DeploymentCondition item);
    public DeploymentStatusFluent.ConditionsNested<A> editCondition(int index);
    public DeploymentStatusFluent.ConditionsNested<A> editFirstCondition();
    public DeploymentStatusFluent.ConditionsNested<A> editLastCondition();
    public DeploymentStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<DeploymentConditionBuilder> predicate);
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
    public Integer getUnavailableReplicas();
    public A withUnavailableReplicas(Integer unavailableReplicas);
    public Boolean hasUnavailableReplicas();
    public Integer getUpdatedReplicas();
    public A withUpdatedReplicas(Integer updatedReplicas);
    public Boolean hasUpdatedReplicas();

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentConditionFluent<DeploymentStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}


}
