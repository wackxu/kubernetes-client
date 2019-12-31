package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectMetaFluentImpl;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.lang.Object;

public class RouteFluentImpl<A extends RouteFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RouteFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private RouteSpecBuilder spec;
    private RouteStatusBuilder status;

    public RouteFluentImpl(){
    }
    public RouteFluentImpl(Route instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withKind(instance.getKind()); 
            this.withMetadata(instance.getMetadata()); 
            this.withSpec(instance.getSpec()); 
            this.withStatus(instance.getStatus()); 
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
@Deprecated public ObjectMeta getMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public ObjectMeta buildMetadata(){
            return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(ObjectMeta metadata){
            _visitables.remove(this.metadata);
            if (metadata!=null){ this.metadata= new ObjectMetaBuilder(metadata); _visitables.add(this.metadata);} return (A) this;
    }

    public Boolean hasMetadata(){
            return this.metadata != null;
    }

    public RouteFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public RouteFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public RouteFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public RouteFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public RouteFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public RouteSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public RouteSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(RouteSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new RouteSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public RouteFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public RouteFluent.SpecNested<A> withNewSpecLike(RouteSpec item){
            return new SpecNestedImpl(item);
    }

    public RouteFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public RouteFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new RouteSpecBuilder().build());
    }

    public RouteFluent.SpecNested<A> editOrNewSpecLike(RouteSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public RouteStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public RouteStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(RouteStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new RouteStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public RouteFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public RouteFluent.StatusNested<A> withNewStatusLike(RouteStatus item){
            return new StatusNestedImpl(item);
    }

    public RouteFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public RouteFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new RouteStatusBuilder().build());
    }

    public RouteFluent.StatusNested<A> editOrNewStatusLike(RouteStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RouteFluentImpl that = (RouteFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<RouteFluent.MetadataNested<N>> implements RouteFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) RouteFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends RouteSpecFluentImpl<RouteFluent.SpecNested<N>> implements RouteFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteSpecBuilder builder;
    
            SpecNestedImpl(RouteSpec item){
                    this.builder = new RouteSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new RouteSpecBuilder(this);
            }
    
    public N and(){
            return (N) RouteFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends RouteStatusFluentImpl<RouteFluent.StatusNested<N>> implements RouteFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final RouteStatusBuilder builder;
    
            StatusNestedImpl(RouteStatus item){
                    this.builder = new RouteStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new RouteStatusBuilder(this);
            }
    
    public N and(){
            return (N) RouteFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
