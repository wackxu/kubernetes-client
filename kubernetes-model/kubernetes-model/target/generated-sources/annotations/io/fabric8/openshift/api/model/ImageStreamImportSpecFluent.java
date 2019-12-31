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

public interface ImageStreamImportSpecFluent<A extends ImageStreamImportSpecFluent<A>> extends Fluent<A>{


    public A addToImages(int index,ImageImportSpec item);
    public A setToImages(int index,ImageImportSpec item);
    public A addToImages(ImageImportSpec... items);
    public A addAllToImages(Collection<ImageImportSpec> items);
    public A removeFromImages(ImageImportSpec... items);
    public A removeAllFromImages(Collection<ImageImportSpec> items);
    
/**
 * This method has been deprecated, please use method buildImages instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageImportSpec> getImages();
    public List<ImageImportSpec> buildImages();
    public ImageImportSpec buildImage(int index);
    public ImageImportSpec buildFirstImage();
    public ImageImportSpec buildLastImage();
    public ImageImportSpec buildMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageImportSpecBuilder> predicate);
    public A withImages(List<ImageImportSpec> images);
    public A withImages(ImageImportSpec... images);
    public Boolean hasImages();
    public ImageStreamImportSpecFluent.ImagesNested<A> addNewImage();
    public ImageStreamImportSpecFluent.ImagesNested<A> addNewImageLike(ImageImportSpec item);
    public ImageStreamImportSpecFluent.ImagesNested<A> setNewImageLike(int index,ImageImportSpec item);
    public ImageStreamImportSpecFluent.ImagesNested<A> editImage(int index);
    public ImageStreamImportSpecFluent.ImagesNested<A> editFirstImage();
    public ImageStreamImportSpecFluent.ImagesNested<A> editLastImage();
    public ImageStreamImportSpecFluent.ImagesNested<A> editMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageImportSpecBuilder> predicate);
    public Boolean isImport();
    public A withImport(Boolean _import);
    public Boolean hasImport();
    public A withNewImport(String arg1);
    public A withNewImport(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildRepository instead.
 * @return The buildable object.
 */
@Deprecated public RepositoryImportSpec getRepository();
    public RepositoryImportSpec buildRepository();
    public A withRepository(RepositoryImportSpec repository);
    public Boolean hasRepository();
    public ImageStreamImportSpecFluent.RepositoryNested<A> withNewRepository();
    public ImageStreamImportSpecFluent.RepositoryNested<A> withNewRepositoryLike(RepositoryImportSpec item);
    public ImageStreamImportSpecFluent.RepositoryNested<A> editRepository();
    public ImageStreamImportSpecFluent.RepositoryNested<A> editOrNewRepository();
    public ImageStreamImportSpecFluent.RepositoryNested<A> editOrNewRepositoryLike(RepositoryImportSpec item);

    public interface ImagesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageImportSpecFluent<ImageStreamImportSpecFluent.ImagesNested<N>>{

        
    public N and();    public N endImage();
}
    public interface RepositoryNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RepositoryImportSpecFluent<ImageStreamImportSpecFluent.RepositoryNested<N>>{

        
    public N and();    public N endRepository();
}


}
