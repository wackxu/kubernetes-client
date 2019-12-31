package io.fabric8.kubernetes.api.model.batch;

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

public class CronJobFluentImpl<A extends CronJobFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CronJobFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private CronJobSpecBuilder spec;
    private CronJobStatusBuilder status;

    public CronJobFluentImpl(){
    }
    public CronJobFluentImpl(CronJob instance){
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

    public CronJobFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public CronJobFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public CronJobFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public CronJobFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public CronJobFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public CronJobSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public CronJobSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(CronJobSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new CronJobSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public CronJobFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public CronJobFluent.SpecNested<A> withNewSpecLike(CronJobSpec item){
            return new SpecNestedImpl(item);
    }

    public CronJobFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public CronJobFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new CronJobSpecBuilder().build());
    }

    public CronJobFluent.SpecNested<A> editOrNewSpecLike(CronJobSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public CronJobStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public CronJobStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(CronJobStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new CronJobStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public CronJobFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public CronJobFluent.StatusNested<A> withNewStatusLike(CronJobStatus item){
            return new StatusNestedImpl(item);
    }

    public CronJobFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public CronJobFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new CronJobStatusBuilder().build());
    }

    public CronJobFluent.StatusNested<A> editOrNewStatusLike(CronJobStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CronJobFluentImpl that = (CronJobFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<CronJobFluent.MetadataNested<N>> implements CronJobFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) CronJobFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends CronJobSpecFluentImpl<CronJobFluent.SpecNested<N>> implements CronJobFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobSpecBuilder builder;
    
            SpecNestedImpl(CronJobSpec item){
                    this.builder = new CronJobSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new CronJobSpecBuilder(this);
            }
    
    public N and(){
            return (N) CronJobFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends CronJobStatusFluentImpl<CronJobFluent.StatusNested<N>> implements CronJobFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CronJobStatusBuilder builder;
    
            StatusNestedImpl(CronJobStatus item){
                    this.builder = new CronJobStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new CronJobStatusBuilder(this);
            }
    
    public N and(){
            return (N) CronJobFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
