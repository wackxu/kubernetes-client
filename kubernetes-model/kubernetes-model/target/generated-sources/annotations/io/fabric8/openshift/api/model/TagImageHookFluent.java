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

public interface TagImageHookFluent<A extends TagImageHookFluent<A>> extends Fluent<A>{


    public String getContainerName();
    public A withContainerName(String containerName);
    public Boolean hasContainerName();
    
/**
 * This method has been deprecated, please use method buildTo instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getTo();
    public ObjectReference buildTo();
    public A withTo(ObjectReference to);
    public Boolean hasTo();
    public TagImageHookFluent.ToNested<A> withNewTo();
    public TagImageHookFluent.ToNested<A> withNewToLike(ObjectReference item);
    public TagImageHookFluent.ToNested<A> editTo();
    public TagImageHookFluent.ToNested<A> editOrNewTo();
    public TagImageHookFluent.ToNested<A> editOrNewToLike(ObjectReference item);

    public interface ToNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<TagImageHookFluent.ToNested<N>>{

        
    public N and();    public N endTo();
}


}
