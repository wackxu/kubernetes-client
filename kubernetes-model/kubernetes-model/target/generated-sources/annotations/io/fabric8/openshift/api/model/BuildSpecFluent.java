package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.ResourceRequirementsBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.ResourceRequirementsFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface BuildSpecFluent<A extends BuildSpecFluent<A>> extends Fluent<A>{


    public Long getCompletionDeadlineSeconds();
    public A withCompletionDeadlineSeconds(Long completionDeadlineSeconds);
    public Boolean hasCompletionDeadlineSeconds();
    public A withNewCompletionDeadlineSeconds(String arg1);
    public A withNewCompletionDeadlineSeconds(long arg1);
    public A addToNodeSelector(String key,String value);
    public A addToNodeSelector(Map<String,String> map);
    public A removeFromNodeSelector(String key);
    public A removeFromNodeSelector(Map<String,String> map);
    public Map<String,String> getNodeSelector();
    public A withNodeSelector(Map<String,String> nodeSelector);
    public Boolean hasNodeSelector();
    
/**
 * This method has been deprecated, please use method buildOutput instead.
 * @return The buildable object.
 */
@Deprecated public BuildOutput getOutput();
    public BuildOutput buildOutput();
    public A withOutput(BuildOutput output);
    public Boolean hasOutput();
    public BuildSpecFluent.OutputNested<A> withNewOutput();
    public BuildSpecFluent.OutputNested<A> withNewOutputLike(BuildOutput item);
    public BuildSpecFluent.OutputNested<A> editOutput();
    public BuildSpecFluent.OutputNested<A> editOrNewOutput();
    public BuildSpecFluent.OutputNested<A> editOrNewOutputLike(BuildOutput item);
    
/**
 * This method has been deprecated, please use method buildPostCommit instead.
 * @return The buildable object.
 */
@Deprecated public BuildPostCommitSpec getPostCommit();
    public BuildPostCommitSpec buildPostCommit();
    public A withPostCommit(BuildPostCommitSpec postCommit);
    public Boolean hasPostCommit();
    public BuildSpecFluent.PostCommitNested<A> withNewPostCommit();
    public BuildSpecFluent.PostCommitNested<A> withNewPostCommitLike(BuildPostCommitSpec item);
    public BuildSpecFluent.PostCommitNested<A> editPostCommit();
    public BuildSpecFluent.PostCommitNested<A> editOrNewPostCommit();
    public BuildSpecFluent.PostCommitNested<A> editOrNewPostCommitLike(BuildPostCommitSpec item);
    
/**
 * This method has been deprecated, please use method buildResources instead.
 * @return The buildable object.
 */
@Deprecated public ResourceRequirements getResources();
    public ResourceRequirements buildResources();
    public A withResources(ResourceRequirements resources);
    public Boolean hasResources();
    public BuildSpecFluent.ResourcesNested<A> withNewResources();
    public BuildSpecFluent.ResourcesNested<A> withNewResourcesLike(ResourceRequirements item);
    public BuildSpecFluent.ResourcesNested<A> editResources();
    public BuildSpecFluent.ResourcesNested<A> editOrNewResources();
    public BuildSpecFluent.ResourcesNested<A> editOrNewResourcesLike(ResourceRequirements item);
    
/**
 * This method has been deprecated, please use method buildRevision instead.
 * @return The buildable object.
 */
@Deprecated public SourceRevision getRevision();
    public SourceRevision buildRevision();
    public A withRevision(SourceRevision revision);
    public Boolean hasRevision();
    public BuildSpecFluent.RevisionNested<A> withNewRevision();
    public BuildSpecFluent.RevisionNested<A> withNewRevisionLike(SourceRevision item);
    public BuildSpecFluent.RevisionNested<A> editRevision();
    public BuildSpecFluent.RevisionNested<A> editOrNewRevision();
    public BuildSpecFluent.RevisionNested<A> editOrNewRevisionLike(SourceRevision item);
    public String getServiceAccount();
    public A withServiceAccount(String serviceAccount);
    public Boolean hasServiceAccount();
    
/**
 * This method has been deprecated, please use method buildSource instead.
 * @return The buildable object.
 */
@Deprecated public BuildSource getSource();
    public BuildSource buildSource();
    public A withSource(BuildSource source);
    public Boolean hasSource();
    public BuildSpecFluent.SourceNested<A> withNewSource();
    public BuildSpecFluent.SourceNested<A> withNewSourceLike(BuildSource item);
    public BuildSpecFluent.SourceNested<A> editSource();
    public BuildSpecFluent.SourceNested<A> editOrNewSource();
    public BuildSpecFluent.SourceNested<A> editOrNewSourceLike(BuildSource item);
    
/**
 * This method has been deprecated, please use method buildStrategy instead.
 * @return The buildable object.
 */
@Deprecated public BuildStrategy getStrategy();
    public BuildStrategy buildStrategy();
    public A withStrategy(BuildStrategy strategy);
    public Boolean hasStrategy();
    public BuildSpecFluent.StrategyNested<A> withNewStrategy();
    public BuildSpecFluent.StrategyNested<A> withNewStrategyLike(BuildStrategy item);
    public BuildSpecFluent.StrategyNested<A> editStrategy();
    public BuildSpecFluent.StrategyNested<A> editOrNewStrategy();
    public BuildSpecFluent.StrategyNested<A> editOrNewStrategyLike(BuildStrategy item);
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
    public BuildSpecFluent.TriggeredByNested<A> addNewTriggeredBy();
    public BuildSpecFluent.TriggeredByNested<A> addNewTriggeredByLike(BuildTriggerCause item);
    public BuildSpecFluent.TriggeredByNested<A> setNewTriggeredByLike(int index,BuildTriggerCause item);
    public BuildSpecFluent.TriggeredByNested<A> editTriggeredBy(int index);
    public BuildSpecFluent.TriggeredByNested<A> editFirstTriggeredBy();
    public BuildSpecFluent.TriggeredByNested<A> editLastTriggeredBy();
    public BuildSpecFluent.TriggeredByNested<A> editMatchingTriggeredBy(io.fabric8.kubernetes.api.builder.Predicate<BuildTriggerCauseBuilder> predicate);

    public interface OutputNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildOutputFluent<BuildSpecFluent.OutputNested<N>>{

        
    public N and();    public N endOutput();
}
    public interface PostCommitNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildPostCommitSpecFluent<BuildSpecFluent.PostCommitNested<N>>{

        
    public N and();    public N endPostCommit();
}
    public interface ResourcesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceRequirementsFluent<BuildSpecFluent.ResourcesNested<N>>{

        
    public N and();    public N endResources();
}
    public interface RevisionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SourceRevisionFluent<BuildSpecFluent.RevisionNested<N>>{

        
    public N and();    public N endRevision();
}
    public interface SourceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildSourceFluent<BuildSpecFluent.SourceNested<N>>{

        
    public N and();    public N endSource();
}
    public interface StrategyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildStrategyFluent<BuildSpecFluent.StrategyNested<N>>{

        
    public N and();    public N endStrategy();
}
    public interface TriggeredByNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildTriggerCauseFluent<BuildSpecFluent.TriggeredByNested<N>>{

        
    public N and();    public N endTriggeredBy();
}


}
