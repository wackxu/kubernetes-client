package io.fabric8.kubernetes.api.model;

import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface ContainerStatusFluent<A extends ContainerStatusFluent<A>> extends Fluent<A>{


    public String getContainerID();
    public A withContainerID(String containerID);
    public Boolean hasContainerID();
    public String getImage();
    public A withImage(String image);
    public Boolean hasImage();
    public String getImageID();
    public A withImageID(String imageID);
    public Boolean hasImageID();
    
/**
 * This method has been deprecated, please use method buildLastState instead.
 * @return The buildable object.
 */
@Deprecated public ContainerState getLastState();
    public ContainerState buildLastState();
    public A withLastState(ContainerState lastState);
    public Boolean hasLastState();
    public ContainerStatusFluent.LastStateNested<A> withNewLastState();
    public ContainerStatusFluent.LastStateNested<A> withNewLastStateLike(ContainerState item);
    public ContainerStatusFluent.LastStateNested<A> editLastState();
    public ContainerStatusFluent.LastStateNested<A> editOrNewLastState();
    public ContainerStatusFluent.LastStateNested<A> editOrNewLastStateLike(ContainerState item);
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public Boolean isReady();
    public A withReady(Boolean ready);
    public Boolean hasReady();
    public A withNewReady(String arg1);
    public A withNewReady(boolean arg1);
    public Integer getRestartCount();
    public A withRestartCount(Integer restartCount);
    public Boolean hasRestartCount();
    
/**
 * This method has been deprecated, please use method buildState instead.
 * @return The buildable object.
 */
@Deprecated public ContainerState getState();
    public ContainerState buildState();
    public A withState(ContainerState state);
    public Boolean hasState();
    public ContainerStatusFluent.StateNested<A> withNewState();
    public ContainerStatusFluent.StateNested<A> withNewStateLike(ContainerState item);
    public ContainerStatusFluent.StateNested<A> editState();
    public ContainerStatusFluent.StateNested<A> editOrNewState();
    public ContainerStatusFluent.StateNested<A> editOrNewStateLike(ContainerState item);

    public interface LastStateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStateFluent<ContainerStatusFluent.LastStateNested<N>>{

        
    public N and();    public N endLastState();
}
    public interface StateNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ContainerStateFluent<ContainerStatusFluent.StateNested<N>>{

        
    public N and();    public N endState();
}


}
