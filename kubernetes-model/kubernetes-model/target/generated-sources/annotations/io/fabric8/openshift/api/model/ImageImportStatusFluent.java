package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.StatusFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.StatusBuilder;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface ImageImportStatusFluent<A extends ImageImportStatusFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildImage instead.
 * @return The buildable object.
 */
@Deprecated public Image getImage();
    public Image buildImage();
    public A withImage(Image image);
    public Boolean hasImage();
    public ImageImportStatusFluent.ImageNested<A> withNewImage();
    public ImageImportStatusFluent.ImageNested<A> withNewImageLike(Image item);
    public ImageImportStatusFluent.ImageNested<A> editImage();
    public ImageImportStatusFluent.ImageNested<A> editOrNewImage();
    public ImageImportStatusFluent.ImageNested<A> editOrNewImageLike(Image item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public Status getStatus();
    public Status buildStatus();
    public A withStatus(Status status);
    public Boolean hasStatus();
    public ImageImportStatusFluent.StatusNested<A> withNewStatus();
    public ImageImportStatusFluent.StatusNested<A> withNewStatusLike(Status item);
    public ImageImportStatusFluent.StatusNested<A> editStatus();
    public ImageImportStatusFluent.StatusNested<A> editOrNewStatus();
    public ImageImportStatusFluent.StatusNested<A> editOrNewStatusLike(Status item);
    public String getTag();
    public A withTag(String tag);
    public Boolean hasTag();

    public interface ImageNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageFluent<ImageImportStatusFluent.ImageNested<N>>{

        
    public N and();    public N endImage();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatusFluent<ImageImportStatusFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
