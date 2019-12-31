package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluentImpl;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import java.util.Collection;
import java.lang.Object;

public class BuildSourceFluentImpl<A extends BuildSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildSourceFluent<A>{

    private BinaryBuildSourceBuilder binary;
    private List<ConfigMapBuildSourceBuilder> configMaps;
    private String contextDir;
    private String dockerfile;
    private GitBuildSourceBuilder git;
    private List<ImageSourceBuilder> images;
    private List<SecretBuildSourceBuilder> secrets;
    private LocalObjectReferenceBuilder sourceSecret;
    private String type;

    public BuildSourceFluentImpl(){
    }
    public BuildSourceFluentImpl(BuildSource instance){
            this.withBinary(instance.getBinary()); 
            this.withConfigMaps(instance.getConfigMaps()); 
            this.withContextDir(instance.getContextDir()); 
            this.withDockerfile(instance.getDockerfile()); 
            this.withGit(instance.getGit()); 
            this.withImages(instance.getImages()); 
            this.withSecrets(instance.getSecrets()); 
            this.withSourceSecret(instance.getSourceSecret()); 
            this.withType(instance.getType()); 
    }

    
/**
 * This method has been deprecated, please use method buildBinary instead.
 * @return The buildable object.
 */
@Deprecated public BinaryBuildSource getBinary(){
            return this.binary!=null?this.binary.build():null;
    }

    public BinaryBuildSource buildBinary(){
            return this.binary!=null?this.binary.build():null;
    }

    public A withBinary(BinaryBuildSource binary){
            _visitables.remove(this.binary);
            if (binary!=null){ this.binary= new BinaryBuildSourceBuilder(binary); _visitables.add(this.binary);} return (A) this;
    }

    public Boolean hasBinary(){
            return this.binary != null;
    }

    public A withNewBinary(String asFile){
            return (A)withBinary(new BinaryBuildSource(asFile));
    }

    public BuildSourceFluent.BinaryNested<A> withNewBinary(){
            return new BinaryNestedImpl();
    }

    public BuildSourceFluent.BinaryNested<A> withNewBinaryLike(BinaryBuildSource item){
            return new BinaryNestedImpl(item);
    }

    public BuildSourceFluent.BinaryNested<A> editBinary(){
            return withNewBinaryLike(getBinary());
    }

    public BuildSourceFluent.BinaryNested<A> editOrNewBinary(){
            return withNewBinaryLike(getBinary() != null ? getBinary(): new BinaryBuildSourceBuilder().build());
    }

    public BuildSourceFluent.BinaryNested<A> editOrNewBinaryLike(BinaryBuildSource item){
            return withNewBinaryLike(getBinary() != null ? getBinary(): item);
    }

    public A addToConfigMaps(int index,ConfigMapBuildSource item){
            if (this.configMaps == null) {this.configMaps = new ArrayList<ConfigMapBuildSourceBuilder>();}
            ConfigMapBuildSourceBuilder builder = new ConfigMapBuildSourceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.configMaps.add(index >= 0 ? index : configMaps.size(), builder); return (A)this;
    }

