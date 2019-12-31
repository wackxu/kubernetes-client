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

public class ImageChangeCauseFluentImpl<A extends ImageChangeCauseFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageChangeCauseFluent<A>{

    private ObjectReferenceBuilder fromRef;
    private String imageID;

    public ImageChangeCauseFluentImpl(){
    }
    public ImageChangeCauseFluentImpl(ImageChangeCause instance){
            this.withFromRef(instance.getFromRef()); 
            this.withImageID(instance.getImageID()); 
    }

    
/**
 * This method has been deprecated, please use method buildFromRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFromRef(){
            return this.fromRef!=null?this.fromRef.build():null;
    }

    public ObjectReference buildFromRef(){
            return this.fromRef!=null?this.fromRef.build():null;
    }

    public A withFromRef(ObjectReference fromRef){
            _visitables.remove(this.fromRef);
            if (fromRef!=null){ this.fromRef= new ObjectReferenceBuilder(fromRef); _visitables.add(this.fromRef);} return (A) this;
    }

    public Boolean hasFromRef(){
            return this.fromRef != null;
    }

    public ImageChangeCauseFluent.FromRefNested<A> withNewFromRef(){
            return new FromRefNestedImpl();
    }

    public ImageChangeCauseFluent.FromRefNested<A> withNewFromRefLike(ObjectReference item){
            return new FromRefNestedImpl(item);
    }

    public ImageChangeCauseFluent.FromRefNested<A> editFromRef(){
            return withNewFromRefLike(getFromRef());
    }

    public ImageChangeCauseFluent.FromRefNested<A> editOrNewFromRef(){
            return withNewFromRefLike(getFromRef() != null ? getFromRef(): new ObjectReferenceBuilder().build());
    }

    public ImageChangeCauseFluent.FromRefNested<A> editOrNewFromRefLike(ObjectReference item){
            return withNewFromRefLike(getFromRef() != null ? getFromRef(): item);
    }

    public String getImageID(){
            return this.imageID;
    }

    public A withImageID(String imageID){
            this.imageID=imageID; return (A) this;
    }

    public Boolean hasImageID(){
            return this.imageID != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageChangeCauseFluentImpl that = (ImageChangeCauseFluentImpl) o;
            if (fromRef != null ? !fromRef.equals(that.fromRef) :that.fromRef != null) return false;
            if (imageID != null ? !imageID.equals(that.imageID) :that.imageID != null) return false;
            return true;
    }


    public class FromRefNestedImpl<N> extends ObjectReferenceFluentImpl<ImageChangeCauseFluent.FromRefNested<N>> implements ImageChangeCauseFluent.FromRefNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            FromRefNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            FromRefNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ImageChangeCauseFluentImpl.this.withFromRef(builder.build());
    }
    public N endFromRef(){
            return and();
    }

}


}
