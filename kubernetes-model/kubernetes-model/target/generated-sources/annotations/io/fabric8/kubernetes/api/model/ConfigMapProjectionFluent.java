package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface ConfigMapProjectionFluent<A extends ConfigMapProjectionFluent<A>> extends Fluent<A>{


    public A addToItems(int index,KeyToPath item);
    public A setToItems(int index,KeyToPath item);
    public A addToItems(KeyToPath... items);
    public A addAllToItems(Collection<KeyToPath> items);
    public A removeFromItems(KeyToPath... items);
    public A removeAllFromItems(Collection<KeyToPath> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<KeyToPath> getItems();
    public List<KeyToPath> buildItems();
    public KeyToPath buildItem(int index);
    public KeyToPath buildFirstItem();
    public KeyToPath buildLastItem();
    public KeyToPath buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<KeyToPathBuilder> predicate);
    public A withItems(List<KeyToPath> items);
    public A withItems(KeyToPath... items);
    public Boolean hasItems();
    public A addNewItem(String key,Integer mode,String path);
    public ConfigMapProjectionFluent.ItemsNested<A> addNewItem();
    public ConfigMapProjectionFluent.ItemsNested<A> addNewItemLike(KeyToPath item);
    public ConfigMapProjectionFluent.ItemsNested<A> setNewItemLike(int index,KeyToPath item);
    public ConfigMapProjectionFluent.ItemsNested<A> editItem(int index);
    public ConfigMapProjectionFluent.ItemsNested<A> editFirstItem();
    public ConfigMapProjectionFluent.ItemsNested<A> editLastItem();
    public ConfigMapProjectionFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<KeyToPathBuilder> predicate);
    public String getName();
    public A withName(String name);
    public Boolean hasName();
    public Boolean isOptional();
    public A withOptional(Boolean optional);
    public Boolean hasOptional();
    public A withNewOptional(String arg1);
    public A withNewOptional(boolean arg1);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,KeyToPathFluent<ConfigMapProjectionFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}


}
