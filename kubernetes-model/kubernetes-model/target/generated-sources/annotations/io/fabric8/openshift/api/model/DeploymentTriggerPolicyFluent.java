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

public interface DeploymentTriggerPolicyFluent<A extends DeploymentTriggerPolicyFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildImageChangeParams instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentTriggerImageChangeParams getImageChangeParams();
    public DeploymentTriggerImageChangeParams buildImageChangeParams();
    public A withImageChangeParams(DeploymentTriggerImageChangeParams imageChangeParams);
    public Boolean hasImageChangeParams();
    public DeploymentTriggerPolicyFluent.ImageChangeParamsNested<A> withNewImageChangeParams();
    public DeploymentTriggerPolicyFluent.ImageChangeParamsNested<A> withNewImageChangeParamsLike(DeploymentTriggerImageChangeParams item);
    public DeploymentTriggerPolicyFluent.ImageChangeParamsNested<A> editImageChangeParams();
    public DeploymentTriggerPolicyFluent.ImageChangeParamsNested<A> editOrNewImageChangeParams();
    public DeploymentTriggerPolicyFluent.ImageChangeParamsNested<A> editOrNewImageChangeParamsLike(DeploymentTriggerImageChangeParams item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface ImageChangeParamsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentTriggerImageChangeParamsFluent<DeploymentTriggerPolicyFluent.ImageChangeParamsNested<N>>{

        
    public N and();    public N endImageChangeParams();
}


}
