package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class LifecycleHookFluentImpl<A extends LifecycleHookFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements LifecycleHookFluent<A>{

    private ExecNewPodHookBuilder execNewPod;
    private String failurePolicy;
    private List<TagImageHookBuilder> tagImages;

    public LifecycleHookFluentImpl(){
    }
    public LifecycleHookFluentImpl(LifecycleHook instance){
            this.withExecNewPod(instance.getExecNewPod()); 
            this.withFailurePolicy(instance.getFailurePolicy()); 
            this.withTagImages(instance.getTagImages()); 
    }

    
/**
 * This method has been deprecated, please use method buildExecNewPod instead.
 * @return The buildable object.
 */
@Deprecated public ExecNewPodHook getExecNewPod(){
            return this.execNewPod!=null?this.execNewPod.build():null;
    }

    public ExecNewPodHook buildExecNewPod(){
            return this.execNewPod!=null?this.execNewPod.build():null;
    }

    public A withExecNewPod(ExecNewPodHook execNewPod){
            _visitables.remove(this.execNewPod);
            if (execNewPod!=null){ this.execNewPod= new ExecNewPodHookBuilder(execNewPod); _visitables.add(this.execNewPod);} return (A) this;
    }

    public Boolean hasExecNewPod(){
            return this.execNewPod != null;
    }

    public LifecycleHookFluent.ExecNewPodNested<A> withNewExecNewPod(){
            return new ExecNewPodNestedImpl();
    }

    public LifecycleHookFluent.ExecNewPodNested<A> withNewExecNewPodLike(ExecNewPodHook item){
            return new ExecNewPodNestedImpl(item);
    }

    public LifecycleHookFluent.ExecNewPodNested<A> editExecNewPod(){
            return withNewExecNewPodLike(getExecNewPod());
    }

    public LifecycleHookFluent.ExecNewPodNested<A> editOrNewExecNewPod(){
            return withNewExecNewPodLike(getExecNewPod() != null ? getExecNewPod(): new ExecNewPodHookBuilder().build());
    }

    public LifecycleHookFluent.ExecNewPodNested<A> editOrNewExecNewPodLike(ExecNewPodHook item){
            return withNewExecNewPodLike(getExecNewPod() != null ? getExecNewPod(): item);
    }

    public String getFailurePolicy(){
            return this.failurePolicy;
    }

    public A withFailurePolicy(String failurePolicy){
            this.failurePolicy=failurePolicy; return (A) this;
    }

    public Boolean hasFailurePolicy(){
            return this.failurePolicy != null;
    }

    public A addToTagImages(int index,TagImageHook item){
            if (this.tagImages == null) {this.tagImages = new ArrayList<TagImageHookBuilder>();}
            TagImageHookBuilder builder = new TagImageHookBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.tagImages.add(index >= 0 ? index : tagImages.size(), builder); return (A)this;
    }

    public A setToTagImages(int index,TagImageHook item){
            if (this.tagImages == null) {this.tagImages = new ArrayList<TagImageHookBuilder>();}
            TagImageHookBuilder builder = new TagImageHookBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= tagImages.size()) { tagImages.add(builder); } else { tagImages.set(index, builder);}
             return (A)this;
    }

    public A addToTagImages(TagImageHook... items){
            if (this.tagImages == null) {this.tagImages = new ArrayList<TagImageHookBuilder>();}
            for (TagImageHook item : items) {TagImageHookBuilder builder = new TagImageHookBuilder(item);_visitables.add(builder);this.tagImages.add(builder);} return (A)this;
    }

    public A addAllToTagImages(Collection<TagImageHook> items){
            if (this.tagImages == null) {this.tagImages = new ArrayList<TagImageHookBuilder>();}
            for (TagImageHook item : items) {TagImageHookBuilder builder = new TagImageHookBuilder(item);_visitables.add(builder);this.tagImages.add(builder);} return (A)this;
    }

    public A removeFromTagImages(TagImageHook... items){
            for (TagImageHook item : items) {TagImageHookBuilder builder = new TagImageHookBuilder(item);_visitables.remove(builder);if (this.tagImages != null) {this.tagImages.remove(builder);}} return (A)this;
    }

    public A removeAllFromTagImages(Collection<TagImageHook> items){
            for (TagImageHook item : items) {TagImageHookBuilder builder = new TagImageHookBuilder(item);_visitables.remove(builder);if (this.tagImages != null) {this.tagImages.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildTagImages instead.
 * @return The buildable object.
 */
@Deprecated public List<TagImageHook> getTagImages(){
            return build(tagImages);
    }

    public List<TagImageHook> buildTagImages(){
            return build(tagImages);
    }

    public TagImageHook buildTagImage(int index){
            return this.tagImages.get(index).build();
    }

    public TagImageHook buildFirstTagImage(){
            return this.tagImages.get(0).build();
    }

    public TagImageHook buildLastTagImage(){
            return this.tagImages.get(tagImages.size() - 1).build();
    }

    public TagImageHook buildMatchingTagImage(io.fabric8.kubernetes.api.builder.Predicate<TagImageHookBuilder> predicate){
            for (TagImageHookBuilder item: tagImages) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withTagImages(List<TagImageHook> tagImages){
            if (this.tagImages != null) { _visitables.removeAll(this.tagImages);}
            if (tagImages != null) {this.tagImages = new ArrayList<TagImageHookBuilder>(); for (TagImageHook item : tagImages){this.addToTagImages(item);}} else { this.tagImages = new ArrayList<TagImageHookBuilder>();} return (A) this;
    }

    public A withTagImages(TagImageHook... tagImages){
            if (this.tagImages != null) {this.tagImages.clear();}
            if (tagImages != null) {for (TagImageHook item :tagImages){ this.addToTagImages(item);}} return (A) this;
    }

    public Boolean hasTagImages(){
            return tagImages != null && !tagImages.isEmpty();
    }

    public LifecycleHookFluent.TagImagesNested<A> addNewTagImage(){
            return new TagImagesNestedImpl();
    }

    public LifecycleHookFluent.TagImagesNested<A> addNewTagImageLike(TagImageHook item){
            return new TagImagesNestedImpl(-1, item);
    }

    public LifecycleHookFluent.TagImagesNested<A> setNewTagImageLike(int index,TagImageHook item){
            return new TagImagesNestedImpl(index, item);
    }

    public LifecycleHookFluent.TagImagesNested<A> editTagImage(int index){
            if (tagImages.size() <= index) throw new RuntimeException("Can't edit tagImages. Index exceeds size.");
            return setNewTagImageLike(index, buildTagImage(index));
    }

    public LifecycleHookFluent.TagImagesNested<A> editFirstTagImage(){
            if (tagImages.size() == 0) throw new RuntimeException("Can't edit first tagImages. The list is empty.");
            return setNewTagImageLike(0, buildTagImage(0));
    }

    public LifecycleHookFluent.TagImagesNested<A> editLastTagImage(){
            int index = tagImages.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last tagImages. The list is empty.");
            return setNewTagImageLike(index, buildTagImage(index));
    }

    public LifecycleHookFluent.TagImagesNested<A> editMatchingTagImage(io.fabric8.kubernetes.api.builder.Predicate<TagImageHookBuilder> predicate){
            int index = -1;
            for (int i=0;i<tagImages.size();i++) { 
            if (predicate.apply(tagImages.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching tagImages. No match found.");
            return setNewTagImageLike(index, buildTagImage(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            LifecycleHookFluentImpl that = (LifecycleHookFluentImpl) o;
            if (execNewPod != null ? !execNewPod.equals(that.execNewPod) :that.execNewPod != null) return false;
            if (failurePolicy != null ? !failurePolicy.equals(that.failurePolicy) :that.failurePolicy != null) return false;
            if (tagImages != null ? !tagImages.equals(that.tagImages) :that.tagImages != null) return false;
            return true;
    }


    public class ExecNewPodNestedImpl<N> extends ExecNewPodHookFluentImpl<LifecycleHookFluent.ExecNewPodNested<N>> implements LifecycleHookFluent.ExecNewPodNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExecNewPodHookBuilder builder;
    
            ExecNewPodNestedImpl(ExecNewPodHook item){
                    this.builder = new ExecNewPodHookBuilder(this, item);
            }
            ExecNewPodNestedImpl(){
                    this.builder = new ExecNewPodHookBuilder(this);
            }
    
    public N and(){
            return (N) LifecycleHookFluentImpl.this.withExecNewPod(builder.build());
    }
    public N endExecNewPod(){
            return and();
    }

}
    public class TagImagesNestedImpl<N> extends TagImageHookFluentImpl<LifecycleHookFluent.TagImagesNested<N>> implements LifecycleHookFluent.TagImagesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagImageHookBuilder builder;
        private final int index;
    
            TagImagesNestedImpl(int index,TagImageHook item){
                    this.index = index;
                    this.builder = new TagImageHookBuilder(this, item);
            }
            TagImagesNestedImpl(){
                    this.index = -1;
                    this.builder = new TagImageHookBuilder(this);
            }
    
    public N and(){
            return (N) LifecycleHookFluentImpl.this.setToTagImages(index, builder.build());
    }
    public N endTagImage(){
            return and();
    }

}


}
