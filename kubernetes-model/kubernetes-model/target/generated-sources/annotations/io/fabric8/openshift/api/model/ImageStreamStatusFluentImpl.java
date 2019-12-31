package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class ImageStreamStatusFluentImpl<A extends ImageStreamStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ImageStreamStatusFluent<A>{

    private String dockerImageRepository;
    private String publicDockerImageRepository;
    private List<NamedTagEventListBuilder> tags;

    public ImageStreamStatusFluentImpl(){
    }
    public ImageStreamStatusFluentImpl(ImageStreamStatus instance){
            this.withDockerImageRepository(instance.getDockerImageRepository()); 
            this.withPublicDockerImageRepository(instance.getPublicDockerImageRepository()); 
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

    public String getPublicDockerImageRepository(){
            return this.publicDockerImageRepository;
    }

    public A withPublicDockerImageRepository(String publicDockerImageRepository){
            this.publicDockerImageRepository=publicDockerImageRepository; return (A) this;
    }

    public Boolean hasPublicDockerImageRepository(){
            return this.publicDockerImageRepository != null;
    }

    public A addToTags(int index,NamedTagEventList item){
            if (this.tags == null) {this.tags = new ArrayList<NamedTagEventListBuilder>();}
            NamedTagEventListBuilder builder = new NamedTagEventListBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.tags.add(index >= 0 ? index : tags.size(), builder); return (A)this;
    }

    public A setToTags(int index,NamedTagEventList item){
            if (this.tags == null) {this.tags = new ArrayList<NamedTagEventListBuilder>();}
            NamedTagEventListBuilder builder = new NamedTagEventListBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= tags.size()) { tags.add(builder); } else { tags.set(index, builder);}
             return (A)this;
    }

    public A addToTags(NamedTagEventList... items){
            if (this.tags == null) {this.tags = new ArrayList<NamedTagEventListBuilder>();}
            for (NamedTagEventList item : items) {NamedTagEventListBuilder builder = new NamedTagEventListBuilder(item);_visitables.add(builder);this.tags.add(builder);} return (A)this;
    }

    public A addAllToTags(Collection<NamedTagEventList> items){
            if (this.tags == null) {this.tags = new ArrayList<NamedTagEventListBuilder>();}
            for (NamedTagEventList item : items) {NamedTagEventListBuilder builder = new NamedTagEventListBuilder(item);_visitables.add(builder);this.tags.add(builder);} return (A)this;
    }

    public A removeFromTags(NamedTagEventList... items){
            for (NamedTagEventList item : items) {NamedTagEventListBuilder builder = new NamedTagEventListBuilder(item);_visitables.remove(builder);if (this.tags != null) {this.tags.remove(builder);}} return (A)this;
    }

    public A removeAllFromTags(Collection<NamedTagEventList> items){
            for (NamedTagEventList item : items) {NamedTagEventListBuilder builder = new NamedTagEventListBuilder(item);_visitables.remove(builder);if (this.tags != null) {this.tags.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildTags instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedTagEventList> getTags(){
            return build(tags);
    }

    public List<NamedTagEventList> buildTags(){
            return build(tags);
    }

    public NamedTagEventList buildTag(int index){
            return this.tags.get(index).build();
    }

    public NamedTagEventList buildFirstTag(){
            return this.tags.get(0).build();
    }

    public NamedTagEventList buildLastTag(){
            return this.tags.get(tags.size() - 1).build();
    }

    public NamedTagEventList buildMatchingTag(io.fabric8.kubernetes.api.builder.Predicate<NamedTagEventListBuilder> predicate){
            for (NamedTagEventListBuilder item: tags) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withTags(List<NamedTagEventList> tags){
            if (this.tags != null) { _visitables.removeAll(this.tags);}
            if (tags != null) {this.tags = new ArrayList<NamedTagEventListBuilder>(); for (NamedTagEventList item : tags){this.addToTags(item);}} else { this.tags = new ArrayList<NamedTagEventListBuilder>();} return (A) this;
    }

    public A withTags(NamedTagEventList... tags){
            if (this.tags != null) {this.tags.clear();}
            if (tags != null) {for (NamedTagEventList item :tags){ this.addToTags(item);}} return (A) this;
    }

    public Boolean hasTags(){
            return tags != null && !tags.isEmpty();
    }

    public ImageStreamStatusFluent.TagsNested<A> addNewTag(){
            return new TagsNestedImpl();
    }

    public ImageStreamStatusFluent.TagsNested<A> addNewTagLike(NamedTagEventList item){
            return new TagsNestedImpl(-1, item);
    }

    public ImageStreamStatusFluent.TagsNested<A> setNewTagLike(int index,NamedTagEventList item){
            return new TagsNestedImpl(index, item);
    }

    public ImageStreamStatusFluent.TagsNested<A> editTag(int index){
            if (tags.size() <= index) throw new RuntimeException("Can't edit tags. Index exceeds size.");
            return setNewTagLike(index, buildTag(index));
    }

    public ImageStreamStatusFluent.TagsNested<A> editFirstTag(){
            if (tags.size() == 0) throw new RuntimeException("Can't edit first tags. The list is empty.");
            return setNewTagLike(0, buildTag(0));
    }

    public ImageStreamStatusFluent.TagsNested<A> editLastTag(){
            int index = tags.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last tags. The list is empty.");
            return setNewTagLike(index, buildTag(index));
    }

    public ImageStreamStatusFluent.TagsNested<A> editMatchingTag(io.fabric8.kubernetes.api.builder.Predicate<NamedTagEventListBuilder> predicate){
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
            ImageStreamStatusFluentImpl that = (ImageStreamStatusFluentImpl) o;
            if (dockerImageRepository != null ? !dockerImageRepository.equals(that.dockerImageRepository) :that.dockerImageRepository != null) return false;
            if (publicDockerImageRepository != null ? !publicDockerImageRepository.equals(that.publicDockerImageRepository) :that.publicDockerImageRepository != null) return false;
            if (tags != null ? !tags.equals(that.tags) :that.tags != null) return false;
            return true;
    }


    public class TagsNestedImpl<N> extends NamedTagEventListFluentImpl<ImageStreamStatusFluent.TagsNested<N>> implements ImageStreamStatusFluent.TagsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final NamedTagEventListBuilder builder;
        private final int index;
    
            TagsNestedImpl(int index,NamedTagEventList item){
                    this.index = index;
                    this.builder = new NamedTagEventListBuilder(this, item);
            }
            TagsNestedImpl(){
                    this.index = -1;
                    this.builder = new NamedTagEventListBuilder(this);
            }
    
    public N and(){
            return (N) ImageStreamStatusFluentImpl.this.setToTags(index, builder.build());
    }
    public N endTag(){
            return and();
    }

}


}
