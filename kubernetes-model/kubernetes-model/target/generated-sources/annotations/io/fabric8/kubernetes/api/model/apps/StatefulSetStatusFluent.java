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

public interface StatefulSetStatusFluent<A extends StatefulSetStatusFluent<A>> extends Fluent<A>{


    public Integer getCollisionCount();
    public A withCollisionCount(Integer collisionCount);
    public Boolean hasCollisionCount();
    public A addToConditions(int index,StatefulSetCondition item);
    public A setToConditions(int index,StatefulSetCondition item);
    public A addToConditions(StatefulSetCondition... items);
    public A addAllToConditions(Collection<StatefulSetCondition> items);
    public A removeFromConditions(StatefulSetCondition... items);
    public A removeAllFromConditions(Collection<StatefulSetCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<StatefulSetCondition> getConditions();
    public List<StatefulSetCondition> buildConditions();
    public StatefulSetCondition buildCondition(int index);
    public StatefulSetCondition buildFirstCondition();
    public StatefulSetCondition buildLastCondition();
    public StatefulSetCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<StatefulSetConditionBuilder> predicate);
    public A withConditions(List<StatefulSetCondition> conditions);
    public A withConditions(StatefulSetCondition... conditions);
    public Boolean hasConditions();
    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type);
    public StatefulSetStatusFluent.ConditionsNested<A> addNewCondition();
    public StatefulSetStatusFluent.ConditionsNested<A> addNewConditionLike(StatefulSetCondition item);
    public StatefulSetStatusFluent.ConditionsNested<A> setNewConditionLike(int index,StatefulSetCondition item);
    public StatefulSetStatusFluent.ConditionsNested<A> editCondition(int index);
    public StatefulSetStatusFluent.ConditionsNested<A> editFirstCondition();
    public StatefulSetStatusFluent.ConditionsNested<A> editLastCondition();
    public StatefulSetStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<StatefulSetConditionBuilder> predicate);
    public Integer getCurrentReplicas();
    public A withCurrentReplicas(Integer currentReplicas);
    public Boolean hasCurrentReplicas();
    public String getCurrentRevision();
    public A withCurrentRevision(String currentRevision);
    public Boolean hasCurrentRevision();
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
    public String getUpdateRevision();
    public A withUpdateRevision(String updateRevision);
    public Boolean hasUpdateRevision();
    public Integer getUpdatedReplicas();
    public A withUpdatedReplicas(Integer updatedReplicas);
    public Boolean hasUpdatedReplicas();

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatefulSetConditionFluent<StatefulSetStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}


}
