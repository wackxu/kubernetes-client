package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import javax.validation.constraints.Pattern;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface ObjectMetaFluent<A extends ObjectMetaFluent<A>> extends Fluent<A>{


    public A addToAnnotations(String key,String value);
    public A addToAnnotations(Map<String,String> map);
    public A removeFromAnnotations(String key);
    public A removeFromAnnotations(Map<String,String> map);
    public Map<String,String> getAnnotations();
    public A withAnnotations(Map<String,String> annotations);
    public Boolean hasAnnotations();
    public String getClusterName();
    public A withClusterName(String clusterName);
    public Boolean hasClusterName();
    public String getCreationTimestamp();
    public A withCreationTimestamp(String creationTimestamp);
    public Boolean hasCreationTimestamp();
    public Long getDeletionGracePeriodSeconds();
    public A withDeletionGracePeriodSeconds(Long deletionGracePeriodSeconds);
    public Boolean hasDeletionGracePeriodSeconds();
    public A withNewDeletionGracePeriodSeconds(String arg1);
    public A withNewDeletionGracePeriodSeconds(long arg1);
    public String getDeletionTimestamp();
    public A withDeletionTimestamp(String deletionTimestamp);
    public Boolean hasDeletionTimestamp();
    public A addToFinalizers(int index,String item);
    public A setToFinalizers(int index,String item);
    public A addToFinalizers(String... items);
    public A addAllToFinalizers(Collection<String> items);
    public A removeFromFinalizers(String... items);
    public A removeAllFromFinalizers(Collection<String> items);
    public List<String> getFinalizers();
    public String getFinalizer(int index);
    public String getFirstFinalizer();
    public String getLastFinalizer();
    public String getMatchingFinalizer(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withFinalizers(List<String> finalizers);
    public A withFinalizers(String... finalizers);
    public Boolean hasFinalizers();
    public String getGenerateName();
    public A withGenerateName(String generateName);
    public Boolean hasGenerateName();
    public Long getGeneration();
    public A withGeneration(Long generation);
    public Boolean hasGeneration();
    public A withNewGeneration(String arg1);
    public A withNewGeneration(long arg1);
    
/**
 * This method has been deprecated, please use method buildInitializers instead.
 * @return The buildable object.
 */
@Deprecated public Initializers getInitializers();
    public Initializers buildInitializers();
    public A withInitializers(Initializers initializers);
    public Boolean hasInitializers();
    public ObjectMetaFluent.InitializersNested<A> withNewInitializers();
    public ObjectMetaFluent.InitializersNested<A> withNewInitializersLike(Initializers item);
    public ObjectMetaFluent.InitializersNested<A> editInitializers();
    public ObjectMetaFluent.InitializersNested<A> editOrNewInitializers();
    public ObjectMetaFluent.InitializersNested<A> editOrNewInitializersLike(Initializers item);
    public A addToLabels(String key,String value);
    public A addToLabels(Map<String,String> map);
    public A removeFromLabels(String key);
    public A removeFromLabels(Map<String,String> map);
    public Map<String,String> getLabels();
    public A withLabels(Map<String,String> labels);
    public Boolean hasLabels();
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public String getNamespace();
    public A withNamespace(String namespace);
    public Boolean hasNamespace();
    public A addToOwnerReferences(int index,OwnerReference item);
    public A setToOwnerReferences(int index,OwnerReference item);
    public A addToOwnerReferences(OwnerReference... items);
    public A addAllToOwnerReferences(Collection<OwnerReference> items);
    public A removeFromOwnerReferences(OwnerReference... items);
    public A removeAllFromOwnerReferences(Collection<OwnerReference> items);
    
/**
 * This method has been deprecated, please use method buildOwnerReferences instead.
 * @return The buildable object.
 */
@Deprecated public List<OwnerReference> getOwnerReferences();
    public List<OwnerReference> buildOwnerReferences();
    public OwnerReference buildOwnerReference(int index);
    public OwnerReference buildFirstOwnerReference();
    public OwnerReference buildLastOwnerReference();
    public OwnerReference buildMatchingOwnerReference(io.fabric8.kubernetes.api.builder.Predicate<OwnerReferenceBuilder> predicate);
    public A withOwnerReferences(List<OwnerReference> ownerReferences);
    public A withOwnerReferences(OwnerReference... ownerReferences);
    public Boolean hasOwnerReferences();
    public ObjectMetaFluent.OwnerReferencesNested<A> addNewOwnerReference();
    public ObjectMetaFluent.OwnerReferencesNested<A> addNewOwnerReferenceLike(OwnerReference item);
    public ObjectMetaFluent.OwnerReferencesNested<A> setNewOwnerReferenceLike(int index,OwnerReference item);
    public ObjectMetaFluent.OwnerReferencesNested<A> editOwnerReference(int index);
    public ObjectMetaFluent.OwnerReferencesNested<A> editFirstOwnerReference();
    public ObjectMetaFluent.OwnerReferencesNested<A> editLastOwnerReference();
    public ObjectMetaFluent.OwnerReferencesNested<A> editMatchingOwnerReference(io.fabric8.kubernetes.api.builder.Predicate<OwnerReferenceBuilder> predicate);
    public String getResourceVersion();
    public A withResourceVersion(String resourceVersion);
    public Boolean hasResourceVersion();
    public String getSelfLink();
    public A withSelfLink(String selfLink);
    public Boolean hasSelfLink();
    public String getUid();
    public A withUid(String uid);
    public Boolean hasUid();

    public interface InitializersNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,InitializersFluent<ObjectMetaFluent.InitializersNested<N>>{

        
    public N and();    public N endInitializers();
}
    public interface OwnerReferencesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OwnerReferenceFluent<ObjectMetaFluent.OwnerReferencesNested<N>>{

        
    public N and();    public N endOwnerReference();
}


}
