package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class LifecycleFluentImpl<A extends LifecycleFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements LifecycleFluent<A>{

    private HandlerBuilder postStart;
    private HandlerBuilder preStop;

    public LifecycleFluentImpl(){
    }
    public LifecycleFluentImpl(Lifecycle instance){
            this.withPostStart(instance.getPostStart()); 
            this.withPreStop(instance.getPreStop()); 
    }

    
/**
 * This method has been deprecated, please use method buildPostStart instead.
 * @return The buildable object.
 */
@Deprecated public Handler getPostStart(){
            return this.postStart!=null?this.postStart.build():null;
    }

    public Handler buildPostStart(){
            return this.postStart!=null?this.postStart.build():null;
    }

    public A withPostStart(Handler postStart){
            _visitables.remove(this.postStart);
            if (postStart!=null){ this.postStart= new HandlerBuilder(postStart); _visitables.add(this.postStart);} return (A) this;
    }

    public Boolean hasPostStart(){
            return this.postStart != null;
    }

    public LifecycleFluent.PostStartNested<A> withNewPostStart(){
            return new PostStartNestedImpl();
    }

    public LifecycleFluent.PostStartNested<A> withNewPostStartLike(Handler item){
            return new PostStartNestedImpl(item);
    }

    public LifecycleFluent.PostStartNested<A> editPostStart(){
            return withNewPostStartLike(getPostStart());
    }

    public LifecycleFluent.PostStartNested<A> editOrNewPostStart(){
            return withNewPostStartLike(getPostStart() != null ? getPostStart(): new HandlerBuilder().build());
    }

    public LifecycleFluent.PostStartNested<A> editOrNewPostStartLike(Handler item){
            return withNewPostStartLike(getPostStart() != null ? getPostStart(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPreStop instead.
 * @return The buildable object.
 */
@Deprecated public Handler getPreStop(){
            return this.preStop!=null?this.preStop.build():null;
    }

    public Handler buildPreStop(){
            return this.preStop!=null?this.preStop.build():null;
    }

    public A withPreStop(Handler preStop){
            _visitables.remove(this.preStop);
            if (preStop!=null){ this.preStop= new HandlerBuilder(preStop); _visitables.add(this.preStop);} return (A) this;
    }

    public Boolean hasPreStop(){
            return this.preStop != null;
    }

    public LifecycleFluent.PreStopNested<A> withNewPreStop(){
            return new PreStopNestedImpl();
    }

    public LifecycleFluent.PreStopNested<A> withNewPreStopLike(Handler item){
            return new PreStopNestedImpl(item);
    }

    public LifecycleFluent.PreStopNested<A> editPreStop(){
            return withNewPreStopLike(getPreStop());
    }

    public LifecycleFluent.PreStopNested<A> editOrNewPreStop(){
            return withNewPreStopLike(getPreStop() != null ? getPreStop(): new HandlerBuilder().build());
    }

    public LifecycleFluent.PreStopNested<A> editOrNewPreStopLike(Handler item){
            return withNewPreStopLike(getPreStop() != null ? getPreStop(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LifecycleFluentImpl that = (LifecycleFluentImpl) o;
            if (postStart != null ? !postStart.equals(that.postStart) :that.postStart != null) return false;
            if (preStop != null ? !preStop.equals(that.preStop) :that.preStop != null) return false;
            return true;
    }


    public class PostStartNestedImpl<N> extends HandlerFluentImpl<LifecycleFluent.PostStartNested<N>> implements LifecycleFluent.PostStartNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HandlerBuilder builder;
    
            PostStartNestedImpl(Handler item){
                    this.builder = new HandlerBuilder(this, item);
            }
            PostStartNestedImpl(){
                    this.builder = new HandlerBuilder(this);
            }
    
    public N and(){
            return (N) LifecycleFluentImpl.this.withPostStart(builder.build());
    }
    public N endPostStart(){
            return and();
    }

}
    public class PreStopNestedImpl<N> extends HandlerFluentImpl<LifecycleFluent.PreStopNested<N>> implements LifecycleFluent.PreStopNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final HandlerBuilder builder;
    
            PreStopNestedImpl(Handler item){
                    this.builder = new HandlerBuilder(this, item);
            }
            PreStopNestedImpl(){
                    this.builder = new HandlerBuilder(this);
            }
    
    public N and(){
            return (N) LifecycleFluentImpl.this.withPreStop(builder.build());
    }
    public N endPreStop(){
            return and();
    }

}


}
