package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface ImageStreamImportFluent<A extends ImageStreamImportFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public ImageStreamImportFluent.MetadataNested<A> withNewMetadata();
    public ImageStreamImportFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ImageStreamImportFluent.MetadataNested<A> editMetadata();
    public ImageStreamImportFluent.MetadataNested<A> editOrNewMetadata();
    public ImageStreamImportFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public ImageStreamImportSpec getSpec();
    public ImageStreamImportSpec buildSpec();
    public A withSpec(ImageStreamImportSpec spec);
    public Boolean hasSpec();
    public ImageStreamImportFluent.SpecNested<A> withNewSpec();
    public ImageStreamImportFluent.SpecNested<A> withNewSpecLike(ImageStreamImportSpec item);
    public ImageStreamImportFluent.SpecNested<A> editSpec();
    public ImageStreamImportFluent.SpecNested<A> editOrNewSpec();
    public ImageStreamImportFluent.SpecNested<A> editOrNewSpecLike(ImageStreamImportSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public ImageStreamImportStatus getStatus();
    public ImageStreamImportStatus buildStatus();
    public A withStatus(ImageStreamImportStatus status);
    public Boolean hasStatus();
    public ImageStreamImportFluent.StatusNested<A> withNewStatus();
    public ImageStreamImportFluent.StatusNested<A> withNewStatusLike(ImageStreamImportStatus item);
    public ImageStreamImportFluent.StatusNested<A> editStatus();
    public ImageStreamImportFluent.StatusNested<A> editOrNewStatus();
    public ImageStreamImportFluent.StatusNested<A> editOrNewStatusLike(ImageStreamImportStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ImageStreamImportFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportSpecFluent<ImageStreamImportFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamImportStatusFluent<ImageStreamImportFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
