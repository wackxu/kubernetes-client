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

public interface ImageStreamStatusFluent<A extends ImageStreamStatusFluent<A>> extends Fluent<A>{


    public String getDockerImageRepository();
    public A withDockerImageRepository(String dockerImageRepository);
    public Boolean hasDockerImageRepository();
    public String getPublicDockerImageRepository();
    public A withPublicDockerImageRepository(String publicDockerImageRepository);
    public Boolean hasPublicDockerImageRepository();
    public A addToTags(int index,NamedTagEventList item);
    public A setToTags(int index,NamedTagEventList item);
    public A addToTags(NamedTagEventList... items);
    public A addAllToTags(Collection<NamedTagEventList> items);
    public A removeFromTags(NamedTagEventList... items);
    public A removeAllFromTags(Collection<NamedTagEventList> items);
    
/**
 * This method has been deprecated, please use method buildTags instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedTagEventList> getTags();
    public List<NamedTagEventList> buildTags();
    public NamedTagEventList buildTag(int index);
    public NamedTagEventList buildFirstTag();
    public NamedTagEventList buildLastTag();
    public NamedTagEventList buildMatchingTag(io.fabric8.kubernetes.api.builder.Predicate<NamedTagEventListBuilder> predicate);
    public A withTags(List<NamedTagEventList> tags);
    public A withTags(NamedTagEventList... tags);
    public Boolean hasTags();
    public ImageStreamStatusFluent.TagsNested<A> addNewTag();
    public ImageStreamStatusFluent.TagsNested<A> addNewTagLike(NamedTagEventList item);
    public ImageStreamStatusFluent.TagsNested<A> setNewTagLike(int index,NamedTagEventList item);
    public ImageStreamStatusFluent.TagsNested<A> editTag(int index);
    public ImageStreamStatusFluent.TagsNested<A> editFirstTag();
    public ImageStreamStatusFluent.TagsNested<A> editLastTag();
    public ImageStreamStatusFluent.TagsNested<A> editMatchingTag(io.fabric8.kubernetes.api.builder.Predicate<NamedTagEventListBuilder> predicate);

    public interface TagsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedTagEventListFluent<ImageStreamStatusFluent.TagsNested<N>>{

        
    public N and();    public N endTag();
}


}
