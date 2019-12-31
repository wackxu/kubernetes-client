package io.fabric8.kubernetes.api.model.batch;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import java.lang.Deprecated;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import javax.validation.Valid;
import java.lang.Object;
import java.util.Map;

public interface CronJobFluent<A extends CronJobFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public CronJobFluent.MetadataNested<A> withNewMetadata();
    public CronJobFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public CronJobFluent.MetadataNested<A> editMetadata();
    public CronJobFluent.MetadataNested<A> editOrNewMetadata();
    public CronJobFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildSpec instead.
 * @return The buildable object.
 */
@Deprecated public CronJobSpec getSpec();
    public CronJobSpec buildSpec();
    public A withSpec(CronJobSpec spec);
    public Boolean hasSpec();
    public CronJobFluent.SpecNested<A> withNewSpec();
    public CronJobFluent.SpecNested<A> withNewSpecLike(CronJobSpec item);
    public CronJobFluent.SpecNested<A> editSpec();
    public CronJobFluent.SpecNested<A> editOrNewSpec();
    public CronJobFluent.SpecNested<A> editOrNewSpecLike(CronJobSpec item);
    
/**
 * This method has been deprecated, please use method buildStatus instead.
 * @return The buildable object.
 */
@Deprecated public CronJobStatus getStatus();
    public CronJobStatus buildStatus();
    public A withStatus(CronJobStatus status);
    public Boolean hasStatus();
    public CronJobFluent.StatusNested<A> withNewStatus();
    public CronJobFluent.StatusNested<A> withNewStatusLike(CronJobStatus item);
    public CronJobFluent.StatusNested<A> editStatus();
    public CronJobFluent.StatusNested<A> editOrNewStatus();
    public CronJobFluent.StatusNested<A> editOrNewStatusLike(CronJobStatus item);

    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<CronJobFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface SpecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobSpecFluent<CronJobFluent.SpecNested<N>>{

        
    public N and();    public N endSpec();
}
    public interface StatusNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CronJobStatusFluent<CronJobFluent.StatusNested<N>>{

        
    public N and();    public N endStatus();
}


}
