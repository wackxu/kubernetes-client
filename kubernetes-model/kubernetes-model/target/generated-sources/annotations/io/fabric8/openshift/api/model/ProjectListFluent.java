package io.fabric8.openshift.api.model;

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

public interface ProjectListFluent<A extends ProjectListFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public A addToItems(int index,Project item);
    public A setToItems(int index,Project item);
    public A addToItems(Project... items);
    public A addAllToItems(Collection<Project> items);
    public A removeFromItems(Project... items);
    public A removeAllFromItems(Collection<Project> items);
    
/**
 * This method has been deprecated, please use method buildItems instead.
 * @return The buildable object.
 */
@Deprecated public List<Project> getItems();
    public List<Project> buildItems();
    public Project buildItem(int index);
    public Project buildFirstItem();
    public Project buildLastItem();
    public Project buildMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ProjectBuilder> predicate);
    public A withItems(List<Project> items);
    public A withItems(Project... items);
    public Boolean hasItems();
    public ProjectListFluent.ItemsNested<A> addNewItem();
    public ProjectListFluent.ItemsNested<A> addNewItemLike(Project item);
    public ProjectListFluent.ItemsNested<A> setNewItemLike(int index,Project item);
    public ProjectListFluent.ItemsNested<A> editItem(int index);
    public ProjectListFluent.ItemsNested<A> editFirstItem();
    public ProjectListFluent.ItemsNested<A> editLastItem();
    public ProjectListFluent.ItemsNested<A> editMatchingItem(io.fabric8.kubernetes.api.builder.Predicate<ProjectBuilder> predicate);
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
    public ProjectListFluent.MetadataNested<A> withNewMetadata();
    public ProjectListFluent.MetadataNested<A> withNewMetadataLike(ListMeta item);
    public ProjectListFluent.MetadataNested<A> editMetadata();
    public ProjectListFluent.MetadataNested<A> editOrNewMetadata();
    public ProjectListFluent.MetadataNested<A> editOrNewMetadataLike(ListMeta item);

    public interface ItemsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ProjectFluent<ProjectListFluent.ItemsNested<N>>{

        
    public N and();    public N endItem();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ListMetaFluent<ProjectListFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}


}
