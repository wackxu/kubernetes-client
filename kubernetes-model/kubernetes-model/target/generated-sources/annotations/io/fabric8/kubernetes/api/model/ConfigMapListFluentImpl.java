package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class ConfigMapListFluentImpl<A extends ConfigMapListFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ConfigMapListFluent<A>{

    private String apiVersion;
    private List<ConfigMapBuilder> items;
    private String kind;
    private ListMetaBuilder metadata;

    public ConfigMapListFluentImpl(){
    }
    public ConfigMapListFluentImpl(ConfigMapList instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withItems(instance.getItems()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
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

    public A addToItems(int index,ConfigMap item){
            if (this.items == null) {this.items = new ArrayList<ConfigMapBuilder>();}
            ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToItems(int index,ConfigMap item){
            if (this.items == null) {this.items = new ArrayList<ConfigMapBuilder>();}
            ConfigMapBuilder builder = new ConfigMapBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToItems(ConfigMap... items){
            if (this.items == null) {this.items = new ArrayList<ConfigMapBuilder>();}
            for (ConfigMap item : items) {ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToItems(Collection<ConfigMap> items){
            if (this.items == null) {this.items = new ArrayList<ConfigMapBuilder>();}
            for (ConfigMap item : items) {ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromItems(ConfigMap... items){
            for (ConfigMap item : items) {ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromItems(Collection<ConfigMap> items){
            for (ConfigMap item : items) {ConfigMapBuilder builder = new ConfigMapBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ConfigMap> getItems(){
            return build(items);
    }

    public List<ConfigMap> buildItems(){
            return build(items);
    }

    public ConfigMap buildItem(int index){
            return this.items.get(index).build();
    }

    public ConfigMap buildFirstItem(){
            return this.items.get(0).build();
    }

    public ConfigMap buildLastItem(){
            return this.items.get(items.size() - 1).build();
    }

    public ConfigMap buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ConfigMapBuilder> predicate){
            for (ConfigMapBuilder item: items) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withItems(List<ConfigMap> items){
            if (this.items != null) { _visitables.removeAll(this.items);}
            if (items != null) {this.items = new ArrayList<ConfigMapBuilder>(); for (ConfigMap item : items){this.addToItems(item);}} else { this.items = new ArrayList<ConfigMapBuilder>();} return (A) this;
    }

    public A withItems(ConfigMap... items){
            if (this.items != null) {this.items.clear();}
            if (items != null) {for (ConfigMap item :items){ this.addToItems(item);}} return (A) this;
    }

    public Boolean hasItems(){
            return items != null && !items.isEmpty();
    }

    public ConfigMapListFluent.ItemsNested<A> addNewItem(){
            return new ItemsNestedImpl();
    }

    public ConfigMapListFluent.ItemsNested<A> addNewItemLike(ConfigMap item){
            return new ItemsNestedImpl(-1, item);
    }

    public ConfigMapListFluent.ItemsNested<A> setNewItemLike(int index,ConfigMap item){
            return new ItemsNestedImpl(index, item);
    }

    public ConfigMapListFluent.ItemsNested<A> editItem(int index){
            if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
            return setNewItemLike(index, buildItem(index));
    }

    public ConfigMapListFluent.ItemsNested<A> editFirstItem(){
            if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
            return setNewItemLike(0, buildItem(0));
    }

    public ConfigMapListFluent.ItemsNested<A> editLastItem(){
            int index = items.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
            return setNewItemLike(index, buildItem(index));
    }

    public ConfigMapListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ConfigMapBuilder> predicate){
            int index = -1;
            for (int i=0;i<items.size();i++) { 
            if (predicate.apply(items.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
            return setNewItemLike(index, buildItem(index));
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
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ListMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ListMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ListMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ListMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public A withNewMetadata(String _continue,String resourceVersion,String selfLink){
            return (A)withMetadata(new ListMeta(_continue, resourceVersion, selfLink));
    }

    public ConfigMapListFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ConfigMapListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item){
            return new MetadataNestedImpl(item);
    }

    public ConfigMapListFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ConfigMapListFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ListMetaBuilder().build());
    }

    public ConfigMapListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConfigMapListFluentImpl that = (ConfigMapListFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (items != null ? !items.equals(that.items) :that.items != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            return true;
    }


    public class ItemsNestedImpl<N> extends ConfigMapFluentImpl<ConfigMapListFluent.ItemsNested<N>> implements ConfigMapListFluent.ItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ConfigMapBuilder builder;
        private final int index;
    
            ItemsNestedImpl(int index,ConfigMap item){
                    this.index = index;
                    this.builder = new ConfigMapBuilder(this, item);
            }
            ItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ConfigMapBuilder(this);
            }
    
    public N and(){
            return (N) ConfigMapListFluentImpl.this.setToItems(index, builder.build());
    }
    public N endItem(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ListMetaFluentImpl<ConfigMapListFluent.MetadataNested<N>> implements ConfigMapListFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ListMetaBuilder builder;
    
            MetadataNestedImpl(ListMeta item){
                    this.builder = new ListMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ListMetaBuilder(this);
            }
    
    public N and(){
            return (N) ConfigMapListFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
