package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface ContainerStateFluent<A extends ContainerStateFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildRunning instead.
 * @return The buildable object.
 */
@Deprecated public ContainerStateRunning getRunning();
    public ContainerStateRunning buildRunning();
    public A withRunning(ContainerStateRunning running);
    public Boolean hasRunning();
    public A withNewRunning(String startedAt);
    public ContainerStateFluent.RunningNested<A> withNewRunning();
    public ContainerStateFluent.RunningNested<A> withNewRunningLike(ContainerStateRunning item);
    public ContainerStateFluent.RunningNested<A> editRunning();
    public ContainerStateFluent.RunningNested<A> editOrNewRunning();
    public ContainerStateFluent.RunningNested<A> editOrNewRunningLike(ContainerStateRunning item);
    
/**
 * This method has been deprecated, please use method buildTerminated instead.
 * @return The buildable object.
 */
@Deprecated public ContainerStateTerminated getTerminated();
    public ContainerStateTerminated buildTerminated();
    public A withTerminated(ContainerStateTerminated terminated);
    public Boolean hasTerminated();
    public ContainerStateFluent.TerminatedNested<A> withNewTerminated();
    public ContainerStateFluent.TerminatedNested<A> withNewTerminatedLike(ContainerStateTerminated item);
    public ContainerStateFluent.TerminatedNested<A> editTerminated();
    public ContainerStateFluent.TerminatedNested<A> editOrNewTerminated();
    public ContainerStateFluent.TerminatedNested<A> editOrNewTerminatedLike(ContainerStateTerminated item);
    
/**
 * This method has been deprecated, please use method buildWaiting instead.
 * @return The buildable object.
 */
@Deprecated public ContainerStateWaiting getWaiting();
    public ContainerStateWaiting buildWaiting();
    public A withWaiting(ContainerStateWaiting waiting);
    public Boolean hasWaiting();
    public A withNewWaiting(String message,String reason);
    public ContainerStateFluent.WaitingNested<A> withNewWaiting();
    public ContainerStateFluent.WaitingNested<A> withNewWaitingLike(ContainerStateWaiting item);
    public ContainerStateFluent.WaitingNested<A> editWaiting();
    public ContainerStateFluent.WaitingNested<A> editOrNewWaiting();
    public ContainerStateFluent.WaitingNested<A> editOrNewWaitingLike(ContainerStateWaiting item);

    public interface RunningNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStateRunningFluent<ContainerStateFluent.RunningNested<N>>{

        
    public N and();    public N endRunning();
}
    public interface TerminatedNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStateTerminatedFluent<ContainerStateFluent.TerminatedNested<N>>{

        
    public N and();    public N endTerminated();
}
    public interface WaitingNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStateWaitingFluent<ContainerStateFluent.WaitingNested<N>>{

        
    public N and();    public N endWaiting();
}


}
