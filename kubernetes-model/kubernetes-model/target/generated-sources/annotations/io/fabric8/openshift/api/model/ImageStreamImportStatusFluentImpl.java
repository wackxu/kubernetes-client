package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class ImageStreamImportStatusFluentImpl<A extends ImageStreamImportStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageStreamImportStatusFluent<A>{

    private List<ImageImportStatusBuilder> images;
    private ImageStreamBuilder _import;
    private RepositoryImportStatusBuilder repository;

    public ImageStreamImportStatusFluentImpl(){
    }
    public ImageStreamImportStatusFluentImpl(ImageStreamImportStatus instance){
            this.withImages(instance.getImages()); 
            this.withImport(instance.getImport()); 
            this.withRepository(instance.getRepository()); 
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

    public ImageStreamImportStatusFluent.ImagesNested<A> addNewImage(){
            return new ImagesNestedImpl();
    }

    public ImageStreamImportStatusFluent.ImagesNested<A> addNewImageLike(ImageImportStatus item){
            return new ImagesNestedImpl(-1, item);
    }

    public ImageStreamImportStatusFluent.ImagesNested<A> setNewImageLike(int index,ImageImportStatus item){
            return new ImagesNestedImpl(index, item);
    }

    public ImageStreamImportStatusFluent.ImagesNested<A> editImage(int index){
            if (images.size() <= index) throw new RuntimeException("Can't edit images. Index exceeds size.");
            return setNewImageLike(index, buildImage(index));
    }

    public ImageStreamImportStatusFluent.ImagesNested<A> editFirstImage(){
            if (images.size() == 0) throw new RuntimeException("Can't edit first images. The list is empty.");
            return setNewImageLike(0, buildImage(0));
    }

    public ImageStreamImportStatusFluent.ImagesNested<A> editLastImage(){
            int index = images.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last images. The list is empty.");
            return setNewImageLike(index, buildImage(index));
    }

    public ImageStreamImportStatusFluent.ImagesNested<A> editMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageImportStatusBuilder> predicate){
            int index = -1;
            for (int i=0;i<images.size();i++) { 
            if (predicate.apply(images.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching images. No match found.");
            return setNewImageLike(index, buildImage(index));
    }

    
/**
 * This method has been deprecated, please use method buildImport instead.
 * @return The buildable object.
 */
@Deprecated public ImageStream getImport(){
            return this._import!=null?this._import.build():null;
    }

    public ImageStream buildImport(){
            return this._import!=null?this._import.build():null;
    }

    public A withImport(ImageStream _import){
            _visitables.remove(this._import);
            if (_import!=null){ this._import= new ImageStreamBuilder(_import); _visitables.add(this._import);} return (A) this;
    }

    public Boolean hasImport(){
            return this._import != null;
    }

    public ImageStreamImportStatusFluent.ImportNested<A> withNewImport(){
            return new ImportNestedImpl();
    }

    public ImageStreamImportStatusFluent.ImportNested<A> withNewImportLike(ImageStream item){
            return new ImportNestedImpl(item);
    }

    public ImageStreamImportStatusFluent.ImportNested<A> editImport(){
            return withNewImportLike(getImport());
    }

    public ImageStreamImportStatusFluent.ImportNested<A> editOrNewImport(){
            return withNewImportLike(getImport() != null ? getImport(): new ImageStreamBuilder().build());
    }

    public ImageStreamImportStatusFluent.ImportNested<A> editOrNewImportLike(ImageStream item){
            return withNewImportLike(getImport() != null ? getImport(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRepository instead.
 * @return The buildable object.
 */
@Deprecated public RepositoryImportStatus getRepository(){
            return this.repository!=null?this.repository.build():null;
    }

    public RepositoryImportStatus buildRepository(){
            return this.repository!=null?this.repository.build():null;
    }

    public A withRepository(RepositoryImportStatus repository){
            _visitables.remove(this.repository);
            if (repository!=null){ this.repository= new RepositoryImportStatusBuilder(repository); _visitables.add(this.repository);} return (A) this;
    }

    public Boolean hasRepository(){
            return this.repository != null;
    }

    public ImageStreamImportStatusFluent.RepositoryNested<A> withNewRepository(){
            return new RepositoryNestedImpl();
    }

    public ImageStreamImportStatusFluent.RepositoryNested<A> withNewRepositoryLike(RepositoryImportStatus item){
            return new RepositoryNestedImpl(item);
    }

    public ImageStreamImportStatusFluent.RepositoryNested<A> editRepository(){
            return withNewRepositoryLike(getRepository());
    }

    public ImageStreamImportStatusFluent.RepositoryNested<A> editOrNewRepository(){
            return withNewRepositoryLike(getRepository() != null ? getRepository(): new RepositoryImportStatusBuilder().build());
    }

    public ImageStreamImportStatusFluent.RepositoryNested<A> editOrNewRepositoryLike(RepositoryImportStatus item){
            return withNewRepositoryLike(getRepository() != null ? getRepository(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamImportStatusFluentImpl that = (ImageStreamImportStatusFluentImpl) o;
            if (images != null ? !images.equals(that.images) :that.images != null) return false;
            if (_import != null ? !_import.equals(that._import) :that._import != null) return false;
            if (repository != null ? !repository.equals(that.repository) :that.repository != null) return false;
            return true;
    }


    public class ImagesNestedImpl<N> extends ImageImportStatusFluentImpl<ImageStreamImportStatusFluent.ImagesNested<N>> implements ImageStreamImportStatusFluent.ImagesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

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
            return (N) ImageStreamImportStatusFluentImpl.this.setToImages(index, builder.build());
    }
    public N endImage(){
            return and();
    }

}
    public class ImportNestedImpl<N> extends ImageStreamFluentImpl<ImageStreamImportStatusFluent.ImportNested<N>> implements ImageStreamImportStatusFluent.ImportNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageStreamBuilder builder;
    
            ImportNestedImpl(ImageStream item){
                    this.builder = new ImageStreamBuilder(this, item);
            }
            ImportNestedImpl(){
                    this.builder = new ImageStreamBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamImportStatusFluentImpl.this.withImport(builder.build());
    }
    public N endImport(){
            return and();
    }

}
    public class RepositoryNestedImpl<N> extends RepositoryImportStatusFluentImpl<ImageStreamImportStatusFluent.RepositoryNested<N>> implements ImageStreamImportStatusFluent.RepositoryNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RepositoryImportStatusBuilder builder;
    
            RepositoryNestedImpl(RepositoryImportStatus item){
                    this.builder = new RepositoryImportStatusBuilder(this, item);
            }
            RepositoryNestedImpl(){
                    this.builder = new RepositoryImportStatusBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamImportStatusFluentImpl.this.withRepository(builder.build());
    }
    public N endRepository(){
            return and();
    }

}


}
