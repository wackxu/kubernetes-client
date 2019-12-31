package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import io.fabric8.kubernetes.api.model.validators.CheckObjectMeta;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectMetaFluent;
import io.fabric8.kubernetes.api.model.EnvVar;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.EnvVarFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectMetaBuilder;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import io.fabric8.kubernetes.api.builder.Nested;
import io.fabric8.kubernetes.api.model.EnvVarBuilder;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.ObjectMeta;

public interface BuildRequestFluent<A extends BuildRequestFluent<A>> extends Fluent<A>{


    public String getApiVersion();
    public A withApiVersion(String apiVersion);
    public Boolean hasApiVersion();
    
/**
 * This method has been deprecated, please use method buildBinary instead.
 * @return The buildable object.
 */
@Deprecated public BinaryBuildSource getBinary();
    public BinaryBuildSource buildBinary();
    public A withBinary(BinaryBuildSource binary);
    public Boolean hasBinary();
    public A withNewBinary(String asFile);
    public BuildRequestFluent.BinaryNested<A> withNewBinary();
    public BuildRequestFluent.BinaryNested<A> withNewBinaryLike(BinaryBuildSource item);
    public BuildRequestFluent.BinaryNested<A> editBinary();
    public BuildRequestFluent.BinaryNested<A> editOrNewBinary();
    public BuildRequestFluent.BinaryNested<A> editOrNewBinaryLike(BinaryBuildSource item);
    
/**
 * This method has been deprecated, please use method buildDockerStrategyOptions instead.
 * @return The buildable object.
 */
@Deprecated public DockerStrategyOptions getDockerStrategyOptions();
    public DockerStrategyOptions buildDockerStrategyOptions();
    public A withDockerStrategyOptions(DockerStrategyOptions dockerStrategyOptions);
    public Boolean hasDockerStrategyOptions();
    public BuildRequestFluent.DockerStrategyOptionsNested<A> withNewDockerStrategyOptions();
    public BuildRequestFluent.DockerStrategyOptionsNested<A> withNewDockerStrategyOptionsLike(DockerStrategyOptions item);
    public BuildRequestFluent.DockerStrategyOptionsNested<A> editDockerStrategyOptions();
    public BuildRequestFluent.DockerStrategyOptionsNested<A> editOrNewDockerStrategyOptions();
    public BuildRequestFluent.DockerStrategyOptionsNested<A> editOrNewDockerStrategyOptionsLike(DockerStrategyOptions item);
    public A addToEnv(int index,EnvVar item);
    public A setToEnv(int index,EnvVar item);
    public A addToEnv(EnvVar... items);
    public A addAllToEnv(Collection<EnvVar> items);
    public A removeFromEnv(EnvVar... items);
    public A removeAllFromEnv(Collection<EnvVar> items);
    
/**
 * This method has been deprecated, please use method buildEnv instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getEnv();
    public List<EnvVar> buildEnv();
    public EnvVar buildEnv(int index);
    public EnvVar buildFirstEnv();
    public EnvVar buildLastEnv();
    public EnvVar buildMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public A withEnv(List<EnvVar> env);
    public A withEnv(EnvVar... env);
    public Boolean hasEnv();
    public BuildRequestFluent.EnvNested<A> addNewEnv();
    public BuildRequestFluent.EnvNested<A> addNewEnvLike(EnvVar item);
    public BuildRequestFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item);
    public BuildRequestFluent.EnvNested<A> editEnv(int index);
    public BuildRequestFluent.EnvNested<A> editFirstEnv();
    public BuildRequestFluent.EnvNested<A> editLastEnv();
    public BuildRequestFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom();
    public ObjectReference buildFrom();
    public A withFrom(ObjectReference from);
    public Boolean hasFrom();
    public BuildRequestFluent.FromNested<A> withNewFrom();
    public BuildRequestFluent.FromNested<A> withNewFromLike(ObjectReference item);
    public BuildRequestFluent.FromNested<A> editFrom();
    public BuildRequestFluent.FromNested<A> editOrNewFrom();
    public BuildRequestFluent.FromNested<A> editOrNewFromLike(ObjectReference item);
    public String getKind();
    public A withKind(String kind);
    public Boolean hasKind();
    public Long getLastVersion();
    public A withLastVersion(Long lastVersion);
    public Boolean hasLastVersion();
    public A withNewLastVersion(String arg1);
    public A withNewLastVersion(long arg1);
    
/**
 * This method has been deprecated, please use method buildMetadata instead.
 * @return The buildable object.
 */
@Deprecated public ObjectMeta getMetadata();
    public ObjectMeta buildMetadata();
    public A withMetadata(ObjectMeta metadata);
    public Boolean hasMetadata();
    public BuildRequestFluent.MetadataNested<A> withNewMetadata();
    public BuildRequestFluent.MetadataNested<A> withNewMetadataLike(ObjectMeta item);
    public BuildRequestFluent.MetadataNested<A> editMetadata();
    public BuildRequestFluent.MetadataNested<A> editOrNewMetadata();
    public BuildRequestFluent.MetadataNested<A> editOrNewMetadataLike(ObjectMeta item);
    
/**
 * This method has been deprecated, please use method buildRevision instead.
 * @return The buildable object.
 */
@Deprecated public SourceRevision getRevision();
    public SourceRevision buildRevision();
    public A withRevision(SourceRevision revision);
    public Boolean hasRevision();
    public BuildRequestFluent.RevisionNested<A> withNewRevision();
    public BuildRequestFluent.RevisionNested<A> withNewRevisionLike(SourceRevision item);
    public BuildRequestFluent.RevisionNested<A> editRevision();
    public BuildRequestFluent.RevisionNested<A> editOrNewRevision();
    public BuildRequestFluent.RevisionNested<A> editOrNewRevisionLike(SourceRevision item);
    
/**
 * This method has been deprecated, please use method buildSourceStrategyOptions instead.
 * @return The buildable object.
 */
@Deprecated public SourceStrategyOptions getSourceStrategyOptions();
    public SourceStrategyOptions buildSourceStrategyOptions();
    public A withSourceStrategyOptions(SourceStrategyOptions sourceStrategyOptions);
    public Boolean hasSourceStrategyOptions();
    public A withNewSourceStrategyOptions(Boolean incremental);
    public BuildRequestFluent.SourceStrategyOptionsNested<A> withNewSourceStrategyOptions();
    public BuildRequestFluent.SourceStrategyOptionsNested<A> withNewSourceStrategyOptionsLike(SourceStrategyOptions item);
    public BuildRequestFluent.SourceStrategyOptionsNested<A> editSourceStrategyOptions();
    public BuildRequestFluent.SourceStrategyOptionsNested<A> editOrNewSourceStrategyOptions();
    public BuildRequestFluent.SourceStrategyOptionsNested<A> editOrNewSourceStrategyOptionsLike(SourceStrategyOptions item);
    public A addToTriggeredBy(int index,BuildTriggerCause item);
    public A setToTriggeredBy(int index,BuildTriggerCause item);
    public A addToTriggeredBy(BuildTriggerCause... items);
    public A addAllToTriggeredBy(Collection<BuildTriggerCause> items);
    public A removeFromTriggeredBy(BuildTriggerCause... items);
    public A removeAllFromTriggeredBy(Collection<BuildTriggerCause> items);
    
/**
 * This method has been deprecated, please use method buildTriggeredBy instead.
 * @return The buildable object.
 */
@Deprecated public List<BuildTriggerCause> getTriggeredBy();
    public List<BuildTriggerCause> buildTriggeredBy();
    public BuildTriggerCause buildTriggeredBy(int index);
    public BuildTriggerCause buildFirstTriggeredBy();
    public BuildTriggerCause buildLastTriggeredBy();
    public BuildTriggerCause buildMatchingTriggeredBy(io.fabric8.kubernetes.api.builder.Predicate<BuildTriggerCauseBuilder> predicate);
    public A withTriggeredBy(List<BuildTriggerCause> triggeredBy);
    public A withTriggeredBy(BuildTriggerCause... triggeredBy);
    public Boolean hasTriggeredBy();
    public BuildRequestFluent.TriggeredByNested<A> addNewTriggeredBy();
    public BuildRequestFluent.TriggeredByNested<A> addNewTriggeredByLike(BuildTriggerCause item);
    public BuildRequestFluent.TriggeredByNested<A> setNewTriggeredByLike(int index,BuildTriggerCause item);
    public BuildRequestFluent.TriggeredByNested<A> editTriggeredBy(int index);
    public BuildRequestFluent.TriggeredByNested<A> editFirstTriggeredBy();
    public BuildRequestFluent.TriggeredByNested<A> editLastTriggeredBy();
    public BuildRequestFluent.TriggeredByNested<A> editMatchingTriggeredBy(io.fabric8.kubernetes.api.builder.Predicate<BuildTriggerCauseBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildTriggeredByImage instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getTriggeredByImage();
    public ObjectReference buildTriggeredByImage();
    public A withTriggeredByImage(ObjectReference triggeredByImage);
    public Boolean hasTriggeredByImage();
    public BuildRequestFluent.TriggeredByImageNested<A> withNewTriggeredByImage();
    public BuildRequestFluent.TriggeredByImageNested<A> withNewTriggeredByImageLike(ObjectReference item);
    public BuildRequestFluent.TriggeredByImageNested<A> editTriggeredByImage();
    public BuildRequestFluent.TriggeredByImageNested<A> editOrNewTriggeredByImage();
    public BuildRequestFluent.TriggeredByImageNested<A> editOrNewTriggeredByImageLike(ObjectReference item);

    public interface BinaryNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BinaryBuildSourceFluent<BuildRequestFluent.BinaryNested<N>>{

        
    public N and();    public N endBinary();
}
    public interface DockerStrategyOptionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,DockerStrategyOptionsFluent<BuildRequestFluent.DockerStrategyOptionsNested<N>>{

        
    public N and();    public N endDockerStrategyOptions();
}
    public interface EnvNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<BuildRequestFluent.EnvNested<N>>{

        
    public N and();    public N endEnv();
}
    public interface FromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<BuildRequestFluent.FromNested<N>>{

        
    public N and();    public N endFrom();
}
    public interface MetadataNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectMetaFluent<BuildRequestFluent.MetadataNested<N>>{

        
    public N and();    public N endMetadata();
}
    public interface RevisionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SourceRevisionFluent<BuildRequestFluent.RevisionNested<N>>{

        
    public N and();    public N endRevision();
}
    public interface SourceStrategyOptionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SourceStrategyOptionsFluent<BuildRequestFluent.SourceStrategyOptionsNested<N>>{

        
    public N and();    public N endSourceStrategyOptions();
}
    public interface TriggeredByNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildTriggerCauseFluent<BuildRequestFluent.TriggeredByNested<N>>{

        
    public N and();    public N endTriggeredBy();
}
    public interface TriggeredByImageNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<BuildRequestFluent.TriggeredByImageNested<N>>{

        
    public N and();    public N endTriggeredByImage();
}


}
