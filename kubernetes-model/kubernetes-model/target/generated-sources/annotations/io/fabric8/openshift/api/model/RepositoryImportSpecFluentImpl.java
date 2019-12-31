package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Object;

public class RepositoryImportSpecFluentImpl<A extends RepositoryImportSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RepositoryImportSpecFluent<A>{

    private ObjectReferenceBuilder from;
    private TagImportPolicyBuilder importPolicy;
    private Boolean includeManifest;
    private TagReferencePolicyBuilder referencePolicy;

    public RepositoryImportSpecFluentImpl(){
    }
    public RepositoryImportSpecFluentImpl(RepositoryImportSpec instance){
            this.withFrom(instance.getFrom()); 
            this.withImportPolicy(instance.getImportPolicy()); 
            this.withIncludeManifest(instance.getIncludeManifest()); 
            this.withReferencePolicy(instance.getReferencePolicy()); 
    }

    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom(){
            return this.from!=null?this.from.build():null;
    }

    public ObjectReference buildFrom(){
            return this.from!=null?this.from.build():null;
    }

    public A withFrom(ObjectReference from){
            _visitables.remove(this.from);
            if (from!=null){ this.from= new ObjectReferenceBuilder(from); _visitables.add(this.from);} return (A) this;
    }

    public Boolean hasFrom(){
            return this.from != null;
    }

    public RepositoryImportSpecFluent.FromNested<A> withNewFrom(){
            return new FromNestedImpl();
    }

    public RepositoryImportSpecFluent.FromNested<A> withNewFromLike(ObjectReference item){
            return new FromNestedImpl(item);
    }

    public RepositoryImportSpecFluent.FromNested<A> editFrom(){
            return withNewFromLike(getFrom());
    }

    public RepositoryImportSpecFluent.FromNested<A> editOrNewFrom(){
            return withNewFromLike(getFrom() != null ? getFrom(): new ObjectReferenceBuilder().build());
    }

    public RepositoryImportSpecFluent.FromNested<A> editOrNewFromLike(ObjectReference item){
            return withNewFromLike(getFrom() != null ? getFrom(): item);
    }

    
/**
 * This method has been deprecated, please use method buildImportPolicy instead.
 * @return The buildable object.
 */
@Deprecated public TagImportPolicy getImportPolicy(){
            return this.importPolicy!=null?this.importPolicy.build():null;
    }

    public TagImportPolicy buildImportPolicy(){
            return this.importPolicy!=null?this.importPolicy.build():null;
    }

    public A withImportPolicy(TagImportPolicy importPolicy){
            _visitables.remove(this.importPolicy);
            if (importPolicy!=null){ this.importPolicy= new TagImportPolicyBuilder(importPolicy); _visitables.add(this.importPolicy);} return (A) this;
    }

    public Boolean hasImportPolicy(){
            return this.importPolicy != null;
    }

    public A withNewImportPolicy(Boolean insecure,Boolean scheduled){
            return (A)withImportPolicy(new TagImportPolicy(insecure, scheduled));
    }

    public RepositoryImportSpecFluent.ImportPolicyNested<A> withNewImportPolicy(){
            return new ImportPolicyNestedImpl();
    }

    public RepositoryImportSpecFluent.ImportPolicyNested<A> withNewImportPolicyLike(TagImportPolicy item){
            return new ImportPolicyNestedImpl(item);
    }

    public RepositoryImportSpecFluent.ImportPolicyNested<A> editImportPolicy(){
            return withNewImportPolicyLike(getImportPolicy());
    }

    public RepositoryImportSpecFluent.ImportPolicyNested<A> editOrNewImportPolicy(){
            return withNewImportPolicyLike(getImportPolicy() != null ? getImportPolicy(): new TagImportPolicyBuilder().build());
    }

    public RepositoryImportSpecFluent.ImportPolicyNested<A> editOrNewImportPolicyLike(TagImportPolicy item){
            return withNewImportPolicyLike(getImportPolicy() != null ? getImportPolicy(): item);
    }

    public Boolean isIncludeManifest(){
            return this.includeManifest;
    }

    public A withIncludeManifest(Boolean includeManifest){
            this.includeManifest=includeManifest; return (A) this;
    }

    public Boolean hasIncludeManifest(){
            return this.includeManifest != null;
    }

    public A withNewIncludeManifest(String arg1){
            return (A)withIncludeManifest(new Boolean(arg1));
    }

