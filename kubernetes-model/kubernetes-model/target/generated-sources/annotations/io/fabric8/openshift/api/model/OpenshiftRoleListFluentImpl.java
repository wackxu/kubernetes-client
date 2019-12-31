package io.fabric8.openshift.api.model;

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
import io.fabric8.kubernetes.api.model.ListMeta;
import io.fabric8.kubernetes.api.model.ListMetaBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ListMetaFluentImpl;
import java.util.Collection;
import java.lang.Object;

public class OpenshiftRoleListFluentImpl<A extends OpenshiftRoleListFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements OpenshiftRoleListFluent<A>{

    private String apiVersion;
    private List<OpenshiftRoleBuilder> items;
    private String kind;
    private ListMetaBuilder metadata;

    public OpenshiftRoleListFluentImpl(){
    }
    public OpenshiftRoleListFluentImpl(OpenshiftRoleList instance){
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

    public A addToItems(int index,OpenshiftRole item){
            if (this.items == null) {this.items = new ArrayList<OpenshiftRoleBuilder>();}
            OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToItems(int index,OpenshiftRole item){
            if (this.items == null) {this.items = new ArrayList<OpenshiftRoleBuilder>();}
            OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
             return (A)this;
    }

    public A addToItems(OpenshiftRole... items){
            if (this.items == null) {this.items = new ArrayList<OpenshiftRoleBuilder>();}
            for (OpenshiftRole item : items) {OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToItems(Collection<OpenshiftRole> items){
            if (this.items == null) {this.items = new ArrayList<OpenshiftRoleBuilder>();}
            for (OpenshiftRole item : items) {OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromItems(OpenshiftRole... items){
            for (OpenshiftRole item : items) {OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromItems(Collection<OpenshiftRole> items){
            for (OpenshiftRole item : items) {OpenshiftRoleBuilder builder = new OpenshiftRoleBuilder(item);_visitables.remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<OpenshiftRole> getItems(){
            return build(items);
    }

    public List<OpenshiftRole> buildItems(){
            return build(items);
    }

    public OpenshiftRole buildItem(int index){
            return this.items.get(index).build();
    }

    public OpenshiftRole buildFirstItem(){
            return this.items.get(0).build();
    }

    public OpenshiftRole buildLastItem(){
            return this.items.get(items.size() - 1).build();
    }

    public OpenshiftRole buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OpenshiftRoleBuilder> predicate){
            for (OpenshiftRoleBuilder item: items) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withItems(List<OpenshiftRole> items){
            if (this.items != null) { _visitables.removeAll(this.items);}
            if (items != null) {this.items = new ArrayList<OpenshiftRoleBuilder>(); for (OpenshiftRole item : items){this.addToItems(item);}} else { this.items = new ArrayList<OpenshiftRoleBuilder>();} return (A) this;
    }

    public A withItems(OpenshiftRole... items){
            if (this.items != null) {this.items.clear();}
            if (items != null) {for (OpenshiftRole item :items){ this.addToItems(item);}} return (A) this;
    }

    public Boolean hasItems(){
            return items != null && !items.isEmpty();
    }

    public OpenshiftRoleListFluent.ItemsNested<A> addNewItem(){
            return new ItemsNestedImpl();
    }

    public OpenshiftRoleListFluent.ItemsNested<A> addNewItemLike(OpenshiftRole item){
            return new ItemsNestedImpl(-1, item);
    }

    public OpenshiftRoleListFluent.ItemsNested<A> setNewItemLike(int index,OpenshiftRole item){
            return new ItemsNestedImpl(index, item);
    }

    public OpenshiftRoleListFluent.ItemsNested<A> editItem(int index){
            if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
            return setNewItemLike(index, buildItem(index));
    }

    public OpenshiftRoleListFluent.ItemsNested<A> editFirstItem(){
            if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
            return setNewItemLike(0, buildItem(0));
    }

    public OpenshiftRoleListFluent.ItemsNested<A> editLastItem(){
            int index = items.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
            return setNewItemLike(index, buildItem(index));
    }

    public OpenshiftRoleListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<OpenshiftRoleBuilder> predicate){
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

    public OpenshiftRoleListFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public OpenshiftRoleListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item){
            return new MetadataNestedImpl(item);
    }

    public OpenshiftRoleListFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public OpenshiftRoleListFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ListMetaBuilder().build());
    }

    public OpenshiftRoleListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftRoleListFluentImpl that = (OpenshiftRoleListFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (items != null ? !items.equals(that.items) :that.items != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            return true;
    }


    public class ItemsNestedImpl<N> extends OpenshiftRoleFluentImpl<OpenshiftRoleListFluent.ItemsNested<N>> implements OpenshiftRoleListFluent.ItemsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftRoleBuilder builder;
        private final int index;
    
            ItemsNestedImpl(int index,OpenshiftRole item){
                    this.index = index;
                    this.builder = new OpenshiftRoleBuilder(this, item);
            }
            ItemsNestedImpl(){
                    this.index = -1;
                    this.builder = new OpenshiftRoleBuilder(this);
            }
    
    public N and(){
            return (N) OpenshiftRoleListFluentImpl.this.setToItems(index, builder.build());
    }
    public N endItem(){
            return and();
    }

}
    public class MetadataNestedImpl<N> extends ListMetaFluentImpl<OpenshiftRoleListFluent.MetadataNested<N>> implements OpenshiftRoleListFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ListMetaBuilder builder;
    
            MetadataNestedImpl(ListMeta item){
                    this.builder = new ListMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ListMetaBuilder(this);
            }
    
    public N and(){
            return (N) OpenshiftRoleListFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}


}
