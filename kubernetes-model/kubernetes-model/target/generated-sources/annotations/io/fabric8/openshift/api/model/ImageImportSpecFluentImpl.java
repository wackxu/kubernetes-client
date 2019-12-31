package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluentImpl;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import java.lang.Object;

public class ImageImportSpecFluentImpl<A extends ImageImportSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageImportSpecFluent<A>{

    private ObjectReferenceBuilder from;
    private TagImportPolicyBuilder importPolicy;
    private Boolean includeManifest;
    private TagReferencePolicyBuilder referencePolicy;
    private LocalObjectReferenceBuilder to;

    public ImageImportSpecFluentImpl(){
    }
    public ImageImportSpecFluentImpl(ImageImportSpec instance){
            this.withFrom(instance.getFrom()); 
            this.withImportPolicy(instance.getImportPolicy()); 
            this.withIncludeManifest(instance.getIncludeManifest()); 
            this.withReferencePolicy(instance.getReferencePolicy()); 
            this.withTo(instance.getTo()); 
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

    public ImageImportSpecFluent.FromNested<A> withNewFrom(){
            return new FromNestedImpl();
    }

    public ImageImportSpecFluent.FromNested<A> withNewFromLike(ObjectReference item){
            return new FromNestedImpl(item);
    }

    public ImageImportSpecFluent.FromNested<A> editFrom(){
            return withNewFromLike(getFrom());
    }

    public ImageImportSpecFluent.FromNested<A> editOrNewFrom(){
            return withNewFromLike(getFrom() != null ? getFrom(): new ObjectReferenceBuilder().build());
    }

    public ImageImportSpecFluent.FromNested<A> editOrNewFromLike(ObjectReference item){
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

    public ImageImportSpecFluent.ImportPolicyNested<A> withNewImportPolicy(){
            return new ImportPolicyNestedImpl();
    }

    public ImageImportSpecFluent.ImportPolicyNested<A> withNewImportPolicyLike(TagImportPolicy item){
            return new ImportPolicyNestedImpl(item);
    }

    public ImageImportSpecFluent.ImportPolicyNested<A> editImportPolicy(){
            return withNewImportPolicyLike(getImportPolicy());
    }

    public ImageImportSpecFluent.ImportPolicyNested<A> editOrNewImportPolicy(){
            return withNewImportPolicyLike(getImportPolicy() != null ? getImportPolicy(): new TagImportPolicyBuilder().build());
    }

    public ImageImportSpecFluent.ImportPolicyNested<A> editOrNewImportPolicyLike(TagImportPolicy item){
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

    public ImageImportSpecFluent.ReferencePolicyNested<A> withNewReferencePolicy(){
            return new ReferencePolicyNestedImpl();
    }

    public ImageImportSpecFluent.ReferencePolicyNested<A> withNewReferencePolicyLike(TagReferencePolicy item){
            return new ReferencePolicyNestedImpl(item);
    }

    public ImageImportSpecFluent.ReferencePolicyNested<A> editReferencePolicy(){
            return withNewReferencePolicyLike(getReferencePolicy());
    }

    public ImageImportSpecFluent.ReferencePolicyNested<A> editOrNewReferencePolicy(){
            return withNewReferencePolicyLike(getReferencePolicy() != null ? getReferencePolicy(): new TagReferencePolicyBuilder().build());
    }

    public ImageImportSpecFluent.ReferencePolicyNested<A> editOrNewReferencePolicyLike(TagReferencePolicy item){
            return withNewReferencePolicyLike(getReferencePolicy() != null ? getReferencePolicy(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTo instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getTo(){
            return this.to!=null?this.to.build():null;
    }

    public LocalObjectReference buildTo(){
            return this.to!=null?this.to.build():null;
    }

    public A withTo(LocalObjectReference to){
            _visitables.remove(this.to);
            if (to!=null){ this.to= new LocalObjectReferenceBuilder(to); _visitables.add(this.to);} return (A) this;
    }

    public Boolean hasTo(){
            return this.to != null;
    }

    public A withNewTo(String name){
            return (A)withTo(new LocalObjectReference(name));
    }

    public ImageImportSpecFluent.ToNested<A> withNewTo(){
            return new ToNestedImpl();
    }

    public ImageImportSpecFluent.ToNested<A> withNewToLike(LocalObjectReference item){
            return new ToNestedImpl(item);
    }

    public ImageImportSpecFluent.ToNested<A> editTo(){
            return withNewToLike(getTo());
    }

    public ImageImportSpecFluent.ToNested<A> editOrNewTo(){
            return withNewToLike(getTo() != null ? getTo(): new LocalObjectReferenceBuilder().build());
    }

    public ImageImportSpecFluent.ToNested<A> editOrNewToLike(LocalObjectReference item){
            return withNewToLike(getTo() != null ? getTo(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageImportSpecFluentImpl that = (ImageImportSpecFluentImpl) o;
            if (from != null ? !from.equals(that.from) :that.from != null) return false;
            if (importPolicy != null ? !importPolicy.equals(that.importPolicy) :that.importPolicy != null) return false;
            if (includeManifest != null ? !includeManifest.equals(that.includeManifest) :that.includeManifest != null) return false;
            if (referencePolicy != null ? !referencePolicy.equals(that.referencePolicy) :that.referencePolicy != null) return false;
            if (to != null ? !to.equals(that.to) :that.to != null) return false;
            return true;
    }


    public class FromNestedImpl<N> extends ObjectReferenceFluentImpl<ImageImportSpecFluent.FromNested<N>> implements ImageImportSpecFluent.FromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            FromNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            FromNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ImageImportSpecFluentImpl.this.withFrom(builder.build());
    }
    public N endFrom(){
            return and();
    }

}
    public class ImportPolicyNestedImpl<N> extends TagImportPolicyFluentImpl<ImageImportSpecFluent.ImportPolicyNested<N>> implements ImageImportSpecFluent.ImportPolicyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagImportPolicyBuilder builder;
    
            ImportPolicyNestedImpl(TagImportPolicy item){
                    this.builder = new TagImportPolicyBuilder(this, item);
            }
            ImportPolicyNestedImpl(){
                    this.builder = new TagImportPolicyBuilder(this);
            }
    
    public N and(){
            return (N) ImageImportSpecFluentImpl.this.withImportPolicy(builder.build());
    }
    public N endImportPolicy(){
            return and();
    }

}
    public class ReferencePolicyNestedImpl<N> extends TagReferencePolicyFluentImpl<ImageImportSpecFluent.ReferencePolicyNested<N>> implements ImageImportSpecFluent.ReferencePolicyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagReferencePolicyBuilder builder;
    
            ReferencePolicyNestedImpl(TagReferencePolicy item){
                    this.builder = new TagReferencePolicyBuilder(this, item);
            }
            ReferencePolicyNestedImpl(){
                    this.builder = new TagReferencePolicyBuilder(this);
            }
    
    public N and(){
            return (N) ImageImportSpecFluentImpl.this.withReferencePolicy(builder.build());
    }
    public N endReferencePolicy(){
            return and();
    }

}
    public class ToNestedImpl<N> extends LocalObjectReferenceFluentImpl<ImageImportSpecFluent.ToNested<N>> implements ImageImportSpecFluent.ToNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            ToNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            ToNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ImageImportSpecFluentImpl.this.withTo(builder.build());
    }
    public N endTo(){
            return and();
    }

}


}
