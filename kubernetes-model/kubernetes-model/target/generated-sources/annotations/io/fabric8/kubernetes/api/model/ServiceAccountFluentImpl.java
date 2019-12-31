package io.fabric8.kubernetes.api.model;

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
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class ServiceAccountFluentImpl<A extends ServiceAccountFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ServiceAccountFluent<A>{

    private String apiVersion;
    private Boolean automountServiceAccountToken;
    private List<LocalObjectReferenceBuilder> imagePullSecrets;
    private String kind;
    private ObjectMetaBuilder metadata;
    private List<ObjectReferenceBuilder> secrets;

    public ServiceAccountFluentImpl(){
    }
    public ServiceAccountFluentImpl(ServiceAccount instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken()); 
            this.withImagePullSecrets(instance.getImagePullSecrets()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSecrets(instance.getSecrets()); 
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

    public Boolean isAutomountServiceAccountToken(){
            return this.automountServiceAccountToken;
    }

    public A withAutomountServiceAccountToken(Boolean automountServiceAccountToken){
            this.automountServiceAccountToken=automountServiceAccountToken; return (A) this;
    }

    public Boolean hasAutomountServiceAccountToken(){
            return this.automountServiceAccountToken != null;
    }

    public A withNewAutomountServiceAccountToken(String arg1){
            return (A)withAutomountServiceAccountToken(new Boolean(arg1));
    }

    public A withNewAutomountServiceAccountToken(boolean arg1){
            return (A)withAutomountServiceAccountToken(new Boolean(arg1));
    }

    public A addToImagePullSecrets(int index,LocalObjectReference item){
            if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<LocalObjectReferenceBuilder>();}
            LocalObjectReferenceBuilder builder = new LocalObjectReferenceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.imagePullSecrets.add(index >= 0 ? index : imagePullSecrets.size(), builder); return (A)this;
    }

    public A setToImagePullSecrets(int index,LocalObjectReference item){
            if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<LocalObjectReferenceBuilder>();}
            LocalObjectReferenceBuilder builder = new LocalObjectReferenceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= imagePullSecrets.size()) { imagePullSecrets.add(builder); } else { imagePullSecrets.set(index, builder);}
             return (A)this;
    }

    public A addToImagePullSecrets(LocalObjectReference... items){
            if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<LocalObjectReferenceBuilder>();}
            for (LocalObjectReference item : items) {LocalObjectReferenceBuilder builder = new LocalObjectReferenceBuilder(item);_visitables.add(builder);this.imagePullSecrets.add(builder);} return (A)this;
    }

    public A addAllToImagePullSecrets(Collection<LocalObjectReference> items){
            if (this.imagePullSecrets == null) {this.imagePullSecrets = new ArrayList<LocalObjectReferenceBuilder>();}
            for (LocalObjectReference item : items) {LocalObjectReferenceBuilder builder = new LocalObjectReferenceBuilder(item);_visitables.add(builder);this.imagePullSecrets.add(builder);} return (A)this;
    }

    public A removeFromImagePullSecrets(LocalObjectReference... items){
            for (LocalObjectReference item : items) {LocalObjectReferenceBuilder builder = new LocalObjectReferenceBuilder(item);_visitables.remove(builder);if (this.imagePullSecrets != null) {this.imagePullSecrets.remove(builder);}} return (A)this;
    }

    public A removeAllFromImagePullSecrets(Collection<LocalObjectReference> items){
            for (LocalObjectReference item : items) {LocalObjectReferenceBuilder builder = new LocalObjectReferenceBuilder(item);_visitables.remove(builder);if (this.imagePullSecrets != null) {this.imagePullSecrets.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildImagePullSecrets instead.
 * @return The buildable object.
 */
@Deprecated public List<LocalObjectReference> getImagePullSecrets(){
            return build(imagePullSecrets);
    }

    public List<LocalObjectReference> buildImagePullSecrets(){
            return build(imagePullSecrets);
    }

    public LocalObjectReference buildImagePullSecret(int index){
            return this.imagePullSecrets.get(index).build();
    }

    public LocalObjectReference buildFirstImagePullSecret(){
            return this.imagePullSecrets.get(0).build();
    }

    public LocalObjectReference buildLastImagePullSecret(){
            return this.imagePullSecrets.get(imagePullSecrets.size() - 1).build();
    }

    public LocalObjectReference buildMatchingImagePullSecret(io.fabric8.kubernetes.api.builder.Predicate<LocalObjectReferenceBuilder> predicate){
            for (LocalObjectReferenceBuilder item: imagePullSecrets) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withImagePullSecrets(List<LocalObjectReference> imagePullSecrets){
            if (this.imagePullSecrets != null) { _visitables.removeAll(this.imagePullSecrets);}
            if (imagePullSecrets != null) {this.imagePullSecrets = new ArrayList<LocalObjectReferenceBuilder>(); for (LocalObjectReference item : imagePullSecrets){this.addToImagePullSecrets(item);}} else { this.imagePullSecrets = new ArrayList<LocalObjectReferenceBuilder>();} return (A) this;
    }

    public A withImagePullSecrets(LocalObjectReference... imagePullSecrets){
            if (this.imagePullSecrets != null) {this.imagePullSecrets.clear();}
            if (imagePullSecrets != null) {for (LocalObjectReference item :imagePullSecrets){ this.addToImagePullSecrets(item);}} return (A) this;
    }

    public Boolean hasImagePullSecrets(){
            return imagePullSecrets != null && !imagePullSecrets.isEmpty();
    }

    public A addNewImagePullSecret(String name){
            return (A)addToImagePullSecrets(new LocalObjectReference(name));
    }

    public ServiceAccountFluent.ImagePullSecretsNested<A> addNewImagePullSecret(){
            return new ImagePullSecretsNestedImpl();
    }

    public ServiceAccountFluent.ImagePullSecretsNested<A> addNewImagePullSecretLike(LocalObjectReference item){
            return new ImagePullSecretsNestedImpl(-1, item);
    }

    public ServiceAccountFluent.ImagePullSecretsNested<A> setNewImagePullSecretLike(int index,LocalObjectReference item){
            return new ImagePullSecretsNestedImpl(index, item);
    }

    public ServiceAccountFluent.ImagePullSecretsNested<A> editImagePullSecret(int index){
            if (imagePullSecrets.size() <= index) throw new RuntimeException("Can't edit imagePullSecrets. Index exceeds size.");
            return setNewImagePullSecretLike(index, buildImagePullSecret(index));
    }

    public ServiceAccountFluent.ImagePullSecretsNested<A> editFirstImagePullSecret(){
            if (imagePullSecrets.size() == 0) throw new RuntimeException("Can't edit first imagePullSecrets. The list is empty.");
            return setNewImagePullSecretLike(0, buildImagePullSecret(0));
    }

    public ServiceAccountFluent.ImagePullSecretsNested<A> editLastImagePullSecret(){
            int index = imagePullSecrets.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last imagePullSecrets. The list is empty.");
            return setNewImagePullSecretLike(index, buildImagePullSecret(index));
    }

    public ServiceAccountFluent.ImagePullSecretsNested<A> editMatchingImagePullSecret(io.fabric8.kubernetes.api.builder.Predicate<LocalObjectReferenceBuilder> predicate){
            int index = -1;
            for (int i=0;i<imagePullSecrets.size();i++) { 
            if (predicate.apply(imagePullSecrets.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching imagePullSecrets. No match found.");
            return setNewImagePullSecretLike(index, buildImagePullSecret(index));
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

    public ServiceAccountFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ServiceAccountFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public ServiceAccountFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ServiceAccountFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public ServiceAccountFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public A addToSecrets(int index,ObjectReference item){
            if (this.secrets == null) {this.secrets = new ArrayList<ObjectReferenceBuilder>();}
            ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.secrets.add(index >= 0 ? index : secrets.size(), builder); return (A)this;
    }

    public A setToSecrets(int index,ObjectReference item){
            if (this.secrets == null) {this.secrets = new ArrayList<ObjectReferenceBuilder>();}
            ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= secrets.size()) { secrets.add(builder); } else { secrets.set(index, builder);}
             return (A)this;
    }

    public A addToSecrets(ObjectReference... items){
            if (this.secrets == null) {this.secrets = new ArrayList<ObjectReferenceBuilder>();}
            for (ObjectReference item : items) {ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.add(builder);this.secrets.add(builder);} return (A)this;
    }

    public A addAllToSecrets(Collection<ObjectReference> items){
            if (this.secrets == null) {this.secrets = new ArrayList<ObjectReferenceBuilder>();}
            for (ObjectReference item : items) {ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.add(builder);this.secrets.add(builder);} return (A)this;
    }

    public A removeFromSecrets(ObjectReference... items){
            for (ObjectReference item : items) {ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.remove(builder);if (this.secrets != null) {this.secrets.remove(builder);}} return (A)this;
    }

    public A removeAllFromSecrets(Collection<ObjectReference> items){
            for (ObjectReference item : items) {ObjectReferenceBuilder builder = new ObjectReferenceBuilder(item);_visitables.remove(builder);if (this.secrets != null) {this.secrets.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildSecrets instead.
 * @return The buildable object.
 */
@Deprecated public List<ObjectReference> getSecrets(){
            return build(secrets);
    }

    public List<ObjectReference> buildSecrets(){
            return build(secrets);
    }

    public ObjectReference buildSecret(int index){
            return this.secrets.get(index).build();
    }

    public ObjectReference buildFirstSecret(){
            return this.secrets.get(0).build();
    }

    public ObjectReference buildLastSecret(){
            return this.secrets.get(secrets.size() - 1).build();
    }

    public ObjectReference buildMatchingSecret(io.fabric8.kubernetes.api.builder.Predicate<ObjectReferenceBuilder> predicate){
            for (ObjectReferenceBuilder item: secrets) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withSecrets(List<ObjectReference> secrets){
            if (this.secrets != null) { _visitables.removeAll(this.secrets);}
            if (secrets != null) {this.secrets = new ArrayList<ObjectReferenceBuilder>(); for (ObjectReference item : secrets){this.addToSecrets(item);}} else { this.secrets = new ArrayList<ObjectReferenceBuilder>();} return (A) this;
    }

    public A withSecrets(ObjectReference... secrets){
            if (this.secrets != null) {this.secrets.clear();}
            if (secrets != null) {for (ObjectReference item :secrets){ this.addToSecrets(item);}} return (A) this;
    }

    public Boolean hasSecrets(){
            return secrets != null && !secrets.isEmpty();
    }

    public ServiceAccountFluent.SecretsNested<A> addNewSecret(){
            return new SecretsNestedImpl();
    }

    public ServiceAccountFluent.SecretsNested<A> addNewSecretLike(ObjectReference item){
            return new SecretsNestedImpl(-1, item);
    }

    public ServiceAccountFluent.SecretsNested<A> setNewSecretLike(int index,ObjectReference item){
            return new SecretsNestedImpl(index, item);
    }

    public ServiceAccountFluent.SecretsNested<A> editSecret(int index){
            if (secrets.size() <= index) throw new RuntimeException("Can't edit secrets. Index exceeds size.");
            return setNewSecretLike(index, buildSecret(index));
    }

    public ServiceAccountFluent.SecretsNested<A> editFirstSecret(){
            if (secrets.size() == 0) throw new RuntimeException("Can't edit first secrets. The list is empty.");
            return setNewSecretLike(0, buildSecret(0));
    }

    public ServiceAccountFluent.SecretsNested<A> editLastSecret(){
            int index = secrets.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last secrets. The list is empty.");
            return setNewSecretLike(index, buildSecret(index));
    }

    public ServiceAccountFluent.SecretsNested<A> editMatchingSecret(io.fabric8.kubernetes.api.builder.Predicate<ObjectReferenceBuilder> predicate){
            int index = -1;
            for (int i=0;i<secrets.size();i++) { 
            if (predicate.apply(secrets.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching secrets. No match found.");
            return setNewSecretLike(index, buildSecret(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ServiceAccountFluentImpl that = (ServiceAccountFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (automountServiceAccountToken != null ? !automountServiceAccountToken.equals(that.automountServiceAccountToken) :that.automountServiceAccountToken != null) return false;
            if (imagePullSecrets != null ? !imagePullSecrets.equals(that.imagePullSecrets) :that.imagePullSecrets != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (secrets != null ? !secrets.equals(that.secrets) :that.secrets != null) return false;
            return true;
    }


    public class ImagePullSecretsNestedImpl<N> extends LocalObjectReferenceFluentImpl<ServiceAccountFluent.ImagePullSecretsNested<N>> implements ServiceAccountFluent.ImagePullSecretsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
        private final int index;
    
            ImagePullSecretsNestedImpl(int index,LocalObjectReference item){
                    this.index = index;
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            ImagePullSecretsNestedImpl(){
                    this.index = -1;
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ServiceAccountFluentImpl.this.setToImagePullSecrets(index, builder.build());
    }
    public N endImagePullSecret(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<ServiceAccountFluent.MetadataNested<N>> implements ServiceAccountFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) ServiceAccountFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SecretsNestedImpl<N> extends ObjectReferenceFluentImpl<ServiceAccountFluent.SecretsNested<N>> implements ServiceAccountFluent.SecretsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
        private final int index;
    
            SecretsNestedImpl(int index,ObjectReference item){
                    this.index = index;
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            SecretsNestedImpl(){
                    this.index = -1;
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ServiceAccountFluentImpl.this.setToSecrets(index, builder.build());
    }
    public N endSecret(){
            return and();
    }

}


}
