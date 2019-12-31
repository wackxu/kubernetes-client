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

public interface NodeConfigStatusFluent<A extends NodeConfigStatusFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildActive instead.
 * @return The buildable object.
 */
@Deprecated public NodeConfigSource getActive();
    public NodeConfigSource buildActive();
    public A withActive(NodeConfigSource active);
    public Boolean hasActive();
    public NodeConfigStatusFluent.ActiveNested<A> withNewActive();
    public NodeConfigStatusFluent.ActiveNested<A> withNewActiveLike(NodeConfigSource item);
    public NodeConfigStatusFluent.ActiveNested<A> editActive();
    public NodeConfigStatusFluent.ActiveNested<A> editOrNewActive();
    public NodeConfigStatusFluent.ActiveNested<A> editOrNewActiveLike(NodeConfigSource item);
    
/**
 * This method has been deprecated, please use method buildAssigned instead.
 * @return The buildable object.
 */
@Deprecated public NodeConfigSource getAssigned();
    public NodeConfigSource buildAssigned();
    public A withAssigned(NodeConfigSource assigned);
    public Boolean hasAssigned();
    public NodeConfigStatusFluent.AssignedNested<A> withNewAssigned();
    public NodeConfigStatusFluent.AssignedNested<A> withNewAssignedLike(NodeConfigSource item);
    public NodeConfigStatusFluent.AssignedNested<A> editAssigned();
    public NodeConfigStatusFluent.AssignedNested<A> editOrNewAssigned();
    public NodeConfigStatusFluent.AssignedNested<A> editOrNewAssignedLike(NodeConfigSource item);
    public String getError();
    public A withError(String error);
    public Boolean hasError();
    
/**
 * This method has been deprecated, please use method buildLastKnownGood instead.
 * @return The buildable object.
 */
@Deprecated public NodeConfigSource getLastKnownGood();
    public NodeConfigSource buildLastKnownGood();
    public A withLastKnownGood(NodeConfigSource lastKnownGood);
    public Boolean hasLastKnownGood();
    public NodeConfigStatusFluent.LastKnownGoodNested<A> withNewLastKnownGood();
    public NodeConfigStatusFluent.LastKnownGoodNested<A> withNewLastKnownGoodLike(NodeConfigSource item);
    public NodeConfigStatusFluent.LastKnownGoodNested<A> editLastKnownGood();
    public NodeConfigStatusFluent.LastKnownGoodNested<A> editOrNewLastKnownGood();
    public NodeConfigStatusFluent.LastKnownGoodNested<A> editOrNewLastKnownGoodLike(NodeConfigSource item);

    public interface ActiveNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeConfigSourceFluent<NodeConfigStatusFluent.ActiveNested<N>>{

        
    public N and();    public N endActive();
}
    public interface AssignedNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeConfigSourceFluent<NodeConfigStatusFluent.AssignedNested<N>>{

        
    public N and();    public N endAssigned();
}
    public interface LastKnownGoodNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NodeConfigSourceFluent<NodeConfigStatusFluent.LastKnownGoodNested<N>>{

        
    public N and();    public N endLastKnownGood();
}


}
