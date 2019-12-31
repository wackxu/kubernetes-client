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
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface BuildSourceFluent<A extends BuildSourceFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildBinary instead.
 * @return The buildable object.
 */
@Deprecated public BinaryBuildSource getBinary();
    public BinaryBuildSource buildBinary();
    public A withBinary(BinaryBuildSource binary);
    public Boolean hasBinary();
    public A withNewBinary(String asFile);
    public BuildSourceFluent.BinaryNested<A> withNewBinary();
    public BuildSourceFluent.BinaryNested<A> withNewBinaryLike(BinaryBuildSource item);
    public BuildSourceFluent.BinaryNested<A> editBinary();
    public BuildSourceFluent.BinaryNested<A> editOrNewBinary();
    public BuildSourceFluent.BinaryNested<A> editOrNewBinaryLike(BinaryBuildSource item);
    public A addToConfigMaps(int index,ConfigMapBuildSource item);
    public A setToConfigMaps(int index,ConfigMapBuildSource item);
    public A addToConfigMaps(ConfigMapBuildSource... items);
    public A addAllToConfigMaps(Collection<ConfigMapBuildSource> items);
    public A removeFromConfigMaps(ConfigMapBuildSource... items);
    public A removeAllFromConfigMaps(Collection<ConfigMapBuildSource> items);
    
/**
 * This method has been deprecated, please use method buildConfigMaps instead.
 * @return The buildable object.
 */
@Deprecated public List<ConfigMapBuildSource> getConfigMaps();
    public List<ConfigMapBuildSource> buildConfigMaps();
    public ConfigMapBuildSource buildConfigMap(int index);
    public ConfigMapBuildSource buildFirstConfigMap();
    public ConfigMapBuildSource buildLastConfigMap();
    public ConfigMapBuildSource buildMatchingConfigMap(io.fabric8.kubernetes.api.builder.Predicate<ConfigMapBuildSourceBuilder> predicate);
    public A withConfigMaps(List<ConfigMapBuildSource> configMaps);
    public A withConfigMaps(ConfigMapBuildSource... configMaps);
    public Boolean hasConfigMaps();
    public BuildSourceFluent.ConfigMapsNested<A> addNewConfigMap();
    public BuildSourceFluent.ConfigMapsNested<A> addNewConfigMapLike(ConfigMapBuildSource item);
    public BuildSourceFluent.ConfigMapsNested<A> setNewConfigMapLike(int index,ConfigMapBuildSource item);
    public BuildSourceFluent.ConfigMapsNested<A> editConfigMap(int index);
    public BuildSourceFluent.ConfigMapsNested<A> editFirstConfigMap();
    public BuildSourceFluent.ConfigMapsNested<A> editLastConfigMap();
    public BuildSourceFluent.ConfigMapsNested<A> editMatchingConfigMap(io.fabric8.kubernetes.api.builder.Predicate<ConfigMapBuildSourceBuilder> predicate);
    public String getContextDir();
    public A withContextDir(String contextDir);
    public Boolean hasContextDir();
    public String getDockerfile();
    public A withDockerfile(String dockerfile);
    public Boolean hasDockerfile();
    
/**
 * This method has been deprecated, please use method buildGit instead.
 * @return The buildable object.
 */
@Deprecated public GitBuildSource getGit();
    public GitBuildSource buildGit();
    public A withGit(GitBuildSource git);
    public Boolean hasGit();
    public A withNewGit(String httpProxy,String httpsProxy,String noProxy,String ref,String uri);
    public BuildSourceFluent.GitNested<A> withNewGit();
    public BuildSourceFluent.GitNested<A> withNewGitLike(GitBuildSource item);
    public BuildSourceFluent.GitNested<A> editGit();
    public BuildSourceFluent.GitNested<A> editOrNewGit();
    public BuildSourceFluent.GitNested<A> editOrNewGitLike(GitBuildSource item);
    public A addToImages(int index,ImageSource item);
    public A setToImages(int index,ImageSource item);
    public A addToImages(ImageSource... items);
    public A addAllToImages(Collection<ImageSource> items);
    public A removeFromImages(ImageSource... items);
    public A removeAllFromImages(Collection<ImageSource> items);
    
