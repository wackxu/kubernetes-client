package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface ImageStreamTagFluent<A extends ImageStreamTagFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToConditions(int index,TagEventCondition item);
    public A setToConditions(int index,TagEventCondition item);
    public A addToConditions(TagEventCondition... items);
    public A addAllToConditions(Collection<TagEventCondition> items);
    public A removeFromConditions(TagEventCondition... items);
    public A removeAllFromConditions(Collection<TagEventCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<TagEventCondition> getConditions();
    public List<TagEventCondition> buildConditions();
    public TagEventCondition buildCondition(int index);
    public TagEventCondition buildFirstCondition();
    public TagEventCondition buildLastCondition();
    public TagEventCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<TagEventConditionBuilder> predicate);
    public A withConditions(List<TagEventCondition> conditions);
    public A withConditions(TagEventCondition... conditions);
    public Boolean hasConditions();
    public ImageStreamTagFluent.ConditionsNested<A> addNewCondition();
    public ImageStreamTagFluent.ConditionsNested<A> addNewConditionLike(TagEventCondition item);
    public ImageStreamTagFluent.ConditionsNested<A> setNewConditionLike(int index,TagEventCondition item);
    public ImageStreamTagFluent.ConditionsNested<A> editCondition(int index);
    public ImageStreamTagFluent.ConditionsNested<A> editFirstCondition();
    public ImageStreamTagFluent.ConditionsNested<A> editLastCondition();
    public ImageStreamTagFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<TagEventConditionBuilder> predicate);
    public Long getGeneration();
    public A withGeneration(Long generation);
    public Boolean hasGeneration();
    public A withNewGeneration(String arg1);
    public A withNewGeneration(long arg1);
    
/**
 * This method has been deprecated, please use method buildImage instead.
 * @return The buildable object.
 */
@Deprecated public Image getImage();
    public Image buildImage();
    public A withImage(Image image);
    public Boolean hasImage();
    public ImageStreamTagFluent.ImageNested<A> withNewImage();
    public ImageStreamTagFluent.ImageNested<A> withNewImageLike(Image item);
    public ImageStreamTagFluent.ImageNested<A> editImage();
    public ImageStreamTagFluent.ImageNested<A> editOrNewImage();
    public ImageStreamTagFluent.ImageNested<A> editOrNewImageLike(Image item);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildLookupPolicy instead.
 * @return The buildable object.
 */
@Deprecated public ImageLookupPolicy getLookupPolicy();
    public ImageLookupPolicy buildLookupPolicy();
    public A withLookupPolicy(ImageLookupPolicy lookupPolicy);
    public Boolean hasLookupPolicy();
    public A withNewLookupPolicy(Boolean local);
    public ImageStreamTagFluent.LookupPolicyNested<A> withNewLookupPolicy();
    public ImageStreamTagFluent.LookupPolicyNested<A> withNewLookupPolicyLike(ImageLookupPolicy item);
    public ImageStreamTagFluent.LookupPolicyNested<A> editLookupPolicy();
    public ImageStreamTagFluent.LookupPolicyNested<A> editOrNewLookupPolicy();
    public ImageStreamTagFluent.LookupPolicyNested<A> editOrNewLookupPolicyLike(ImageLookupPolicy item);
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public ImageStreamTagFluent.MetadataNested<A> withNewMetadata();
    public ImageStreamTagFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ImageStreamTagFluent.MetadataNested<A> editMetadata();
    public ImageStreamTagFluent.MetadataNested<A> editOrNewMetadata();
    public ImageStreamTagFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildTag instead.
 * @return The buildable object.
 */
@Deprecated public TagReference getTag();
    public TagReference buildTag();
    public A withTag(TagReference tag);
    public Boolean hasTag();
    public ImageStreamTagFluent.TagNested<A> withNewTag();
    public ImageStreamTagFluent.TagNested<A> withNewTagLike(TagReference item);
    public ImageStreamTagFluent.TagNested<A> editTag();
    public ImageStreamTagFluent.TagNested<A> editOrNewTag();
    public ImageStreamTagFluent.TagNested<A> editOrNewTagLike(TagReference item);

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagEventConditionFluent<ImageStreamTagFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}
    public interface ImageNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageFluent<ImageStreamTagFluent.ImageNested<N>>{

        
    public N and();    public N endImage();
}
    public interface LookupPolicyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ImageLookupPolicyFluent<ImageStreamTagFluent.LookupPolicyNested<N>>{

        
    public N and();    public N endLookupPolicy();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ImageStreamTagFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface TagNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagReferenceFluent<ImageStreamTagFluent.TagNested<N>>{

        
    public N and();    public N endTag();
}


}
