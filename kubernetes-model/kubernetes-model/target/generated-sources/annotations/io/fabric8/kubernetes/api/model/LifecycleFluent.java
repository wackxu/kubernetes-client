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

public interface LifecycleFluent<A extends LifecycleFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildPostStart instead.
 * @return The buildable object.
 */
@Deprecated public Handler getPostStart();
    public Handler buildPostStart();
    public A withPostStart(Handler postStart);
    public Boolean hasPostStart();
    public LifecycleFluent.PostStartNested<A> withNewPostStart();
    public LifecycleFluent.PostStartNested<A> withNewPostStartLike(Handler item);
    public LifecycleFluent.PostStartNested<A> editPostStart();
    public LifecycleFluent.PostStartNested<A> editOrNewPostStart();
    public LifecycleFluent.PostStartNested<A> editOrNewPostStartLike(Handler item);
    
/**
 * This method has been deprecated, please use method buildPreStop instead.
 * @return The buildable object.
 */
@Deprecated public Handler getPreStop();
    public Handler buildPreStop();
    public A withPreStop(Handler preStop);
    public Boolean hasPreStop();
    public LifecycleFluent.PreStopNested<A> withNewPreStop();
    public LifecycleFluent.PreStopNested<A> withNewPreStopLike(Handler item);
    public LifecycleFluent.PreStopNested<A> editPreStop();
    public LifecycleFluent.PreStopNested<A> editOrNewPreStop();
    public LifecycleFluent.PreStopNested<A> editOrNewPreStopLike(Handler item);

    public interface PostStartNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HandlerFluent<LifecycleFluent.PostStartNested<N>>{

        
    public N and();    public N endPostStart();
}
    public interface PreStopNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HandlerFluent<LifecycleFluent.PreStopNested<N>>{

        
    public N and();    public N endPreStop();
}


}