/**
 * This method has been deprecated, please use method buildImages instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageSource> getImages();
    public List<ImageSource> buildImages();
    public ImageSource buildImage(int index);
    public ImageSource buildFirstImage();
    public ImageSource buildLastImage();
    public ImageSource buildMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageSourceBuilder> predicate);
    public A withImages(List<ImageSource> images);
    public A withImages(ImageSource... images);
    public Boolean hasImages();
    public BuildSourceFluent.ImagesNested<A> addNewImage();
    public BuildSourceFluent.ImagesNested<A> addNewImageLike(ImageSource item);
    public BuildSourceFluent.ImagesNested<A> setNewImageLike(int index,ImageSource item);
    public BuildSourceFluent.ImagesNested<A> editImage(int index);
    public BuildSourceFluent.ImagesNested<A> editFirstImage();
    public BuildSourceFluent.ImagesNested<A> editLastImage();
    public BuildSourceFluent.ImagesNested<A> editMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageSourceBuilder> predicate);
    public A addToSecrets(int index,SecretBuildSource item);
    public A setToSecrets(int index,SecretBuildSource item);
    public A addToSecrets(SecretBuildSource... items);
    public A addAllToSecrets(Collection<SecretBuildSource> items);
    public A removeFromSecrets(SecretBuildSource... items);
    public A removeAllFromSecrets(Collection<SecretBuildSource> items);
    
/**
 * This method has been deprecated, please use method buildSecrets instead.
 * @return The buildable object.
 */
@Deprecated public List<SecretBuildSource> getSecrets();
    public List<SecretBuildSource> buildSecrets();
    public SecretBuildSource buildSecret(int index);
    public SecretBuildSource buildFirstSecret();
    public SecretBuildSource buildLastSecret();
    public SecretBuildSource buildMatchingSecret(io.fabric8.kubernetes.api.builder.Predicate<SecretBuildSourceBuilder> predicate);
    public A withSecrets(List<SecretBuildSource> secrets);
    public A withSecrets(SecretBuildSource... secrets);
    public Boolean hasSecrets();
    public BuildSourceFluent.SecretsNested<A> addNewSecret();
    public BuildSourceFluent.SecretsNested<A> addNewSecretLike(SecretBuildSource item);
    public BuildSourceFluent.SecretsNested<A> setNewSecretLike(int index,SecretBuildSource item);
    public BuildSourceFluent.SecretsNested<A> editSecret(int index);
    public BuildSourceFluent.SecretsNested<A> editFirstSecret();
    public BuildSourceFluent.SecretsNested<A> editLastSecret();
    public BuildSourceFluent.SecretsNested<A> editMatchingSecret(io.fabric8.kubernetes.api.builder.Predicate<SecretBuildSourceBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildSourceSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getSourceSecret();
    public LocalObjectReference buildSourceSecret();
    public A withSourceSecret(LocalObjectReference sourceSecret);
    public Boolean hasSourceSecret();
    public A withNewSourceSecret(String name);
    public BuildSourceFluent.SourceSecretNested<A> withNewSourceSecret();
    public BuildSourceFluent.SourceSecretNested<A> withNewSourceSecretLike(LocalObjectReference item);
    public BuildSourceFluent.SourceSecretNested<A> editSourceSecret();
    public BuildSourceFluent.SourceSecretNested<A> editOrNewSourceSecret();
    public BuildSourceFluent.SourceSecretNested<A> editOrNewSourceSecretLike(LocalObjectReference item);
    public String getType();
    public A withType(String type);
    public Boolean hasType();

    public interface BinaryNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BinaryBuildSourceFluent<BuildSourceFluent.BinaryNested<N>>{

        
    public N and();    public N endBinary();
}
    public interface ConfigMapsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ConfigMapBuildSourceFluent<BuildSourceFluent.ConfigMapsNested<N>>{

        
    public N and();    public N endConfigMap();
}
    public interface GitNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GitBuildSourceFluent<BuildSourceFluent.GitNested<N>>{

        
    public N and();    public N endGit();
}
    public interface ImagesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageSourceFluent<BuildSourceFluent.ImagesNested<N>>{

        
    public N and();    public N endImage();
}
    public interface SecretsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretBuildSourceFluent<BuildSourceFluent.SecretsNested<N>>{

        
    public N and();    public N endSecret();
}
    public interface SourceSecretNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<BuildSourceFluent.SourceSecretNested<N>>{

        
    public N and();    public N endSourceSecret();
}


}
