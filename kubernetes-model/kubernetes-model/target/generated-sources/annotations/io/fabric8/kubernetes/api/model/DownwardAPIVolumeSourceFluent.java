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

public interface DownwardAPIVolumeSourceFluent<A extends DownwardAPIVolumeSourceFluent<A>> extends Fluent<A>{


    public Integer getDefaultMode();
    public A withDefaultMode(Integer defaultMode);
    public Boolean hasDefaultMode();
    public A addToItems(int index,DownwardAPIVolumeFile item);
    public A setToItems(int index,DownwardAPIVolumeFile item);
    public A addToItems(DownwardAPIVolumeFile... items);
    public A addAllToItems(Collection<DownwardAPIVolumeFile> items);
    public A removeFromItems(DownwardAPIVolumeFile... items);
    public A removeAllFromItems(Collection<DownwardAPIVolumeFile> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<DownwardAPIVolumeFile> getItems();
    public List<DownwardAPIVolumeFile> buildItems();
    public DownwardAPIVolumeFile buildItem(int index);
    public DownwardAPIVolumeFile buildFirstItem();
    public DownwardAPIVolumeFile buildLastItem();
    public DownwardAPIVolumeFile buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<DownwardAPIVolumeFileBuilder> predicate);
    public A withItems(List<DownwardAPIVolumeFile> items);
    public A withItems(DownwardAPIVolumeFile... items);
    public Boolean hasItems();
    public DownwardAPIVolumeSourceFluent.ItemsNested<A> addNewItem();
    public DownwardAPIVolumeSourceFluent.ItemsNested<A> addNewItemLike(DownwardAPIVolumeFile item);
    public DownwardAPIVolumeSourceFluent.ItemsNested<A> setNewItemLike(int index,DownwardAPIVolumeFile item);
    public DownwardAPIVolumeSourceFluent.ItemsNested<A> editItem(int index);
    public DownwardAPIVolumeSourceFluent.ItemsNested<A> editFirstItem();
    public DownwardAPIVolumeSourceFluent.ItemsNested<A> editLastItem();
    public DownwardAPIVolumeSourceFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<DownwardAPIVolumeFileBuilder> predicate);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DownwardAPIVolumeFileFluent<DownwardAPIVolumeSourceFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}


}
