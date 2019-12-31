package io.fabric8.kubernetes.api.model.batch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.ListMetaFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ListMeta;
import io.fabric8.kubernetes.api.model.ListMetaBuilder;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface JobListFluent<A extends JobListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Job item);
    public A setToItems(int index,Job item);
    public A addToItems(Job... items);
    public A addAllToItems(Collection<Job> items);
    public A removeFromItems(Job... items);
    public A removeAllFromItems(Collection<Job> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Job> getItems();
    public List<Job> buildItems();
    public Job buildItem(int index);
    public Job buildFirstItem();
    public Job buildLastItem();
    public Job buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<JobBuilder> predicate);
    public A withItems(List<Job> items);
    public A withItems(Job... items);
    public Boolean hasItems();
    public JobListFluent.ItemsNested<A> addNewItem();
    public JobListFluent.ItemsNested<A> addNewItemLike(Job item);
    public JobListFluent.ItemsNested<A> setNewItemLike(int index,Job item);
    public JobListFluent.ItemsNested<A> editItem(int index);
    public JobListFluent.ItemsNested<A> editFirstItem();
    public JobListFluent.ItemsNested<A> editLastItem();
    public JobListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<JobBuilder> predicate);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ListMeta getMetadata();
    public ListMeta buildMetadata();
    public A withMetadata(ListMeta metadata);
    public Boolean hasMetadata();
    public A withNewMetadata(String _continue,String resourceVersion,String selfLink);
    public JobListFluent.MetadataNested<A> withNewMetadata();
    public JobListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public JobListFluent.MetadataNested<A> editMetadata();
    public JobListFluent.MetadataNested<A> editOrNewMetadata();
    public JobListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,JobFluent<JobListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<JobListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
