package io.fabric8.kubernetes.api.model;

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
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface PodStatusFluent<A extends PodStatusFluent<A>> extends Fluent<A>{


    public A addToConditions(int index,PodCondition item);
    public A setToConditions(int index,PodCondition item);
    public A addToConditions(PodCondition... items);
    public A addAllToConditions(Collection<PodCondition> items);
    public A removeFromConditions(PodCondition... items);
    public A removeAllFromConditions(Collection<PodCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<PodCondition> getConditions();
    public List<PodCondition> buildConditions();
    public PodCondition buildCondition(int index);
    public PodCondition buildFirstCondition();
    public PodCondition buildLastCondition();
    public PodCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<PodConditionBuilder> predicate);
    public A withConditions(List<PodCondition> conditions);
    public A withConditions(PodCondition... conditions);
    public Boolean hasConditions();
    public PodStatusFluent.ConditionsNested<A> addNewCondition();
    public PodStatusFluent.ConditionsNested<A> addNewConditionLike(PodCondition item);
    public PodStatusFluent.ConditionsNested<A> setNewConditionLike(int index,PodCondition item);
    public PodStatusFluent.ConditionsNested<A> editCondition(int index);
    public PodStatusFluent.ConditionsNested<A> editFirstCondition();
    public PodStatusFluent.ConditionsNested<A> editLastCondition();
    public PodStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<PodConditionBuilder> predicate);
    public A addToContainerStatuses(int index,ContainerStatus item);
    public A setToContainerStatuses(int index,ContainerStatus item);
    public A addToContainerStatuses(ContainerStatus... items);
    public A addAllToContainerStatuses(Collection<ContainerStatus> items);
    public A removeFromContainerStatuses(ContainerStatus... items);
    public A removeAllFromContainerStatuses(Collection<ContainerStatus> items);
    
/**
 * This method has been deprecated, please use method buildContainerStatuses instead.
 * @return The buildable object.
 */
@Deprecated public List<ContainerStatus> getContainerStatuses();
    public List<ContainerStatus> buildContainerStatuses();
    public ContainerStatus buildContainerStatus(int index);
    public ContainerStatus buildFirstContainerStatus();
    public ContainerStatus buildLastContainerStatus();
    public ContainerStatus buildMatchingContainerStatus(io.fabric8.kubernetes.api.builder.Predicate<ContainerStatusBuilder> predicate);
    public A withContainerStatuses(List<ContainerStatus> containerStatuses);
    public A withContainerStatuses(ContainerStatus... containerStatuses);
    public Boolean hasContainerStatuses();
    public PodStatusFluent.ContainerStatusesNested<A> addNewContainerStatus();
    public PodStatusFluent.ContainerStatusesNested<A> addNewContainerStatusLike(ContainerStatus item);
    public PodStatusFluent.ContainerStatusesNested<A> setNewContainerStatusLike(int index,ContainerStatus item);
    public PodStatusFluent.ContainerStatusesNested<A> editContainerStatus(int index);
    public PodStatusFluent.ContainerStatusesNested<A> editFirstContainerStatus();
    public PodStatusFluent.ContainerStatusesNested<A> editLastContainerStatus();
    public PodStatusFluent.ContainerStatusesNested<A> editMatchingContainerStatus(io.fabric8.kubernetes.api.builder.Predicate<ContainerStatusBuilder> predicate);
    public String getHostIP();
    public A withHostIP(String hostIP);
    public Boolean hasHostIP();
    public A addToInitContainerStatuses(int index,ContainerStatus item);
    public A setToInitContainerStatuses(int index,ContainerStatus item);
    public A addToInitContainerStatuses(ContainerStatus... items);
    public A addAllToInitContainerStatuses(Collection<ContainerStatus> items);
    public A removeFromInitContainerStatuses(ContainerStatus... items);
    public A removeAllFromInitContainerStatuses(Collection<ContainerStatus> items);
    
/**
 * This method has been deprecated, please use method buildInitContainerStatuses instead.
 * @return The buildable object.
 */
@Deprecated public List<ContainerStatus> getInitContainerStatuses();
    public List<ContainerStatus> buildInitContainerStatuses();
    public ContainerStatus buildInitContainerStatus(int index);
    public ContainerStatus buildFirstInitContainerStatus();
    public ContainerStatus buildLastInitContainerStatus();
    public ContainerStatus buildMatchingInitContainerStatus(io.fabric8.kubernetes.api.builder.Predicate<ContainerStatusBuilder> predicate);
    public A withInitContainerStatuses(List<ContainerStatus> initContainerStatuses);
    public A withInitContainerStatuses(ContainerStatus... initContainerStatuses);
    public Boolean hasInitContainerStatuses();
    public PodStatusFluent.InitContainerStatusesNested<A> addNewInitContainerStatus();
    public PodStatusFluent.InitContainerStatusesNested<A> addNewInitContainerStatusLike(ContainerStatus item);
    public PodStatusFluent.InitContainerStatusesNested<A> setNewInitContainerStatusLike(int index,ContainerStatus item);
    public PodStatusFluent.InitContainerStatusesNested<A> editInitContainerStatus(int index);
    public PodStatusFluent.InitContainerStatusesNested<A> editFirstInitContainerStatus();
    public PodStatusFluent.InitContainerStatusesNested<A> editLastInitContainerStatus();
    public PodStatusFluent.InitContainerStatusesNested<A> editMatchingInitContainerStatus(io.fabric8.kubernetes.api.builder.Predicate<ContainerStatusBuilder> predicate);
    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();
    public String getNominatedNodeName();
    public A withNominatedNodeName(String nominatedNodeName);
    public Boolean hasNominatedNodeName();
    public String getPhase();
    public A withPhase(String phase);
    public Boolean hasPhase();
    public String getPodIP();
    public A withPodIP(String podIP);
    public Boolean hasPodIP();
    public String getQosClass();
    public A withQosClass(String qosClass);
    public Boolean hasQosClass();
    public String getReason();
    public A withReason(String reason);
    public Boolean hasReason();
    public String getStartTime();
    public A withStartTime(String startTime);
    public Boolean hasStartTime();

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,PodConditionFluent<PodStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}
    public interface ContainerStatusesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStatusFluent<PodStatusFluent.ContainerStatusesNested<N>>{

        
    public N and();    public N endContainerStatus();
}
    public interface InitContainerStatusesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStatusFluent<PodStatusFluent.InitContainerStatusesNested<N>>{

        
    public N and();    public N endInitContainerStatus();
}


}
