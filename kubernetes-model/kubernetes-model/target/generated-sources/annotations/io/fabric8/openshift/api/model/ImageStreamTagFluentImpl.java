package io.fabric8.openshift.api.model;

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
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

public class ImageStreamTagFluentImpl<A extends ImageStreamTagFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageStreamTagFluent<A>{

    private String apiVersion;
    private List<TagEventConditionBuilder> conditions;
    private Long generation;
    private ImageBuilder image;
    private String kind;
    private ImageLookupPolicyBuilder lookupPolicy;
    private ObjectMetaBuilder metadata;
    private TagReferenceBuilder tag;

    public ImageStreamTagFluentImpl(){
    }
    public ImageStreamTagFluentImpl(ImageStreamTag instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withConditions(instance.getConditions()); 
            this.withGeneration(instance.getGeneration()); 
            this.withImage(instance.getImage()); 
            this.withKind(instance.getKind()); 
            this.withLookupPolicy(instance.getLookupPolicy()); 
            this.withMetadata(instance.getMetadata()); 
            this.withTag(instance.getTag()); 
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

    public A addToConditions(int index,TagEventCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<TagEventConditionBuilder>();}
            TagEventConditionBuilder builder = new TagEventConditionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,TagEventCondition item){
            if (this.conditions == null) {this.conditions = new ArrayList<TagEventConditionBuilder>();}
            TagEventConditionBuilder builder = new TagEventConditionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
             return (A)this;
    }

