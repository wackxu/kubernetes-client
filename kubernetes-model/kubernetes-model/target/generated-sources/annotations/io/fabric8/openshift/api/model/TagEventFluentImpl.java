package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class TagEventFluentImpl<A extends TagEventFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TagEventFluent<A>{

    private String created;
    private String dockerImageReference;
    private Long generation;
    private String image;

    public TagEventFluentImpl(){
    }
    public TagEventFluentImpl(TagEvent instance){
            this.withCreated(instance.getCreated()); 
            this.withDockerImageReference(instance.getDockerImageReference()); 
            this.withGeneration(instance.getGeneration()); 
            this.withImage(instance.getImage()); 
    }

    public String getCreated(){
            return this.created;
    }

    public A withCreated(String created){
            this.created=created; return (A) this;
    }

    public Boolean hasCreated(){
            return this.created != null;
    }

    public String getDockerImageReference(){
            return this.dockerImageReference;
    }

    public A withDockerImageReference(String dockerImageReference){
            this.dockerImageReference=dockerImageReference; return (A) this;
    }

    public Boolean hasDockerImageReference(){
            return this.dockerImageReference != null;
    }

    public Long getGeneration(){
            return this.generation;
    }

    public A withGeneration(Long generation){
            this.generation=generation; return (A) this;
    }

    public Boolean hasGeneration(){
            return this.generation != null;
    }

    public A withNewGeneration(String arg1){
            return (A)withGeneration(new Long(arg1));
    }

    public A withNewGeneration(long arg1){
            return (A)withGeneration(new Long(arg1));
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TagEventFluentImpl that = (TagEventFluentImpl) o;
            if (created != null ? !created.equals(that.created) :that.created != null) return false;
            if (dockerImageReference != null ? !dockerImageReference.equals(that.dockerImageReference) :that.dockerImageReference != null) return false;
            if (generation != null ? !generation.equals(that.generation) :that.generation != null) return false;
            if (image != null ? !image.equals(that.image) :that.image != null) return false;
            return true;
    }




}
