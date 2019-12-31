package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface RecreateDeploymentStrategyParamsFluent<A extends RecreateDeploymentStrategyParamsFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildMid instead.
 * @return The buildable object.
 */
@Deprecated public LifecycleHook getMid();
    public LifecycleHook buildMid();
    public A withMid(LifecycleHook mid);
    public Boolean hasMid();
    public RecreateDeploymentStrategyParamsFluent.MidNested<A> withNewMid();
    public RecreateDeploymentStrategyParamsFluent.MidNested<A> withNewMidLike(LifecycleHook item);
    public RecreateDeploymentStrategyParamsFluent.MidNested<A> editMid();
    public RecreateDeploymentStrategyParamsFluent.MidNested<A> editOrNewMid();
    public RecreateDeploymentStrategyParamsFluent.MidNested<A> editOrNewMidLike(LifecycleHook item);
    
/**
 * This method has been deprecated, please use method buildPost instead.
 * @return The buildable object.
 */
@Deprecated public LifecycleHook getPost();
    public LifecycleHook buildPost();
    public A withPost(LifecycleHook post);
    public Boolean hasPost();
    public RecreateDeploymentStrategyParamsFluent.PostNested<A> withNewPost();
    public RecreateDeploymentStrategyParamsFluent.PostNested<A> withNewPostLike(LifecycleHook item);
    public RecreateDeploymentStrategyParamsFluent.PostNested<A> editPost();
    public RecreateDeploymentStrategyParamsFluent.PostNested<A> editOrNewPost();
    public RecreateDeploymentStrategyParamsFluent.PostNested<A> editOrNewPostLike(LifecycleHook item);
    
/**
 * This method has been deprecated, please use method buildPre instead.
 * @return The buildable object.
 */
@Deprecated public LifecycleHook getPre();
    public LifecycleHook buildPre();
    public A withPre(LifecycleHook pre);
    public Boolean hasPre();
    public RecreateDeploymentStrategyParamsFluent.PreNested<A> withNewPre();
    public RecreateDeploymentStrategyParamsFluent.PreNested<A> withNewPreLike(LifecycleHook item);
    public RecreateDeploymentStrategyParamsFluent.PreNested<A> editPre();
    public RecreateDeploymentStrategyParamsFluent.PreNested<A> editOrNewPre();
    public RecreateDeploymentStrategyParamsFluent.PreNested<A> editOrNewPreLike(LifecycleHook item);
    public Long getTimeoutSeconds();
    public A withTimeoutSeconds(Long timeoutSeconds);
    public Boolean hasTimeoutSeconds();
    public A withNewTimeoutSeconds(String arg1);
    public A withNewTimeoutSeconds(long arg1);

    public interface MidNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LifecycleHookFluent<RecreateDeploymentStrategyParamsFluent.MidNested<N>>{

        
    public N and();    public N endMid();
}
    public interface PostNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LifecycleHookFluent<RecreateDeploymentStrategyParamsFluent.PostNested<N>>{

        
    public N and();    public N endPost();
}
    public interface PreNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LifecycleHookFluent<RecreateDeploymentStrategyParamsFluent.PreNested<N>>{

        
    public N and();    public N endPre();
}


}
