package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.StatusFluentImpl;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.StatusBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class ImageImportStatusFluentImpl<A extends ImageImportStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageImportStatusFluent<A>{

    private ImageBuilder image;
    private StatusBuilder status;
    private String tag;

    public ImageImportStatusFluentImpl(){
    }
    public ImageImportStatusFluentImpl(ImageImportStatus instance){
            this.withImage(instance.getImage()); 
            this.withStatus(instance.getStatus()); 
            this.withTag(instance.getTag()); 
    }

    
/**
 * This method has been deprecated, please use method buildImage instead.
 * @return The buildable object.
 */
@Deprecated public Image getImage(){
            return this.image!=null?this.image.build():null;
    }

    public Image buildImage(){
            return this.image!=null?this.image.build():null;
    }

    public A withImage(Image image){
            _visitables.remove(this.image);
            if (image!=null){ this.image= new ImageBuilder(image); _visitables.add(this.image);} return (A) this;
    }

    public Boolean hasImage(){
            return this.image != null;
    }

    public ImageImportStatusFluent.ImageNested<A> withNewImage(){
            return new ImageNestedImpl();
    }

    public ImageImportStatusFluent.ImageNested<A> withNewImageLike(Image item){
            return new ImageNestedImpl(item);
    }

    public ImageImportStatusFluent.ImageNested<A> editImage(){
            return withNewImageLike(getImage());
    }

    public ImageImportStatusFluent.ImageNested<A> editOrNewImage(){
            return withNewImageLike(getImage() != null ? getImage(): new ImageBuilder().build());
    }

    public ImageImportStatusFluent.ImageNested<A> editOrNewImageLike(Image item){
            return withNewImageLike(getImage() != null ? getImage(): item);
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

    public ImageImportStatusFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public ImageImportStatusFluent.StatusNested<A> withNewStatusLike(Status item){
            return new StatusNestedImpl(item);
    }

    public ImageImportStatusFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public ImageImportStatusFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new StatusBuilder().build());
    }

    public ImageImportStatusFluent.StatusNested<A> editOrNewStatusLike(Status item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public String getTag(){
            return this.tag;
    }

    public A withTag(String tag){
            this.tag=tag; return (A) this;
    }

    public Boolean hasTag(){
            return this.tag != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageImportStatusFluentImpl that = (ImageImportStatusFluentImpl) o;
            if (image != null ? !image.equals(that.image) :that.image != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            if (tag != null ? !tag.equals(that.tag) :that.tag != null) return false;
            return true;
    }


    public class ImageNestedImpl<N> extends ImageFluentImpl<ImageImportStatusFluent.ImageNested<N>> implements ImageImportStatusFluent.ImageNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageBuilder builder;
    
            ImageNestedImpl(Image item){
                    this.builder = new ImageBuilder(this, item);
            }
            ImageNestedImpl(){
                    this.builder = new ImageBuilder(this);
            }
    
    public N and(){
            return (N) ImageImportStatusFluentImpl.this.withImage(builder.build());
    }
    public N endImage(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends StatusFluentImpl<ImageImportStatusFluent.StatusNested<N>> implements ImageImportStatusFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatusBuilder builder;
    
            StatusNestedImpl(Status item){
                    this.builder = new StatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new StatusBuilder(this);
            }
    
    public N and(){
            return (N) ImageImportStatusFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
