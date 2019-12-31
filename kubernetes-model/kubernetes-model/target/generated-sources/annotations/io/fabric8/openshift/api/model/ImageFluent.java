package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.runtime.RawExtensionBuilder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.runtime.RawExtensionFluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.runtime.RawExtension;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface ImageFluent<A extends ImageFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getDockerImageConfig();
    public A withDockerImageConfig(String dockerImageConfig);
    public Boolean hasDockerImageConfig();
    public A addToDockerImageLayers(int index,ImageLayer item);
    public A setToDockerImageLayers(int index,ImageLayer item);
    public A addToDockerImageLayers(ImageLayer... items);
    public A addAllToDockerImageLayers(Collection<ImageLayer> items);
    public A removeFromDockerImageLayers(ImageLayer... items);
    public A removeAllFromDockerImageLayers(Collection<ImageLayer> items);
    
/**
 * This method has been deprecated, please use method buildDockerImageLayers instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageLayer> getDockerImageLayers();
    public List<ImageLayer> buildDockerImageLayers();
    public ImageLayer buildDockerImageLayer(int index);
    public ImageLayer buildFirstDockerImageLayer();
    public ImageLayer buildLastDockerImageLayer();
    public ImageLayer buildMatchingDockerImageLayer(io.fabric8.kubernetes.api.builder.Predicate<ImageLayerBuilder> predicate);
    public A withDockerImageLayers(List<ImageLayer> dockerImageLayers);
    public A withDockerImageLayers(ImageLayer... dockerImageLayers);
    public Boolean hasDockerImageLayers();
    public A addNewDockerImageLayer(String mediaType,String name,Long size);
    public ImageFluent.DockerImageLayersNested<A> addNewDockerImageLayer();
    public ImageFluent.DockerImageLayersNested<A> addNewDockerImageLayerLike(ImageLayer item);
    public ImageFluent.DockerImageLayersNested<A> setNewDockerImageLayerLike(int index,ImageLayer item);
    public ImageFluent.DockerImageLayersNested<A> editDockerImageLayer(int index);
    public ImageFluent.DockerImageLayersNested<A> editFirstDockerImageLayer();
    public ImageFluent.DockerImageLayersNested<A> editLastDockerImageLayer();
    public ImageFluent.DockerImageLayersNested<A> editMatchingDockerImageLayer(io.fabric8.kubernetes.api.builder.Predicate<ImageLayerBuilder> predicate);
    public String getDockerImageManifest();
    public A withDockerImageManifest(String dockerImageManifest);
    public Boolean hasDockerImageManifest();
    public String getDockerImageManifestMediaType();
    public A withDockerImageManifestMediaType(String dockerImageManifestMediaType);
    public Boolean hasDockerImageManifestMediaType();
    
/**
 * This method has been deprecated, please use method buildDockerImageMetadata instead.
 * @return The buildable object.
 */
@Deprecated public RawExtension getDockerImageMetadata();
    public RawExtension buildDockerImageMetadata();
    public A withDockerImageMetadata(RawExtension dockerImageMetadata);
    public Boolean hasDockerImageMetadata();
    public A withNewDockerImageMetadata(String raw);
    public ImageFluent.DockerImageMetadataNested<A> withNewDockerImageMetadata();
    public ImageFluent.DockerImageMetadataNested<A> withNewDockerImageMetadataLike(RawExtension item);
    public ImageFluent.DockerImageMetadataNested<A> editDockerImageMetadata();
    public ImageFluent.DockerImageMetadataNested<A> editOrNewDockerImageMetadata();
    public ImageFluent.DockerImageMetadataNested<A> editOrNewDockerImageMetadataLike(RawExtension item);
    public String getDockerImageMetadataVersion();
    public A withDockerImageMetadataVersion(String dockerImageMetadataVersion);
    public Boolean hasDockerImageMetadataVersion();
    public String getDockerImageReference();
    public A withDockerImageReference(String dockerImageReference);
    public Boolean hasDockerImageReference();
    public A addToDockerImageSignatures(int index,String item);
    public A setToDockerImageSignatures(int index,String item);
    public A addToDockerImageSignatures(String... items);
    public A addAllToDockerImageSignatures(Collection<String> items);
    public A removeFromDockerImageSignatures(String... items);
    public A removeAllFromDockerImageSignatures(Collection<String> items);
    public List<String> getDockerImageSignatures();
    public String getDockerImageSignature(int index);
    public String getFirstDockerImageSignature();
    public String getLastDockerImageSignature();
    public String getMatchingDockerImageSignature(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withDockerImageSignatures(List<String> dockerImageSignatures);
    public A withDockerImageSignatures(String... dockerImageSignatures);
    public Boolean hasDockerImageSignatures();
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
    public ImageFluent.MetadataNested<A> withNewMetadata();
    public ImageFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ImageFluent.MetadataNested<A> editMetadata();
    public ImageFluent.MetadataNested<A> editOrNewMetadata();
    public ImageFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public A addToSignatures(int index,ImageSignature item);
    public A setToSignatures(int index,ImageSignature item);
    public A addToSignatures(ImageSignature... items);
    public A addAllToSignatures(Collection<ImageSignature> items);
    public A removeFromSignatures(ImageSignature... items);
    public A removeAllFromSignatures(Collection<ImageSignature> items);
    
/**
 * This method has been deprecated, please use method buildSignatures instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageSignature> getSignatures();
    public List<ImageSignature> buildSignatures();
    public ImageSignature buildSignature(int index);
    public ImageSignature buildFirstSignature();
    public ImageSignature buildLastSignature();
    public ImageSignature buildMatchingSignature(io.fabric8.kubernetes.api.builder.Predicate<ImageSignatureBuilder> predicate);
    public A withSignatures(List<ImageSignature> signatures);
    public A withSignatures(ImageSignature... signatures);
    public Boolean hasSignatures();
    public ImageFluent.SignaturesNested<A> addNewSignature();
    public ImageFluent.SignaturesNested<A> addNewSignatureLike(ImageSignature item);
    public ImageFluent.SignaturesNested<A> setNewSignatureLike(int index,ImageSignature item);
    public ImageFluent.SignaturesNested<A> editSignature(int index);
    public ImageFluent.SignaturesNested<A> editFirstSignature();
    public ImageFluent.SignaturesNested<A> editLastSignature();
    public ImageFluent.SignaturesNested<A> editMatchingSignature(io.fabric8.kubernetes.api.builder.Predicate<ImageSignatureBuilder> predicate);

    public interface DockerImageLayersNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageLayerFluent<ImageFluent.DockerImageLayersNested<N>>{

        
    public N and();    public N endDockerImageLayer();
}
    public interface DockerImageMetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,RawExtensionFluent<ImageFluent.DockerImageMetadataNested<N>>{

        
    public N and();    public N endDockerImageMetadata();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ImageFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SignaturesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSignatureFluent<ImageFluent.SignaturesNested<N>>{

        
    public N and();    public N endSignature();
}


}
