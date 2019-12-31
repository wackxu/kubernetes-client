package io.fabric8.kubernetes.api.model.apps;

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

public class StatefulSetFluentImpl<A extends StatefulSetFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements StatefulSetFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private StatefulSetSpecBuilder spec;
    private StatefulSetStatusBuilder status;

    public StatefulSetFluentImpl(){
    }
    public StatefulSetFluentImpl(StatefulSet instance){
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

    public StatefulSetFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public StatefulSetFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public StatefulSetFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public StatefulSetFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public StatefulSetFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public StatefulSetSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public StatefulSetSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(StatefulSetSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new StatefulSetSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public StatefulSetFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public StatefulSetFluent.SpecNested<A> withNewSpecLike(StatefulSetSpec item){
            return new SpecNestedImpl(item);
    }

    public StatefulSetFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public StatefulSetFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new StatefulSetSpecBuilder().build());
    }

    public StatefulSetFluent.SpecNested<A> editOrNewSpecLike(StatefulSetSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public StatefulSetStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public StatefulSetStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(StatefulSetStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new StatefulSetStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public StatefulSetFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public StatefulSetFluent.StatusNested<A> withNewStatusLike(StatefulSetStatus item){
            return new StatusNestedImpl(item);
    }

    public StatefulSetFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public StatefulSetFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new StatefulSetStatusBuilder().build());
    }

    public StatefulSetFluent.StatusNested<A> editOrNewStatusLike(StatefulSetStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            StatefulSetFluentImpl that = (StatefulSetFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<StatefulSetFluent.MetadataNested<N>> implements StatefulSetFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) StatefulSetFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends StatefulSetSpecFluentImpl<StatefulSetFluent.SpecNested<N>> implements StatefulSetFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetSpecBuilder builder;
    
            SpecNestedImpl(StatefulSetSpec item){
                    this.builder = new StatefulSetSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new StatefulSetSpecBuilder(this);
            }
    
    public N and(){
            return (N) StatefulSetFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends StatefulSetStatusFluentImpl<StatefulSetFluent.StatusNested<N>> implements StatefulSetFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StatefulSetStatusBuilder builder;
    
            StatusNestedImpl(StatefulSetStatus item){
                    this.builder = new StatefulSetStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new StatefulSetStatusBuilder(this);
            }
    
    public N and(){
            return (N) StatefulSetFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
