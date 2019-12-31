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

public interface ImageChangeCauseFluent<A extends ImageChangeCauseFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildFromRef instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFromRef();
    public ObjectReference buildFromRef();
    public A withFromRef(ObjectReference fromRef);
    public Boolean hasFromRef();
    public ImageChangeCauseFluent.FromRefNested<A> withNewFromRef();
    public ImageChangeCauseFluent.FromRefNested<A> withNewFromRefLike(ObjectReference item);
    public ImageChangeCauseFluent.FromRefNested<A> editFromRef();
    public ImageChangeCauseFluent.FromRefNested<A> editOrNewFromRef();
    public ImageChangeCauseFluent.FromRefNested<A> editOrNewFromRefLike(ObjectReference item);
    public String getImageID();
    public A withImageID(String imageID);
    public Boolean hasImageID();

    public interface FromRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<ImageChangeCauseFluent.FromRefNested<N>>{

        
    public N and();    public N endFromRef();
}


}
