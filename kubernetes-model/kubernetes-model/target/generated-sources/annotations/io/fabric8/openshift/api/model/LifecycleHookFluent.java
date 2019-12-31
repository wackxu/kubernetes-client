package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface LifecycleHookFluent<A extends LifecycleHookFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildExecNewPod instead.
 * @return The buildable object.
 */
@Deprecated public ExecNewPodHook getExecNewPod();
    public ExecNewPodHook buildExecNewPod();
    public A withExecNewPod(ExecNewPodHook execNewPod);
    public Boolean hasExecNewPod();
    public LifecycleHookFluent.ExecNewPodNested<A> withNewExecNewPod();
    public LifecycleHookFluent.ExecNewPodNested<A> withNewExecNewPodLike(ExecNewPodHook item);
    public LifecycleHookFluent.ExecNewPodNested<A> editExecNewPod();
    public LifecycleHookFluent.ExecNewPodNested<A> editOrNewExecNewPod();
    public LifecycleHookFluent.ExecNewPodNested<A> editOrNewExecNewPodLike(ExecNewPodHook item);
    public String getFailurePolicy();
    public A withFailurePolicy(String failurePolicy);
    public Boolean hasFailurePolicy();
    public A addToTagImages(int index,TagImageHook item);
    public A setToTagImages(int index,TagImageHook item);
    public A addToTagImages(TagImageHook... items);
    public A addAllToTagImages(Collection<TagImageHook> items);
    public A removeFromTagImages(TagImageHook... items);
    public A removeAllFromTagImages(Collection<TagImageHook> items);
    
/**
 * This method has been deprecated, please use method buildTagImages instead.
 * @return The buildable object.
 */
@Deprecated public List<TagImageHook> getTagImages();
    public List<TagImageHook> buildTagImages();
    public TagImageHook buildTagImage(int index);
    public TagImageHook buildFirstTagImage();
    public TagImageHook buildLastTagImage();
    public TagImageHook buildMatchingTagImage(io.fabric8.kubernetes.api.builder.Predicate<TagImageHookBuilder> predicate);
    public A withTagImages(List<TagImageHook> tagImages);
    public A withTagImages(TagImageHook... tagImages);
    public Boolean hasTagImages();
    public LifecycleHookFluent.TagImagesNested<A> addNewTagImage();
    public LifecycleHookFluent.TagImagesNested<A> addNewTagImageLike(TagImageHook item);
    public LifecycleHookFluent.TagImagesNested<A> setNewTagImageLike(int index,TagImageHook item);
    public LifecycleHookFluent.TagImagesNested<A> editTagImage(int index);
    public LifecycleHookFluent.TagImagesNested<A> editFirstTagImage();
    public LifecycleHookFluent.TagImagesNested<A> editLastTagImage();
    public LifecycleHookFluent.TagImagesNested<A> editMatchingTagImage(io.fabric8.kubernetes.api.builder.Predicate<TagImageHookBuilder> predicate);

    public interface ExecNewPodNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExecNewPodHookFluent<LifecycleHookFluent.ExecNewPodNested<N>>{

        
    public N and();    public N endExecNewPod();
}
    public interface TagImagesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagImageHookFluent<LifecycleHookFluent.TagImagesNested<N>>{

        
    public N and();    public N endTagImage();
}


}
