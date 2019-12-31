package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface ServiceAccountFluent<A extends ServiceAccountFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public Boolean isAutomountServiceAccountToken();
    public A withAutomountServiceAccountToken(Boolean automountServiceAccountToken);
    public Boolean hasAutomountServiceAccountToken();
    public A withNewAutomountServiceAccountToken(String arg1);
    public A withNewAutomountServiceAccountToken(boolean arg1);
    public A addToImagePullSecrets(int index,LocalObjectReference item);
    public A setToImagePullSecrets(int index,LocalObjectReference item);
    public A addToImagePullSecrets(LocalObjectReference... items);
    public A addAllToImagePullSecrets(Collection<LocalObjectReference> items);
    public A removeFromImagePullSecrets(LocalObjectReference... items);
    public A removeAllFromImagePullSecrets(Collection<LocalObjectReference> items);
    
/**
 * This method has been deprecated, please use method buildImagePullSecrets instead.
 * @return The buildable object.
 */
@Deprecated public List<LocalObjectReference> getImagePullSecrets();
    public List<LocalObjectReference> buildImagePullSecrets();
    public LocalObjectReference buildImagePullSecret(int index);
    public LocalObjectReference buildFirstImagePullSecret();
    public LocalObjectReference buildLastImagePullSecret();
    public LocalObjectReference buildMatchingImagePullSecret(io.fabric8.kubernetes.api.builder.Predicate<LocalObjectReferenceBuilder> predicate);
    public A withImagePullSecrets(List<LocalObjectReference> imagePullSecrets);
    public A withImagePullSecrets(LocalObjectReference... imagePullSecrets);
    public Boolean hasImagePullSecrets();
    public A addNewImagePullSecret(String name);
    public ServiceAccountFluent.ImagePullSecretsNested<A> addNewImagePullSecret();
    public ServiceAccountFluent.ImagePullSecretsNested<A> addNewImagePullSecretLike(LocalObjectReference item);
    public ServiceAccountFluent.ImagePullSecretsNested<A> setNewImagePullSecretLike(int index,LocalObjectReference item);
    public ServiceAccountFluent.ImagePullSecretsNested<A> editImagePullSecret(int index);
    public ServiceAccountFluent.ImagePullSecretsNested<A> editFirstImagePullSecret();
    public ServiceAccountFluent.ImagePullSecretsNested<A> editLastImagePullSecret();
    public ServiceAccountFluent.ImagePullSecretsNested<A> editMatchingImagePullSecret(io.fabric8.kubernetes.api.builder.Predicate<LocalObjectReferenceBuilder> predicate);
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
    public ServiceAccountFluent.MetadataNested<A> withNewMetadata();
    public ServiceAccountFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ServiceAccountFluent.MetadataNested<A> editMetadata();
    public ServiceAccountFluent.MetadataNested<A> editOrNewMetadata();
    public ServiceAccountFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    public A addToSecrets(int index,ObjectReference item);
    public A setToSecrets(int index,ObjectReference item);
    public A addToSecrets(ObjectReference... items);
    public A addAllToSecrets(Collection<ObjectReference> items);
    public A removeFromSecrets(ObjectReference... items);
    public A removeAllFromSecrets(Collection<ObjectReference> items);
    
/**
 * This method has been deprecated, please use method buildSecrets instead.
 * @return The buildable object.
 */
@Deprecated public List<ObjectReference> getSecrets();
    public List<ObjectReference> buildSecrets();
    public ObjectReference buildSecret(int index);
    public ObjectReference buildFirstSecret();
    public ObjectReference buildLastSecret();
    public ObjectReference buildMatchingSecret(io.fabric8.kubernetes.api.builder.Predicate<ObjectReferenceBuilder> predicate);
    public A withSecrets(List<ObjectReference> secrets);
    public A withSecrets(ObjectReference... secrets);
    public Boolean hasSecrets();
    public ServiceAccountFluent.SecretsNested<A> addNewSecret();
    public ServiceAccountFluent.SecretsNested<A> addNewSecretLike(ObjectReference item);
    public ServiceAccountFluent.SecretsNested<A> setNewSecretLike(int index,ObjectReference item);
    public ServiceAccountFluent.SecretsNested<A> editSecret(int index);
    public ServiceAccountFluent.SecretsNested<A> editFirstSecret();
    public ServiceAccountFluent.SecretsNested<A> editLastSecret();
    public ServiceAccountFluent.SecretsNested<A> editMatchingSecret(io.fabric8.kubernetes.api.builder.Predicate<ObjectReferenceBuilder> predicate);

    public interface ImagePullSecretsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<ServiceAccountFluent.ImagePullSecretsNested<N>>{

        
    public N and();    public N endImagePullSecret();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ServiceAccountFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SecretsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<ServiceAccountFluent.SecretsNested<N>>{

        
    public N and();    public N endSecret();
}


}
