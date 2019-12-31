package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;

public class ContainerStateFluentImpl<A extends ContainerStateFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ContainerStateFluent<A>{

    private ContainerStateRunningBuilder running;
    private ContainerStateTerminatedBuilder terminated;
    private ContainerStateWaitingBuilder waiting;

    public ContainerStateFluentImpl(){
    }
    public ContainerStateFluentImpl(ContainerState instance){
            this.withRunning(instance.getRunning()); 
            this.withTerminated(instance.getTerminated()); 
            this.withWaiting(instance.getWaiting()); 
    }

    
/**
 * This method has been deprecated, please use method buildRunning instead.
 * @return The buildable object.
 */
@Deprecated public ContainerStateRunning getRunning(){
            return this.running!=null?this.running.build():null;
    }

    public ContainerStateRunning buildRunning(){
            return this.running!=null?this.running.build():null;
    }

    public A withRunning(ContainerStateRunning running){
            _visitables.remove(this.running);
            if (running!=null){ this.running= new ContainerStateRunningBuilder(running); _visitables.add(this.running);} return (A) this;
    }

    public Boolean hasRunning(){
            return this.running != null;
    }

    public A withNewRunning(String startedAt){
            return (A)withRunning(new ContainerStateRunning(startedAt));
    }

    public ContainerStateFluent.RunningNested<A> withNewRunning(){
            return new RunningNestedImpl();
    }

    public ContainerStateFluent.RunningNested<A> withNewRunningLike(ContainerStateRunning item){
            return new RunningNestedImpl(item);
    }

    public ContainerStateFluent.RunningNested<A> editRunning(){
            return withNewRunningLike(getRunning());
    }

    public ContainerStateFluent.RunningNested<A> editOrNewRunning(){
            return withNewRunningLike(getRunning() != null ? getRunning(): new ContainerStateRunningBuilder().build());
    }

    public ContainerStateFluent.RunningNested<A> editOrNewRunningLike(ContainerStateRunning item){
            return withNewRunningLike(getRunning() != null ? getRunning(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTerminated instead.
 * @return The buildable object.
 */
@Deprecated public ContainerStateTerminated getTerminated(){
            return this.terminated!=null?this.terminated.build():null;
    }

    public ContainerStateTerminated buildTerminated(){
            return this.terminated!=null?this.terminated.build():null;
    }

    public A withTerminated(ContainerStateTerminated terminated){
            _visitables.remove(this.terminated);
            if (terminated!=null){ this.terminated= new ContainerStateTerminatedBuilder(terminated); _visitables.add(this.terminated);} return (A) this;
    }

    public Boolean hasTerminated(){
            return this.terminated != null;
    }

    public ContainerStateFluent.TerminatedNested<A> withNewTerminated(){
            return new TerminatedNestedImpl();
    }

    public ContainerStateFluent.TerminatedNested<A> withNewTerminatedLike(ContainerStateTerminated item){
            return new TerminatedNestedImpl(item);
    }

    public ContainerStateFluent.TerminatedNested<A> editTerminated(){
            return withNewTerminatedLike(getTerminated());
    }

    public ContainerStateFluent.TerminatedNested<A> editOrNewTerminated(){
            return withNewTerminatedLike(getTerminated() != null ? getTerminated(): new ContainerStateTerminatedBuilder().build());
    }

    public ContainerStateFluent.TerminatedNested<A> editOrNewTerminatedLike(ContainerStateTerminated item){
            return withNewTerminatedLike(getTerminated() != null ? getTerminated(): item);
    }

    
/**
 * This method has been deprecated, please use method buildWaiting instead.
 * @return The buildable object.
 */
@Deprecated public ContainerStateWaiting getWaiting(){
            return this.waiting!=null?this.waiting.build():null;
    }

    public ContainerStateWaiting buildWaiting(){
            return this.waiting!=null?this.waiting.build():null;
    }

    public A withWaiting(ContainerStateWaiting waiting){
            _visitables.remove(this.waiting);
            if (waiting!=null){ this.waiting= new ContainerStateWaitingBuilder(waiting); _visitables.add(this.waiting);} return (A) this;
    }

    public Boolean hasWaiting(){
            return this.waiting != null;
    }

    public A withNewWaiting(String message,String reason){
            return (A)withWaiting(new ContainerStateWaiting(message, reason));
    }

    public ContainerStateFluent.WaitingNested<A> withNewWaiting(){
            return new WaitingNestedImpl();
    }

    public ContainerStateFluent.WaitingNested<A> withNewWaitingLike(ContainerStateWaiting item){
            return new WaitingNestedImpl(item);
    }

    public ContainerStateFluent.WaitingNested<A> editWaiting(){
            return withNewWaitingLike(getWaiting());
    }

    public ContainerStateFluent.WaitingNested<A> editOrNewWaiting(){
            return withNewWaitingLike(getWaiting() != null ? getWaiting(): new ContainerStateWaitingBuilder().build());
    }

    public ContainerStateFluent.WaitingNested<A> editOrNewWaitingLike(ContainerStateWaiting item){
            return withNewWaitingLike(getWaiting() != null ? getWaiting(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerStateFluentImpl that = (ContainerStateFluentImpl) o;
            if (running != null ? !running.equals(that.running) :that.running != null) return false;
            if (terminated != null ? !terminated.equals(that.terminated) :that.terminated != null) return false;
            if (waiting != null ? !waiting.equals(that.waiting) :that.waiting != null) return false;
            return true;
    }


    public class RunningNestedImpl<N> extends ContainerStateRunningFluentImpl<ContainerStateFluent.RunningNested<N>> implements ContainerStateFluent.RunningNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStateRunningBuilder builder;
    
            RunningNestedImpl(ContainerStateRunning item){
                    this.builder = new ContainerStateRunningBuilder(this, item);
            }
            RunningNestedImpl(){
                    this.builder = new ContainerStateRunningBuilder(this);
            }
    
    public N and(){
            return (N) ContainerStateFluentImpl.this.withRunning(builder.build());
    }
    public N endRunning(){
            return and();
    }

}
    public class TerminatedNestedImpl<N> extends ContainerStateTerminatedFluentImpl<ContainerStateFluent.TerminatedNested<N>> implements ContainerStateFluent.TerminatedNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStateTerminatedBuilder builder;
    
            TerminatedNestedImpl(ContainerStateTerminated item){
                    this.builder = new ContainerStateTerminatedBuilder(this, item);
            }
            TerminatedNestedImpl(){
                    this.builder = new ContainerStateTerminatedBuilder(this);
            }
    
    public N and(){
            return (N) ContainerStateFluentImpl.this.withTerminated(builder.build());
    }
    public N endTerminated(){
            return and();
    }

}
    public class WaitingNestedImpl<N> extends ContainerStateWaitingFluentImpl<ContainerStateFluent.WaitingNested<N>> implements ContainerStateFluent.WaitingNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStateWaitingBuilder builder;
    
            WaitingNestedImpl(ContainerStateWaiting item){
                    this.builder = new ContainerStateWaitingBuilder(this, item);
            }
            WaitingNestedImpl(){
                    this.builder = new ContainerStateWaitingBuilder(this);
            }
    
    public N and(){
            return (N) ContainerStateFluentImpl.this.withWaiting(builder.build());
    }
    public N endWaiting(){
            return and();
    }

}


}
