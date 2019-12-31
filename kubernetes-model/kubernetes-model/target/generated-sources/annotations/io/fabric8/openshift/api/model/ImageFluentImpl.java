package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.model.runtime.RawExtensionBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.runtime.RawExtensionFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.runtime.RawExtension;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

public class ImageFluentImpl<A extends ImageFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageFluent<A>{

    private String apiVersion;
    private String dockerImageConfig;
    private List<ImageLayerBuilder> dockerImageLayers;
    private String dockerImageManifest;
    private String dockerImageManifestMediaType;
    private RawExtensionBuilder dockerImageMetadata;
    private String dockerImageMetadataVersion;
    private String dockerImageReference;
    private List<String> dockerImageSignatures;
    private String kind;
    private ObjectMetaBuilder metadata;
    private List<ImageSignatureBuilder> signatures;

    public ImageFluentImpl(){
    }
    public ImageFluentImpl(Image instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withDockerImageConfig(instance.getDockerImageConfig()); 
            this.withDockerImageLayers(instance.getDockerImageLayers()); 
            this.withDockerImageManifest(instance.getDockerImageManifest()); 
            this.withDockerImageManifestMediaType(instance.getDockerImageManifestMediaType()); 
            this.withDockerImageMetadata(instance.getDockerImageMetadata()); 
            this.withDockerImageMetadataVersion(instance.getDockerImageMetadataVersion()); 
            this.withDockerImageReference(instance.getDockerImageReference()); 
            this.withDockerImageSignatures(instance.getDockerImageSignatures()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSignatures(instance.getSignatures()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public String getDockerImageConfig(){
            return this.dockerImageConfig;
    }

    public A withDockerImageConfig(String dockerImageConfig){
            this.dockerImageConfig=dockerImageConfig; return (A) this;
    }

    public Boolean hasDockerImageConfig(){
            return this.dockerImageConfig != null;
    }

    public A addToDockerImageLayers(int index,ImageLayer item){
            if (this.dockerImageLayers == null) {this.dockerImageLayers = new ArrayList<ImageLayerBuilder>();}
            ImageLayerBuilder builder = new ImageLayerBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.dockerImageLayers.add(index >= 0 ? index : dockerImageLayers.size(), builder); return (A)this;
    }

    public A setToDockerImageLayers(int index,ImageLayer item){
            if (this.dockerImageLayers == null) {this.dockerImageLayers = new ArrayList<ImageLayerBuilder>();}
            ImageLayerBuilder builder = new ImageLayerBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= dockerImageLayers.size()) { dockerImageLayers.add(builder); } else { dockerImageLayers.set(index, builder);}
             return (A)this;
    }

    public A addToDockerImageLayers(ImageLayer... items){
            if (this.dockerImageLayers == null) {this.dockerImageLayers = new ArrayList<ImageLayerBuilder>();}
            for (ImageLayer item : items) {ImageLayerBuilder builder = new ImageLayerBuilder(item);_visitables.add(builder);this.dockerImageLayers.add(builder);} return (A)this;
    }

    public A addAllToDockerImageLayers(Collection<ImageLayer> items){
            if (this.dockerImageLayers == null) {this.dockerImageLayers = new ArrayList<ImageLayerBuilder>();}
            for (ImageLayer item : items) {ImageLayerBuilder builder = new ImageLayerBuilder(item);_visitables.add(builder);this.dockerImageLayers.add(builder);} return (A)this;
    }

    public A removeFromDockerImageLayers(ImageLayer... items){
            for (ImageLayer item : items) {ImageLayerBuilder builder = new ImageLayerBuilder(item);_visitables.remove(builder);if (this.dockerImageLayers != null) {this.dockerImageLayers.remove(builder);}} return (A)this;
    }

    public A removeAllFromDockerImageLayers(Collection<ImageLayer> items){
            for (ImageLayer item : items) {ImageLayerBuilder builder = new ImageLayerBuilder(item);_visitables.remove(builder);if (this.dockerImageLayers != null) {this.dockerImageLayers.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildDockerImageLayers instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageLayer> getDockerImageLayers(){
            return build(dockerImageLayers);
    }

    public List<ImageLayer> buildDockerImageLayers(){
            return build(dockerImageLayers);
    }

    public ImageLayer buildDockerImageLayer(int index){
            return this.dockerImageLayers.get(index).build();
    }

    public ImageLayer buildFirstDockerImageLayer(){
            return this.dockerImageLayers.get(0).build();
    }

    public ImageLayer buildLastDockerImageLayer(){
            return this.dockerImageLayers.get(dockerImageLayers.size() - 1).build();
    }

    public ImageLayer buildMatchingDockerImageLayer(io.fabric8.kubernetes.api.builder.Predicate<ImageLayerBuilder> predicate){
            for (ImageLayerBuilder item: dockerImageLayers) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withDockerImageLayers(List<ImageLayer> dockerImageLayers){
            if (this.dockerImageLayers != null) { _visitables.removeAll(this.dockerImageLayers);}
            if (dockerImageLayers != null) {this.dockerImageLayers = new ArrayList<ImageLayerBuilder>(); for (ImageLayer item : dockerImageLayers){this.addToDockerImageLayers(item);}} else { this.dockerImageLayers = new ArrayList<ImageLayerBuilder>();} return (A) this;
    }

    public A withDockerImageLayers(ImageLayer... dockerImageLayers){
            if (this.dockerImageLayers != null) {this.dockerImageLayers.clear();}
            if (dockerImageLayers != null) {for (ImageLayer item :dockerImageLayers){ this.addToDockerImageLayers(item);}} return (A) this;
    }

    public Boolean hasDockerImageLayers(){
            return dockerImageLayers != null && !dockerImageLayers.isEmpty();
    }

    public A addNewDockerImageLayer(String mediaType,String name,Long size){
            return (A)addToDockerImageLayers(new ImageLayer(mediaType, name, size));
    }

    public ImageFluent.DockerImageLayersNested<A> addNewDockerImageLayer(){
            return new DockerImageLayersNestedImpl();
    }

    public ImageFluent.DockerImageLayersNested<A> addNewDockerImageLayerLike(ImageLayer item){
            return new DockerImageLayersNestedImpl(-1, item);
    }

    public ImageFluent.DockerImageLayersNested<A> setNewDockerImageLayerLike(int index,ImageLayer item){
            return new DockerImageLayersNestedImpl(index, item);
    }

    public ImageFluent.DockerImageLayersNested<A> editDockerImageLayer(int index){
            if (dockerImageLayers.size() <= index) throw new RuntimeException("Can't edit dockerImageLayers. Index exceeds size.");
            return setNewDockerImageLayerLike(index, buildDockerImageLayer(index));
    }

    public ImageFluent.DockerImageLayersNested<A> editFirstDockerImageLayer(){
            if (dockerImageLayers.size() == 0) throw new RuntimeException("Can't edit first dockerImageLayers. The list is empty.");
            return setNewDockerImageLayerLike(0, buildDockerImageLayer(0));
    }

    public ImageFluent.DockerImageLayersNested<A> editLastDockerImageLayer(){
            int index = dockerImageLayers.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last dockerImageLayers. The list is empty.");
            return setNewDockerImageLayerLike(index, buildDockerImageLayer(index));
    }

    public ImageFluent.DockerImageLayersNested<A> editMatchingDockerImageLayer(io.fabric8.kubernetes.api.builder.Predicate<ImageLayerBuilder> predicate){
            int index = -1;
            for (int i=0;i<dockerImageLayers.size();i++) { 
            if (predicate.apply(dockerImageLayers.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching dockerImageLayers. No match found.");
            return setNewDockerImageLayerLike(index, buildDockerImageLayer(index));
    }

    public String getDockerImageManifest(){
            return this.dockerImageManifest;
    }

    public A withDockerImageManifest(String dockerImageManifest){
            this.dockerImageManifest=dockerImageManifest; return (A) this;
    }

    public Boolean hasDockerImageManifest(){
            return this.dockerImageManifest != null;
    }

    public String getDockerImageManifestMediaType(){
            return this.dockerImageManifestMediaType;
    }

    public A withDockerImageManifestMediaType(String dockerImageManifestMediaType){
            this.dockerImageManifestMediaType=dockerImageManifestMediaType; return (A) this;
    }

    public Boolean hasDockerImageManifestMediaType(){
            return this.dockerImageManifestMediaType != null;
    }

    
/**
 * This method has been deprecated, please use method buildDockerImageMetadata instead.
 * @return The buildable object.
 */
@Deprecated public RawExtension getDockerImageMetadata(){
            return this.dockerImageMetadata!=null?this.dockerImageMetadata.build():null;
    }

    public RawExtension buildDockerImageMetadata(){
            return this.dockerImageMetadata!=null?this.dockerImageMetadata.build():null;
    }

    public A withDockerImageMetadata(RawExtension dockerImageMetadata){
            _visitables.remove(this.dockerImageMetadata);
            if (dockerImageMetadata!=null){ this.dockerImageMetadata= new RawExtensionBuilder(dockerImageMetadata); _visitables.add(this.dockerImageMetadata);} return (A) this;
    }

    public Boolean hasDockerImageMetadata(){
            return this.dockerImageMetadata != null;
    }

    public A withNewDockerImageMetadata(String raw){
            return (A)withDockerImageMetadata(new RawExtension(raw));
    }

    public ImageFluent.DockerImageMetadataNested<A> withNewDockerImageMetadata(){
            return new DockerImageMetadataNestedImpl();
    }

    public ImageFluent.DockerImageMetadataNested<A> withNewDockerImageMetadataLike(RawExtension item){
            return new DockerImageMetadataNestedImpl(item);
    }

    public ImageFluent.DockerImageMetadataNested<A> editDockerImageMetadata(){
            return withNewDockerImageMetadataLike(getDockerImageMetadata());
    }

    public ImageFluent.DockerImageMetadataNested<A> editOrNewDockerImageMetadata(){
            return withNewDockerImageMetadataLike(getDockerImageMetadata() != null ? getDockerImageMetadata(): new RawExtensionBuilder().build());
    }

    public ImageFluent.DockerImageMetadataNested<A> editOrNewDockerImageMetadataLike(RawExtension item){
            return withNewDockerImageMetadataLike(getDockerImageMetadata() != null ? getDockerImageMetadata(): item);
    }

    public String getDockerImageMetadataVersion(){
            return this.dockerImageMetadataVersion;
    }

    public A withDockerImageMetadataVersion(String dockerImageMetadataVersion){
            this.dockerImageMetadataVersion=dockerImageMetadataVersion; return (A) this;
    }

    public Boolean hasDockerImageMetadataVersion(){
            return this.dockerImageMetadataVersion != null;
    }

    public String getDockerImageReference(){
            return this.dockerImageReference;
    }

    public A withDockerImageReference(String dockerImageReference){
            this.dockerImageReference=dockerImageReference; return (A) this;
    }

    public Boolean hasDockerImageReference(){
            return this.dockerImageReference != null;
    }

    public A addToDockerImageSignatures(int index,String item){
            if (this.dockerImageSignatures == null) {this.dockerImageSignatures = new ArrayList<String>();}
            this.dockerImageSignatures.add(index, item);
            return (A)this;
    }

    public A setToDockerImageSignatures(int index,String item){
            if (this.dockerImageSignatures == null) {this.dockerImageSignatures = new ArrayList<String>();}
            this.dockerImageSignatures.set(index, item); return (A)this;
    }

    public A addToDockerImageSignatures(String... items){
            if (this.dockerImageSignatures == null) {this.dockerImageSignatures = new ArrayList<String>();}
            for (String item : items) {this.dockerImageSignatures.add(item);} return (A)this;
    }

    public A addAllToDockerImageSignatures(Collection<String> items){
            if (this.dockerImageSignatures == null) {this.dockerImageSignatures = new ArrayList<String>();}
            for (String item : items) {this.dockerImageSignatures.add(item);} return (A)this;
    }

    public A removeFromDockerImageSignatures(String... items){
            for (String item : items) {if (this.dockerImageSignatures!= null){ this.dockerImageSignatures.remove(item);}} return (A)this;
    }

    public A removeAllFromDockerImageSignatures(Collection<String> items){
            for (String item : items) {if (this.dockerImageSignatures!= null){ this.dockerImageSignatures.remove(item);}} return (A)this;
    }

    public List<String> getDockerImageSignatures(){
            return this.dockerImageSignatures;
    }

    public String getDockerImageSignature(int index){
            return this.dockerImageSignatures.get(index);
    }

    public String getFirstDockerImageSignature(){
            return this.dockerImageSignatures.get(0);
    }

    public String getLastDockerImageSignature(){
            return this.dockerImageSignatures.get(dockerImageSignatures.size() - 1);
    }

    public String getMatchingDockerImageSignature(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: dockerImageSignatures) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withDockerImageSignatures(List<String> dockerImageSignatures){
            if (this.dockerImageSignatures != null) { _visitables.removeAll(this.dockerImageSignatures);}
            if (dockerImageSignatures != null) {this.dockerImageSignatures = new ArrayList<String>(); for (String item : dockerImageSignatures){this.addToDockerImageSignatures(item);}} else { this.dockerImageSignatures = new ArrayList<String>();} return (A) this;
    }

    public A withDockerImageSignatures(String... dockerImageSignatures){
            if (this.dockerImageSignatures != null) {this.dockerImageSignatures.clear();}
            if (dockerImageSignatures != null) {for (String item :dockerImageSignatures){ this.addToDockerImageSignatures(item);}} return (A) this;
    }

    public Boolean hasDockerImageSignatures(){
            return dockerImageSignatures != null && !dockerImageSignatures.isEmpty();
    }

    public String getKind(){
            return this.kind;
    }

    public A withKind(String kind){
            this.kind=kind; return (A) this;
    }

    public Boolean hasKind(){
            return this.kind != null;
    }

    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ObjectMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ObjectMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public ImageFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ImageFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public ImageFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ImageFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public ImageFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public A addToSignatures(int index,ImageSignature item){
            if (this.signatures == null) {this.signatures = new ArrayList<ImageSignatureBuilder>();}
            ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.signatures.add(index >= 0 ? index : signatures.size(), builder); return (A)this;
    }

    public A setToSignatures(int index,ImageSignature item){
            if (this.signatures == null) {this.signatures = new ArrayList<ImageSignatureBuilder>();}
            ImageSignatureBuilder builder = new ImageSignatureBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= signatures.size()) { signatures.add(builder); } else { signatures.set(index, builder);}
             return (A)this;
    }

    public A addToSignatures(ImageSignature... items){
            if (this.signatures == null) {this.signatures = new ArrayList<ImageSignatureBuilder>();}
            for (ImageSignature item : items) {ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.add(builder);this.signatures.add(builder);} return (A)this;
    }

    public A addAllToSignatures(Collection<ImageSignature> items){
            if (this.signatures == null) {this.signatures = new ArrayList<ImageSignatureBuilder>();}
            for (ImageSignature item : items) {ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.add(builder);this.signatures.add(builder);} return (A)this;
    }

    public A removeFromSignatures(ImageSignature... items){
            for (ImageSignature item : items) {ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.remove(builder);if (this.signatures != null) {this.signatures.remove(builder);}} return (A)this;
    }

    public A removeAllFromSignatures(Collection<ImageSignature> items){
            for (ImageSignature item : items) {ImageSignatureBuilder builder = new ImageSignatureBuilder(item);_visitables.remove(builder);if (this.signatures != null) {this.signatures.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildSignatures instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageSignature> getSignatures(){
            return build(signatures);
    }

    public List<ImageSignature> buildSignatures(){
            return build(signatures);
    }

    public ImageSignature buildSignature(int index){
            return this.signatures.get(index).build();
    }

    public ImageSignature buildFirstSignature(){
            return this.signatures.get(0).build();
    }

    public ImageSignature buildLastSignature(){
            return this.signatures.get(signatures.size() - 1).build();
    }

    public ImageSignature buildMatchingSignature(io.fabric8.kubernetes.api.builder.Predicate<ImageSignatureBuilder> predicate){
            for (ImageSignatureBuilder item: signatures) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withSignatures(List<ImageSignature> signatures){
            if (this.signatures != null) { _visitables.removeAll(this.signatures);}
            if (signatures != null) {this.signatures = new ArrayList<ImageSignatureBuilder>(); for (ImageSignature item : signatures){this.addToSignatures(item);}} else { this.signatures = new ArrayList<ImageSignatureBuilder>();} return (A) this;
    }

    public A withSignatures(ImageSignature... signatures){
            if (this.signatures != null) {this.signatures.clear();}
            if (signatures != null) {for (ImageSignature item :signatures){ this.addToSignatures(item);}} return (A) this;
    }

    public Boolean hasSignatures(){
            return signatures != null && !signatures.isEmpty();
    }

    public ImageFluent.SignaturesNested<A> addNewSignature(){
            return new SignaturesNestedImpl();
    }

    public ImageFluent.SignaturesNested<A> addNewSignatureLike(ImageSignature item){
            return new SignaturesNestedImpl(-1, item);
    }

    public ImageFluent.SignaturesNested<A> setNewSignatureLike(int index,ImageSignature item){
            return new SignaturesNestedImpl(index, item);
    }

    public ImageFluent.SignaturesNested<A> editSignature(int index){
            if (signatures.size() <= index) throw new RuntimeException("Can't edit signatures. Index exceeds size.");
            return setNewSignatureLike(index, buildSignature(index));
    }

    public ImageFluent.SignaturesNested<A> editFirstSignature(){
            if (signatures.size() == 0) throw new RuntimeException("Can't edit first signatures. The list is empty.");
            return setNewSignatureLike(0, buildSignature(0));
    }

    public ImageFluent.SignaturesNested<A> editLastSignature(){
            int index = signatures.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last signatures. The list is empty.");
            return setNewSignatureLike(index, buildSignature(index));
    }

    public ImageFluent.SignaturesNested<A> editMatchingSignature(io.fabric8.kubernetes.api.builder.Predicate<ImageSignatureBuilder> predicate){
            int index = -1;
            for (int i=0;i<signatures.size();i++) { 
            if (predicate.apply(signatures.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching signatures. No match found.");
            return setNewSignatureLike(index, buildSignature(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageFluentImpl that = (ImageFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (dockerImageConfig != null ? !dockerImageConfig.equals(that.dockerImageConfig) :that.dockerImageConfig != null) return false;
            if (dockerImageLayers != null ? !dockerImageLayers.equals(that.dockerImageLayers) :that.dockerImageLayers != null) return false;
            if (dockerImageManifest != null ? !dockerImageManifest.equals(that.dockerImageManifest) :that.dockerImageManifest != null) return false;
            if (dockerImageManifestMediaType != null ? !dockerImageManifestMediaType.equals(that.dockerImageManifestMediaType) :that.dockerImageManifestMediaType != null) return false;
            if (dockerImageMetadata != null ? !dockerImageMetadata.equals(that.dockerImageMetadata) :that.dockerImageMetadata != null) return false;
            if (dockerImageMetadataVersion != null ? !dockerImageMetadataVersion.equals(that.dockerImageMetadataVersion) :that.dockerImageMetadataVersion != null) return false;
            if (dockerImageReference != null ? !dockerImageReference.equals(that.dockerImageReference) :that.dockerImageReference != null) return false;
            if (dockerImageSignatures != null ? !dockerImageSignatures.equals(that.dockerImageSignatures) :that.dockerImageSignatures != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (signatures != null ? !signatures.equals(that.signatures) :that.signatures != null) return false;
            return true;
    }


    public class DockerImageLayersNestedImpl<N> extends ImageLayerFluentImpl<ImageFluent.DockerImageLayersNested<N>> implements ImageFluent.DockerImageLayersNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageLayerBuilder builder;
        private final int index;
    
            DockerImageLayersNestedImpl(int index,ImageLayer item){
                    this.index = index;
                    this.builder = new ImageLayerBuilder(this, item);
            }
            DockerImageLayersNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageLayerBuilder(this);
            }
    
    public N and(){
            return (N) ImageFluentImpl.this.setToDockerImageLayers(index, builder.build());
    }
    public N endDockerImageLayer(){
            return and();
    }

}
    public class DockerImageMetadataNestedImpl<N> extends RawExtensionFluentImpl<ImageFluent.DockerImageMetadataNested<N>> implements ImageFluent.DockerImageMetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RawExtensionBuilder builder;
    
            DockerImageMetadataNestedImpl(RawExtension item){
                    this.builder = new RawExtensionBuilder(this, item);
            }
            DockerImageMetadataNestedImpl(){
                    this.builder = new RawExtensionBuilder(this);
            }
    
    public N and(){
            return (N) ImageFluentImpl.this.withDockerImageMetadata(builder.build());
    }
    public N endDockerImageMetadata(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<ImageFluent.MetadataNested<N>> implements ImageFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) ImageFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SignaturesNestedImpl<N> extends ImageSignatureFluentImpl<ImageFluent.SignaturesNested<N>> implements ImageFluent.SignaturesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSignatureBuilder builder;
        private final int index;
    
            SignaturesNestedImpl(int index,ImageSignature item){
                    this.index = index;
                    this.builder = new ImageSignatureBuilder(this, item);
            }
            SignaturesNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageSignatureBuilder(this);
            }
    
    public N and(){
            return (N) ImageFluentImpl.this.setToSignatures(index, builder.build());
    }
    public N endSignature(){
            return and();
    }

}


}
