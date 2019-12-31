package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.builder.Nested;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.fabric8.kubernetes.api.model.IntOrStringBuilder;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Long;
import java.lang.Object;
import io.fabric8.kubernetes.api.model.IntOrStringFluentImpl;

public class RollingDeploymentStrategyParamsFluentImpl<A extends RollingDeploymentStrategyParamsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RollingDeploymentStrategyParamsFluent<A>{

    private Long intervalSeconds;
    private IntOrStringBuilder maxSurge;
    private IntOrStringBuilder maxUnavailable;
    private LifecycleHookBuilder post;
    private LifecycleHookBuilder pre;
    private Long timeoutSeconds;
    private Long updatePeriodSeconds;

    public RollingDeploymentStrategyParamsFluentImpl(){
    }
    public RollingDeploymentStrategyParamsFluentImpl(RollingDeploymentStrategyParams instance){
            this.withIntervalSeconds(instance.getIntervalSeconds()); 
            this.withMaxSurge(instance.getMaxSurge()); 
            this.withMaxUnavailable(instance.getMaxUnavailable()); 
            this.withPost(instance.getPost()); 
            this.withPre(instance.getPre()); 
            this.withTimeoutSeconds(instance.getTimeoutSeconds()); 
            this.withUpdatePeriodSeconds(instance.getUpdatePeriodSeconds()); 
    }

    public Long getIntervalSeconds(){
            return this.intervalSeconds;
    }

    public A withIntervalSeconds(Long intervalSeconds){
            this.intervalSeconds=intervalSeconds; return (A) this;
    }

    public Boolean hasIntervalSeconds(){
            return this.intervalSeconds != null;
    }

    public A withNewIntervalSeconds(String arg1){
            return (A)withIntervalSeconds(new Long(arg1));
    }

