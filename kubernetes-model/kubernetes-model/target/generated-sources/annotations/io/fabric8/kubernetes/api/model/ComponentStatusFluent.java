package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface ComponentStatusFluent<A extends ComponentStatusFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToConditions(int index,ComponentCondition item);
    public A setToConditions(int index,ComponentCondition item);
    public A addToConditions(ComponentCondition... items);
    public A addAllToConditions(Collection<ComponentCondition> items);
    public A removeFromConditions(ComponentCondition... items);
    public A removeAllFromConditions(Collection<ComponentCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<ComponentCondition> getConditions();
    public List<ComponentCondition> buildConditions();
    public ComponentCondition buildCondition(int index);
    public ComponentCondition buildFirstCondition();
    public ComponentCondition buildLastCondition();
    public ComponentCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<ComponentConditionBuilder> predicate);
    public A withConditions(List<ComponentCondition> conditions);
    public A withConditions(ComponentCondition... conditions);
    public Boolean hasConditions();
    public A addNewCondition(String error,String message,String status,String type);
    public ComponentStatusFluent.ConditionsNested<A> addNewCondition();
    public ComponentStatusFluent.ConditionsNested<A> addNewConditionLike(ComponentCondition item);
    public ComponentStatusFluent.ConditionsNested<A> setNewConditionLike(int index,ComponentCondition item);
    public ComponentStatusFluent.ConditionsNested<A> editCondition(int index);
    public ComponentStatusFluent.ConditionsNested<A> editFirstCondition();
    public ComponentStatusFluent.ConditionsNested<A> editLastCondition();
    public ComponentStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<ComponentConditionBuilder> predicate);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public ComponentStatusFluent.MetadataNested<A> withNewMetadata();
    public ComponentStatusFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public ComponentStatusFluent.MetadataNested<A> editMetadata();
    public ComponentStatusFluent.MetadataNested<A> editOrNewMetadata();
    public ComponentStatusFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ComponentConditionFluent<ComponentStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<ComponentStatusFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
