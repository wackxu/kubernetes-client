package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface DeploymentCauseFluent<A extends DeploymentCauseFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildImageTrigger instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentCauseImageTrigger getImageTrigger();
    public DeploymentCauseImageTrigger buildImageTrigger();
    public A withImageTrigger(DeploymentCauseImageTrigger imageTrigger);
    public Boolean hasImageTrigger();
    public DeploymentCauseFluent.ImageTriggerNested<A> withNewImageTrigger();
    public DeploymentCauseFluent.ImageTriggerNested<A> withNewImageTriggerLike(DeploymentCauseImageTrigger item);
    public DeploymentCauseFluent.ImageTriggerNested<A> editImageTrigger();
    public DeploymentCauseFluent.ImageTriggerNested<A> editOrNewImageTrigger();
    public DeploymentCauseFluent.ImageTriggerNested<A> editOrNewImageTriggerLike(DeploymentCauseImageTrigger item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface ImageTriggerNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentCauseImageTriggerFluent<DeploymentCauseFluent.ImageTriggerNested<N>>{

        
    public N and();    public N endImageTrigger();
}


}