    public A withNewIntervalSeconds(long arg1){
            return (A)withIntervalSeconds(new Long(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildMaxSurge instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getMaxSurge(){
            return this.maxSurge!=null?this.maxSurge.build():null;
    }

    public IntOrString buildMaxSurge(){
            return this.maxSurge!=null?this.maxSurge.build():null;
    }

    public A withMaxSurge(IntOrString maxSurge){
            _visitables.remove(this.maxSurge);
            if (maxSurge!=null){ this.maxSurge= new IntOrStringBuilder(maxSurge); _visitables.add(this.maxSurge);} return (A) this;
    }

    public Boolean hasMaxSurge(){
            return this.maxSurge != null;
    }

    public A withNewMaxSurge(String strVal){
            return (A)withMaxSurge(new IntOrString(strVal));
    }

    public A withNewMaxSurge(Integer intVal){
            return (A)withMaxSurge(new IntOrString(intVal));
    }

    public RollingDeploymentStrategyParamsFluent.MaxSurgeNested<A> withNewMaxSurge(){
            return new MaxSurgeNestedImpl();
    }

    public RollingDeploymentStrategyParamsFluent.MaxSurgeNested<A> withNewMaxSurgeLike(IntOrString item){
            return new MaxSurgeNestedImpl(item);
    }

    public RollingDeploymentStrategyParamsFluent.MaxSurgeNested<A> editMaxSurge(){
            return withNewMaxSurgeLike(getMaxSurge());
    }

    public RollingDeploymentStrategyParamsFluent.MaxSurgeNested<A> editOrNewMaxSurge(){
            return withNewMaxSurgeLike(getMaxSurge() != null ? getMaxSurge(): new IntOrStringBuilder().build());
    }

    public RollingDeploymentStrategyParamsFluent.MaxSurgeNested<A> editOrNewMaxSurgeLike(IntOrString item){
            return withNewMaxSurgeLike(getMaxSurge() != null ? getMaxSurge(): item);
    }

    
/**
 * This method has been deprecated, please use method buildMaxUnavailable instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getMaxUnavailable(){
            return this.maxUnavailable!=null?this.maxUnavailable.build():null;
    }

    public IntOrString buildMaxUnavailable(){
            return this.maxUnavailable!=null?this.maxUnavailable.build():null;
    }

    public A withMaxUnavailable(IntOrString maxUnavailable){
            _visitables.remove(this.maxUnavailable);
            if (maxUnavailable!=null){ this.maxUnavailable= new IntOrStringBuilder(maxUnavailable); _visitables.add(this.maxUnavailable);} return (A) this;
    }

    public Boolean hasMaxUnavailable(){
            return this.maxUnavailable != null;
    }

    public A withNewMaxUnavailable(String strVal){
            return (A)withMaxUnavailable(new IntOrString(strVal));
    }

    public A withNewMaxUnavailable(Integer intVal){
            return (A)withMaxUnavailable(new IntOrString(intVal));
    }

    public RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<A> withNewMaxUnavailable(){
            return new MaxUnavailableNestedImpl();
    }

    public RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<A> withNewMaxUnavailableLike(IntOrString item){
            return new MaxUnavailableNestedImpl(item);
    }

    public RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<A> editMaxUnavailable(){
            return withNewMaxUnavailableLike(getMaxUnavailable());
    }

    public RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<A> editOrNewMaxUnavailable(){
            return withNewMaxUnavailableLike(getMaxUnavailable() != null ? getMaxUnavailable(): new IntOrStringBuilder().build());
    }

    public RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<A> editOrNewMaxUnavailableLike(IntOrString item){
            return withNewMaxUnavailableLike(getMaxUnavailable() != null ? getMaxUnavailable(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPost instead.
 * @return The buildable object.
 */
@Deprecated public LifecycleHook getPost(){
            return this.post!=null?this.post.build():null;
    }

    public LifecycleHook buildPost(){
            return this.post!=null?this.post.build():null;
    }

    public A withPost(LifecycleHook post){
            _visitables.remove(this.post);
            if (post!=null){ this.post= new LifecycleHookBuilder(post); _visitables.add(this.post);} return (A) this;
    }

    public Boolean hasPost(){
            return this.post != null;
    }

    public RollingDeploymentStrategyParamsFluent.PostNested<A> withNewPost(){
            return new PostNestedImpl();
    }

    public RollingDeploymentStrategyParamsFluent.PostNested<A> withNewPostLike(LifecycleHook item){
            return new PostNestedImpl(item);
    }

    public RollingDeploymentStrategyParamsFluent.PostNested<A> editPost(){
            return withNewPostLike(getPost());
    }

    public RollingDeploymentStrategyParamsFluent.PostNested<A> editOrNewPost(){
            return withNewPostLike(getPost() != null ? getPost(): new LifecycleHookBuilder().build());
    }

    public RollingDeploymentStrategyParamsFluent.PostNested<A> editOrNewPostLike(LifecycleHook item){
            return withNewPostLike(getPost() != null ? getPost(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPre instead.
 * @return The buildable object.
 */
@Deprecated public LifecycleHook getPre(){
            return this.pre!=null?this.pre.build():null;
    }

    public LifecycleHook buildPre(){
            return this.pre!=null?this.pre.build():null;
    }

    public A withPre(LifecycleHook pre){
            _visitables.remove(this.pre);
            if (pre!=null){ this.pre= new LifecycleHookBuilder(pre); _visitables.add(this.pre);} return (A) this;
    }

    public Boolean hasPre(){
            return this.pre != null;
    }

    public RollingDeploymentStrategyParamsFluent.PreNested<A> withNewPre(){
            return new PreNestedImpl();
    }

    public RollingDeploymentStrategyParamsFluent.PreNested<A> withNewPreLike(LifecycleHook item){
            return new PreNestedImpl(item);
    }

    public RollingDeploymentStrategyParamsFluent.PreNested<A> editPre(){
            return withNewPreLike(getPre());
    }

    public RollingDeploymentStrategyParamsFluent.PreNested<A> editOrNewPre(){
            return withNewPreLike(getPre() != null ? getPre(): new LifecycleHookBuilder().build());
    }

    public RollingDeploymentStrategyParamsFluent.PreNested<A> editOrNewPreLike(LifecycleHook item){
            return withNewPreLike(getPre() != null ? getPre(): item);
    }

    public Long getTimeoutSeconds(){
            return this.timeoutSeconds;
    }

    public A withTimeoutSeconds(Long timeoutSeconds){
            this.timeoutSeconds=timeoutSeconds; return (A) this;
    }

    public Boolean hasTimeoutSeconds(){
            return this.timeoutSeconds != null;
    }

    public A withNewTimeoutSeconds(String arg1){
            return (A)withTimeoutSeconds(new Long(arg1));
    }

    public A withNewTimeoutSeconds(long arg1){
            return (A)withTimeoutSeconds(new Long(arg1));
    }

    public Long getUpdatePeriodSeconds(){
            return this.updatePeriodSeconds;
    }

    public A withUpdatePeriodSeconds(Long updatePeriodSeconds){
            this.updatePeriodSeconds=updatePeriodSeconds; return (A) this;
    }

    public Boolean hasUpdatePeriodSeconds(){
            return this.updatePeriodSeconds != null;
    }

    public A withNewUpdatePeriodSeconds(String arg1){
            return (A)withUpdatePeriodSeconds(new Long(arg1));
    }

    public A withNewUpdatePeriodSeconds(long arg1){
            return (A)withUpdatePeriodSeconds(new Long(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RollingDeploymentStrategyParamsFluentImpl that = (RollingDeploymentStrategyParamsFluentImpl) o;
            if (intervalSeconds != null ? !intervalSeconds.equals(that.intervalSeconds) :that.intervalSeconds != null) return false;
            if (maxSurge != null ? !maxSurge.equals(that.maxSurge) :that.maxSurge != null) return false;
            if (maxUnavailable != null ? !maxUnavailable.equals(that.maxUnavailable) :that.maxUnavailable != null) return false;
            if (post != null ? !post.equals(that.post) :that.post != null) return false;
            if (pre != null ? !pre.equals(that.pre) :that.pre != null) return false;
            if (timeoutSeconds != null ? !timeoutSeconds.equals(that.timeoutSeconds) :that.timeoutSeconds != null) return false;
            if (updatePeriodSeconds != null ? !updatePeriodSeconds.equals(that.updatePeriodSeconds) :that.updatePeriodSeconds != null) return false;
            return true;
    }


    public class MaxSurgeNestedImpl<N> extends IntOrStringFluentImpl<RollingDeploymentStrategyParamsFluent.MaxSurgeNested<N>> implements RollingDeploymentStrategyParamsFluent.MaxSurgeNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            MaxSurgeNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            MaxSurgeNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) RollingDeploymentStrategyParamsFluentImpl.this.withMaxSurge(builder.build());
    }
    public N endMaxSurge(){
            return and();
    }

}
    public class MaxUnavailableNestedImpl<N> extends IntOrStringFluentImpl<RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<N>> implements RollingDeploymentStrategyParamsFluent.MaxUnavailableNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final IntOrStringBuilder builder;
    
            MaxUnavailableNestedImpl(IntOrString item){
                    this.builder = new IntOrStringBuilder(this, item);
            }
            MaxUnavailableNestedImpl(){
                    this.builder = new IntOrStringBuilder(this);
            }
    
    public N and(){
            return (N) RollingDeploymentStrategyParamsFluentImpl.this.withMaxUnavailable(builder.build());
    }
    public N endMaxUnavailable(){
            return and();
    }

}
    public class PostNestedImpl<N> extends LifecycleHookFluentImpl<RollingDeploymentStrategyParamsFluent.PostNested<N>> implements RollingDeploymentStrategyParamsFluent.PostNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LifecycleHookBuilder builder;
    
            PostNestedImpl(LifecycleHook item){
                    this.builder = new LifecycleHookBuilder(this, item);
            }
            PostNestedImpl(){
                    this.builder = new LifecycleHookBuilder(this);
            }
    
    public N and(){
            return (N) RollingDeploymentStrategyParamsFluentImpl.this.withPost(builder.build());
    }
    public N endPost(){
            return and();
    }

}
    public class PreNestedImpl<N> extends LifecycleHookFluentImpl<RollingDeploymentStrategyParamsFluent.PreNested<N>> implements RollingDeploymentStrategyParamsFluent.PreNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LifecycleHookBuilder builder;
    
            PreNestedImpl(LifecycleHook item){
                    this.builder = new LifecycleHookBuilder(this, item);
            }
            PreNestedImpl(){
                    this.builder = new LifecycleHookBuilder(this);
            }
    
    public N and(){
            return (N) RollingDeploymentStrategyParamsFluentImpl.this.withPre(builder.build());
    }
    public N endPre(){
            return and();
    }

}


}
