package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.fabric8.kubernetes.api.model.IntOrStringBuilder;
import java.lang.Deprecated;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.IntOrStringFluent;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Long;
import java.lang.Object;
import java.util.Map;

public interface RollingDeploymentStrategyParamsFluent<A extends RollingDeploymentStrategyParamsFluent<A>> extends Fluent<A>{


    public Long getIntervalSeconds();
    public A withIntervalSeconds(Long intervalSeconds);
    public Boolean hasIntervalSeconds();
    public A withNewIntervalSeconds(String arg1);
    public A withNewIntervalSeconds(long arg1);
    
/**
 * This method has been deprecated, please use method buildMaxSurge instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getMaxSurge();
    public IntOrString buildMaxSurge();
    public A withMaxSurge(IntOrString maxSurge);
    public Boolean hasMaxSurge();
    public A withNewMaxSurge(String strVal);
    public A withNewMaxSurge(Integer intVal);
    public RollingDeploymentStrategyParamsFluent.MaxSurgeNested<A> withNewMaxSurge();
    public RollingDeploymentStrategyParamsFluent.MaxSurgeNested<A> withNewMaxSurgeLike(IntOrString item);
    public RollingDeploymentStrategyParamsFluent.MaxSurgeNested<A> editMaxSurge();
    public RollingDeploymentStrategyParamsFluent.MaxSurgeNested<A> editOrNewMaxSurge();
    public RollingDeploymentStrategyParamsFluent.MaxSurgeNested<A> editOrNewMaxSurgeLike(IntOrString item);
    
/**
 * This method has been deprecated, please use method buildMaxUnavailable instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getMaxUnavailable();
    public IntOrString buildMaxUnavailable();
    public A withMaxUnavailable(IntOrString maxUnavailable);
    public Boolean hasMaxUnavailable();
    public A withNewMaxUnavailable(String strVal);
    public A withNewMaxUnavailable(Integer intVal);
    public RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<A> withNewMaxUnavailable();
    public RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<A> withNewMaxUnavailableLike(IntOrString item);
    public RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<A> editMaxUnavailable();
    public RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<A> editOrNewMaxUnavailable();
    public RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<A> editOrNewMaxUnavailableLike(IntOrString item);
    
/**
 * This method has been deprecated, please use method buildPost instead.
 * @return The buildable object.
 */
@Deprecated public LifecycleHook getPost();
    public LifecycleHook buildPost();
    public A withPost(LifecycleHook post);
    public Boolean hasPost();
    public RollingDeploymentStrategyParamsFluent.PostNested<A> withNewPost();
    public RollingDeploymentStrategyParamsFluent.PostNested<A> withNewPostLike(LifecycleHook item);
    public RollingDeploymentStrategyParamsFluent.PostNested<A> editPost();
    public RollingDeploymentStrategyParamsFluent.PostNested<A> editOrNewPost();
    public RollingDeploymentStrategyParamsFluent.PostNested<A> editOrNewPostLike(LifecycleHook item);
    
/**
 * This method has been deprecated, please use method buildPre instead.
 * @return The buildable object.
 */
@Deprecated public LifecycleHook getPre();
    public LifecycleHook buildPre();
    public A withPre(LifecycleHook pre);
    public Boolean hasPre();
    public RollingDeploymentStrategyParamsFluent.PreNested<A> withNewPre();
    public RollingDeploymentStrategyParamsFluent.PreNested<A> withNewPreLike(LifecycleHook item);
    public RollingDeploymentStrategyParamsFluent.PreNested<A> editPre();
    public RollingDeploymentStrategyParamsFluent.PreNested<A> editOrNewPre();
    public RollingDeploymentStrategyParamsFluent.PreNested<A> editOrNewPreLike(LifecycleHook item);
    public Long getTimeoutSeconds();
    public A withTimeoutSeconds(Long timeoutSeconds);
    public Boolean hasTimeoutSeconds();
    public A withNewTimeoutSeconds(String arg1);
    public A withNewTimeoutSeconds(long arg1);
    public Long getUpdatePeriodSeconds();
    public A withUpdatePeriodSeconds(Long updatePeriodSeconds);
    public Boolean hasUpdatePeriodSeconds();
    public A withNewUpdatePeriodSeconds(String arg1);
    public A withNewUpdatePeriodSeconds(long arg1);

    public interface MaxSurgeNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IntOrStringFluent<RollingDeploymentStrategyParamsFluent.MaxSurgeNested<N>>{

        
    public N and();    public N endMaxSurge();
}
    public interface MaxUnavailableNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IntOrStringFluent<RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<N>>{

        
    public N and();    public N endMaxUnavailable();
}
    public interface PostNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LifecycleHookFluent<RollingDeploymentStrategyParamsFluent.PostNested<N>>{

        
    public N and();    public N endPost();
}
    public interface PreNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LifecycleHookFluent<RollingDeploymentStrategyParamsFluent.PreNested<N>>{

        
    public N and();    public N endPre();
}


}
