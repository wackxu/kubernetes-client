package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class DeploymentCauseFluentImpl<A extends DeploymentCauseFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DeploymentCauseFluent<A>{

    private DeploymentCauseImageTriggerBuilder imageTrigger;
    private String type;

    public DeploymentCauseFluentImpl(){
    }
    public DeploymentCauseFluentImpl(DeploymentCause instance){
            this.withImageTrigger(instance.getImageTrigger()); 
            this.withType(instance.getType()); 
    }

    
/**
 * This method has been deprecated, please use method buildImageTrigger instead.
 * @return The buildable object.
 */
@Deprecated public DeploymentCauseImageTrigger getImageTrigger(){
            return this.imageTrigger!=null?this.imageTrigger.build():null;
    }

    public DeploymentCauseImageTrigger buildImageTrigger(){
            return this.imageTrigger!=null?this.imageTrigger.build():null;
    }

    public A withImageTrigger(DeploymentCauseImageTrigger imageTrigger){
            _visitables.remove(this.imageTrigger);
            if (imageTrigger!=null){ this.imageTrigger= new DeploymentCauseImageTriggerBuilder(imageTrigger); _visitables.add(this.imageTrigger);} return (A) this;
    }

    public Boolean hasImageTrigger(){
            return this.imageTrigger != null;
    }

    public DeploymentCauseFluent.ImageTriggerNested<A> withNewImageTrigger(){
            return new ImageTriggerNestedImpl();
    }

    public DeploymentCauseFluent.ImageTriggerNested<A> withNewImageTriggerLike(DeploymentCauseImageTrigger item){
            return new ImageTriggerNestedImpl(item);
    }

    public DeploymentCauseFluent.ImageTriggerNested<A> editImageTrigger(){
            return withNewImageTriggerLike(getImageTrigger());
    }

    public DeploymentCauseFluent.ImageTriggerNested<A> editOrNewImageTrigger(){
            return withNewImageTriggerLike(getImageTrigger() != null ? getImageTrigger(): new DeploymentCauseImageTriggerBuilder().build());
    }

    public DeploymentCauseFluent.ImageTriggerNested<A> editOrNewImageTriggerLike(DeploymentCauseImageTrigger item){
            return withNewImageTriggerLike(getImageTrigger() != null ? getImageTrigger(): item);
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
            DeploymentCauseFluentImpl that = (DeploymentCauseFluentImpl) o;
            if (imageTrigger != null ? !imageTrigger.equals(that.imageTrigger) :that.imageTrigger != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class ImageTriggerNestedImpl<N> extends DeploymentCauseImageTriggerFluentImpl<DeploymentCauseFluent.ImageTriggerNested<N>> implements DeploymentCauseFluent.ImageTriggerNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final DeploymentCauseImageTriggerBuilder builder;
    
            ImageTriggerNestedImpl(DeploymentCauseImageTrigger item){
                    this.builder = new DeploymentCauseImageTriggerBuilder(this, item);
            }
            ImageTriggerNestedImpl(){
                    this.builder = new DeploymentCauseImageTriggerBuilder(this);
            }
    
    public N and(){
            return (N) DeploymentCauseFluentImpl.this.withImageTrigger(builder.build());
    }
    public N endImageTrigger(){
            return and();
    }

}


}