    public A setToConfigMaps(int index,ConfigMapBuildSource item){
            if (this.configMaps == null) {this.configMaps = new ArrayList<ConfigMapBuildSourceBuilder>();}
            ConfigMapBuildSourceBuilder builder = new ConfigMapBuildSourceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= configMaps.size()) { configMaps.add(builder); } else { configMaps.set(index, builder);}
             return (A)this;
    }

    public A addToConfigMaps(ConfigMapBuildSource... items){
            if (this.configMaps == null) {this.configMaps = new ArrayList<ConfigMapBuildSourceBuilder>();}
            for (ConfigMapBuildSource item : items) {ConfigMapBuildSourceBuilder builder = new ConfigMapBuildSourceBuilder(item);_visitables.add(builder);this.configMaps.add(builder);} return (A)this;
    }

    public A addAllToConfigMaps(Collection<ConfigMapBuildSource> items){
            if (this.configMaps == null) {this.configMaps = new ArrayList<ConfigMapBuildSourceBuilder>();}
            for (ConfigMapBuildSource item : items) {ConfigMapBuildSourceBuilder builder = new ConfigMapBuildSourceBuilder(item);_visitables.add(builder);this.configMaps.add(builder);} return (A)this;
    }

    public A removeFromConfigMaps(ConfigMapBuildSource... items){
            for (ConfigMapBuildSource item : items) {ConfigMapBuildSourceBuilder builder = new ConfigMapBuildSourceBuilder(item);_visitables.remove(builder);if (this.configMaps != null) {this.configMaps.remove(builder);}} return (A)this;
    }

    public A removeAllFromConfigMaps(Collection<ConfigMapBuildSource> items){
            for (ConfigMapBuildSource item : items) {ConfigMapBuildSourceBuilder builder = new ConfigMapBuildSourceBuilder(item);_visitables.remove(builder);if (this.configMaps != null) {this.configMaps.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConfigMaps instead.
 * @return The buildable object.
 */
@Deprecated public List<ConfigMapBuildSource> getConfigMaps(){
            return build(configMaps);
    }

    public List<ConfigMapBuildSource> buildConfigMaps(){
            return build(configMaps);
    }

    public ConfigMapBuildSource buildConfigMap(int index){
            return this.configMaps.get(index).build();
    }

    public ConfigMapBuildSource buildFirstConfigMap(){
            return this.configMaps.get(0).build();
    }

    public ConfigMapBuildSource buildLastConfigMap(){
            return this.configMaps.get(configMaps.size() - 1).build();
    }

    public ConfigMapBuildSource buildMatchingConfigMap(io.fabric8.kubernetes.api.builder.Predicate<ConfigMapBuildSourceBuilder> predicate){
            for (ConfigMapBuildSourceBuilder item: configMaps) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConfigMaps(List<ConfigMapBuildSource> configMaps){
            if (this.configMaps != null) { _visitables.removeAll(this.configMaps);}
            if (configMaps != null) {this.configMaps = new ArrayList<ConfigMapBuildSourceBuilder>(); for (ConfigMapBuildSource item : configMaps){this.addToConfigMaps(item);}} else { this.configMaps = new ArrayList<ConfigMapBuildSourceBuilder>();} return (A) this;
    }

    public A withConfigMaps(ConfigMapBuildSource... configMaps){
            if (this.configMaps != null) {this.configMaps.clear();}
            if (configMaps != null) {for (ConfigMapBuildSource item :configMaps){ this.addToConfigMaps(item);}} return (A) this;
    }

    public Boolean hasConfigMaps(){
            return configMaps != null && !configMaps.isEmpty();
    }

    public BuildSourceFluent.ConfigMapsNested<A> addNewConfigMap(){
            return new ConfigMapsNestedImpl();
    }

    public BuildSourceFluent.ConfigMapsNested<A> addNewConfigMapLike(ConfigMapBuildSource item){
            return new ConfigMapsNestedImpl(-1, item);
    }

    public BuildSourceFluent.ConfigMapsNested<A> setNewConfigMapLike(int index,ConfigMapBuildSource item){
            return new ConfigMapsNestedImpl(index, item);
    }

    public BuildSourceFluent.ConfigMapsNested<A> editConfigMap(int index){
            if (configMaps.size() <= index) throw new RuntimeException("Can't edit configMaps. Index exceeds size.");
            return setNewConfigMapLike(index, buildConfigMap(index));
    }

    public BuildSourceFluent.ConfigMapsNested<A> editFirstConfigMap(){
            if (configMaps.size() == 0) throw new RuntimeException("Can't edit first configMaps. The list is empty.");
            return setNewConfigMapLike(0, buildConfigMap(0));
    }

    public BuildSourceFluent.ConfigMapsNested<A> editLastConfigMap(){
            int index = configMaps.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last configMaps. The list is empty.");
            return setNewConfigMapLike(index, buildConfigMap(index));
    }

    public BuildSourceFluent.ConfigMapsNested<A> editMatchingConfigMap(io.fabric8.kubernetes.api.builder.Predicate<ConfigMapBuildSourceBuilder> predicate){
            int index = -1;
            for (int i=0;i<configMaps.size();i++) { 
            if (predicate.apply(configMaps.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching configMaps. No match found.");
            return setNewConfigMapLike(index, buildConfigMap(index));
    }

    public String getContextDir(){
            return this.contextDir;
    }

    public A withContextDir(String contextDir){
            this.contextDir=contextDir; return (A) this;
    }

    public Boolean hasContextDir(){
            return this.contextDir != null;
    }

    public String getDockerfile(){
            return this.dockerfile;
    }

    public A withDockerfile(String dockerfile){
            this.dockerfile=dockerfile; return (A) this;
    }

    public Boolean hasDockerfile(){
            return this.dockerfile != null;
    }

    
/**
 * This method has been deprecated, please use method buildGit instead.
 * @return The buildable object.
 */
@Deprecated public GitBuildSource getGit(){
            return this.git!=null?this.git.build():null;
    }

    public GitBuildSource buildGit(){
            return this.git!=null?this.git.build():null;
    }

    public A withGit(GitBuildSource git){
            _visitables.remove(this.git);
            if (git!=null){ this.git= new GitBuildSourceBuilder(git); _visitables.add(this.git);} return (A) this;
    }

    public Boolean hasGit(){
            return this.git != null;
    }

    public A withNewGit(String httpProxy,String httpsProxy,String noProxy,String ref,String uri){
            return (A)withGit(new GitBuildSource(httpProxy, httpsProxy, noProxy, ref, uri));
    }

    public BuildSourceFluent.GitNested<A> withNewGit(){
            return new GitNestedImpl();
    }

    public BuildSourceFluent.GitNested<A> withNewGitLike(GitBuildSource item){
            return new GitNestedImpl(item);
    }

    public BuildSourceFluent.GitNested<A> editGit(){
            return withNewGitLike(getGit());
    }

    public BuildSourceFluent.GitNested<A> editOrNewGit(){
            return withNewGitLike(getGit() != null ? getGit(): new GitBuildSourceBuilder().build());
    }

    public BuildSourceFluent.GitNested<A> editOrNewGitLike(GitBuildSource item){
            return withNewGitLike(getGit() != null ? getGit(): item);
    }

    public A addToImages(int index,ImageSource item){
            if (this.images == null) {this.images = new ArrayList<ImageSourceBuilder>();}
            ImageSourceBuilder builder = new ImageSourceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.images.add(index >= 0 ? index : images.size(), builder); return (A)this;
    }

    public A setToImages(int index,ImageSource item){
            if (this.images == null) {this.images = new ArrayList<ImageSourceBuilder>();}
            ImageSourceBuilder builder = new ImageSourceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= images.size()) { images.add(builder); } else { images.set(index, builder);}
             return (A)this;
    }

    public A addToImages(ImageSource... items){
            if (this.images == null) {this.images = new ArrayList<ImageSourceBuilder>();}
            for (ImageSource item : items) {ImageSourceBuilder builder = new ImageSourceBuilder(item);_visitables.add(builder);this.images.add(builder);} return (A)this;
    }

    public A addAllToImages(Collection<ImageSource> items){
            if (this.images == null) {this.images = new ArrayList<ImageSourceBuilder>();}
            for (ImageSource item : items) {ImageSourceBuilder builder = new ImageSourceBuilder(item);_visitables.add(builder);this.images.add(builder);} return (A)this;
    }

    public A removeFromImages(ImageSource... items){
            for (ImageSource item : items) {ImageSourceBuilder builder = new ImageSourceBuilder(item);_visitables.remove(builder);if (this.images != null) {this.images.remove(builder);}} return (A)this;
    }

    public A removeAllFromImages(Collection<ImageSource> items){
            for (ImageSource item : items) {ImageSourceBuilder builder = new ImageSourceBuilder(item);_visitables.remove(builder);if (this.images != null) {this.images.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildImages instead.
 * @return The buildable object.
 */
@Deprecated public List<ImageSource> getImages(){
            return build(images);
    }

    public List<ImageSource> buildImages(){
            return build(images);
    }

    public ImageSource buildImage(int index){
            return this.images.get(index).build();
    }

    public ImageSource buildFirstImage(){
            return this.images.get(0).build();
    }

    public ImageSource buildLastImage(){
            return this.images.get(images.size() - 1).build();
    }

    public ImageSource buildMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageSourceBuilder> predicate){
            for (ImageSourceBuilder item: images) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withImages(List<ImageSource> images){
            if (this.images != null) { _visitables.removeAll(this.images);}
            if (images != null) {this.images = new ArrayList<ImageSourceBuilder>(); for (ImageSource item : images){this.addToImages(item);}} else { this.images = new ArrayList<ImageSourceBuilder>();} return (A) this;
    }

    public A withImages(ImageSource... images){
            if (this.images != null) {this.images.clear();}
            if (images != null) {for (ImageSource item :images){ this.addToImages(item);}} return (A) this;
    }

    public Boolean hasImages(){
            return images != null && !images.isEmpty();
    }

    public BuildSourceFluent.ImagesNested<A> addNewImage(){
            return new ImagesNestedImpl();
    }

    public BuildSourceFluent.ImagesNested<A> addNewImageLike(ImageSource item){
            return new ImagesNestedImpl(-1, item);
    }

    public BuildSourceFluent.ImagesNested<A> setNewImageLike(int index,ImageSource item){
            return new ImagesNestedImpl(index, item);
    }

    public BuildSourceFluent.ImagesNested<A> editImage(int index){
            if (images.size() <= index) throw new RuntimeException("Can't edit images. Index exceeds size.");
            return setNewImageLike(index, buildImage(index));
    }

    public BuildSourceFluent.ImagesNested<A> editFirstImage(){
            if (images.size() == 0) throw new RuntimeException("Can't edit first images. The list is empty.");
            return setNewImageLike(0, buildImage(0));
    }

    public BuildSourceFluent.ImagesNested<A> editLastImage(){
            int index = images.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last images. The list is empty.");
            return setNewImageLike(index, buildImage(index));
    }

    public BuildSourceFluent.ImagesNested<A> editMatchingImage(io.fabric8.kubernetes.api.builder.Predicate<ImageSourceBuilder> predicate){
            int index = -1;
            for (int i=0;i<images.size();i++) { 
            if (predicate.apply(images.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching images. No match found.");
            return setNewImageLike(index, buildImage(index));
    }

    public A addToSecrets(int index,SecretBuildSource item){
            if (this.secrets == null) {this.secrets = new ArrayList<SecretBuildSourceBuilder>();}
            SecretBuildSourceBuilder builder = new SecretBuildSourceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.secrets.add(index >= 0 ? index : secrets.size(), builder); return (A)this;
    }

    public A setToSecrets(int index,SecretBuildSource item){
            if (this.secrets == null) {this.secrets = new ArrayList<SecretBuildSourceBuilder>();}
            SecretBuildSourceBuilder builder = new SecretBuildSourceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= secrets.size()) { secrets.add(builder); } else { secrets.set(index, builder);}
             return (A)this;
    }

    public A addToSecrets(SecretBuildSource... items){
            if (this.secrets == null) {this.secrets = new ArrayList<SecretBuildSourceBuilder>();}
            for (SecretBuildSource item : items) {SecretBuildSourceBuilder builder = new SecretBuildSourceBuilder(item);_visitables.add(builder);this.secrets.add(builder);} return (A)this;
    }

    public A addAllToSecrets(Collection<SecretBuildSource> items){
            if (this.secrets == null) {this.secrets = new ArrayList<SecretBuildSourceBuilder>();}
            for (SecretBuildSource item : items) {SecretBuildSourceBuilder builder = new SecretBuildSourceBuilder(item);_visitables.add(builder);this.secrets.add(builder);} return (A)this;
    }

    public A removeFromSecrets(SecretBuildSource... items){
            for (SecretBuildSource item : items) {SecretBuildSourceBuilder builder = new SecretBuildSourceBuilder(item);_visitables.remove(builder);if (this.secrets != null) {this.secrets.remove(builder);}} return (A)this;
    }

    public A removeAllFromSecrets(Collection<SecretBuildSource> items){
            for (SecretBuildSource item : items) {SecretBuildSourceBuilder builder = new SecretBuildSourceBuilder(item);_visitables.remove(builder);if (this.secrets != null) {this.secrets.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildSecrets instead.
 * @return The buildable object.
 */
@Deprecated public List<SecretBuildSource> getSecrets(){
            return build(secrets);
    }

    public List<SecretBuildSource> buildSecrets(){
            return build(secrets);
    }

    public SecretBuildSource buildSecret(int index){
            return this.secrets.get(index).build();
    }

    public SecretBuildSource buildFirstSecret(){
            return this.secrets.get(0).build();
    }

    public SecretBuildSource buildLastSecret(){
            return this.secrets.get(secrets.size() - 1).build();
    }

    public SecretBuildSource buildMatchingSecret(io.fabric8.kubernetes.api.builder.Predicate<SecretBuildSourceBuilder> predicate){
            for (SecretBuildSourceBuilder item: secrets) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withSecrets(List<SecretBuildSource> secrets){
            if (this.secrets != null) { _visitables.removeAll(this.secrets);}
            if (secrets != null) {this.secrets = new ArrayList<SecretBuildSourceBuilder>(); for (SecretBuildSource item : secrets){this.addToSecrets(item);}} else { this.secrets = new ArrayList<SecretBuildSourceBuilder>();} return (A) this;
    }

    public A withSecrets(SecretBuildSource... secrets){
            if (this.secrets != null) {this.secrets.clear();}
            if (secrets != null) {for (SecretBuildSource item :secrets){ this.addToSecrets(item);}} return (A) this;
    }

    public Boolean hasSecrets(){
            return secrets != null && !secrets.isEmpty();
    }

    public BuildSourceFluent.SecretsNested<A> addNewSecret(){
            return new SecretsNestedImpl();
    }

    public BuildSourceFluent.SecretsNested<A> addNewSecretLike(SecretBuildSource item){
            return new SecretsNestedImpl(-1, item);
    }

    public BuildSourceFluent.SecretsNested<A> setNewSecretLike(int index,SecretBuildSource item){
            return new SecretsNestedImpl(index, item);
    }

    public BuildSourceFluent.SecretsNested<A> editSecret(int index){
            if (secrets.size() <= index) throw new RuntimeException("Can't edit secrets. Index exceeds size.");
            return setNewSecretLike(index, buildSecret(index));
    }

    public BuildSourceFluent.SecretsNested<A> editFirstSecret(){
            if (secrets.size() == 0) throw new RuntimeException("Can't edit first secrets. The list is empty.");
            return setNewSecretLike(0, buildSecret(0));
    }

    public BuildSourceFluent.SecretsNested<A> editLastSecret(){
            int index = secrets.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last secrets. The list is empty.");
            return setNewSecretLike(index, buildSecret(index));
    }

    public BuildSourceFluent.SecretsNested<A> editMatchingSecret(io.fabric8.kubernetes.api.builder.Predicate<SecretBuildSourceBuilder> predicate){
            int index = -1;
            for (int i=0;i<secrets.size();i++) { 
            if (predicate.apply(secrets.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching secrets. No match found.");
            return setNewSecretLike(index, buildSecret(index));
    }

    
/**
 * This method has been deprecated, please use method buildSourceSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getSourceSecret(){
            return this.sourceSecret!=null?this.sourceSecret.build():null;
    }

    public LocalObjectReference buildSourceSecret(){
            return this.sourceSecret!=null?this.sourceSecret.build():null;
    }

    public A withSourceSecret(LocalObjectReference sourceSecret){
            _visitables.remove(this.sourceSecret);
            if (sourceSecret!=null){ this.sourceSecret= new LocalObjectReferenceBuilder(sourceSecret); _visitables.add(this.sourceSecret);} return (A) this;
    }

    public Boolean hasSourceSecret(){
            return this.sourceSecret != null;
    }

    public A withNewSourceSecret(String name){
            return (A)withSourceSecret(new LocalObjectReference(name));
    }

    public BuildSourceFluent.SourceSecretNested<A> withNewSourceSecret(){
            return new SourceSecretNestedImpl();
    }

    public BuildSourceFluent.SourceSecretNested<A> withNewSourceSecretLike(LocalObjectReference item){
            return new SourceSecretNestedImpl(item);
    }

    public BuildSourceFluent.SourceSecretNested<A> editSourceSecret(){
            return withNewSourceSecretLike(getSourceSecret());
    }

    public BuildSourceFluent.SourceSecretNested<A> editOrNewSourceSecret(){
            return withNewSourceSecretLike(getSourceSecret() != null ? getSourceSecret(): new LocalObjectReferenceBuilder().build());
    }

    public BuildSourceFluent.SourceSecretNested<A> editOrNewSourceSecretLike(LocalObjectReference item){
            return withNewSourceSecretLike(getSourceSecret() != null ? getSourceSecret(): item);
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildSourceFluentImpl that = (BuildSourceFluentImpl) o;
            if (binary != null ? !binary.equals(that.binary) :that.binary != null) return false;
            if (configMaps != null ? !configMaps.equals(that.configMaps) :that.configMaps != null) return false;
            if (contextDir != null ? !contextDir.equals(that.contextDir) :that.contextDir != null) return false;
            if (dockerfile != null ? !dockerfile.equals(that.dockerfile) :that.dockerfile != null) return false;
            if (git != null ? !git.equals(that.git) :that.git != null) return false;
            if (images != null ? !images.equals(that.images) :that.images != null) return false;
            if (secrets != null ? !secrets.equals(that.secrets) :that.secrets != null) return false;
            if (sourceSecret != null ? !sourceSecret.equals(that.sourceSecret) :that.sourceSecret != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            return true;
    }


    public class BinaryNestedImpl<N> extends BinaryBuildSourceFluentImpl<BuildSourceFluent.BinaryNested<N>> implements BuildSourceFluent.BinaryNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BinaryBuildSourceBuilder builder;
    
            BinaryNestedImpl(BinaryBuildSource item){
                    this.builder = new BinaryBuildSourceBuilder(this, item);
            }
            BinaryNestedImpl(){
                    this.builder = new BinaryBuildSourceBuilder(this);
            }
    
    public N and(){
            return (N) BuildSourceFluentImpl.this.withBinary(builder.build());
    }
    public N endBinary(){
            return and();
    }

}
    public class ConfigMapsNestedImpl<N> extends ConfigMapBuildSourceFluentImpl<BuildSourceFluent.ConfigMapsNested<N>> implements BuildSourceFluent.ConfigMapsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapBuildSourceBuilder builder;
        private final int index;
    
            ConfigMapsNestedImpl(int index,ConfigMapBuildSource item){
                    this.index = index;
                    this.builder = new ConfigMapBuildSourceBuilder(this, item);
            }
            ConfigMapsNestedImpl(){
                    this.index = -1;
                    this.builder = new ConfigMapBuildSourceBuilder(this);
            }
    
    public N and(){
            return (N) BuildSourceFluentImpl.this.setToConfigMaps(index, builder.build());
    }
    public N endConfigMap(){
            return and();
    }

}
    public class GitNestedImpl<N> extends GitBuildSourceFluentImpl<BuildSourceFluent.GitNested<N>> implements BuildSourceFluent.GitNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GitBuildSourceBuilder builder;
    
            GitNestedImpl(GitBuildSource item){
                    this.builder = new GitBuildSourceBuilder(this, item);
            }
            GitNestedImpl(){
                    this.builder = new GitBuildSourceBuilder(this);
            }
    
    public N and(){
            return (N) BuildSourceFluentImpl.this.withGit(builder.build());
    }
    public N endGit(){
            return and();
    }

}
    public class ImagesNestedImpl<N> extends ImageSourceFluentImpl<BuildSourceFluent.ImagesNested<N>> implements BuildSourceFluent.ImagesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageSourceBuilder builder;
        private final int index;
    
            ImagesNestedImpl(int index,ImageSource item){
                    this.index = index;
                    this.builder = new ImageSourceBuilder(this, item);
            }
            ImagesNestedImpl(){
                    this.index = -1;
                    this.builder = new ImageSourceBuilder(this);
            }
    
    public N and(){
            return (N) BuildSourceFluentImpl.this.setToImages(index, builder.build());
    }
    public N endImage(){
            return and();
    }

}
    public class SecretsNestedImpl<N> extends SecretBuildSourceFluentImpl<BuildSourceFluent.SecretsNested<N>> implements BuildSourceFluent.SecretsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SecretBuildSourceBuilder builder;
        private final int index;
    
            SecretsNestedImpl(int index,SecretBuildSource item){
                    this.index = index;
                    this.builder = new SecretBuildSourceBuilder(this, item);
            }
            SecretsNestedImpl(){
                    this.index = -1;
                    this.builder = new SecretBuildSourceBuilder(this);
            }
    
    public N and(){
            return (N) BuildSourceFluentImpl.this.setToSecrets(index, builder.build());
    }
    public N endSecret(){
            return and();
    }

}
    public class SourceSecretNestedImpl<N> extends LocalObjectReferenceFluentImpl<BuildSourceFluent.SourceSecretNested<N>> implements BuildSourceFluent.SourceSecretNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            SourceSecretNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            SourceSecretNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) BuildSourceFluentImpl.this.withSourceSecret(builder.build());
    }
    public N endSourceSecret(){
            return and();
    }

}


}
