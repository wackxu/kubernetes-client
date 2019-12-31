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
import io.fabric8.kubernetes.api.model.Status;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.StatusFluentImpl;
import java.util.Collection;
import io.fabric8.kubernetes.api.model.StatusBuilder;
import java.lang.Object;

public class RepositoryImportStatusFluentImpl<A extends RepositoryImportStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RepositoryImportStatusFluent<A>{

    private List<String> additionalTags;
    private List<ImageImportStatusBuilder> images;
    private StatusBuilder status;

    public RepositoryImportStatusFluentImpl(){
    }
    public RepositoryImportStatusFluentImpl(RepositoryImportStatus instance){
            this.withAdditionalTags(instance.getAdditionalTags()); 
            this.withImages(instance.getImages()); 
            this.withStatus(instance.getStatus()); 
    }

    public A addToAdditionalTags(int index,String item){
            if (this.additionalTags == null) {this.additionalTags = new ArrayList<String>();}
            this.additionalTags.add(index, item);
            return (A)this;
    }

    public A setToAdditionalTags(int index,String item){
            if (this.additionalTags == null) {this.additionalTags = new ArrayList<String>();}
            this.additionalTags.set(index, item); return (A)this;
    }

    public A addToAdditionalTags(String... items){
            if (this.additionalTags == null) {this.additionalTags = new ArrayList<String>();}
            for (String item : items) {this.additionalTags.add(item);} return (A)this;
    }

    public A addAllToAdditionalTags(Collection<String> items){
            if (this.additionalTags == null) {this.additionalTags = new ArrayList<String>();}
            for (String item : items) {this.additionalTags.add(item);} return (A)this;
    }

    public A removeFromAdditionalTags(String... items){
            for (String item : items) {if (this.additionalTags!= null){ this.additionalTags.remove(item);}} return (A)this;
    }

    public A removeAllFromAdditionalTags(Collection<String> items){
            for (String item : items) {if (this.additionalTags!= null){ this.additionalTags.remove(item);}} return (A)this;
    }

    public List<String> getAdditionalTags(){
            return this.additionalTags;
    }

    public String getAdditionalTag(int index){
            return this.additionalTags.get(index);
    }

    public String getFirstAdditionalTag(){
            return this.additionalTags.get(0);
    }

    public String getLastAdditionalTag(){
            return this.additionalTags.get(additionalTags.size() - 1);
    }

    public String getMatchingAdditionalTag(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: additionalTags) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withAdditionalTags(List<String> additionalTags){
            if (this.additionalTags != null) { _visitables.removeAll(this.additionalTags);}
            if (additionalTags != null) {this.additionalTags = new ArrayList<String>(); for (String item : additionalTags){this.addToAdditionalTags(item);}} else { this.additionalTags = new ArrayList<String>();} return (A) this;
    }

    public A withAdditionalTags(String... additionalTags){
            if (this.additionalTags != null) {this.additionalTags.clear();}
            if (additionalTags != null) {for (String item :additionalTags){ this.addToAdditionalTags(item);}} return (A) this;
    }

    public Boolean hasAdditionalTags(){
            return additionalTags != null && !additionalTags.isEmpty();
    }

    public A addToImages(int index,ImageImportStatus item){
            if (this.images == null) {this.images = new ArrayList<ImageImportStatusBuilder>();}
            ImageImportStatusBuilder builder = new ImageImportStatusBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.images.add(index >= 0 ? index : images.size(), builder); return (A)this;
    }

