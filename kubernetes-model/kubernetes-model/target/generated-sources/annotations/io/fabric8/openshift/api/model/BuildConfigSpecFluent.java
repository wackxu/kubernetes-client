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
import java.lang.Integer;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface BuildConfigSpecFluent<A extends BuildConfigSpecFluent<A>> extends Fluent<A>{


    public Long getCompletionDeadlineSeconds();
    public A withCompletionDeadlineSeconds(Long completionDeadlineSeconds);
    public Boolean hasCompletionDeadlineSeconds();
    public A withNewCompletionDeadlineSeconds(String arg1);
    public A withNewCompletionDeadlineSeconds(long arg1);
    public Integer getFailedBuildsHistoryLimit();
    public A withFailedBuildsHistoryLimit(Integer failedBuildsHistoryLimit);
    public Boolean hasFailedBuildsHistoryLimit();
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
    public BuildConfigSpecFluent.OutputNested<A> withNewOutput();
    public BuildConfigSpecFluent.OutputNested<A> withNewOutputLike(BuildOutput item);
    public BuildConfigSpecFluent.OutputNested<A> editOutput();
    public BuildConfigSpecFluent.OutputNested<A> editOrNewOutput();
    public BuildConfigSpecFluent.OutputNested<A> editOrNewOutputLike(BuildOutput item);
    
/**
 * This method has been deprecated, please use method buildPostCommit instead.
 * @return The buildable object.
 */
@Deprecated public BuildPostCommitSpec getPostCommit();
    public BuildPostCommitSpec buildPostCommit();
    public A withPostCommit(BuildPostCommitSpec postCommit);
    public Boolean hasPostCommit();
    public BuildConfigSpecFluent.PostCommitNested<A> withNewPostCommit();
    public BuildConfigSpecFluent.PostCommitNested<A> withNewPostCommitLike(BuildPostCommitSpec item);
    public BuildConfigSpecFluent.PostCommitNested<A> editPostCommit();
    public BuildConfigSpecFluent.PostCommitNested<A> editOrNewPostCommit();
    public BuildConfigSpecFluent.PostCommitNested<A> editOrNewPostCommitLike(BuildPostCommitSpec item);
    
/**
 * This method has been deprecated, please use method buildResources instead.
 * @return The buildable object.
 */
@Deprecated public ResourceRequirements getResources();
    public ResourceRequirements buildResources();
    public A withResources(ResourceRequirements resources);
    public Boolean hasResources();
    public BuildConfigSpecFluent.ResourcesNested<A> withNewResources();
    public BuildConfigSpecFluent.ResourcesNested<A> withNewResourcesLike(ResourceRequirements item);
    public BuildConfigSpecFluent.ResourcesNested<A> editResources();
    public BuildConfigSpecFluent.ResourcesNested<A> editOrNewResources();
    public BuildConfigSpecFluent.ResourcesNested<A> editOrNewResourcesLike(ResourceRequirements item);
    
/**
 * This method has been deprecated, please use method buildRevision instead.
 * @return The buildable object.
 */
@Deprecated public SourceRevision getRevision();
    public SourceRevision buildRevision();
    public A withRevision(SourceRevision revision);
    public Boolean hasRevision();
    public BuildConfigSpecFluent.RevisionNested<A> withNewRevision();
    public BuildConfigSpecFluent.RevisionNested<A> withNewRevisionLike(SourceRevision item);
    public BuildConfigSpecFluent.RevisionNested<A> editRevision();
    public BuildConfigSpecFluent.RevisionNested<A> editOrNewRevision();
    public BuildConfigSpecFluent.RevisionNested<A> editOrNewRevisionLike(SourceRevision item);
    public String getRunPolicy();
    public A withRunPolicy(String runPolicy);
    public Boolean hasRunPolicy();
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
    public BuildConfigSpecFluent.SourceNested<A> withNewSource();
    public BuildConfigSpecFluent.SourceNested<A> withNewSourceLike(BuildSource item);
    public BuildConfigSpecFluent.SourceNested<A> editSource();
    public BuildConfigSpecFluent.SourceNested<A> editOrNewSource();
    public BuildConfigSpecFluent.SourceNested<A> editOrNewSourceLike(BuildSource item);
    
/**
 * This method has been deprecated, please use method buildStrategy instead.
 * @return The buildable object.
 */
@Deprecated public BuildStrategy getStrategy();
    public BuildStrategy buildStrategy();
    public A withStrategy(BuildStrategy strategy);
    public Boolean hasStrategy();
    public BuildConfigSpecFluent.StrategyNested<A> withNewStrategy();
    public BuildConfigSpecFluent.StrategyNested<A> withNewStrategyLike(BuildStrategy item);
    public BuildConfigSpecFluent.StrategyNested<A> editStrategy();
    public BuildConfigSpecFluent.StrategyNested<A> editOrNewStrategy();
    public BuildConfigSpecFluent.StrategyNested<A> editOrNewStrategyLike(BuildStrategy item);
    public Integer getSuccessfulBuildsHistoryLimit();
    public A withSuccessfulBuildsHistoryLimit(Integer successfulBuildsHistoryLimit);
    public Boolean hasSuccessfulBuildsHistoryLimit();
    public A addToTriggers(int index,BuildTriggerPolicy item);
    public A setToTriggers(int index,BuildTriggerPolicy item);
    public A addToTriggers(BuildTriggerPolicy... items);
    public A addAllToTriggers(Collection<BuildTriggerPolicy> items);
    public A removeFromTriggers(BuildTriggerPolicy... items);
    public A removeAllFromTriggers(Collection<BuildTriggerPolicy> items);
    
/**
 * This method has been deprecated, please use method buildTriggers instead.
 * @return The buildable object.
 */
@Deprecated public List<BuildTriggerPolicy> getTriggers();
    public List<BuildTriggerPolicy> buildTriggers();
    public BuildTriggerPolicy buildTrigger(int index);
    public BuildTriggerPolicy buildFirstTrigger();
    public BuildTriggerPolicy buildLastTrigger();
    public BuildTriggerPolicy buildMatchingTrigger(io.fabric8.kubernetes.api.builder.Predicate<BuildTriggerPolicyBuilder> predicate);
    public A withTriggers(List<BuildTriggerPolicy> triggers);
    public A withTriggers(BuildTriggerPolicy... triggers);
    public Boolean hasTriggers();
    public BuildConfigSpecFluent.TriggersNested<A> addNewTrigger();
    public BuildConfigSpecFluent.TriggersNested<A> addNewTriggerLike(BuildTriggerPolicy item);
    public BuildConfigSpecFluent.TriggersNested<A> setNewTriggerLike(int index,BuildTriggerPolicy item);
    public BuildConfigSpecFluent.TriggersNested<A> editTrigger(int index);
    public BuildConfigSpecFluent.TriggersNested<A> editFirstTrigger();
    public BuildConfigSpecFluent.TriggersNested<A> editLastTrigger();
    public BuildConfigSpecFluent.TriggersNested<A> editMatchingTrigger(io.fabric8.kubernetes.api.builder.Predicate<BuildTriggerPolicyBuilder> predicate);

    public interface OutputNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildOutputFluent<BuildConfigSpecFluent.OutputNested<N>>{

        
    public N and();    public N endOutput();
}
    public interface PostCommitNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildPostCommitSpecFluent<BuildConfigSpecFluent.PostCommitNested<N>>{

        
    public N and();    public N endPostCommit();
}
    public interface ResourcesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ResourceRequirementsFluent<BuildConfigSpecFluent.ResourcesNested<N>>{

        
    public N and();    public N endResources();
}
    public interface RevisionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SourceRevisionFluent<BuildConfigSpecFluent.RevisionNested<N>>{

        
    public N and();    public N endRevision();
}
    public interface SourceNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildSourceFluent<BuildConfigSpecFluent.SourceNested<N>>{

        
    public N and();    public N endSource();
}
    public interface StrategyNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildStrategyFluent<BuildConfigSpecFluent.StrategyNested<N>>{

        
    public N and();    public N endStrategy();
}
    public interface TriggersNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildTriggerPolicyFluent<BuildConfigSpecFluent.TriggersNested<N>>{

        
    public N and();    public N endTrigger();
}


}
