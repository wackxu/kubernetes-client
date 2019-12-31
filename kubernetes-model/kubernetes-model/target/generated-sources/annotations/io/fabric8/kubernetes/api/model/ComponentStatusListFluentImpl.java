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

public class ComponentStatusListFluentImpl<A extends ComponentStatusListFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ComponentStatusListFluent<A>{

    private String apiVersion;
    private List<ComponentStatusBuilder> items;
    private String kind;
    private ListMetaBuilder metadata;

    public ComponentStatusListFluentImpl(){
    }
    public ComponentStatusListFluentImpl(ComponentStatusList instance){
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

    public A addToItems(int index,ComponentStatus item){
            if (this.items == null) {this.items = new ArrayList<ComponentStatusBuilder>();}
            ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToItems(int index,ComponentStatus item){
            if (this.items == null) {this.items = new ArrayList<ComponentStatusBuilder>();}
            ComponentStatusBuilder builder = new ComponentStatusBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToItems(ComponentStatus... items){
            if (this.items == null) {this.items = new ArrayList<ComponentStatusBuilder>();}
            for (ComponentStatus item : items) {ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToItems(Collection<ComponentStatus> items){
            if (this.items == null) {this.items = new ArrayList<ComponentStatusBuilder>();}
            for (ComponentStatus item : items) {ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromItems(ComponentStatus... items){
            for (ComponentStatus item : items) {ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromItems(Collection<ComponentStatus> items){
            for (ComponentStatus item : items) {ComponentStatusBuilder builder = new ComponentStatusBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<ComponentStatus> getItems(){
            return build(items);
    }

    public List<ComponentStatus> buildItems(){
            return build(items);
    }

    public ComponentStatus buildItem(int index){
            return this.items.get(index).build();
    }

    public ComponentStatus buildFirstItem(){
            return this.items.get(0).build();
    }

    public ComponentStatus buildLastItem(){
            return this.items.get(items.size() - 1).build();
    }

    public ComponentStatus buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ComponentStatusBuilder> predicate){
            for (ComponentStatusBuilder item: items) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withItems(List<ComponentStatus> items){
            if (this.items != null) { _visitables.removeAll(this.items);}
            if (items != null) {this.items = new ArrayList<ComponentStatusBuilder>(); for (ComponentStatus item : items){this.addToItems(item);}} else { this.items = new ArrayList<ComponentStatusBuilder>();} return (A) this;
    }

    public A withItems(ComponentStatus... items){
            if (this.items != null) {this.items.clear();}
            if (items != null) {for (ComponentStatus item :items){ this.addToItems(item);}} return (A) this;
    }

    public Boolean hasItems(){
            return items != null && !items.isEmpty();
    }

    public ComponentStatusListFluent.ItemsNested<A> addNewItem(){
            return new ItemsNestedImpl();
    }

    public ComponentStatusListFluent.ItemsNested<A> addNewItemLike(ComponentStatus item){
            return new ItemsNestedImpl(-1, item);
    }

    public ComponentStatusListFluent.ItemsNested<A> setNewItemLike(int index,ComponentStatus item){
            return new ItemsNestedImpl(index, item);
    }

    public ComponentStatusListFluent.ItemsNested<A> editItem(int index){
            if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
            return setNewItemLike(index, buildItem(index));
    }

    public ComponentStatusListFluent.ItemsNested<A> editFirstItem(){
            if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
            return setNewItemLike(0, buildItem(0));
    }

    public ComponentStatusListFluent.ItemsNested<A> editLastItem(){
            int index = items.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
            return setNewItemLike(index, buildItem(index));
    }

    public ComponentStatusListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ComponentStatusBuilder> predicate){
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

    public ComponentStatusListFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public ComponentStatusListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item){
            return new MetadataNestedImpl(item);
    }

    public ComponentStatusListFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public ComponentStatusListFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ListMetaBuilder().build());
    }

    public ComponentStatusListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ComponentStatusListFluentImpl that = (ComponentStatusListFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (items != null ? !items.equals(that.items) :that.items != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            return true;
    }


    public class ItemsNestedImpl<N> extends ComponentStatusFluentImpl<ComponentStatusListFluent.ItemsNested<N>> implements ComponentStatusListFluent.ItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ComponentStatusBuilder builder;
        private final int index;
    
            ItemsNestedImpl(int index,ComponentStatus item){
                    this.index = index;
                    this.builder = new ComponentStatusBuilder(this, item);
            }
            ItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new ComponentStatusBuilder(this);
            }
    
    public N and(){
            return (N) ComponentStatusListFluentImpl.this.setToItems(index, builder.build());
    }
    public N endItem(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ListMetaFluentImpl<ComponentStatusListFluent.MetadataNested<N>> implements ComponentStatusListFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ListMetaBuilder builder;
    
            MetadataNestedImpl(ListMeta item){
                    this.builder = new ListMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ListMetaBuilder(this);
            }
    
    public N and(){
            return (N) ComponentStatusListFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
