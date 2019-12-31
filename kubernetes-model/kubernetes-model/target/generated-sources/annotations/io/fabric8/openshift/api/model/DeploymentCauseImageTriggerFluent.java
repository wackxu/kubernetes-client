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

public interface DeploymentCauseImageTriggerFluent<A extends DeploymentCauseImageTriggerFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom();
    public ObjectReference buildFrom();
    public A withFrom(ObjectReference from);
    public Boolean hasFrom();
    public DeploymentCauseImageTriggerFluent.FromNested<A> withNewFrom();
    public DeploymentCauseImageTriggerFluent.FromNested<A> withNewFromLike(ObjectReference item);
    public DeploymentCauseImageTriggerFluent.FromNested<A> editFrom();
    public DeploymentCauseImageTriggerFluent.FromNested<A> editOrNewFrom();
    public DeploymentCauseImageTriggerFluent.FromNested<A> editOrNewFromLike(ObjectReference item);

    public interface FromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<DeploymentCauseImageTriggerFluent.FromNested<N>>{

        
    public N and();    public N endFrom();
}


}
