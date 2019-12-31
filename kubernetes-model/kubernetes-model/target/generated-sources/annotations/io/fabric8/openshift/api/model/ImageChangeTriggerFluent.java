package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface ImageChangeTriggerFluent<A extends ImageChangeTriggerFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom();
    public ObjectReference buildFrom();
    public A withFrom(ObjectReference from);
    public Boolean hasFrom();
    public ImageChangeTriggerFluent.FromNested<A> withNewFrom();
    public ImageChangeTriggerFluent.FromNested<A> withNewFromLike(ObjectReference item);
    public ImageChangeTriggerFluent.FromNested<A> editFrom();
    public ImageChangeTriggerFluent.FromNested<A> editOrNewFrom();
    public ImageChangeTriggerFluent.FromNested<A> editOrNewFromLike(ObjectReference item);
    public String getLastTriggeredImageID();
    public A withLastTriggeredImageID(String lastTriggeredImageID);
    public Boolean hasLastTriggeredImageID();
    public Boolean isPaused();
    public A withPaused(Boolean paused);
    public Boolean hasPaused();
    public A withNewPaused(String arg1);
    public A withNewPaused(boolean arg1);

    public interface FromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<ImageChangeTriggerFluent.FromNested<N>>{

        
    public N and();    public N endFrom();
}


}
