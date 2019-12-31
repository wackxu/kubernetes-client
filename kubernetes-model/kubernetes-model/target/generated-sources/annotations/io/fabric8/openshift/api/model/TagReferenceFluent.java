package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Long;
import java.lang.Object;
import java.util.Map;

public interface TagReferenceFluent<A extends TagReferenceFluent<A>> extends Fluent<A>{


    public A addToAnnotations(String key,String value);
    public A addToAnnotations(Map<String,String> map);
    public A removeFromAnnotations(String key);
    public A removeFromAnnotations(Map<String,String> map);
    public Map<String,String> getAnnotations();
    public A withAnnotations(Map<String,String> annotations);
    public Boolean hasAnnotations();
    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom();
    public ObjectReference buildFrom();
    public A withFrom(ObjectReference from);
    public Boolean hasFrom();
    public TagReferenceFluent.FromNested<A> withNewFrom();
    public TagReferenceFluent.FromNested<A> withNewFromLike(ObjectReference item);
    public TagReferenceFluent.FromNested<A> editFrom();
    public TagReferenceFluent.FromNested<A> editOrNewFrom();
    public TagReferenceFluent.FromNested<A> editOrNewFromLike(ObjectReference item);
    public Long getGeneration();
    public A withGeneration(Long generation);
    public Boolean hasGeneration();
    public A withNewGeneration(String arg1);
    public A withNewGeneration(long arg1);
    
/**
 * This method has been deprecated, please use method buildImportPolicy instead.
 * @return The buildable object.
 */
@Deprecated public TagImportPolicy getImportPolicy();
    public TagImportPolicy buildImportPolicy();
    public A withImportPolicy(TagImportPolicy importPolicy);
    public Boolean hasImportPolicy();
    public A withNewImportPolicy(Boolean insecure,Boolean scheduled);
    public TagReferenceFluent.ImportPolicyNested<A> withNewImportPolicy();
    public TagReferenceFluent.ImportPolicyNested<A> withNewImportPolicyLike(TagImportPolicy item);
    public TagReferenceFluent.ImportPolicyNested<A> editImportPolicy();
    public TagReferenceFluent.ImportPolicyNested<A> editOrNewImportPolicy();
    public TagReferenceFluent.ImportPolicyNested<A> editOrNewImportPolicyLike(TagImportPolicy item);
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public Boolean isReference();
    public A withReference(Boolean reference);
    public Boolean hasReference();
    public A withNewReference(String arg1);
    public A withNewReference(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildReferencePolicy instead.
 * @return The buildable object.
 */
@Deprecated public TagReferencePolicy getReferencePolicy();
    public TagReferencePolicy buildReferencePolicy();
    public A withReferencePolicy(TagReferencePolicy referencePolicy);
    public Boolean hasReferencePolicy();
    public A withNewReferencePolicy(String type);
    public TagReferenceFluent.ReferencePolicyNested<A> withNewReferencePolicy();
    public TagReferenceFluent.ReferencePolicyNested<A> withNewReferencePolicyLike(TagReferencePolicy item);
    public TagReferenceFluent.ReferencePolicyNested<A> editReferencePolicy();
    public TagReferenceFluent.ReferencePolicyNested<A> editOrNewReferencePolicy();
    public TagReferenceFluent.ReferencePolicyNested<A> editOrNewReferencePolicyLike(TagReferencePolicy item);

    public interface FromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<TagReferenceFluent.FromNested<N>>{

        
    public N and();    public N endFrom();
}
    public interface ImportPolicyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagImportPolicyFluent<TagReferenceFluent.ImportPolicyNested<N>>{

        
    public N and();    public N endImportPolicy();
}
    public interface ReferencePolicyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagReferencePolicyFluent<TagReferenceFluent.ReferencePolicyNested<N>>{

        
    public N and();    public N endReferencePolicy();
}


}
