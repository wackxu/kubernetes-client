package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import java.lang.Object;
import java.util.Map;

public interface ImageImportSpecFluent<A extends ImageImportSpecFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom();
    public ObjectReference buildFrom();
    public A withFrom(ObjectReference from);
    public Boolean hasFrom();
    public ImageImportSpecFluent.FromNested<A> withNewFrom();
    public ImageImportSpecFluent.FromNested<A> withNewFromLike(ObjectReference item);
    public ImageImportSpecFluent.FromNested<A> editFrom();
    public ImageImportSpecFluent.FromNested<A> editOrNewFrom();
    public ImageImportSpecFluent.FromNested<A> editOrNewFromLike(ObjectReference item);
    
/**
 * This method has been deprecated, please use method buildImportPolicy instead.
 * @return The buildable object.
 */
@Deprecated public TagImportPolicy getImportPolicy();
    public TagImportPolicy buildImportPolicy();
    public A withImportPolicy(TagImportPolicy importPolicy);
    public Boolean hasImportPolicy();
    public A withNewImportPolicy(Boolean insecure,Boolean scheduled);
    public ImageImportSpecFluent.ImportPolicyNested<A> withNewImportPolicy();
    public ImageImportSpecFluent.ImportPolicyNested<A> withNewImportPolicyLike(TagImportPolicy item);
    public ImageImportSpecFluent.ImportPolicyNested<A> editImportPolicy();
    public ImageImportSpecFluent.ImportPolicyNested<A> editOrNewImportPolicy();
    public ImageImportSpecFluent.ImportPolicyNested<A> editOrNewImportPolicyLike(TagImportPolicy item);
    public Boolean isIncludeManifest();
    public A withIncludeManifest(Boolean includeManifest);
    public Boolean hasIncludeManifest();
    public A withNewIncludeManifest(String arg1);
    public A withNewIncludeManifest(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildReferencePolicy instead.
 * @return The buildable object.
 */
@Deprecated public TagReferencePolicy getReferencePolicy();
    public TagReferencePolicy buildReferencePolicy();
    public A withReferencePolicy(TagReferencePolicy referencePolicy);
    public Boolean hasReferencePolicy();
    public A withNewReferencePolicy(String type);
    public ImageImportSpecFluent.ReferencePolicyNested<A> withNewReferencePolicy();
    public ImageImportSpecFluent.ReferencePolicyNested<A> withNewReferencePolicyLike(TagReferencePolicy item);
    public ImageImportSpecFluent.ReferencePolicyNested<A> editReferencePolicy();
    public ImageImportSpecFluent.ReferencePolicyNested<A> editOrNewReferencePolicy();
    public ImageImportSpecFluent.ReferencePolicyNested<A> editOrNewReferencePolicyLike(TagReferencePolicy item);
    
/**
 * This method has been deprecated, please use method buildTo instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getTo();
    public LocalObjectReference buildTo();
    public A withTo(LocalObjectReference to);
    public Boolean hasTo();
    public A withNewTo(String name);
    public ImageImportSpecFluent.ToNested<A> withNewTo();
    public ImageImportSpecFluent.ToNested<A> withNewToLike(LocalObjectReference item);
    public ImageImportSpecFluent.ToNested<A> editTo();
    public ImageImportSpecFluent.ToNested<A> editOrNewTo();
    public ImageImportSpecFluent.ToNested<A> editOrNewToLike(LocalObjectReference item);

    public interface FromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<ImageImportSpecFluent.FromNested<N>>{

        
    public N and();    public N endFrom();
}
    public interface ImportPolicyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagImportPolicyFluent<ImageImportSpecFluent.ImportPolicyNested<N>>{

        
    public N and();    public N endImportPolicy();
}
    public interface ReferencePolicyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagReferencePolicyFluent<ImageImportSpecFluent.ReferencePolicyNested<N>>{

        
    public N and();    public N endReferencePolicy();
}
    public interface ToNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<ImageImportSpecFluent.ToNested<N>>{

        
    public N and();    public N endTo();
}


}