    public A addToConditions(TagEventCondition... items){
            if (this.conditions == null) {this.conditions = new ArrayList<TagEventConditionBuilder>();}
            for (TagEventCondition item : items) {TagEventConditionBuilder builder = new TagEventConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(Collection<TagEventCondition> items){
            if (this.conditions == null) {this.conditions = new ArrayList<TagEventConditionBuilder>();}
            for (TagEventCondition item : items) {TagEventConditionBuilder builder = new TagEventConditionBuilder(item);_visitables.add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(TagEventCondition... items){
            for (TagEventCondition item : items) {TagEventConditionBuilder builder = new TagEventConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(Collection<TagEventCondition> items){
            for (TagEventCondition item : items) {TagEventConditionBuilder builder = new TagEventConditionBuilder(item);_visitables.remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<TagEventCondition> getConditions(){
            return build(conditions);
    }

    public List<TagEventCondition> buildConditions(){
            return build(conditions);
    }

    public TagEventCondition buildCondition(int index){
            return this.conditions.get(index).build();
    }

    public TagEventCondition buildFirstCondition(){
            return this.conditions.get(0).build();
    }

    public TagEventCondition buildLastCondition(){
            return this.conditions.get(conditions.size() - 1).build();
    }

    public TagEventCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<TagEventConditionBuilder> predicate){
            for (TagEventConditionBuilder item: conditions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withConditions(List<TagEventCondition> conditions){
            if (this.conditions != null) { _visitables.removeAll(this.conditions);}
            if (conditions != null) {this.conditions = new ArrayList<TagEventConditionBuilder>(); for (TagEventCondition item : conditions){this.addToConditions(item);}} else { this.conditions = new ArrayList<TagEventConditionBuilder>();} return (A) this;
    }

    public A withConditions(TagEventCondition... conditions){
            if (this.conditions != null) {this.conditions.clear();}
            if (conditions != null) {for (TagEventCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public Boolean hasConditions(){
            return conditions != null && !conditions.isEmpty();
    }

    public ImageStreamTagFluent.ConditionsNested<A> addNewCondition(){
            return new ConditionsNestedImpl();
    }

    public ImageStreamTagFluent.ConditionsNested<A> addNewConditionLike(TagEventCondition item){
            return new ConditionsNestedImpl(-1, item);
    }

    public ImageStreamTagFluent.ConditionsNested<A> setNewConditionLike(int index,TagEventCondition item){
            return new ConditionsNestedImpl(index, item);
    }

    public ImageStreamTagFluent.ConditionsNested<A> editCondition(int index){
            if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public ImageStreamTagFluent.ConditionsNested<A> editFirstCondition(){
            if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
            return setNewConditionLike(0, buildCondition(0));
    }

    public ImageStreamTagFluent.ConditionsNested<A> editLastCondition(){
            int index = conditions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
            return setNewConditionLike(index, buildCondition(index));
    }

    public ImageStreamTagFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<TagEventConditionBuilder> predicate){
            int index = -1;
            for (int i=0;i<conditions.size();i++) { 
            if (predicate.apply(conditions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
            return setNewConditionLike(index, buildCondition(index));
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
 * This method has been deprecated, please use method buildImage instead.
 * @return The buildable object.
 */
@Deprecated public Image getImage(){
            return this.image!=null?this.image.build():null;
    }

    public Image buildImage(){
            return this.image!=null?this.image.build():null;
    }

    public A withImage(Image image){
            _visitables.remove(this.image);
            if (image!=null){ this.image= new ImageBuilder(image); _visitables.add(this.image);} return (A) this;
    }

    public Boolean hasImage(){
            return this.image != null;
    }

    public ImageStreamTagFluent.ImageNested<A> withNewImage(){
            return new ImageNestedImpl();
    }

    public ImageStreamTagFluent.ImageNested<A> withNewImageLike(Image item){
            return new ImageNestedImpl(item);
    }

    public ImageStreamTagFluent.ImageNested<A> editImage(){
            return withNewImageLike(getImage());
    }

    public ImageStreamTagFluent.ImageNested<A> editOrNewImage(){
            return withNewImageLike(getImage() != null ? getImage(): new ImageBuilder().build());
    }

    public ImageStreamTagFluent.ImageNested<A> editOrNewImageLike(Image item){
            return withNewImageLike(getImage() != null ? getImage(): item);
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

    public ImageStreamTagFluent.LookupPolicyNested<A> withNewLookupPolicy(){
            return new LookupPolicyNestedImpl();
    }

    public ImageStreamTagFluent.LookupPolicyNested<A> withNewLookupPolicyLike(ImageLookupPolicy item){
            return new LookupPolicyNestedImpl(item);
    }

    public ImageStreamTagFluent.LookupPolicyNested<A> editLookupPolicy(){
            return withNewLookupPolicyLike(getLookupPolicy());
    }

    public ImageStreamTagFluent.LookupPolicyNested<A> editOrNewLookupPolicy(){
            return withNewLookupPolicyLike(getLookupPolicy() != null ? getLookupPolicy(): new ImageLookupPolicyBuilder().build());
    }

    public ImageStreamTagFluent.LookupPolicyNested<A> editOrNewLookupPolicyLike(ImageLookupPolicy item){
            return withNewLookupPolicyLike(getLookupPolicy() != null ? getLookupPolicy(): item);
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

    public ImageStreamTagFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ImageStreamTagFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public ImageStreamTagFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ImageStreamTagFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public ImageStreamTagFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildTag instead.
 * @return The buildable object.
 */
@Deprecated public TagReference getTag(){
            return this.tag!=null?this.tag.build():null;
    }

    public TagReference buildTag(){
            return this.tag!=null?this.tag.build():null;
    }

    public A withTag(TagReference tag){
            _visitables.remove(this.tag);
            if (tag!=null){ this.tag= new TagReferenceBuilder(tag); _visitables.add(this.tag);} return (A) this;
    }

    public Boolean hasTag(){
            return this.tag != null;
    }

    public ImageStreamTagFluent.TagNested<A> withNewTag(){
            return new TagNestedImpl();
    }

    public ImageStreamTagFluent.TagNested<A> withNewTagLike(TagReference item){
            return new TagNestedImpl(item);
    }

    public ImageStreamTagFluent.TagNested<A> editTag(){
            return withNewTagLike(getTag());
    }

    public ImageStreamTagFluent.TagNested<A> editOrNewTag(){
            return withNewTagLike(getTag() != null ? getTag(): new TagReferenceBuilder().build());
    }

    public ImageStreamTagFluent.TagNested<A> editOrNewTagLike(TagReference item){
            return withNewTagLike(getTag() != null ? getTag(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ImageStreamTagFluentImpl that = (ImageStreamTagFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
            if (generation != null ? !generation.equals(that.generation) :that.generation != null) return false;
            if (image != null ? !image.equals(that.image) :that.image != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (lookupPolicy != null ? !lookupPolicy.equals(that.lookupPolicy) :that.lookupPolicy != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (tag != null ? !tag.equals(that.tag) :that.tag != null) return false;
            return true;
    }


    public class ConditionsNestedImpl<N> extends TagEventConditionFluentImpl<ImageStreamTagFluent.ConditionsNested<N>> implements ImageStreamTagFluent.ConditionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagEventConditionBuilder builder;
        private final int index;
    
            ConditionsNestedImpl(int index,TagEventCondition item){
                    this.index = index;
                    this.builder = new TagEventConditionBuilder(this, item);
            }
            ConditionsNestedImpl(){
                    this.index = -1;
                    this.builder = new TagEventConditionBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamTagFluentImpl.this.setToConditions(index, builder.build());
    }
    public N endCondition(){
            return and();
    }

}
    public class ImageNestedImpl<N> extends ImageFluentImpl<ImageStreamTagFluent.ImageNested<N>> implements ImageStreamTagFluent.ImageNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageBuilder builder;
    
            ImageNestedImpl(Image item){
                    this.builder = new ImageBuilder(this, item);
            }
            ImageNestedImpl(){
                    this.builder = new ImageBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamTagFluentImpl.this.withImage(builder.build());
    }
    public N endImage(){
            return and();
    }

}
    public class LookupPolicyNestedImpl<N> extends ImageLookupPolicyFluentImpl<ImageStreamTagFluent.LookupPolicyNested<N>> implements ImageStreamTagFluent.LookupPolicyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ImageLookupPolicyBuilder builder;
    
            LookupPolicyNestedImpl(ImageLookupPolicy item){
                    this.builder = new ImageLookupPolicyBuilder(this, item);
            }
            LookupPolicyNestedImpl(){
                    this.builder = new ImageLookupPolicyBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamTagFluentImpl.this.withLookupPolicy(builder.build());
    }
    public N endLookupPolicy(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<ImageStreamTagFluent.MetadataNested<N>> implements ImageStreamTagFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamTagFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class TagNestedImpl<N> extends TagReferenceFluentImpl<ImageStreamTagFluent.TagNested<N>> implements ImageStreamTagFluent.TagNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final TagReferenceBuilder builder;
    
            TagNestedImpl(TagReference item){
                    this.builder = new TagReferenceBuilder(this, item);
            }
            TagNestedImpl(){
                    this.builder = new TagReferenceBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamTagFluentImpl.this.withTag(builder.build());
    }
    public N endTag(){
            return and();
    }

}


}
