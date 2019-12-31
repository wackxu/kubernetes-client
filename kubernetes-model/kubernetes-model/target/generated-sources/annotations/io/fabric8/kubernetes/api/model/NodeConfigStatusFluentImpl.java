package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class NodeConfigStatusFluentImpl<A extends NodeConfigStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NodeConfigStatusFluent<A>{

    private NodeConfigSourceBuilder active;
    private NodeConfigSourceBuilder assigned;
    private String error;
    private NodeConfigSourceBuilder lastKnownGood;

    public NodeConfigStatusFluentImpl(){
    }
    public NodeConfigStatusFluentImpl(NodeConfigStatus instance){
            this.withActive(instance.getActive()); 
            this.withAssigned(instance.getAssigned()); 
            this.withError(instance.getError()); 
            this.withLastKnownGood(instance.getLastKnownGood()); 
    }

    
/**
 * This method has been deprecated, please use method buildActive instead.
 * @return The buildable object.
 */
@Deprecated public NodeConfigSource getActive(){
            return this.active!=null?this.active.build():null;
    }

    public NodeConfigSource buildActive(){
            return this.active!=null?this.active.build():null;
    }

    public A withActive(NodeConfigSource active){
            _visitables.remove(this.active);
            if (active!=null){ this.active= new NodeConfigSourceBuilder(active); _visitables.add(this.active);} return (A) this;
    }

    public Boolean hasActive(){
            return this.active != null;
    }

    public NodeConfigStatusFluent.ActiveNested<A> withNewActive(){
            return new ActiveNestedImpl();
    }

    public NodeConfigStatusFluent.ActiveNested<A> withNewActiveLike(NodeConfigSource item){
            return new ActiveNestedImpl(item);
    }

    public NodeConfigStatusFluent.ActiveNested<A> editActive(){
            return withNewActiveLike(getActive());
    }

    public NodeConfigStatusFluent.ActiveNested<A> editOrNewActive(){
            return withNewActiveLike(getActive() != null ? getActive(): new NodeConfigSourceBuilder().build());
    }

    public NodeConfigStatusFluent.ActiveNested<A> editOrNewActiveLike(NodeConfigSource item){
            return withNewActiveLike(getActive() != null ? getActive(): item);
    }

    
/**
 * This method has been deprecated, please use method buildAssigned instead.
 * @return The buildable object.
 */
@Deprecated public NodeConfigSource getAssigned(){
            return this.assigned!=null?this.assigned.build():null;
    }

    public NodeConfigSource buildAssigned(){
            return this.assigned!=null?this.assigned.build():null;
    }

    public A withAssigned(NodeConfigSource assigned){
            _visitables.remove(this.assigned);
            if (assigned!=null){ this.assigned= new NodeConfigSourceBuilder(assigned); _visitables.add(this.assigned);} return (A) this;
    }

    public Boolean hasAssigned(){
            return this.assigned != null;
    }

    public NodeConfigStatusFluent.AssignedNested<A> withNewAssigned(){
            return new AssignedNestedImpl();
    }

    public NodeConfigStatusFluent.AssignedNested<A> withNewAssignedLike(NodeConfigSource item){
            return new AssignedNestedImpl(item);
    }

    public NodeConfigStatusFluent.AssignedNested<A> editAssigned(){
            return withNewAssignedLike(getAssigned());
    }

    public NodeConfigStatusFluent.AssignedNested<A> editOrNewAssigned(){
            return withNewAssignedLike(getAssigned() != null ? getAssigned(): new NodeConfigSourceBuilder().build());
    }

    public NodeConfigStatusFluent.AssignedNested<A> editOrNewAssignedLike(NodeConfigSource item){
            return withNewAssignedLike(getAssigned() != null ? getAssigned(): item);
    }

    public String getError(){
            return this.error;
    }

    public A withError(String error){
            this.error=error; return (A) this;
    }

    public Boolean hasError(){
            return this.error != null;
    }

    
/**
 * This method has been deprecated, please use method buildLastKnownGood instead.
 * @return The buildable object.
 */
@Deprecated public NodeConfigSource getLastKnownGood(){
            return this.lastKnownGood!=null?this.lastKnownGood.build():null;
    }

    public NodeConfigSource buildLastKnownGood(){
            return this.lastKnownGood!=null?this.lastKnownGood.build():null;
    }

    public A withLastKnownGood(NodeConfigSource lastKnownGood){
            _visitables.remove(this.lastKnownGood);
            if (lastKnownGood!=null){ this.lastKnownGood= new NodeConfigSourceBuilder(lastKnownGood); _visitables.add(this.lastKnownGood);} return (A) this;
    }

    public Boolean hasLastKnownGood(){
            return this.lastKnownGood != null;
    }

    public NodeConfigStatusFluent.LastKnownGoodNested<A> withNewLastKnownGood(){
            return new LastKnownGoodNestedImpl();
    }

    public NodeConfigStatusFluent.LastKnownGoodNested<A> withNewLastKnownGoodLike(NodeConfigSource item){
            return new LastKnownGoodNestedImpl(item);
    }

    public NodeConfigStatusFluent.LastKnownGoodNested<A> editLastKnownGood(){
            return withNewLastKnownGoodLike(getLastKnownGood());
    }

    public NodeConfigStatusFluent.LastKnownGoodNested<A> editOrNewLastKnownGood(){
            return withNewLastKnownGoodLike(getLastKnownGood() != null ? getLastKnownGood(): new NodeConfigSourceBuilder().build());
    }

    public NodeConfigStatusFluent.LastKnownGoodNested<A> editOrNewLastKnownGoodLike(NodeConfigSource item){
            return withNewLastKnownGoodLike(getLastKnownGood() != null ? getLastKnownGood(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NodeConfigStatusFluentImpl that = (NodeConfigStatusFluentImpl) o;
            if (active != null ? !active.equals(that.active) :that.active != null) return false;
            if (assigned != null ? !assigned.equals(that.assigned) :that.assigned != null) return false;
            if (error != null ? !error.equals(that.error) :that.error != null) return false;
            if (lastKnownGood != null ? !lastKnownGood.equals(that.lastKnownGood) :that.lastKnownGood != null) return false;
            return true;
    }


    public class ActiveNestedImpl<N> extends NodeConfigSourceFluentImpl<NodeConfigStatusFluent.ActiveNested<N>> implements NodeConfigStatusFluent.ActiveNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeConfigSourceBuilder builder;
    
            ActiveNestedImpl(NodeConfigSource item){
                    this.builder = new NodeConfigSourceBuilder(this, item);
            }
            ActiveNestedImpl(){
                    this.builder = new NodeConfigSourceBuilder(this);
            }
    
    public N and(){
            return (N) NodeConfigStatusFluentImpl.this.withActive(builder.build());
    }
    public N endActive(){
            return and();
    }

}
    public class AssignedNestedImpl<N> extends NodeConfigSourceFluentImpl<NodeConfigStatusFluent.AssignedNested<N>> implements NodeConfigStatusFluent.AssignedNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeConfigSourceBuilder builder;
    
            AssignedNestedImpl(NodeConfigSource item){
                    this.builder = new NodeConfigSourceBuilder(this, item);
            }
            AssignedNestedImpl(){
                    this.builder = new NodeConfigSourceBuilder(this);
            }
    
    public N and(){
            return (N) NodeConfigStatusFluentImpl.this.withAssigned(builder.build());
    }
    public N endAssigned(){
            return and();
    }

}
    public class LastKnownGoodNestedImpl<N> extends NodeConfigSourceFluentImpl<NodeConfigStatusFluent.LastKnownGoodNested<N>> implements NodeConfigStatusFluent.LastKnownGoodNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NodeConfigSourceBuilder builder;
    
            LastKnownGoodNestedImpl(NodeConfigSource item){
                    this.builder = new NodeConfigSourceBuilder(this, item);
            }
            LastKnownGoodNestedImpl(){
                    this.builder = new NodeConfigSourceBuilder(this);
            }
    
    public N and(){
            return (N) NodeConfigStatusFluentImpl.this.withLastKnownGood(builder.build());
    }
    public N endLastKnownGood(){
            return and();
    }

}


}
