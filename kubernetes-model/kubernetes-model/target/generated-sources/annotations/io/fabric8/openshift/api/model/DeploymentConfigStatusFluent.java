package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface DeploymentConfigStatusFluent<A extends DeploymentConfigStatusFluent<A>> extends Fluent<A>{


    public Integer getAvailableReplicas();
    public A withAvailableReplicas(Integer availableReplicas);
    public Boolean hasAvailableReplicas();
    public A addToConditions(int index,io.fabric8.openshift.api.model.DeploymentCondition item);
    public A setToConditions(int index,io.fabric8.openshift.api.model.DeploymentCondition item);
    public A addToConditions(io.fabric8.openshift.api.model.DeploymentCondition... items);
    public A addAllToConditions(Collection<io.fabric8.openshift.api.model.DeploymentCondition> items);
    public A removeFromConditions(io.fabric8.openshift.api.model.DeploymentCondition... items);
    public A removeAllFromConditions(Collection<io.fabric8.openshift.api.model.DeploymentCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<io.fabric8.openshift.api.model.DeploymentCondition> getConditions();
    public List<io.fabric8.openshift.api.model.DeploymentCondition> buildConditions();
    public io.fabric8.openshift.api.model.DeploymentCondition buildCondition(int index);
    public io.fabric8.openshift.api.model.DeploymentCondition buildFirstCondition();
    public io.fabric8.openshift.api.model.DeploymentCondition buildLastCondition();
    public io.fabric8.openshift.api.model.DeploymentCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.DeploymentConditionBuilder> predicate);
    public A withConditions(List<io.fabric8.openshift.api.model.DeploymentCondition> conditions);
    public A withConditions(io.fabric8.openshift.api.model.DeploymentCondition... conditions);
    public Boolean hasConditions();
    public DeploymentConfigStatusFluent.ConditionsNested<A> addNewCondition();
    public DeploymentConfigStatusFluent.ConditionsNested<A> addNewConditionLike(io.fabric8.openshift.api.model.DeploymentCondition item);
    public DeploymentConfigStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.fabric8.openshift.api.model.DeploymentCondition item);
    public DeploymentConfigStatusFluent.ConditionsNested<A> editCondition(int index);
    public DeploymentConfigStatusFluent.ConditionsNested<A> editFirstCondition();
    public DeploymentConfigStatusFluent.ConditionsNested<A> editLastCondition();
    public DeploymentConfigStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<io.fabric8.openshift.api.model.DeploymentConditionBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildDetails instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentDetails getDetails();
    public DeploymentDetails buildDetails();
    public A withDetails(DeploymentDetails details);
    public Boolean hasDetails();
    public DeploymentConfigStatusFluent.DetailsNested<A> withNewDetails();
    public DeploymentConfigStatusFluent.DetailsNested<A> withNewDetailsLike(DeploymentDetails item);
    public DeploymentConfigStatusFluent.DetailsNested<A> editDetails();
    public DeploymentConfigStatusFluent.DetailsNested<A> editOrNewDetails();
    public DeploymentConfigStatusFluent.DetailsNested<A> editOrNewDetailsLike(DeploymentDetails item);
    public Long getLatestVersion();
    public A withLatestVersion(Long latestVersion);
    public Boolean hasLatestVersion();
    public A withNewLatestVersion(String arg1);
    public A withNewLatestVersion(long arg1);
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

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,io.fabric8.openshift.api.model.DeploymentConditionFluent<DeploymentConfigStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}
    public interface DetailsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentDetailsFluent<DeploymentConfigStatusFluent.DetailsNested<N>>{

        
    public N and();    public N endDetails();
}


}
