package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.StatusFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import io.fabric8.kubernetes.api.model.StatusBuilder;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface RepositoryImportStatusFluent<A extends RepositoryImportStatusFluent<A>> extends Fluent<A>{


    public A addToAdditionalTags(int index,String item);
    public A setToAdditionalTags(int index,String item);
    public A addToAdditionalTags(String... items);
    public A addAllToAdditionalTags(Collection<String> items);
    public A removeFromAdditionalTags(String... items);
    public A removeAllFromAdditionalTags(Collection<String> items);
    public List<String> getAdditionalTags();
    public String getAdditionalTag(int index);
    public String getFirstAdditionalTag();
    public String getLastAdditionalTag();
    public String getMatchingAdditionalTag(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withAdditionalTags(List<String> additionalTags);
    public A withAdditionalTags(String... additionalTags);
    public Boolean hasAdditionalTags();
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
    public RepositoryImportStatusFluent.ImagesNested<A> addNewImage();
    public RepositoryImportStatusFluent.ImagesNested<A> addNewImageLike(ImageImportStatus item);
    public RepositoryImportStatusFluent.ImagesNested<A> setNewImageLike(int index,ImageImportStatus item);
    public RepositoryImportStatusFluent.ImagesNested<A> editImage(int index);
    public RepositoryImportStatusFluent.ImagesNested<A> editFirstImage();
    public RepositoryImportStatusFluent.ImagesNested<A> editLastImage();
    public RepositoryImportStatusFluent.ImagesNested<A> editMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageImportStatusBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public Status getStatus();
    public Status buildStatus();
    public A withStatus(Status status);
    public Boolean hasStatus();
    public RepositoryImportStatusFluent.StatusNested<A> withNewStatus();
    public RepositoryImportStatusFluent.StatusNested<A> withNewStatusLike(Status item);
    public RepositoryImportStatusFluent.StatusNested<A> editStatus();
    public RepositoryImportStatusFluent.StatusNested<A> editOrNewStatus();
    public RepositoryImportStatusFluent.StatusNested<A> editOrNewStatusLike(Status item);

    public interface ImagesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageImportStatusFluent<RepositoryImportStatusFluent.ImagesNested<N>>{

        
    public N and();    public N endImage();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StatusFluent<RepositoryImportStatusFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
