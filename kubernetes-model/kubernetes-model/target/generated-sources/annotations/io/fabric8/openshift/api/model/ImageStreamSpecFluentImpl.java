package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class ImageStreamSpecFluentImpl<A extends ImageStreamSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageStreamSpecFluent<A>{

    private String dockerImageRepository;
    private ImageLookupPolicyBuilder lookupPolicy;
    private List<TagReferenceBuilder> tags;

    public ImageStreamSpecFluentImpl(){
    }
    public ImageStreamSpecFluentImpl(ImageStreamSpec instance){
            this.withDockerImageRepository(instance.getDockerImageRepository()); 
            this.withLookupPolicy(instance.getLookupPolicy()); 
            this.withTags(instance.getTags()); 
    }

    public String getDockerImageRepository(){
            return this.dockerImageRepository;
    }

    public A withDockerImageRepository(String dockerImageRepository){
            this.dockerImageRepository=dockerImageRepository; return (A) this;
    }

    public Boolean hasDockerImageRepository(){
            return this.dockerImageRepository != null;
    }

    
/**
 * This method has been deprecated, please use method buildLookupPolicy instead.
 * @return The buildable object.
 */
@Deprecated public ImageLookupPolicy getLookupPolicy(){
            return this.lookupPolicy!=null?this.lookupPolicy.build():null;
    }

    public ImageLookupPolicy buildLookupPolicy(){
            return this.lookupPolicy!=null?this.lookupPolicy.build():null;
    }

    public A withLookupPolicy(ImageLookupPolicy lookupPolicy){
            _visitables.remove(this.lookupPolicy);
            if (lookupPolicy!=null){ this.lookupPolicy= new ImageLookupPolicyBuilder(lookupPolicy); _visitables.add(this.lookupPolicy);} return (A) this;
    }

    public Boolean hasLookupPolicy(){
            return this.lookupPolicy != null;
    }

    public A withNewLookupPolicy(Boolean local){
            return (A)withLookupPolicy(new ImageLookupPolicy(local));
    }

    public ImageStreamSpecFluent.LookupPolicyNested<A> withNewLookupPolicy(){
            return new LookupPolicyNestedImpl();
    }

    public ImageStreamSpecFluent.LookupPolicyNested<A> withNewLookupPolicyLike(ImageLookupPolicy item){
            return new LookupPolicyNestedImpl(item);
    }

    public ImageStreamSpecFluent.LookupPolicyNested<A> editLookupPolicy(){
            return withNewLookupPolicyLike(getLookupPolicy());
    }

    public ImageStreamSpecFluent.LookupPolicyNested<A> editOrNewLookupPolicy(){
            return withNewLookupPolicyLike(getLookupPolicy() != null ? getLookupPolicy(): new ImageLookupPolicyBuilder().build());
    }

    public ImageStreamSpecFluent.LookupPolicyNested<A> editOrNewLookupPolicyLike(ImageLookupPolicy item){
            return withNewLookupPolicyLike(getLookupPolicy() != null ? getLookupPolicy(): item);
    }

    public A addToTags(int index,TagReference item){
            if (this.tags == null) {this.tags = new ArrayList<TagReferenceBuilder>();}
            TagReferenceBuilder builder = new TagReferenceBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.tags.add(index >= 0 ? index : tags.size(), builder); return (A)this;
    }

    public A setToTags(int index,TagReference item){
            if (this.tags == null) {this.tags = new ArrayList<TagReferenceBuilder>();}
            TagReferenceBuilder builder = new TagReferenceBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= tags.size()) { tags.add(builder); } else { tags.set(index, builder);}
             return (A)this;
    }

    public A addToTags(TagReference... items){
            if (this.tags == null) {this.tags = new ArrayList<TagReferenceBuilder>();}
            for (TagReference item : items) {TagReferenceBuilder builder = new TagReferenceBuilder(item);_visitables.add(builder);this.tags.add(builder);} return (A)this;
    }

    public A addAllToTags(Collection<TagReference> items){
            if (this.tags == null) {this.tags = new ArrayList<TagReferenceBuilder>();}
            for (TagReference item : items) {TagReferenceBuilder builder = new TagReferenceBuilder(item);_visitables.add(builder);this.tags.add(builder);} return (A)this;
    }

    public A removeFromTags(TagReference... items){
            for (TagReference item : items) {TagReferenceBuilder builder = new TagReferenceBuilder(item);_visitables.remove(builder);if (this.tags != null) {this.tags.remove(builder);}} return (A)this;
    }

    public A removeAllFromTags(Collection<TagReference> items){
            for (TagReference item : items) {TagReferenceBuilder builder = new TagReferenceBuilder(item);_visitables.remove(builder);if (this.tags != null) {this.tags.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildTags instead.
 * @return The buildable object.
 */
@Deprecated public List<TagReference> getTags(){
            return build(tags);
    }

    public List<TagReference> buildTags(){
            return build(tags);
    }

    public TagReference buildTag(int index){
            return this.tags.get(index).build();
    }

    public TagReference buildFirstTag(){
            return this.tags.get(0).build();
    }

    public TagReference buildLastTag(){
            return this.tags.get(tags.size() - 1).build();
    }

    public TagReference buildMatchingTag(io.fabric8.kubernetes.api.builder.Predicate<TagReferenceBuilder> predicate){
            for (TagReferenceBuilder item: tags) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withTags(List<TagReference> tags){
            if (this.tags != null) { _visitables.removeAll(this.tags);}
            if (tags != null) {this.tags = new ArrayList<TagReferenceBuilder>(); for (TagReference item : tags){this.addToTags(item);}} else { this.tags = new ArrayList<TagReferenceBuilder>();} return (A) this;
    }

    public A withTags(TagReference... tags){
            if (this.tags != null) {this.tags.clear();}
            if (tags != null) {for (TagReference item :tags){ this.addToTags(item);}} return (A) this;
    }

    public Boolean hasTags(){
            return tags != null && !tags.isEmpty();
    }

    public ImageStreamSpecFluent.TagsNested<A> addNewTag(){
            return new TagsNestedImpl();
    }

    public ImageStreamSpecFluent.TagsNested<A> addNewTagLike(TagReference item){
            return new TagsNestedImpl(-1, item);
    }

    public ImageStreamSpecFluent.TagsNested<A> setNewTagLike(int index,TagReference item){
            return new TagsNestedImpl(index, item);
    }

    public ImageStreamSpecFluent.TagsNested<A> editTag(int index){
            if (tags.size() <= index) throw new RuntimeException("Can't edit tags. Index exceeds size.");
            return setNewTagLike(index, buildTag(index));
    }

    public ImageStreamSpecFluent.TagsNested<A> editFirstTag(){
            if (tags.size() == 0) throw new RuntimeException("Can't edit first tags. The list is empty.");
            return setNewTagLike(0, buildTag(0));
    }

    public ImageStreamSpecFluent.TagsNested<A> editLastTag(){
            int index = tags.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last tags. The list is empty.");
            return setNewTagLike(index, buildTag(index));
    }

    public ImageStreamSpecFluent.TagsNested<A> editMatchingTag(io.fabric8.kubernetes.api.builder.Predicate<TagReferenceBuilder> predicate){
            int index = -1;
            for (int i=0;i<tags.size();i++) { 
            if (predicate.apply(tags.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching tags. No match found.");
            return setNewTagLike(index, buildTag(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamSpecFluentImpl that = (ImageStreamSpecFluentImpl) o;
            if (dockerImageRepository != null ? !dockerImageRepository.equals(that.dockerImageRepository) :that.dockerImageRepository != null) return false;
            if (lookupPolicy != null ? !lookupPolicy.equals(that.lookupPolicy) :that.lookupPolicy != null) return false;
            if (tags != null ? !tags.equals(that.tags) :that.tags != null) return false;
            return true;
    }


    public class LookupPolicyNestedImpl<N> extends ImageLookupPolicyFluentImpl<ImageStreamSpecFluent.LookupPolicyNested<N>> implements ImageStreamSpecFluent.LookupPolicyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageLookupPolicyBuilder builder;
    
            LookupPolicyNestedImpl(ImageLookupPolicy item){
                    this.builder = new ImageLookupPolicyBuilder(this, item);
            }
            LookupPolicyNestedImpl(){
                    this.builder = new ImageLookupPolicyBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamSpecFluentImpl.this.withLookupPolicy(builder.build());
    }
    public N endLookupPolicy(){
            return and();
    }

}
    public class TagsNestedImpl<N> extends TagReferenceFluentImpl<ImageStreamSpecFluent.TagsNested<N>> implements ImageStreamSpecFluent.TagsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagReferenceBuilder builder;
        private final int index;
    
            TagsNestedImpl(int index,TagReference item){
                    this.index = index;
                    this.builder = new TagReferenceBuilder(this, item);
            }
            TagsNestedImpl(){
                    this.index = -1;
                    this.builder = new TagReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamSpecFluentImpl.this.setToTags(index, builder.build());
    }
    public N endTag(){
            return and();
    }

}


}
