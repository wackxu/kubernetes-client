package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface ImageStreamSpecFluent<A extends ImageStreamSpecFluent<A>> extends Fluent<A>{


    public String getDockerImageRepository();
    public A withDockerImageRepository(String dockerImageRepository);
    public Boolean hasDockerImageRepository();
    
/**
 * This method has been deprecated, please use method buildLookupPolicy instead.
 * @return The buildable object.
 */
@Deprecated public ImageLookupPolicy getLookupPolicy();
    public ImageLookupPolicy buildLookupPolicy();
    public A withLookupPolicy(ImageLookupPolicy lookupPolicy);
    public Boolean hasLookupPolicy();
    public A withNewLookupPolicy(Boolean local);
    public ImageStreamSpecFluent.LookupPolicyNested<A> withNewLookupPolicy();
    public ImageStreamSpecFluent.LookupPolicyNested<A> withNewLookupPolicyLike(ImageLookupPolicy item);
    public ImageStreamSpecFluent.LookupPolicyNested<A> editLookupPolicy();
    public ImageStreamSpecFluent.LookupPolicyNested<A> editOrNewLookupPolicy();
    public ImageStreamSpecFluent.LookupPolicyNested<A> editOrNewLookupPolicyLike(ImageLookupPolicy item);
    public A addToTags(int index,TagReference item);
    public A setToTags(int index,TagReference item);
    public A addToTags(TagReference... items);
    public A addAllToTags(Collection<TagReference> items);
    public A removeFromTags(TagReference... items);
    public A removeAllFromTags(Collection<TagReference> items);
    
/**
 * This method has been deprecated, please use method buildTags instead.
 * @return The buildable object.
 */
@Deprecated public List<TagReference> getTags();
    public List<TagReference> buildTags();
    public TagReference buildTag(int index);
    public TagReference buildFirstTag();
    public TagReference buildLastTag();
    public TagReference buildMatchingTag(io.fabric8.kubernetes.api.builder.Predicate<TagReferenceBuilder> predicate);
    public A withTags(List<TagReference> tags);
    public A withTags(TagReference... tags);
    public Boolean hasTags();
    public ImageStreamSpecFluent.TagsNested<A> addNewTag();
    public ImageStreamSpecFluent.TagsNested<A> addNewTagLike(TagReference item);
    public ImageStreamSpecFluent.TagsNested<A> setNewTagLike(int index,TagReference item);
    public ImageStreamSpecFluent.TagsNested<A> editTag(int index);
    public ImageStreamSpecFluent.TagsNested<A> editFirstTag();
    public ImageStreamSpecFluent.TagsNested<A> editLastTag();
    public ImageStreamSpecFluent.TagsNested<A> editMatchingTag(io.fabric8.kubernetes.api.builder.Predicate<TagReferenceBuilder> predicate);

    public interface LookupPolicyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageLookupPolicyFluent<ImageStreamSpecFluent.LookupPolicyNested<N>>{

        
    public N and();    public N endLookupPolicy();
}
    public interface TagsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagReferenceFluent<ImageStreamSpecFluent.TagsNested<N>>{

        
    public N and();    public N endTag();
}


}
