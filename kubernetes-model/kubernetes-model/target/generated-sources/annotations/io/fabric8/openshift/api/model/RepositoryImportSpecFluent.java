package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface RepositoryImportSpecFluent<A extends RepositoryImportSpecFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom();
    public ObjectReference buildFrom();
    public A withFrom(ObjectReference from);
    public Boolean hasFrom();
    public RepositoryImportSpecFluent.FromNested<A> withNewFrom();
    public RepositoryImportSpecFluent.FromNested<A> withNewFromLike(ObjectReference item);
    public RepositoryImportSpecFluent.FromNested<A> editFrom();
    public RepositoryImportSpecFluent.FromNested<A> editOrNewFrom();
    public RepositoryImportSpecFluent.FromNested<A> editOrNewFromLike(ObjectReference item);
    
/**
 * This method has been deprecated, please use method buildImportPolicy instead.
 * @return The buildable object.
 */
@Deprecated public TagImportPolicy getImportPolicy();
    public TagImportPolicy buildImportPolicy();
    public A withImportPolicy(TagImportPolicy importPolicy);
    public Boolean hasImportPolicy();
    public A withNewImportPolicy(Boolean insecure,Boolean scheduled);
    public RepositoryImportSpecFluent.ImportPolicyNested<A> withNewImportPolicy();
    public RepositoryImportSpecFluent.ImportPolicyNested<A> withNewImportPolicyLike(TagImportPolicy item);
    public RepositoryImportSpecFluent.ImportPolicyNested<A> editImportPolicy();
    public RepositoryImportSpecFluent.ImportPolicyNested<A> editOrNewImportPolicy();
    public RepositoryImportSpecFluent.ImportPolicyNested<A> editOrNewImportPolicyLike(TagImportPolicy item);
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
    public RepositoryImportSpecFluent.ReferencePolicyNested<A> withNewReferencePolicy();
    public RepositoryImportSpecFluent.ReferencePolicyNested<A> withNewReferencePolicyLike(TagReferencePolicy item);
    public RepositoryImportSpecFluent.ReferencePolicyNested<A> editReferencePolicy();
    public RepositoryImportSpecFluent.ReferencePolicyNested<A> editOrNewReferencePolicy();
    public RepositoryImportSpecFluent.ReferencePolicyNested<A> editOrNewReferencePolicyLike(TagReferencePolicy item);

    public interface FromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<RepositoryImportSpecFluent.FromNested<N>>{

        
    public N and();    public N endFrom();
}
    public interface ImportPolicyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagImportPolicyFluent<RepositoryImportSpecFluent.ImportPolicyNested<N>>{

        
    public N and();    public N endImportPolicy();
}
    public interface ReferencePolicyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagReferencePolicyFluent<RepositoryImportSpecFluent.ReferencePolicyNested<N>>{

        
    public N and();    public N endReferencePolicy();
}


}