    public A setToImages(int index,ImageImportStatus item){
            if (this.images == null) {this.images = new ArrayList<ImageImportStatusBuilder>();}
            ImageImportStatusBuilder builder = new ImageImportStatusBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= images.size()) { images.add(builder); } else { images.set(index, builder);}
             return (A)this;
    }

    public A addToImages(ImageImportStatus... items){
            if (this.images == null) {this.images = new ArrayList<ImageImportStatusBuilder>();}
            for (ImageImportStatus item : items) {ImageImportStatusBuilder builder = new ImageImportStatusBuilder(item);_visitables.add(builder);this.images.add(builder);} return (A)this;
    }

    public A addAllToImages(Collection<ImageImportStatus> items){
            if (this.images == null) {this.images = new ArrayList<ImageImportStatusBuilder>();}
            for (ImageImportStatus item : items) {ImageImportStatusBuilder builder = new ImageImportStatusBuilder(item);_visitables.add(builder);this.images.add(builder);} return (A)this;
    }

    public A removeFromImages(ImageImportStatus... items){
            for (ImageImportStatus item : items) {ImageImportStatusBuilder builder = new ImageImportStatusBuilder(item);_visitables.remove(builder);if (this.images != null) {this.images.remove(builder);}} return (A)this;
    }

    public A removeAllFromImages(Collection<ImageImportStatus> items){
            for (ImageImportStatus item : items) {ImageImportStatusBuilder builder = new ImageImportStatusBuilder(item);_visitables.remove(builder);if (this.images != null) {this.images.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildImages instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageImportStatus> getImages(){
            return build(images);
    }

    public List<ImageImportStatus> buildImages(){
            return build(images);
    }

    public ImageImportStatus buildImage(int index){
            return this.images.get(index).build();
    }

    public ImageImportStatus buildFirstImage(){
            return this.images.get(0).build();
    }

    public ImageImportStatus buildLastImage(){
            return this.images.get(images.size() - 1).build();
    }

    public ImageImportStatus buildMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageImportStatusBuilder> predicate){
            for (ImageImportStatusBuilder item: images) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withImages(List<ImageImportStatus> images){
            if (this.images != null) { _visitables.removeAll(this.images);}
            if (images != null) {this.images = new ArrayList<ImageImportStatusBuilder>(); for (ImageImportStatus item : images){this.addToImages(item);}} else { this.images = new ArrayList<ImageImportStatusBuilder>();} return (A) this;
    }

    public A withImages(ImageImportStatus... images){
            if (this.images != null) {this.images.clear();}
            if (images != null) {for (ImageImportStatus item :images){ this.addToImages(item);}} return (A) this;
    }

    public Boolean hasImages(){
            return images != null && !images.isEmpty();
    }

    public RepositoryImportStatusFluent.ImagesNested<A> addNewImage(){
            return new ImagesNestedImpl();
    }

    public RepositoryImportStatusFluent.ImagesNested<A> addNewImageLike(ImageImportStatus item){
            return new ImagesNestedImpl(-1, item);
    }

    public RepositoryImportStatusFluent.ImagesNested<A> setNewImageLike(int index,ImageImportStatus item){
            return new ImagesNestedImpl(index, item);
    }

    public RepositoryImportStatusFluent.ImagesNested<A> editImage(int index){
            if (images.size() <= index) throw new RuntimeException("Can't edit images. Index exceeds size.");
            return setNewImageLike(index, buildImage(index));
    }

    public RepositoryImportStatusFluent.ImagesNested<A> editFirstImage(){
            if (images.size() == 0) throw new RuntimeException("Can't edit first images. The list is empty.");
            return setNewImageLike(0, buildImage(0));
    }

    public RepositoryImportStatusFluent.ImagesNested<A> editLastImage(){
            int index = images.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last images. The list is empty.");
            return setNewImageLike(index, buildImage(index));
    }

    public RepositoryImportStatusFluent.ImagesNested<A> editMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageImportStatusBuilder> predicate){
            int index = -1;
            for (int i=0;i<images.size();i++) { 
            if (predicate.apply(images.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching images. No match found.");
            return setNewImageLike(index, buildImage(index));
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public Status getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public Status buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(Status status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new StatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public RepositoryImportStatusFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public RepositoryImportStatusFluent.StatusNested<A> withNewStatusLike(Status item){
            return new StatusNestedImpl(item);
    }

    public RepositoryImportStatusFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public RepositoryImportStatusFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new StatusBuilder().build());
    }

    public RepositoryImportStatusFluent.StatusNested<A> editOrNewStatusLike(Status item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RepositoryImportStatusFluentImpl that = (RepositoryImportStatusFluentImpl) o;
            if (additionalTags != null ? !additionalTags.equals(that.additionalTags) :that.additionalTags != null) return false;
            if (images != null ? !images.equals(that.images) :that.images != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class ImagesNestedImpl<N> extends ImageImportStatusFluentImpl<RepositoryImportStatusFluent.ImagesNested<N>> implements RepositoryImportStatusFluent.ImagesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageImportStatusBuilder builder;
        private final int index;
    
            ImagesNestedImpl(int index,ImageImportStatus item){
                    this.index = index;
                    this.builder = new ImageImportStatusBuilder(this, item);
            }
            ImagesNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageImportStatusBuilder(this);
            }
    
    public N and(){
            return (N) RepositoryImportStatusFluentImpl.this.setToImages(index, builder.build());
    }
    public N endImage(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends StatusFluentImpl<RepositoryImportStatusFluent.StatusNested<N>> implements RepositoryImportStatusFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatusBuilder builder;
    
            StatusNestedImpl(Status item){
                    this.builder = new StatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new StatusBuilder(this);
            }
    
    public N and(){
            return (N) RepositoryImportStatusFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
