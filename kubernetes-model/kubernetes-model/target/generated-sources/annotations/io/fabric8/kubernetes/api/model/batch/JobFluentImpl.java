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

public class JobFluentImpl<A extends JobFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements JobFluent<A>{

    private String apiVersion;
    private String kind;
    private ObjectMetaBuilder metadata;
    private JobSpecBuilder spec;
    private JobStatusBuilder status;

    public JobFluentImpl(){
    }
    public JobFluentImpl(Job instance){
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

    public JobFluent.MetadataNested<A> withNewMetadata(){
            return new MetadataNestedImpl();
    }

    public JobFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item){
            return new MetadataNestedImpl(item);
    }

    public JobFluent.MetadataNested<A> editMetadata(){
            return withNewMetadataLike(getMetadata());
    }

    public JobFluent.MetadataNested<A> editOrNewMetadata(){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): new ObjectMetaBuilder().build());
    }

    public JobFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item){
            return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public JobSpec getSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public JobSpec buildSpec(){
            return this.spec!=null?this.spec.build():null;
    }

    public A withSpec(JobSpec spec){
            _visitables.remove(this.spec);
            if (spec!=null){ this.spec= new JobSpecBuilder(spec); _visitables.add(this.spec);} return (A) this;
    }

    public Boolean hasSpec(){
            return this.spec != null;
    }

    public JobFluent.SpecNested<A> withNewSpec(){
            return new SpecNestedImpl();
    }

    public JobFluent.SpecNested<A> withNewSpecLike(JobSpec item){
            return new SpecNestedImpl(item);
    }

    public JobFluent.SpecNested<A> editSpec(){
            return withNewSpecLike(getSpec());
    }

    public JobFluent.SpecNested<A> editOrNewSpec(){
            return withNewSpecLike(getSpec() != null ? getSpec(): new JobSpecBuilder().build());
    }

    public JobFluent.SpecNested<A> editOrNewSpecLike(JobSpec item){
            return withNewSpecLike(getSpec() != null ? getSpec(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public JobStatus getStatus(){
            return this.status!=null?this.status.build():null;
    }

    public JobStatus buildStatus(){
            return this.status!=null?this.status.build():null;
    }

    public A withStatus(JobStatus status){
            _visitables.remove(this.status);
            if (status!=null){ this.status= new JobStatusBuilder(status); _visitables.add(this.status);} return (A) this;
    }

    public Boolean hasStatus(){
            return this.status != null;
    }

    public JobFluent.StatusNested<A> withNewStatus(){
            return new StatusNestedImpl();
    }

    public JobFluent.StatusNested<A> withNewStatusLike(JobStatus item){
            return new StatusNestedImpl(item);
    }

    public JobFluent.StatusNested<A> editStatus(){
            return withNewStatusLike(getStatus());
    }

    public JobFluent.StatusNested<A> editOrNewStatus(){
            return withNewStatusLike(getStatus() != null ? getStatus(): new JobStatusBuilder().build());
    }

    public JobFluent.StatusNested<A> editOrNewStatusLike(JobStatus item){
            return withNewStatusLike(getStatus() != null ? getStatus(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JobFluentImpl that = (JobFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
            if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
            if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
            if (status != null ? !status.equals(that.status) :that.status != null) return false;
            return true;
    }


    public class MetadataNestedImpl<N> extends ObjectMetaFluentImpl<JobFluent.MetadataNested<N>> implements JobFluent.MetadataNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectMetaBuilder builder;
    
            MetadataNestedImpl(ObjectMeta item){
                    this.builder = new ObjectMetaBuilder(this, item);
            }
            MetadataNestedImpl(){
                    this.builder = new ObjectMetaBuilder(this);
            }
    
    public N and(){
            return (N) JobFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata(){
            return and();
    }

}
    public class SpecNestedImpl<N> extends JobSpecFluentImpl<JobFluent.SpecNested<N>> implements JobFluent.SpecNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobSpecBuilder builder;
    
            SpecNestedImpl(JobSpec item){
                    this.builder = new JobSpecBuilder(this, item);
            }
            SpecNestedImpl(){
                    this.builder = new JobSpecBuilder(this);
            }
    
    public N and(){
            return (N) JobFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec(){
            return and();
    }

}
    public class StatusNestedImpl<N> extends JobStatusFluentImpl<JobFluent.StatusNested<N>> implements JobFluent.StatusNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final JobStatusBuilder builder;
    
            StatusNestedImpl(JobStatus item){
                    this.builder = new JobStatusBuilder(this, item);
            }
            StatusNestedImpl(){
                    this.builder = new JobStatusBuilder(this);
            }
    
    public N and(){
            return (N) JobFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus(){
            return and();
    }

}


}
