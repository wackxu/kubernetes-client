package io.fabric8.kubernetes.api.model;

import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class ContainerStatusFluentImpl<A extends ContainerStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ContainerStatusFluent<A>{

    private String containerID;
    private String image;
    private String imageID;
    private ContainerStateBuilder lastState;
    private String name;
    private Boolean ready;
    private Integer restartCount;
    private ContainerStateBuilder state;

    public ContainerStatusFluentImpl(){
    }
    public ContainerStatusFluentImpl(ContainerStatus instance){
            this.withContainerID(instance.getContainerID()); 
            this.withImage(instance.getImage()); 
            this.withImageID(instance.getImageID()); 
            this.withLastState(instance.getLastState()); 
            this.withName(instance.getName()); 
            this.withReady(instance.getReady()); 
            this.withRestartCount(instance.getRestartCount()); 
            this.withState(instance.getState()); 
    }

    public String getContainerID(){
            return this.containerID;
    }

    public A withContainerID(String containerID){
            this.containerID=containerID; return (A) this;
    }

    public Boolean hasContainerID(){
            return this.containerID != null;
    }

    public String getImage(){
            return this.image;
    }

    public A withImage(String image){
            this.image=image; return (A) this;
    }

    public Boolean hasImage(){
            return this.image != null;
    }

    public String getImageID(){
            return this.imageID;
    }

    public A withImageID(String imageID){
            this.imageID=imageID; return (A) this;
    }

    public Boolean hasImageID(){
            return this.imageID != null;
    }

    
/**
 * This method has been deprecated, please use method buildLastState instead.
 * @return The buildable object.
 */
@Deprecated public ContainerState getLastState(){
            return this.lastState!=null?this.lastState.build():null;
    }

    public ContainerState buildLastState(){
            return this.lastState!=null?this.lastState.build():null;
    }

    public A withLastState(ContainerState lastState){
            _visitables.remove(this.lastState);
            if (lastState!=null){ this.lastState= new ContainerStateBuilder(lastState); _visitables.add(this.lastState);} return (A) this;
    }

    public Boolean hasLastState(){
            return this.lastState != null;
    }

    public ContainerStatusFluent.LastStateNested<A> withNewLastState(){
            return new LastStateNestedImpl();
    }

    public ContainerStatusFluent.LastStateNested<A> withNewLastStateLike(ContainerState item){
            return new LastStateNestedImpl(item);
    }

    public ContainerStatusFluent.LastStateNested<A> editLastState(){
            return withNewLastStateLike(getLastState());
    }

    public ContainerStatusFluent.LastStateNested<A> editOrNewLastState(){
            return withNewLastStateLike(getLastState() != null ? getLastState(): new ContainerStateBuilder().build());
    }

    public ContainerStatusFluent.LastStateNested<A> editOrNewLastStateLike(ContainerState item){
            return withNewLastStateLike(getLastState() != null ? getLastState(): item);
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public Boolean isReady(){
            return this.ready;
    }

    public A withReady(Boolean ready){
            this.ready=ready; return (A) this;
    }

    public Boolean hasReady(){
            return this.ready != null;
    }

    public A withNewReady(String arg1){
            return (A)withReady(new Boolean(arg1));
    }

    public A withNewReady(boolean arg1){
            return (A)withReady(new Boolean(arg1));
    }

    public Integer getRestartCount(){
            return this.restartCount;
    }

    public A withRestartCount(Integer restartCount){
            this.restartCount=restartCount; return (A) this;
    }

    public Boolean hasRestartCount(){
            return this.restartCount != null;
    }

    
/**
 * This method has been deprecated, please use method buildState instead.
 * @return The buildable object.
 */
@Deprecated public ContainerState getState(){
            return this.state!=null?this.state.build():null;
    }

    public ContainerState buildState(){
            return this.state!=null?this.state.build():null;
    }

    public A withState(ContainerState state){
            _visitables.remove(this.state);
            if (state!=null){ this.state= new ContainerStateBuilder(state); _visitables.add(this.state);} return (A) this;
    }

    public Boolean hasState(){
            return this.state != null;
    }

    public ContainerStatusFluent.StateNested<A> withNewState(){
            return new StateNestedImpl();
    }

    public ContainerStatusFluent.StateNested<A> withNewStateLike(ContainerState item){
            return new StateNestedImpl(item);
    }

    public ContainerStatusFluent.StateNested<A> editState(){
            return withNewStateLike(getState());
    }

    public ContainerStatusFluent.StateNested<A> editOrNewState(){
            return withNewStateLike(getState() != null ? getState(): new ContainerStateBuilder().build());
    }

    public ContainerStatusFluent.StateNested<A> editOrNewStateLike(ContainerState item){
            return withNewStateLike(getState() != null ? getState(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ContainerStatusFluentImpl that = (ContainerStatusFluentImpl) o;
            if (containerID != null ? !containerID.equals(that.containerID) :that.containerID != null) return false;
            if (image != null ? !image.equals(that.image) :that.image != null) return false;
            if (imageID != null ? !imageID.equals(that.imageID) :that.imageID != null) return false;
            if (lastState != null ? !lastState.equals(that.lastState) :that.lastState != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (ready != null ? !ready.equals(that.ready) :that.ready != null) return false;
            if (restartCount != null ? !restartCount.equals(that.restartCount) :that.restartCount != null) return false;
            if (state != null ? !state.equals(that.state) :that.state != null) return false;
            return true;
    }


    public class LastStateNestedImpl<N> extends ContainerStateFluentImpl<ContainerStatusFluent.LastStateNested<N>> implements ContainerStatusFluent.LastStateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStateBuilder builder;
    
            LastStateNestedImpl(ContainerState item){
                    this.builder = new ContainerStateBuilder(this, item);
            }
            LastStateNestedImpl(){
                    this.builder = new ContainerStateBuilder(this);
            }
    
    public N and(){
            return (N) ContainerStatusFluentImpl.this.withLastState(builder.build());
    }
    public N endLastState(){
            return and();
    }

}
    public class StateNestedImpl<N> extends ContainerStateFluentImpl<ContainerStatusFluent.StateNested<N>> implements ContainerStatusFluent.StateNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ContainerStateBuilder builder;
    
            StateNestedImpl(ContainerState item){
                    this.builder = new ContainerStateBuilder(this, item);
            }
            StateNestedImpl(){
                    this.builder = new ContainerStateBuilder(this);
            }
    
    public N and(){
            return (N) ContainerStatusFluentImpl.this.withState(builder.build());
    }
    public N endState(){
            return and();
    }

}


}
