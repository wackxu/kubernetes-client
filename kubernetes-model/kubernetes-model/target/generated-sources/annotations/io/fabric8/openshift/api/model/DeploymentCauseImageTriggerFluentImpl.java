package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class DeploymentCauseImageTriggerFluentImpl<A extends DeploymentCauseImageTriggerFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeploymentCauseImageTriggerFluent<A>{

    private ObjectReferenceBuilder from;

    public DeploymentCauseImageTriggerFluentImpl(){
    }
    public DeploymentCauseImageTriggerFluentImpl(DeploymentCauseImageTrigger instance){
            this.withFrom(instance.getFrom()); 
    }

    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom(){
            return this.from!=null?this.from.build():null;
    }

    public ObjectReference buildFrom(){
            return this.from!=null?this.from.build():null;
    }

    public A withFrom(ObjectReference from){
            _visitables.remove(this.from);
            if (from!=null){ this.from= new ObjectReferenceBuilder(from); _visitables.add(this.from);} return (A) this;
    }

    public Boolean hasFrom(){
            return this.from != null;
    }

    public DeploymentCauseImageTriggerFluent.FromNested<A> withNewFrom(){
            return new FromNestedImpl();
    }

    public DeploymentCauseImageTriggerFluent.FromNested<A> withNewFromLike(ObjectReference item){
            return new FromNestedImpl(item);
    }

    public DeploymentCauseImageTriggerFluent.FromNested<A> editFrom(){
            return withNewFromLike(getFrom());
    }

    public DeploymentCauseImageTriggerFluent.FromNested<A> editOrNewFrom(){
            return withNewFromLike(getFrom() != null ? getFrom(): new ObjectReferenceBuilder().build());
    }

    public DeploymentCauseImageTriggerFluent.FromNested<A> editOrNewFromLike(ObjectReference item){
            return withNewFromLike(getFrom() != null ? getFrom(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentCauseImageTriggerFluentImpl that = (DeploymentCauseImageTriggerFluentImpl) o;
            if (from != null ? !from.equals(that.from) :that.from != null) return false;
            return true;
    }


    public class FromNestedImpl<N> extends ObjectReferenceFluentImpl<DeploymentCauseImageTriggerFluent.FromNested<N>> implements DeploymentCauseImageTriggerFluent.FromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            FromNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            FromNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentCauseImageTriggerFluentImpl.this.withFrom(builder.build());
    }
    public N endFrom(){
            return and();
    }

}


}
