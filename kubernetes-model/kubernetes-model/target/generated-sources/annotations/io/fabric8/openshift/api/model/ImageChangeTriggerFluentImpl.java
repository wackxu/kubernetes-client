package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class ImageChangeTriggerFluentImpl<A extends ImageChangeTriggerFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageChangeTriggerFluent<A>{

    private ObjectReferenceBuilder from;
    private String lastTriggeredImageID;
    private Boolean paused;

    public ImageChangeTriggerFluentImpl(){
    }
    public ImageChangeTriggerFluentImpl(ImageChangeTrigger instance){
            this.withFrom(instance.getFrom()); 
            this.withLastTriggeredImageID(instance.getLastTriggeredImageID()); 
            this.withPaused(instance.getPaused()); 
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

    public ImageChangeTriggerFluent.FromNested<A> withNewFrom(){
            return new FromNestedImpl();
    }

    public ImageChangeTriggerFluent.FromNested<A> withNewFromLike(ObjectReference item){
            return new FromNestedImpl(item);
    }

    public ImageChangeTriggerFluent.FromNested<A> editFrom(){
            return withNewFromLike(getFrom());
    }

    public ImageChangeTriggerFluent.FromNested<A> editOrNewFrom(){
            return withNewFromLike(getFrom() != null ? getFrom(): new ObjectReferenceBuilder().build());
    }

    public ImageChangeTriggerFluent.FromNested<A> editOrNewFromLike(ObjectReference item){
            return withNewFromLike(getFrom() != null ? getFrom(): item);
    }

    public String getLastTriggeredImageID(){
            return this.lastTriggeredImageID;
    }

    public A withLastTriggeredImageID(String lastTriggeredImageID){
            this.lastTriggeredImageID=lastTriggeredImageID; return (A) this;
    }

    public Boolean hasLastTriggeredImageID(){
            return this.lastTriggeredImageID != null;
    }

    public Boolean isPaused(){
            return this.paused;
    }

    public A withPaused(Boolean paused){
            this.paused=paused; return (A) this;
    }

    public Boolean hasPaused(){
            return this.paused != null;
    }

    public A withNewPaused(String arg1){
            return (A)withPaused(new Boolean(arg1));
    }

    public A withNewPaused(boolean arg1){
            return (A)withPaused(new Boolean(arg1));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageChangeTriggerFluentImpl that = (ImageChangeTriggerFluentImpl) o;
            if (from != null ? !from.equals(that.from) :that.from != null) return false;
            if (lastTriggeredImageID != null ? !lastTriggeredImageID.equals(that.lastTriggeredImageID) :that.lastTriggeredImageID != null) return false;
            if (paused != null ? !paused.equals(that.paused) :that.paused != null) return false;
            return true;
    }


    public class FromNestedImpl<N> extends ObjectReferenceFluentImpl<ImageChangeTriggerFluent.FromNested<N>> implements ImageChangeTriggerFluent.FromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            FromNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            FromNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ImageChangeTriggerFluentImpl.this.withFrom(builder.build());
    }
    public N endFrom(){
            return and();
    }

}


}
