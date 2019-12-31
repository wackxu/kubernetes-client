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

public interface ImageStreamFluent<A extends ImageStreamFluent<A>> extends Fluent<A>{


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
    public ImageStreamFluent.MetadataNested<A> withNewMetadata();
    public ImageStreamFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ImageStreamFluent.MetadataNested<A> editMetadata();
    public ImageStreamFluent.MetadataNested<A> editOrNewMetadata();
    public ImageStreamFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public ImageStreamSpec getSpec();
    public ImageStreamSpec buildSpec();
    public A withSpec(ImageStreamSpec spec);
    public Boolean hasSpec();
    public ImageStreamFluent.SpecNested<A> withNewSpec();
    public ImageStreamFluent.SpecNested<A> withNewSpecLike(ImageStreamSpec item);
    public ImageStreamFluent.SpecNested<A> editSpec();
    public ImageStreamFluent.SpecNested<A> editOrNewSpec();
    public ImageStreamFluent.SpecNested<A> editOrNewSpecLike(ImageStreamSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public ImageStreamStatus getStatus();
    public ImageStreamStatus buildStatus();
    public A withStatus(ImageStreamStatus status);
    public Boolean hasStatus();
    public ImageStreamFluent.StatusNested<A> withNewStatus();
    public ImageStreamFluent.StatusNested<A> withNewStatusLike(ImageStreamStatus item);
    public ImageStreamFluent.StatusNested<A> editStatus();
    public ImageStreamFluent.StatusNested<A> editOrNewStatus();
    public ImageStreamFluent.StatusNested<A> editOrNewStatusLike(ImageStreamStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ImageStreamFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamSpecFluent<ImageStreamFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageStreamStatusFluent<ImageStreamFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
