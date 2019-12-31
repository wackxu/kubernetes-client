package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class DeploymentTriggerPolicyFluentImpl<A extends DeploymentTriggerPolicyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeploymentTriggerPolicyFluent<A>{

    private DeploymentTriggerImageChangeParamsBuilder imageChangeParams;
    private String type;

    public DeploymentTriggerPolicyFluentImpl(){
    }
    public DeploymentTriggerPolicyFluentImpl(DeploymentTriggerPolicy instance){
            this.withImageChangeParams(instance.getImageChangeParams()); 
            this.withType(instance.getType()); 
    }

    
/**
 * This method has been deprecated, please use method buildImageChangeParams instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentTriggerImageChangeParams getImageChangeParams(){
            return this.imageChangeParams!=null?this.imageChangeParams.build():null;
    }

    public DeploymentTriggerImageChangeParams buildImageChangeParams(){
            return this.imageChangeParams!=null?this.imageChangeParams.build():null;
    }

    public A withImageChangeParams(DeploymentTriggerImageChangeParams imageChangeParams){
            _visitables.remove(this.imageChangeParams);
            if (imageChangeParams!=null){ this.imageChangeParams= new DeploymentTriggerImageChangeParamsBuilder(imageChangeParams); _visitables.add(this.imageChangeParams);} return (A) this;
    }

    public Boolean hasImageChangeParams(){
            return this.imageChangeParams != null;
    }

    public DeploymentTriggerPolicyFluent.ImageChangeParamsNested<A> withNewImageChangeParams(){
            return new ImageChangeParamsNestedImpl();
    }

    public DeploymentTriggerPolicyFluent.ImageChangeParamsNested<A> withNewImageChangeParamsLike(DeploymentTriggerImageChangeParams item){
            return new ImageChangeParamsNestedImpl(item);
    }

    public DeploymentTriggerPolicyFluent.ImageChangeParamsNested<A> editImageChangeParams(){
            return withNewImageChangeParamsLike(getImageChangeParams());
    }

    public DeploymentTriggerPolicyFluent.ImageChangeParamsNested<A> editOrNewImageChangeParams(){
            return withNewImageChangeParamsLike(getImageChangeParams() != null ? getImageChangeParams(): new DeploymentTriggerImageChangeParamsBuilder().build());
    }

    public DeploymentTriggerPolicyFluent.ImageChangeParamsNested<A> editOrNewImageChangeParamsLike(DeploymentTriggerImageChangeParams item){
            return withNewImageChangeParamsLike(getImageChangeParams() != null ? getImageChangeParams(): item);
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DeploymentTriggerPolicyFluentImpl that = (DeploymentTriggerPolicyFluentImpl) o;
            if (imageChangeParams != null ? !imageChangeParams.equals(that.imageChangeParams) :that.imageChangeParams != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class ImageChangeParamsNestedImpl<N> extends DeploymentTriggerImageChangeParamsFluentImpl<DeploymentTriggerPolicyFluent.ImageChangeParamsNested<N>> implements DeploymentTriggerPolicyFluent.ImageChangeParamsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentTriggerImageChangeParamsBuilder builder;
    
            ImageChangeParamsNestedImpl(DeploymentTriggerImageChangeParams item){
                    this.builder = new DeploymentTriggerImageChangeParamsBuilder(this, item);
            }
            ImageChangeParamsNestedImpl(){
                    this.builder = new DeploymentTriggerImageChangeParamsBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentTriggerPolicyFluentImpl.this.withImageChangeParams(builder.build());
    }
    public N endImageChangeParams(){
            return and();
    }

}


}
