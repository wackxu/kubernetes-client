package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface NamedTagEventListFluent<A extends NamedTagEventListFluent<A>> extends Fluent<A>{


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
    public NamedTagEventListFluent.ConditionsNested<A> addNewCondition();
    public NamedTagEventListFluent.ConditionsNested<A> addNewConditionLike(TagEventCondition item);
    public NamedTagEventListFluent.ConditionsNested<A> setNewConditionLike(int index,TagEventCondition item);
    public NamedTagEventListFluent.ConditionsNested<A> editCondition(int index);
    public NamedTagEventListFluent.ConditionsNested<A> editFirstCondition();
    public NamedTagEventListFluent.ConditionsNested<A> editLastCondition();
    public NamedTagEventListFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<TagEventConditionBuilder> predicate);
    public A addToItems(int index,TagEvent item);
    public A setToItems(int index,TagEvent item);
    public A addToItems(TagEvent... items);
    public A addAllToItems(Collection<TagEvent> items);
    public A removeFromItems(TagEvent... items);
    public A removeAllFromItems(Collection<TagEvent> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<TagEvent> getItems();
    public List<TagEvent> buildItems();
    public TagEvent buildItem(int index);
    public TagEvent buildFirstItem();
    public TagEvent buildLastItem();
    public TagEvent buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<TagEventBuilder> predicate);
    public A withItems(List<TagEvent> items);
    public A withItems(TagEvent... items);
    public Boolean hasItems();
    public A addNewItem(String created,String dockerImageReference,Long generation,String image);
    public NamedTagEventListFluent.ItemsNested<A> addNewItem();
    public NamedTagEventListFluent.ItemsNested<A> addNewItemLike(TagEvent item);
    public NamedTagEventListFluent.ItemsNested<A> setNewItemLike(int index,TagEvent item);
    public NamedTagEventListFluent.ItemsNested<A> editItem(int index);
    public NamedTagEventListFluent.ItemsNested<A> editFirstItem();
    public NamedTagEventListFluent.ItemsNested<A> editLastItem();
    public NamedTagEventListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<TagEventBuilder> predicate);
    public String getTag();
    public A withTag(String tag);
    public Boolean hasTag();

    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagEventConditionFluent<NamedTagEventListFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}
    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,TagEventFluent<NamedTagEventListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}


}
