package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface ImageStreamImportStatusFluent<A extends ImageStreamImportStatusFluent<A>> extends Fluent<A>{


    public A addToImages(int index,ImageImportStatus item);
    public A setToImages(int index,ImageImportStatus item);
    public A addToImages(ImageImportStatus... items);
    public A addAllToImages(Collection<ImageImportStatus> items);
    public A removeFromImages(ImageImportStatus... items);
    public A removeAllFromImages(Collection<ImageImportStatus> items);
    
/**
 * This method has been deprecated, please use method buildImages instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageImportStatus> getImages();
    public List<ImageImportStatus> buildImages();
    public ImageImportStatus buildImage(int index);
    public ImageImportStatus buildFirstImage();
    public ImageImportStatus buildLastImage();
    public ImageImportStatus buildMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageImportStatusBuilder> predicate);
    public A withImages(List<ImageImportStatus> images);
    public A withImages(ImageImportStatus... images);
    public Boolean hasImages();
    public ImageStreamImportStatusFluent.ImagesNested<A> addNewImage();
    public ImageStreamImportStatusFluent.ImagesNested<A> addNewImageLike(ImageImportStatus item);
    public ImageStreamImportStatusFluent.ImagesNested<A> setNewImageLike(int index,ImageImportStatus item);
    public ImageStreamImportStatusFluent.ImagesNested<A> editImage(int index);
    public ImageStreamImportStatusFluent.ImagesNested<A> editFirstImage();
    public ImageStreamImportStatusFluent.ImagesNested<A> editLastImage();
    public ImageStreamImportStatusFluent.ImagesNested<A> editMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageImportStatusBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildImport instead.
 * @return The buildable object.
 */
@Deprecated public ImageStream getImport();
    public ImageStream buildImport();
    public A withImport(ImageStream _import);
    public Boolean hasImport();
    public ImageStreamImportStatusFluent.ImportNested<A> withNewImport();
    public ImageStreamImportStatusFluent.ImportNested<A> withNewImportLike(ImageStream item);
    public ImageStreamImportStatusFluent.ImportNested<A> editImport();
    public ImageStreamImportStatusFluent.ImportNested<A> editOrNewImport();
    public ImageStreamImportStatusFluent.ImportNested<A> editOrNewImportLike(ImageStream item);
    
/**
 * This method has been deprecated, please use method buildRepository instead.
 * @return The buildable object.
 */
@Deprecated public RepositoryImportStatus getRepository();
    public RepositoryImportStatus buildRepository();
    public A withRepository(RepositoryImportStatus repository);
    public Boolean hasRepository();
    public ImageStreamImportStatusFluent.RepositoryNested<A> withNewRepository();
    public ImageStreamImportStatusFluent.RepositoryNested<A> withNewRepositoryLike(RepositoryImportStatus item);
    public ImageStreamImportStatusFluent.RepositoryNested<A> editRepository();
    public ImageStreamImportStatusFluent.RepositoryNested<A> editOrNewRepository();
    public ImageStreamImportStatusFluent.RepositoryNested<A> editOrNewRepositoryLike(RepositoryImportStatus item);

    public interface ImagesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageImportStatusFluent<ImageStreamImportStatusFluent.ImagesNested<N>>{

        
    public N and();    public N endImage();
}
    public interface ImportNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamFluent<ImageStreamImportStatusFluent.ImportNested<N>>{

        
    public N and();    public N endImport();
}
    public interface RepositoryNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RepositoryImportStatusFluent<ImageStreamImportStatusFluent.RepositoryNested<N>>{

        
    public N and();    public N endRepository();
}


}
