package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

public class RecreateDeploymentStrategyParamsFluentImpl<A extends RecreateDeploymentStrategyParamsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RecreateDeploymentStrategyParamsFluent<A>{

    private LifecycleHookBuilder mid;
    private LifecycleHookBuilder post;
    private LifecycleHookBuilder pre;
    private Long timeoutSeconds;

    public RecreateDeploymentStrategyParamsFluentImpl(){
    }
    public RecreateDeploymentStrategyParamsFluentImpl(RecreateDeploymentStrategyParams instance){
            this.withMid(instance.getMid()); 
            this.withPost(instance.getPost()); 
            this.withPre(instance.getPre()); 
            this.withTimeoutSeconds(instance.getTimeoutSeconds()); 
    }

    
/**
 * This method has been deprecated, please use method buildMid instead.
 * @return The buildable object.
 */
@Deprecated public LifecycleHook getMid(){
            return this.mid!=null?this.mid.build():null;
    }

    public LifecycleHook buildMid(){
            return this.mid!=null?this.mid.build():null;
    }

    public A withMid(LifecycleHook mid){
            _visitables.remove(this.mid);
            if (mid!=null){ this.mid= new LifecycleHookBuilder(mid); _visitables.add(this.mid);} return (A) this;
    }

    public Boolean hasMid(){
            return this.mid != null;
    }

    public RecreateDeploymentStrategyParamsFluent.MidNested<A> withNewMid(){
            return new MidNestedImpl();
    }

    public RecreateDeploymentStrategyParamsFluent.MidNested<A> withNewMidLike(LifecycleHook item){
            return new MidNestedImpl(item);
    }

    public RecreateDeploymentStrategyParamsFluent.MidNested<A> editMid(){
            return withNewMidLike(getMid());
    }

    public RecreateDeploymentStrategyParamsFluent.MidNested<A> editOrNewMid(){
            return withNewMidLike(getMid() != null ? getMid(): new LifecycleHookBuilder().build());
    }

    public RecreateDeploymentStrategyParamsFluent.MidNested<A> editOrNewMidLike(LifecycleHook item){
            return withNewMidLike(getMid() != null ? getMid(): item);
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

    public RecreateDeploymentStrategyParamsFluent.PostNested<A> withNewPost(){
            return new PostNestedImpl();
    }

    public RecreateDeploymentStrategyParamsFluent.PostNested<A> withNewPostLike(LifecycleHook item){
            return new PostNestedImpl(item);
    }

    public RecreateDeploymentStrategyParamsFluent.PostNested<A> editPost(){
            return withNewPostLike(getPost());
    }

    public RecreateDeploymentStrategyParamsFluent.PostNested<A> editOrNewPost(){
            return withNewPostLike(getPost() != null ? getPost(): new LifecycleHookBuilder().build());
    }

    public RecreateDeploymentStrategyParamsFluent.PostNested<A> editOrNewPostLike(LifecycleHook item){
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

    public RecreateDeploymentStrategyParamsFluent.PreNested<A> withNewPre(){
            return new PreNestedImpl();
    }

    public RecreateDeploymentStrategyParamsFluent.PreNested<A> withNewPreLike(LifecycleHook item){
            return new PreNestedImpl(item);
    }

    public RecreateDeploymentStrategyParamsFluent.PreNested<A> editPre(){
            return withNewPreLike(getPre());
    }

    public RecreateDeploymentStrategyParamsFluent.PreNested<A> editOrNewPre(){
            return withNewPreLike(getPre() != null ? getPre(): new LifecycleHookBuilder().build());
    }

    public RecreateDeploymentStrategyParamsFluent.PreNested<A> editOrNewPreLike(LifecycleHook item){
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RecreateDeploymentStrategyParamsFluentImpl that = (RecreateDeploymentStrategyParamsFluentImpl) o;
            if (mid != null ? !mid.equals(that.mid) :that.mid != null) return false;
            if (post != null ? !post.equals(that.post) :that.post != null) return false;
            if (pre != null ? !pre.equals(that.pre) :that.pre != null) return false;
            if (timeoutSeconds != null ? !timeoutSeconds.equals(that.timeoutSeconds) :that.timeoutSeconds != null) return false;
            return true;
    }


    public class MidNestedImpl<N> extends LifecycleHookFluentImpl<RecreateDeploymentStrategyParamsFluent.MidNested<N>> implements RecreateDeploymentStrategyParamsFluent.MidNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LifecycleHookBuilder builder;
    
            MidNestedImpl(LifecycleHook item){
                    this.builder = new LifecycleHookBuilder(this, item);
            }
            MidNestedImpl(){
                    this.builder = new LifecycleHookBuilder(this);
            }
    
    public N and(){
            return (N) RecreateDeploymentStrategyParamsFluentImpl.this.withMid(builder.build());
    }
    public N endMid(){
            return and();
    }

}
    public class PostNestedImpl<N> extends LifecycleHookFluentImpl<RecreateDeploymentStrategyParamsFluent.PostNested<N>> implements RecreateDeploymentStrategyParamsFluent.PostNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LifecycleHookBuilder builder;
    
            PostNestedImpl(LifecycleHook item){
                    this.builder = new LifecycleHookBuilder(this, item);
            }
            PostNestedImpl(){
                    this.builder = new LifecycleHookBuilder(this);
            }
    
    public N and(){
            return (N) RecreateDeploymentStrategyParamsFluentImpl.this.withPost(builder.build());
    }
    public N endPost(){
            return and();
    }

}
    public class PreNestedImpl<N> extends LifecycleHookFluentImpl<RecreateDeploymentStrategyParamsFluent.PreNested<N>> implements RecreateDeploymentStrategyParamsFluent.PreNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LifecycleHookBuilder builder;
    
            PreNestedImpl(LifecycleHook item){
                    this.builder = new LifecycleHookBuilder(this, item);
            }
            PreNestedImpl(){
                    this.builder = new LifecycleHookBuilder(this);
            }
    
    public N and(){
            return (N) RecreateDeploymentStrategyParamsFluentImpl.this.withPre(builder.build());
    }
    public N endPre(){
            return and();
    }

}


}
