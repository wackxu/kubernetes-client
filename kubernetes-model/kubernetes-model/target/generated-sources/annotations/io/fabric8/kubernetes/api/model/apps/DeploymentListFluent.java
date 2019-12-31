package io.fabric8.kubernetes.api.model.apps;

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

public interface DeploymentListFluent<A extends DeploymentListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Deployment item);
    public A setToItems(int index,Deployment item);
    public A addToItems(Deployment... items);
    public A addAllToItems(Collection<Deployment> items);
    public A removeFromItems(Deployment... items);
    public A removeAllFromItems(Collection<Deployment> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Deployment> getItems();
    public List<Deployment> buildItems();
    public Deployment buildItem(int index);
    public Deployment buildFirstItem();
    public Deployment buildLastItem();
    public Deployment buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<DeploymentBuilder> predicate);
    public A withItems(List<Deployment> items);
    public A withItems(Deployment... items);
    public Boolean hasItems();
    public DeploymentListFluent.ItemsNested<A> addNewItem();
    public DeploymentListFluent.ItemsNested<A> addNewItemLike(Deployment item);
    public DeploymentListFluent.ItemsNested<A> setNewItemLike(int index,Deployment item);
    public DeploymentListFluent.ItemsNested<A> editItem(int index);
    public DeploymentListFluent.ItemsNested<A> editFirstItem();
    public DeploymentListFluent.ItemsNested<A> editLastItem();
    public DeploymentListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<DeploymentBuilder> predicate);
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
    public DeploymentListFluent.MetadataNested<A> withNewMetadata();
    public DeploymentListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public DeploymentListFluent.MetadataNested<A> editMetadata();
    public DeploymentListFluent.MetadataNested<A> editOrNewMetadata();
    public DeploymentListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DeploymentFluent<DeploymentListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<DeploymentListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