    public A withNewIncludeManifest(boolean arg1){
            return (A)withIncludeManifest(new Boolean(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildReferencePolicy instead.
 * @return The buildable object.
 */
@Deprecated public TagReferencePolicy getReferencePolicy(){
            return this.referencePolicy!=null?this.referencePolicy.build():null;
    }

    public TagReferencePolicy buildReferencePolicy(){
            return this.referencePolicy!=null?this.referencePolicy.build():null;
    }

    public A withReferencePolicy(TagReferencePolicy referencePolicy){
            _visitables.remove(this.referencePolicy);
            if (referencePolicy!=null){ this.referencePolicy= new TagReferencePolicyBuilder(referencePolicy); _visitables.add(this.referencePolicy);} return (A) this;
    }

    public Boolean hasReferencePolicy(){
            return this.referencePolicy != null;
    }

    public A withNewReferencePolicy(String type){
            return (A)withReferencePolicy(new TagReferencePolicy(type));
    }

    public RepositoryImportSpecFluent.ReferencePolicyNested<A> withNewReferencePolicy(){
            return new ReferencePolicyNestedImpl();
    }

    public RepositoryImportSpecFluent.ReferencePolicyNested<A> withNewReferencePolicyLike(TagReferencePolicy item){
            return new ReferencePolicyNestedImpl(item);
    }

    public RepositoryImportSpecFluent.ReferencePolicyNested<A> editReferencePolicy(){
            return withNewReferencePolicyLike(getReferencePolicy());
    }

    public RepositoryImportSpecFluent.ReferencePolicyNested<A> editOrNewReferencePolicy(){
            return withNewReferencePolicyLike(getReferencePolicy() != null ? getReferencePolicy(): new TagReferencePolicyBuilder().build());
    }

    public RepositoryImportSpecFluent.ReferencePolicyNested<A> editOrNewReferencePolicyLike(TagReferencePolicy item){
            return withNewReferencePolicyLike(getReferencePolicy() != null ? getReferencePolicy(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RepositoryImportSpecFluentImpl that = (RepositoryImportSpecFluentImpl) o;
            if (from != null ? !from.equals(that.from) :that.from != null) return false;
            if (importPolicy != null ? !importPolicy.equals(that.importPolicy) :that.importPolicy != null) return false;
            if (includeManifest != null ? !includeManifest.equals(that.includeManifest) :that.includeManifest != null) return false;
            if (referencePolicy != null ? !referencePolicy.equals(that.referencePolicy) :that.referencePolicy != null) return false;
            return true;
    }


    public class FromNestedImpl<N> extends ObjectReferenceFluentImpl<RepositoryImportSpecFluent.FromNested<N>> implements RepositoryImportSpecFluent.FromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            FromNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            FromNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) RepositoryImportSpecFluentImpl.this.withFrom(builder.build());
    }
    public N endFrom(){
            return and();
    }

}
    public class ImportPolicyNestedImpl<N> extends TagImportPolicyFluentImpl<RepositoryImportSpecFluent.ImportPolicyNested<N>> implements RepositoryImportSpecFluent.ImportPolicyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagImportPolicyBuilder builder;
    
            ImportPolicyNestedImpl(TagImportPolicy item){
                    this.builder = new TagImportPolicyBuilder(this, item);
            }
            ImportPolicyNestedImpl(){
                    this.builder = new TagImportPolicyBuilder(this);
            }
    
    public N and(){
            return (N) RepositoryImportSpecFluentImpl.this.withImportPolicy(builder.build());
    }
    public N endImportPolicy(){
            return and();
    }

}
    public class ReferencePolicyNestedImpl<N> extends TagReferencePolicyFluentImpl<RepositoryImportSpecFluent.ReferencePolicyNested<N>> implements RepositoryImportSpecFluent.ReferencePolicyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagReferencePolicyBuilder builder;
    
            ReferencePolicyNestedImpl(TagReferencePolicy item){
                    this.builder = new TagReferencePolicyBuilder(this, item);
            }
            ReferencePolicyNestedImpl(){
                    this.builder = new TagReferencePolicyBuilder(this);
            }
    
    public N and(){
            return (N) RepositoryImportSpecFluentImpl.this.withReferencePolicy(builder.build());
    }
    public N endReferencePolicy(){
            return and();
    }

}


}
