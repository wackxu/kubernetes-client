package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluentImpl;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import java.util.Collection;
import java.lang.Object;

public class BuildOutputFluentImpl<A extends BuildOutputFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildOutputFluent<A>{

    private List<ImageLabelBuilder> imageLabels;
    private LocalObjectReferenceBuilder pushSecret;
    private ObjectReferenceBuilder to;

    public BuildOutputFluentImpl(){
    }
    public BuildOutputFluentImpl(BuildOutput instance){
            this.withImageLabels(instance.getImageLabels()); 
            this.withPushSecret(instance.getPushSecret()); 
            this.withTo(instance.getTo()); 
    }

    public A addToImageLabels(int index,ImageLabel item){
            if (this.imageLabels == null) {this.imageLabels = new ArrayList<ImageLabelBuilder>();}
            ImageLabelBuilder builder = new ImageLabelBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.imageLabels.add(index >= 0 ? index : imageLabels.size(), builder); return (A)this;
    }

    public A setToImageLabels(int index,ImageLabel item){
            if (this.imageLabels == null) {this.imageLabels = new ArrayList<ImageLabelBuilder>();}
            ImageLabelBuilder builder = new ImageLabelBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= imageLabels.size()) { imageLabels.add(builder); } else { imageLabels.set(index, builder);}
             return (A)this;
    }

    public A addToImageLabels(ImageLabel... items){
            if (this.imageLabels == null) {this.imageLabels = new ArrayList<ImageLabelBuilder>();}
            for (ImageLabel item : items) {ImageLabelBuilder builder = new ImageLabelBuilder(item);_visitables.add(builder);this.imageLabels.add(builder);} return (A)this;
    }

    public A addAllToImageLabels(Collection<ImageLabel> items){
            if (this.imageLabels == null) {this.imageLabels = new ArrayList<ImageLabelBuilder>();}
            for (ImageLabel item : items) {ImageLabelBuilder builder = new ImageLabelBuilder(item);_visitables.add(builder);this.imageLabels.add(builder);} return (A)this;
    }

    public A removeFromImageLabels(ImageLabel... items){
            for (ImageLabel item : items) {ImageLabelBuilder builder = new ImageLabelBuilder(item);_visitables.remove(builder);if (this.imageLabels != null) {this.imageLabels.remove(builder);}} return (A)this;
    }

    public A removeAllFromImageLabels(Collection<ImageLabel> items){
            for (ImageLabel item : items) {ImageLabelBuilder builder = new ImageLabelBuilder(item);_visitables.remove(builder);if (this.imageLabels != null) {this.imageLabels.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildImageLabels instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageLabel> getImageLabels(){
            return build(imageLabels);
    }

    public List<ImageLabel> buildImageLabels(){
            return build(imageLabels);
    }

    public ImageLabel buildImageLabel(int index){
            return this.imageLabels.get(index).build();
    }

    public ImageLabel buildFirstImageLabel(){
            return this.imageLabels.get(0).build();
    }

    public ImageLabel buildLastImageLabel(){
            return this.imageLabels.get(imageLabels.size() - 1).build();
    }

    public ImageLabel buildMatchingImageLabel(io.fabric8.kubernetes.api.builder.Predicate<ImageLabelBuilder> predicate){
            for (ImageLabelBuilder item: imageLabels) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withImageLabels(List<ImageLabel> imageLabels){
            if (this.imageLabels != null) { _visitables.removeAll(this.imageLabels);}
            if (imageLabels != null) {this.imageLabels = new ArrayList<ImageLabelBuilder>(); for (ImageLabel item : imageLabels){this.addToImageLabels(item);}} else { this.imageLabels = new ArrayList<ImageLabelBuilder>();} return (A) this;
    }

    public A withImageLabels(ImageLabel... imageLabels){
            if (this.imageLabels != null) {this.imageLabels.clear();}
            if (imageLabels != null) {for (ImageLabel item :imageLabels){ this.addToImageLabels(item);}} return (A) this;
    }

    public Boolean hasImageLabels(){
            return imageLabels != null && !imageLabels.isEmpty();
    }

    public A addNewImageLabel(String name,String value){
            return (A)addToImageLabels(new ImageLabel(name, value));
    }

    public BuildOutputFluent.ImageLabelsNested<A> addNewImageLabel(){
            return new ImageLabelsNestedImpl();
    }

    public BuildOutputFluent.ImageLabelsNested<A> addNewImageLabelLike(ImageLabel item){
            return new ImageLabelsNestedImpl(-1, item);
    }

    public BuildOutputFluent.ImageLabelsNested<A> setNewImageLabelLike(int index,ImageLabel item){
            return new ImageLabelsNestedImpl(index, item);
    }

    public BuildOutputFluent.ImageLabelsNested<A> editImageLabel(int index){
            if (imageLabels.size() <= index) throw new RuntimeException("Can't edit imageLabels. Index exceeds size.");
            return setNewImageLabelLike(index, buildImageLabel(index));
    }

    public BuildOutputFluent.ImageLabelsNested<A> editFirstImageLabel(){
            if (imageLabels.size() == 0) throw new RuntimeException("Can't edit first imageLabels. The list is empty.");
            return setNewImageLabelLike(0, buildImageLabel(0));
    }

    public BuildOutputFluent.ImageLabelsNested<A> editLastImageLabel(){
            int index = imageLabels.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last imageLabels. The list is empty.");
            return setNewImageLabelLike(index, buildImageLabel(index));
    }

    public BuildOutputFluent.ImageLabelsNested<A> editMatchingImageLabel(io.fabric8.kubernetes.api.builder.Predicate<ImageLabelBuilder> predicate){
            int index = -1;
            for (int i=0;i<imageLabels.size();i++) { 
            if (predicate.apply(imageLabels.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching imageLabels. No match found.");
            return setNewImageLabelLike(index, buildImageLabel(index));
    }

    
/**
 * This method has been deprecated, please use method buildPushSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getPushSecret(){
            return this.pushSecret!=null?this.pushSecret.build():null;
    }

    public LocalObjectReference buildPushSecret(){
            return this.pushSecret!=null?this.pushSecret.build():null;
    }

    public A withPushSecret(LocalObjectReference pushSecret){
            _visitables.remove(this.pushSecret);
            if (pushSecret!=null){ this.pushSecret= new LocalObjectReferenceBuilder(pushSecret); _visitables.add(this.pushSecret);} return (A) this;
    }

    public Boolean hasPushSecret(){
            return this.pushSecret != null;
    }

    public A withNewPushSecret(String name){
            return (A)withPushSecret(new LocalObjectReference(name));
    }

    public BuildOutputFluent.PushSecretNested<A> withNewPushSecret(){
            return new PushSecretNestedImpl();
    }

    public BuildOutputFluent.PushSecretNested<A> withNewPushSecretLike(LocalObjectReference item){
            return new PushSecretNestedImpl(item);
    }

    public BuildOutputFluent.PushSecretNested<A> editPushSecret(){
            return withNewPushSecretLike(getPushSecret());
    }

    public BuildOutputFluent.PushSecretNested<A> editOrNewPushSecret(){
            return withNewPushSecretLike(getPushSecret() != null ? getPushSecret(): new LocalObjectReferenceBuilder().build());
    }

    public BuildOutputFluent.PushSecretNested<A> editOrNewPushSecretLike(LocalObjectReference item){
            return withNewPushSecretLike(getPushSecret() != null ? getPushSecret(): item);
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

    public BuildOutputFluent.ToNested<A> withNewTo(){
            return new ToNestedImpl();
    }

    public BuildOutputFluent.ToNested<A> withNewToLike(ObjectReference item){
            return new ToNestedImpl(item);
    }

    public BuildOutputFluent.ToNested<A> editTo(){
            return withNewToLike(getTo());
    }

    public BuildOutputFluent.ToNested<A> editOrNewTo(){
            return withNewToLike(getTo() != null ? getTo(): new ObjectReferenceBuilder().build());
    }

    public BuildOutputFluent.ToNested<A> editOrNewToLike(ObjectReference item){
            return withNewToLike(getTo() != null ? getTo(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildOutputFluentImpl that = (BuildOutputFluentImpl) o;
            if (imageLabels != null ? !imageLabels.equals(that.imageLabels) :that.imageLabels != null) return false;
            if (pushSecret != null ? !pushSecret.equals(that.pushSecret) :that.pushSecret != null) return false;
            if (to != null ? !to.equals(that.to) :that.to != null) return false;
            return true;
    }


    public class ImageLabelsNestedImpl<N> extends ImageLabelFluentImpl<BuildOutputFluent.ImageLabelsNested<N>> implements BuildOutputFluent.ImageLabelsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageLabelBuilder builder;
        private final int index;
    
            ImageLabelsNestedImpl(int index,ImageLabel item){
                    this.index = index;
                    this.builder = new ImageLabelBuilder(this, item);
            }
            ImageLabelsNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageLabelBuilder(this);
            }
    
    public N and(){
            return (N) BuildOutputFluentImpl.this.setToImageLabels(index, builder.build());
    }
    public N endImageLabel(){
            return and();
    }

}
    public class PushSecretNestedImpl<N> extends LocalObjectReferenceFluentImpl<BuildOutputFluent.PushSecretNested<N>> implements BuildOutputFluent.PushSecretNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            PushSecretNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            PushSecretNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) BuildOutputFluentImpl.this.withPushSecret(builder.build());
    }
    public N endPushSecret(){
            return and();
    }

}
    public class ToNestedImpl<N> extends ObjectReferenceFluentImpl<BuildOutputFluent.ToNested<N>> implements BuildOutputFluent.ToNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            ToNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            ToNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) BuildOutputFluentImpl.this.withTo(builder.build());
    }
    public N endTo(){
            return and();
    }

}


}
