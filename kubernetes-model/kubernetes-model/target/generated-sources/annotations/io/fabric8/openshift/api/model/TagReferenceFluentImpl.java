package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Long;
import java.lang.Object;
import java.util.Map;

public class TagReferenceFluentImpl<A extends TagReferenceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TagReferenceFluent<A>{

    private Map<String,String> annotations;
    private ObjectReferenceBuilder from;
    private Long generation;
    private TagImportPolicyBuilder importPolicy;
    private String name;
    private Boolean reference;
    private TagReferencePolicyBuilder referencePolicy;

    public TagReferenceFluentImpl(){
    }
    public TagReferenceFluentImpl(TagReference instance){
            this.withAnnotations(instance.getAnnotations()); 
            this.withFrom(instance.getFrom()); 
            this.withGeneration(instance.getGeneration()); 
            this.withImportPolicy(instance.getImportPolicy()); 
            this.withName(instance.getName()); 
            this.withReference(instance.getReference()); 
            this.withReferencePolicy(instance.getReferencePolicy()); 
    }

    public A addToAnnotations(String key,String value){
            if(this.annotations == null && key != null && value != null) { this.annotations = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.annotations.put(key, value);} return (A)this;
    }

    public A addToAnnotations(Map<String,String> map){
            if(this.annotations == null && map != null) { this.annotations = new LinkedHashMap<String,String>(); }
            if(map != null) { this.annotations.putAll(map);} return (A)this;
    }

    public A removeFromAnnotations(String key){
            if(this.annotations == null) { return (A) this; }
            if(key != null && this.annotations != null) {this.annotations.remove(key);} return (A)this;
    }

