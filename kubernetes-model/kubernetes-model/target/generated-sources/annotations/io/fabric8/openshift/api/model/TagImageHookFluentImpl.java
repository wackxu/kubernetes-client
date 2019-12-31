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

public class TagImageHookFluentImpl<A extends TagImageHookFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TagImageHookFluent<A>{

    private String containerName;
    private ObjectReferenceBuilder to;

    public TagImageHookFluentImpl(){
    }
    public TagImageHookFluentImpl(TagImageHook instance){
            this.withContainerName(instance.getContainerName()); 
            this.withTo(instance.getTo()); 
    }

    public String getContainerName(){
            return this.containerName;
    }

    public A withContainerName(String containerName){
            this.containerName=containerName; return (A) this;
    }

    public Boolean hasContainerName(){
            return this.containerName != null;
    }

    
/**
 * This method has been deprecated, please use method buildTo instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getTo(){
            return this.to!=null?this.to.build():null;
    }

    public ObjectReference buildTo(){
            return this.to!=null?this.to.build():null;
    }

    public A withTo(ObjectReference to){
            _visitables.remove(this.to);
            if (to!=null){ this.to= new ObjectReferenceBuilder(to); _visitables.add(this.to);} return (A) this;
    }

    public Boolean hasTo(){
            return this.to != null;
    }

    public TagImageHookFluent.ToNested<A> withNewTo(){
            return new ToNestedImpl();
    }

    public TagImageHookFluent.ToNested<A> withNewToLike(ObjectReference item){
            return new ToNestedImpl(item);
    }

    public TagImageHookFluent.ToNested<A> editTo(){
            return withNewToLike(getTo());
    }

    public TagImageHookFluent.ToNested<A> editOrNewTo(){
            return withNewToLike(getTo() != null ? getTo(): new ObjectReferenceBuilder().build());
    }

    public TagImageHookFluent.ToNested<A> editOrNewToLike(ObjectReference item){
            return withNewToLike(getTo() != null ? getTo(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TagImageHookFluentImpl that = (TagImageHookFluentImpl) o;
            if (containerName != null ? !containerName.equals(that.containerName) :that.containerName != null) return false;
            if (to != null ? !to.equals(that.to) :that.to != null) return false;
            return true;
    }


    public class ToNestedImpl<N> extends ObjectReferenceFluentImpl<TagImageHookFluent.ToNested<N>> implements TagImageHookFluent.ToNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            ToNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            ToNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) TagImageHookFluentImpl.this.withTo(builder.build());
    }
    public N endTo(){
            return and();
    }

}


}
