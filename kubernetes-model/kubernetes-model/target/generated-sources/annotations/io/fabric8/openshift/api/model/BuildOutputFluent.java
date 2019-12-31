package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface BuildOutputFluent<A extends BuildOutputFluent<A>> extends Fluent<A>{


    public A addToImageLabels(int index,ImageLabel item);
    public A setToImageLabels(int index,ImageLabel item);
    public A addToImageLabels(ImageLabel... items);
    public A addAllToImageLabels(Collection<ImageLabel> items);
    public A removeFromImageLabels(ImageLabel... items);
    public A removeAllFromImageLabels(Collection<ImageLabel> items);
    
/**
 * This method has been deprecated, please use method buildImageLabels instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageLabel> getImageLabels();
    public List<ImageLabel> buildImageLabels();
    public ImageLabel buildImageLabel(int index);
    public ImageLabel buildFirstImageLabel();
    public ImageLabel buildLastImageLabel();
    public ImageLabel buildMatchingImageLabel(io.fabric8.kubernetes.api.builder.Predicate<ImageLabelBuilder> predicate);
    public A withImageLabels(List<ImageLabel> imageLabels);
    public A withImageLabels(ImageLabel... imageLabels);
    public Boolean hasImageLabels();
    public A addNewImageLabel(String name,String value);
    public BuildOutputFluent.ImageLabelsNested<A> addNewImageLabel();
    public BuildOutputFluent.ImageLabelsNested<A> addNewImageLabelLike(ImageLabel item);
    public BuildOutputFluent.ImageLabelsNested<A> setNewImageLabelLike(int index,ImageLabel item);
    public BuildOutputFluent.ImageLabelsNested<A> editImageLabel(int index);
    public BuildOutputFluent.ImageLabelsNested<A> editFirstImageLabel();
    public BuildOutputFluent.ImageLabelsNested<A> editLastImageLabel();
    public BuildOutputFluent.ImageLabelsNested<A> editMatchingImageLabel(io.fabric8.kubernetes.api.builder.Predicate<ImageLabelBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildPushSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getPushSecret();
    public LocalObjectReference buildPushSecret();
    public A withPushSecret(LocalObjectReference pushSecret);
    public Boolean hasPushSecret();
    public A withNewPushSecret(String name);
    public BuildOutputFluent.PushSecretNested<A> withNewPushSecret();
    public BuildOutputFluent.PushSecretNested<A> withNewPushSecretLike(LocalObjectReference item);
    public BuildOutputFluent.PushSecretNested<A> editPushSecret();
    public BuildOutputFluent.PushSecretNested<A> editOrNewPushSecret();
    public BuildOutputFluent.PushSecretNested<A> editOrNewPushSecretLike(LocalObjectReference item);
    
/**
 * This method has been deprecated, please use method buildTo instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getTo();
    public ObjectReference buildTo();
    public A withTo(ObjectReference to);
    public Boolean hasTo();
    public BuildOutputFluent.ToNested<A> withNewTo();
    public BuildOutputFluent.ToNested<A> withNewToLike(ObjectReference item);
    public BuildOutputFluent.ToNested<A> editTo();
    public BuildOutputFluent.ToNested<A> editOrNewTo();
    public BuildOutputFluent.ToNested<A> editOrNewToLike(ObjectReference item);

    public interface ImageLabelsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageLabelFluent<BuildOutputFluent.ImageLabelsNested<N>>{

        
    public N and();    public N endImageLabel();
}
    public interface PushSecretNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<BuildOutputFluent.PushSecretNested<N>>{

        
    public N and();    public N endPushSecret();
}
    public interface ToNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<BuildOutputFluent.ToNested<N>>{

        
    public N and();    public N endTo();
}


}
