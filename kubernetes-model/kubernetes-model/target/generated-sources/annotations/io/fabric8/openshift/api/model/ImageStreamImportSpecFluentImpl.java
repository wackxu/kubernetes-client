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

public class ImageStreamImportSpecFluentImpl<A extends ImageStreamImportSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageStreamImportSpecFluent<A>{

    private List<ImageImportSpecBuilder> images;
    private Boolean _import;
    private RepositoryImportSpecBuilder repository;

    public ImageStreamImportSpecFluentImpl(){
    }
    public ImageStreamImportSpecFluentImpl(ImageStreamImportSpec instance){
            this.withImages(instance.getImages()); 
            this.withImport(instance.getImport()); 
            this.withRepository(instance.getRepository()); 
    }

    public A addToImages(int index,ImageImportSpec item){
            if (this.images == null) {this.images = new ArrayList<ImageImportSpecBuilder>();}
            ImageImportSpecBuilder builder = new ImageImportSpecBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.images.add(index >= 0 ? index : images.size(), builder); return (A)this;
    }

    public A setToImages(int index,ImageImportSpec item){
            if (this.images == null) {this.images = new ArrayList<ImageImportSpecBuilder>();}
            ImageImportSpecBuilder builder = new ImageImportSpecBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= images.size()) { images.add(builder); } else { images.set(index, builder);}
             return (A)this;
    }

    public A addToImages(ImageImportSpec... items){
            if (this.images == null) {this.images = new ArrayList<ImageImportSpecBuilder>();}
            for (ImageImportSpec item : items) {ImageImportSpecBuilder builder = new ImageImportSpecBuilder(item);_visitables.add(builder);this.images.add(builder);} return (A)this;
    }

    public A addAllToImages(Collection<ImageImportSpec> items){
            if (this.images == null) {this.images = new ArrayList<ImageImportSpecBuilder>();}
            for (ImageImportSpec item : items) {ImageImportSpecBuilder builder = new ImageImportSpecBuilder(item);_visitables.add(builder);this.images.add(builder);} return (A)this;
    }

    public A removeFromImages(ImageImportSpec... items){
            for (ImageImportSpec item : items) {ImageImportSpecBuilder builder = new ImageImportSpecBuilder(item);_visitables.remove(builder);if (this.images != null) {this.images.remove(builder);}} return (A)this;
    }

    public A removeAllFromImages(Collection<ImageImportSpec> items){
            for (ImageImportSpec item : items) {ImageImportSpecBuilder builder = new ImageImportSpecBuilder(item);_visitables.remove(builder);if (this.images != null) {this.images.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildImages instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageImportSpec> getImages(){
            return build(images);
    }

    public List<ImageImportSpec> buildImages(){
            return build(images);
    }

    public ImageImportSpec buildImage(int index){
            return this.images.get(index).build();
    }

    public ImageImportSpec buildFirstImage(){
            return this.images.get(0).build();
    }

    public ImageImportSpec buildLastImage(){
            return this.images.get(images.size() - 1).build();
    }

    public ImageImportSpec buildMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageImportSpecBuilder> predicate){
            for (ImageImportSpecBuilder item: images) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withImages(List<ImageImportSpec> images){
            if (this.images != null) { _visitables.removeAll(this.images);}
            if (images != null) {this.images = new ArrayList<ImageImportSpecBuilder>(); for (ImageImportSpec item : images){this.addToImages(item);}} else { this.images = new ArrayList<ImageImportSpecBuilder>();} return (A) this;
    }

    public A withImages(ImageImportSpec... images){
            if (this.images != null) {this.images.clear();}
            if (images != null) {for (ImageImportSpec item :images){ this.addToImages(item);}} return (A) this;
    }

    public Boolean hasImages(){
            return images != null && !images.isEmpty();
    }

    public ImageStreamImportSpecFluent.ImagesNested<A> addNewImage(){
            return new ImagesNestedImpl();
    }

    public ImageStreamImportSpecFluent.ImagesNested<A> addNewImageLike(ImageImportSpec item){
            return new ImagesNestedImpl(-1, item);
    }

    public ImageStreamImportSpecFluent.ImagesNested<A> setNewImageLike(int index,ImageImportSpec item){
            return new ImagesNestedImpl(index, item);
    }

    public ImageStreamImportSpecFluent.ImagesNested<A> editImage(int index){
            if (images.size() <= index) throw new RuntimeException("Can't edit images. Index exceeds size.");
            return setNewImageLike(index, buildImage(index));
    }

    public ImageStreamImportSpecFluent.ImagesNested<A> editFirstImage(){
            if (images.size() == 0) throw new RuntimeException("Can't edit first images. The list is empty.");
            return setNewImageLike(0, buildImage(0));
    }

    public ImageStreamImportSpecFluent.ImagesNested<A> editLastImage(){
            int index = images.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last images. The list is empty.");
            return setNewImageLike(index, buildImage(index));
    }

    public ImageStreamImportSpecFluent.ImagesNested<A> editMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageImportSpecBuilder> predicate){
            int index = -1;
            for (int i=0;i<images.size();i++) { 
            if (predicate.apply(images.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching images. No match found.");
            return setNewImageLike(index, buildImage(index));
    }

    public Boolean isImport(){
            return this._import;
    }

    public A withImport(Boolean _import){
            this._import=_import; return (A) this;
    }

    public Boolean hasImport(){
            return this._import != null;
    }

    public A withNewImport(String arg1){
            return (A)withImport(new Boolean(arg1));
    }

    public A withNewImport(boolean arg1){
            return (A)withImport(new Boolean(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildRepository instead.
 * @return The buildable object.
 */
@Deprecated public RepositoryImportSpec getRepository(){
            return this.repository!=null?this.repository.build():null;
    }

    public RepositoryImportSpec buildRepository(){
            return this.repository!=null?this.repository.build():null;
    }

    public A withRepository(RepositoryImportSpec repository){
            _visitables.remove(this.repository);
            if (repository!=null){ this.repository= new RepositoryImportSpecBuilder(repository); _visitables.add(this.repository);} return (A) this;
    }

    public Boolean hasRepository(){
            return this.repository != null;
    }

    public ImageStreamImportSpecFluent.RepositoryNested<A> withNewRepository(){
            return new RepositoryNestedImpl();
    }

    public ImageStreamImportSpecFluent.RepositoryNested<A> withNewRepositoryLike(RepositoryImportSpec item){
            return new RepositoryNestedImpl(item);
    }

    public ImageStreamImportSpecFluent.RepositoryNested<A> editRepository(){
            return withNewRepositoryLike(getRepository());
    }

    public ImageStreamImportSpecFluent.RepositoryNested<A> editOrNewRepository(){
            return withNewRepositoryLike(getRepository() != null ? getRepository(): new RepositoryImportSpecBuilder().build());
    }

    public ImageStreamImportSpecFluent.RepositoryNested<A> editOrNewRepositoryLike(RepositoryImportSpec item){
            return withNewRepositoryLike(getRepository() != null ? getRepository(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamImportSpecFluentImpl that = (ImageStreamImportSpecFluentImpl) o;
            if (images != null ? !images.equals(that.images) :that.images != null) return false;
            if (_import != null ? !_import.equals(that._import) :that._import != null) return false;
            if (repository != null ? !repository.equals(that.repository) :that.repository != null) return false;
            return true;
    }


    public class ImagesNestedImpl<N> extends ImageImportSpecFluentImpl<ImageStreamImportSpecFluent.ImagesNested<N>> implements ImageStreamImportSpecFluent.ImagesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageImportSpecBuilder builder;
        private final int index;
    
            ImagesNestedImpl(int index,ImageImportSpec item){
                    this.index = index;
                    this.builder = new ImageImportSpecBuilder(this, item);
            }
            ImagesNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageImportSpecBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamImportSpecFluentImpl.this.setToImages(index, builder.build());
    }
    public N endImage(){
            return and();
    }

}
    public class RepositoryNestedImpl<N> extends RepositoryImportSpecFluentImpl<ImageStreamImportSpecFluent.RepositoryNested<N>> implements ImageStreamImportSpecFluent.RepositoryNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RepositoryImportSpecBuilder builder;
    
            RepositoryNestedImpl(RepositoryImportSpec item){
                    this.builder = new RepositoryImportSpecBuilder(this, item);
            }
            RepositoryNestedImpl(){
                    this.builder = new RepositoryImportSpecBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamImportSpecFluentImpl.this.withRepository(builder.build());
    }
    public N endRepository(){
            return and();
    }

}


}