    public A removeFromAnnotations(Map<String,String> map){
            if(this.annotations == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.annotations != null){this.annotations.remove(key);}}} return (A)this;
    }

    public Map<String,String> getAnnotations(){
            return this.annotations;
    }

    public A withAnnotations(Map<String,String> annotations){
            if (annotations == null) { this.annotations =  new LinkedHashMap<String,String>();} else {this.annotations = new LinkedHashMap<String,String>(annotations);} return (A) this;
    }

    public Boolean hasAnnotations(){
            return this.annotations != null;
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

    public TagReferenceFluent.FromNested<A> withNewFrom(){
            return new FromNestedImpl();
    }

    public TagReferenceFluent.FromNested<A> withNewFromLike(ObjectReference item){
            return new FromNestedImpl(item);
    }

    public TagReferenceFluent.FromNested<A> editFrom(){
            return withNewFromLike(getFrom());
    }

    public TagReferenceFluent.FromNested<A> editOrNewFrom(){
            return withNewFromLike(getFrom() != null ? getFrom(): new ObjectReferenceBuilder().build());
    }

    public TagReferenceFluent.FromNested<A> editOrNewFromLike(ObjectReference item){
            return withNewFromLike(getFrom() != null ? getFrom(): item);
    }

    public Long getGeneration(){
            return this.generation;
    }

    public A withGeneration(Long generation){
            this.generation=generation; return (A) this;
    }

    public Boolean hasGeneration(){
            return this.generation != null;
    }

    public A withNewGeneration(String arg1){
            return (A)withGeneration(new Long(arg1));
    }

    public A withNewGeneration(long arg1){
            return (A)withGeneration(new Long(arg1));
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

    public TagReferenceFluent.ImportPolicyNested<A> withNewImportPolicy(){
            return new ImportPolicyNestedImpl();
    }

    public TagReferenceFluent.ImportPolicyNested<A> withNewImportPolicyLike(TagImportPolicy item){
            return new ImportPolicyNestedImpl(item);
    }

    public TagReferenceFluent.ImportPolicyNested<A> editImportPolicy(){
            return withNewImportPolicyLike(getImportPolicy());
    }

    public TagReferenceFluent.ImportPolicyNested<A> editOrNewImportPolicy(){
            return withNewImportPolicyLike(getImportPolicy() != null ? getImportPolicy(): new TagImportPolicyBuilder().build());
    }

    public TagReferenceFluent.ImportPolicyNested<A> editOrNewImportPolicyLike(TagImportPolicy item){
            return withNewImportPolicyLike(getImportPolicy() != null ? getImportPolicy(): item);
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public Boolean isReference(){
            return this.reference;
    }

    public A withReference(Boolean reference){
            this.reference=reference; return (A) this;
    }

    public Boolean hasReference(){
            return this.reference != null;
    }

    public A withNewReference(String arg1){
            return (A)withReference(new Boolean(arg1));
    }

    public A withNewReference(boolean arg1){
            return (A)withReference(new Boolean(arg1));
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

    public TagReferenceFluent.ReferencePolicyNested<A> withNewReferencePolicy(){
            return new ReferencePolicyNestedImpl();
    }

    public TagReferenceFluent.ReferencePolicyNested<A> withNewReferencePolicyLike(TagReferencePolicy item){
            return new ReferencePolicyNestedImpl(item);
    }

    public TagReferenceFluent.ReferencePolicyNested<A> editReferencePolicy(){
            return withNewReferencePolicyLike(getReferencePolicy());
    }

    public TagReferenceFluent.ReferencePolicyNested<A> editOrNewReferencePolicy(){
            return withNewReferencePolicyLike(getReferencePolicy() != null ? getReferencePolicy(): new TagReferencePolicyBuilder().build());
    }

    public TagReferenceFluent.ReferencePolicyNested<A> editOrNewReferencePolicyLike(TagReferencePolicy item){
            return withNewReferencePolicyLike(getReferencePolicy() != null ? getReferencePolicy(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TagReferenceFluentImpl that = (TagReferenceFluentImpl) o;
            if (annotations != null ? !annotations.equals(that.annotations) :that.annotations != null) return false;
            if (from != null ? !from.equals(that.from) :that.from != null) return false;
            if (generation != null ? !generation.equals(that.generation) :that.generation != null) return false;
            if (importPolicy != null ? !importPolicy.equals(that.importPolicy) :that.importPolicy != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (reference != null ? !reference.equals(that.reference) :that.reference != null) return false;
            if (referencePolicy != null ? !referencePolicy.equals(that.referencePolicy) :that.referencePolicy != null) return false;
            return true;
    }


    public class FromNestedImpl<N> extends ObjectReferenceFluentImpl<TagReferenceFluent.FromNested<N>> implements TagReferenceFluent.FromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            FromNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            FromNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) TagReferenceFluentImpl.this.withFrom(builder.build());
    }
    public N endFrom(){
            return and();
    }

}
    public class ImportPolicyNestedImpl<N> extends TagImportPolicyFluentImpl<TagReferenceFluent.ImportPolicyNested<N>> implements TagReferenceFluent.ImportPolicyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagImportPolicyBuilder builder;
    
            ImportPolicyNestedImpl(TagImportPolicy item){
                    this.builder = new TagImportPolicyBuilder(this, item);
            }
            ImportPolicyNestedImpl(){
                    this.builder = new TagImportPolicyBuilder(this);
            }
    
    public N and(){
            return (N) TagReferenceFluentImpl.this.withImportPolicy(builder.build());
    }
    public N endImportPolicy(){
            return and();
    }

}
    public class ReferencePolicyNestedImpl<N> extends TagReferencePolicyFluentImpl<TagReferenceFluent.ReferencePolicyNested<N>> implements TagReferenceFluent.ReferencePolicyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagReferencePolicyBuilder builder;
    
            ReferencePolicyNestedImpl(TagReferencePolicy item){
                    this.builder = new TagReferencePolicyBuilder(this, item);
            }
            ReferencePolicyNestedImpl(){
                    this.builder = new TagReferencePolicyBuilder(this);
            }
    
    public N and(){
            return (N) TagReferenceFluentImpl.this.withReferencePolicy(builder.build());
    }
    public N endReferencePolicy(){
            return and();
    }

}


}
