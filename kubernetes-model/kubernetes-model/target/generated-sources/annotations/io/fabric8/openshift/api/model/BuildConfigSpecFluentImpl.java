package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ResourceRequirementsFluentImpl;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;
import io.fabric8.kubernetes.api.model.ResourceRequirementsBuilder;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import java.lang.Integer;

public class BuildConfigSpecFluentImpl<A extends BuildConfigSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildConfigSpecFluent<A>{

    private Long completionDeadlineSeconds;
    private Integer failedBuildsHistoryLimit;
    private Map<String,String> nodeSelector;
    private BuildOutputBuilder output;
    private BuildPostCommitSpecBuilder postCommit;
    private ResourceRequirementsBuilder resources;
    private SourceRevisionBuilder revision;
    private String runPolicy;
    private String serviceAccount;
    private BuildSourceBuilder source;
    private BuildStrategyBuilder strategy;
    private Integer successfulBuildsHistoryLimit;
    private List<BuildTriggerPolicyBuilder> triggers;

    public BuildConfigSpecFluentImpl(){
    }
    public BuildConfigSpecFluentImpl(BuildConfigSpec instance){
            this.withCompletionDeadlineSeconds(instance.getCompletionDeadlineSeconds()); 
            this.withFailedBuildsHistoryLimit(instance.getFailedBuildsHistoryLimit()); 
            this.withNodeSelector(instance.getNodeSelector()); 
            this.withOutput(instance.getOutput()); 
            this.withPostCommit(instance.getPostCommit()); 
            this.withResources(instance.getResources()); 
            this.withRevision(instance.getRevision()); 
            this.withRunPolicy(instance.getRunPolicy()); 
            this.withServiceAccount(instance.getServiceAccount()); 
            this.withSource(instance.getSource()); 
            this.withStrategy(instance.getStrategy()); 
            this.withSuccessfulBuildsHistoryLimit(instance.getSuccessfulBuildsHistoryLimit()); 
            this.withTriggers(instance.getTriggers()); 
    }

    public Long getCompletionDeadlineSeconds(){
            return this.completionDeadlineSeconds;
    }

    public A withCompletionDeadlineSeconds(Long completionDeadlineSeconds){
            this.completionDeadlineSeconds=completionDeadlineSeconds; return (A) this;
    }

    public Boolean hasCompletionDeadlineSeconds(){
            return this.completionDeadlineSeconds != null;
    }

    public A withNewCompletionDeadlineSeconds(String arg1){
            return (A)withCompletionDeadlineSeconds(new Long(arg1));
    }

    public A withNewCompletionDeadlineSeconds(long arg1){
            return (A)withCompletionDeadlineSeconds(new Long(arg1));
    }

    public Integer getFailedBuildsHistoryLimit(){
            return this.failedBuildsHistoryLimit;
    }

    public A withFailedBuildsHistoryLimit(Integer failedBuildsHistoryLimit){
            this.failedBuildsHistoryLimit=failedBuildsHistoryLimit; return (A) this;
    }

    public Boolean hasFailedBuildsHistoryLimit(){
            return this.failedBuildsHistoryLimit != null;
    }

    public A addToNodeSelector(String key,String value){
            if(this.nodeSelector == null && key != null && value != null) { this.nodeSelector = new LinkedHashMap<String,String>(); }
            if(key != null && value != null) {this.nodeSelector.put(key, value);} return (A)this;
    }

    public A addToNodeSelector(Map<String,String> map){
            if(this.nodeSelector == null && map != null) { this.nodeSelector = new LinkedHashMap<String,String>(); }
            if(map != null) { this.nodeSelector.putAll(map);} return (A)this;
    }

    public A removeFromNodeSelector(String key){
            if(this.nodeSelector == null) { return (A) this; }
            if(key != null && this.nodeSelector != null) {this.nodeSelector.remove(key);} return (A)this;
    }

    public A removeFromNodeSelector(Map<String,String> map){
            if(this.nodeSelector == null) { return (A) this; }
            if(map != null) { for(Object key : map.keySet()) {if (this.nodeSelector != null){this.nodeSelector.remove(key);}}} return (A)this;
    }

    public Map<String,String> getNodeSelector(){
            return this.nodeSelector;
    }

    public A withNodeSelector(Map<String,String> nodeSelector){
            if (nodeSelector == null) { this.nodeSelector =  new LinkedHashMap<String,String>();} else {this.nodeSelector = new LinkedHashMap<String,String>(nodeSelector);} return (A) this;
    }

    public Boolean hasNodeSelector(){
            return this.nodeSelector != null;
    }

    
/**
 * This method has been deprecated, please use method buildOutput instead.
 * @return The buildable object.
 */
@Deprecated public BuildOutput getOutput(){
            return this.output!=null?this.output.build():null;
    }

    public BuildOutput buildOutput(){
            return this.output!=null?this.output.build():null;
    }

    public A withOutput(BuildOutput output){
            _visitables.remove(this.output);
            if (output!=null){ this.output= new BuildOutputBuilder(output); _visitables.add(this.output);} return (A) this;
    }

    public Boolean hasOutput(){
            return this.output != null;
    }

    public BuildConfigSpecFluent.OutputNested<A> withNewOutput(){
            return new OutputNestedImpl();
    }

    public BuildConfigSpecFluent.OutputNested<A> withNewOutputLike(BuildOutput item){
            return new OutputNestedImpl(item);
    }

    public BuildConfigSpecFluent.OutputNested<A> editOutput(){
            return withNewOutputLike(getOutput());
    }

    public BuildConfigSpecFluent.OutputNested<A> editOrNewOutput(){
            return withNewOutputLike(getOutput() != null ? getOutput(): new BuildOutputBuilder().build());
    }

    public BuildConfigSpecFluent.OutputNested<A> editOrNewOutputLike(BuildOutput item){
            return withNewOutputLike(getOutput() != null ? getOutput(): item);
    }

    
/**
 * This method has been deprecated, please use method buildPostCommit instead.
 * @return The buildable object.
 */
@Deprecated public BuildPostCommitSpec getPostCommit(){
            return this.postCommit!=null?this.postCommit.build():null;
    }

    public BuildPostCommitSpec buildPostCommit(){
            return this.postCommit!=null?this.postCommit.build():null;
    }

    public A withPostCommit(BuildPostCommitSpec postCommit){
            _visitables.remove(this.postCommit);
            if (postCommit!=null){ this.postCommit= new BuildPostCommitSpecBuilder(postCommit); _visitables.add(this.postCommit);} return (A) this;
    }

    public Boolean hasPostCommit(){
            return this.postCommit != null;
    }

    public BuildConfigSpecFluent.PostCommitNested<A> withNewPostCommit(){
            return new PostCommitNestedImpl();
    }

    public BuildConfigSpecFluent.PostCommitNested<A> withNewPostCommitLike(BuildPostCommitSpec item){
            return new PostCommitNestedImpl(item);
    }

    public BuildConfigSpecFluent.PostCommitNested<A> editPostCommit(){
            return withNewPostCommitLike(getPostCommit());
    }

    public BuildConfigSpecFluent.PostCommitNested<A> editOrNewPostCommit(){
            return withNewPostCommitLike(getPostCommit() != null ? getPostCommit(): new BuildPostCommitSpecBuilder().build());
    }

    public BuildConfigSpecFluent.PostCommitNested<A> editOrNewPostCommitLike(BuildPostCommitSpec item){
            return withNewPostCommitLike(getPostCommit() != null ? getPostCommit(): item);
    }

    
/**
 * This method has been deprecated, please use method buildResources instead.
 * @return The buildable object.
 */
@Deprecated public ResourceRequirements getResources(){
            return this.resources!=null?this.resources.build():null;
    }

    public ResourceRequirements buildResources(){
            return this.resources!=null?this.resources.build():null;
    }

    public A withResources(ResourceRequirements resources){
            _visitables.remove(this.resources);
            if (resources!=null){ this.resources= new ResourceRequirementsBuilder(resources); _visitables.add(this.resources);} return (A) this;
    }

    public Boolean hasResources(){
            return this.resources != null;
    }

    public BuildConfigSpecFluent.ResourcesNested<A> withNewResources(){
            return new ResourcesNestedImpl();
    }

    public BuildConfigSpecFluent.ResourcesNested<A> withNewResourcesLike(ResourceRequirements item){
            return new ResourcesNestedImpl(item);
    }

    public BuildConfigSpecFluent.ResourcesNested<A> editResources(){
            return withNewResourcesLike(getResources());
    }

    public BuildConfigSpecFluent.ResourcesNested<A> editOrNewResources(){
            return withNewResourcesLike(getResources() != null ? getResources(): new ResourceRequirementsBuilder().build());
    }

    public BuildConfigSpecFluent.ResourcesNested<A> editOrNewResourcesLike(ResourceRequirements item){
            return withNewResourcesLike(getResources() != null ? getResources(): item);
    }

    
/**
 * This method has been deprecated, please use method buildRevision instead.
 * @return The buildable object.
 */
@Deprecated public SourceRevision getRevision(){
            return this.revision!=null?this.revision.build():null;
    }

    public SourceRevision buildRevision(){
            return this.revision!=null?this.revision.build():null;
    }

    public A withRevision(SourceRevision revision){
            _visitables.remove(this.revision);
            if (revision!=null){ this.revision= new SourceRevisionBuilder(revision); _visitables.add(this.revision);} return (A) this;
    }

    public Boolean hasRevision(){
            return this.revision != null;
    }

    public BuildConfigSpecFluent.RevisionNested<A> withNewRevision(){
            return new RevisionNestedImpl();
    }

    public BuildConfigSpecFluent.RevisionNested<A> withNewRevisionLike(SourceRevision item){
            return new RevisionNestedImpl(item);
    }

    public BuildConfigSpecFluent.RevisionNested<A> editRevision(){
            return withNewRevisionLike(getRevision());
    }

    public BuildConfigSpecFluent.RevisionNested<A> editOrNewRevision(){
            return withNewRevisionLike(getRevision() != null ? getRevision(): new SourceRevisionBuilder().build());
    }

    public BuildConfigSpecFluent.RevisionNested<A> editOrNewRevisionLike(SourceRevision item){
            return withNewRevisionLike(getRevision() != null ? getRevision(): item);
    }

    public String getRunPolicy(){
            return this.runPolicy;
    }

    public A withRunPolicy(String runPolicy){
            this.runPolicy=runPolicy; return (A) this;
    }

    public Boolean hasRunPolicy(){
            return this.runPolicy != null;
    }

    public String getServiceAccount(){
            return this.serviceAccount;
    }

    public A withServiceAccount(String serviceAccount){
            this.serviceAccount=serviceAccount; return (A) this;
    }

    public Boolean hasServiceAccount(){
            return this.serviceAccount != null;
    }

    
/**
 * This method has been deprecated, please use method buildSource instead.
 * @return The buildable object.
 */
@Deprecated public BuildSource getSource(){
            return this.source!=null?this.source.build():null;
    }

    public BuildSource buildSource(){
            return this.source!=null?this.source.build():null;
    }

    public A withSource(BuildSource source){
            _visitables.remove(this.source);
            if (source!=null){ this.source= new BuildSourceBuilder(source); _visitables.add(this.source);} return (A) this;
    }

    public Boolean hasSource(){
            return this.source != null;
    }

    public BuildConfigSpecFluent.SourceNested<A> withNewSource(){
            return new SourceNestedImpl();
    }

    public BuildConfigSpecFluent.SourceNested<A> withNewSourceLike(BuildSource item){
            return new SourceNestedImpl(item);
    }

    public BuildConfigSpecFluent.SourceNested<A> editSource(){
            return withNewSourceLike(getSource());
    }

    public BuildConfigSpecFluent.SourceNested<A> editOrNewSource(){
            return withNewSourceLike(getSource() != null ? getSource(): new BuildSourceBuilder().build());
    }

    public BuildConfigSpecFluent.SourceNested<A> editOrNewSourceLike(BuildSource item){
            return withNewSourceLike(getSource() != null ? getSource(): item);
    }

    
/**
 * This method has been deprecated, please use method buildStrategy instead.
 * @return The buildable object.
 */
@Deprecated public BuildStrategy getStrategy(){
            return this.strategy!=null?this.strategy.build():null;
    }

    public BuildStrategy buildStrategy(){
            return this.strategy!=null?this.strategy.build():null;
    }

    public A withStrategy(BuildStrategy strategy){
            _visitables.remove(this.strategy);
            if (strategy!=null){ this.strategy= new BuildStrategyBuilder(strategy); _visitables.add(this.strategy);} return (A) this;
    }

    public Boolean hasStrategy(){
            return this.strategy != null;
    }

    public BuildConfigSpecFluent.StrategyNested<A> withNewStrategy(){
            return new StrategyNestedImpl();
    }

    public BuildConfigSpecFluent.StrategyNested<A> withNewStrategyLike(BuildStrategy item){
            return new StrategyNestedImpl(item);
    }

    public BuildConfigSpecFluent.StrategyNested<A> editStrategy(){
            return withNewStrategyLike(getStrategy());
    }

    public BuildConfigSpecFluent.StrategyNested<A> editOrNewStrategy(){
            return withNewStrategyLike(getStrategy() != null ? getStrategy(): new BuildStrategyBuilder().build());
    }

    public BuildConfigSpecFluent.StrategyNested<A> editOrNewStrategyLike(BuildStrategy item){
            return withNewStrategyLike(getStrategy() != null ? getStrategy(): item);
    }

    public Integer getSuccessfulBuildsHistoryLimit(){
            return this.successfulBuildsHistoryLimit;
    }

    public A withSuccessfulBuildsHistoryLimit(Integer successfulBuildsHistoryLimit){
            this.successfulBuildsHistoryLimit=successfulBuildsHistoryLimit; return (A) this;
    }

    public Boolean hasSuccessfulBuildsHistoryLimit(){
            return this.successfulBuildsHistoryLimit != null;
    }

    public A addToTriggers(int index,BuildTriggerPolicy item){
            if (this.triggers == null) {this.triggers = new ArrayList<BuildTriggerPolicyBuilder>();}
            BuildTriggerPolicyBuilder builder = new BuildTriggerPolicyBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.triggers.add(index >= 0 ? index : triggers.size(), builder); return (A)this;
    }

    public A setToTriggers(int index,BuildTriggerPolicy item){
            if (this.triggers == null) {this.triggers = new ArrayList<BuildTriggerPolicyBuilder>();}
            BuildTriggerPolicyBuilder builder = new BuildTriggerPolicyBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= triggers.size()) { triggers.add(builder); } else { triggers.set(index, builder);}
             return (A)this;
    }

    public A addToTriggers(BuildTriggerPolicy... items){
            if (this.triggers == null) {this.triggers = new ArrayList<BuildTriggerPolicyBuilder>();}
            for (BuildTriggerPolicy item : items) {BuildTriggerPolicyBuilder builder = new BuildTriggerPolicyBuilder(item);_visitables.add(builder);this.triggers.add(builder);} return (A)this;
    }

    public A addAllToTriggers(Collection<BuildTriggerPolicy> items){
            if (this.triggers == null) {this.triggers = new ArrayList<BuildTriggerPolicyBuilder>();}
            for (BuildTriggerPolicy item : items) {BuildTriggerPolicyBuilder builder = new BuildTriggerPolicyBuilder(item);_visitables.add(builder);this.triggers.add(builder);} return (A)this;
    }

    public A removeFromTriggers(BuildTriggerPolicy... items){
            for (BuildTriggerPolicy item : items) {BuildTriggerPolicyBuilder builder = new BuildTriggerPolicyBuilder(item);_visitables.remove(builder);if (this.triggers != null) {this.triggers.remove(builder);}} return (A)this;
    }

    public A removeAllFromTriggers(Collection<BuildTriggerPolicy> items){
            for (BuildTriggerPolicy item : items) {BuildTriggerPolicyBuilder builder = new BuildTriggerPolicyBuilder(item);_visitables.remove(builder);if (this.triggers != null) {this.triggers.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildTriggers instead.
 * @return The buildable object.
 */
@Deprecated public List<BuildTriggerPolicy> getTriggers(){
            return build(triggers);
    }

    public List<BuildTriggerPolicy> buildTriggers(){
            return build(triggers);
    }

    public BuildTriggerPolicy buildTrigger(int index){
            return this.triggers.get(index).build();
    }

    public BuildTriggerPolicy buildFirstTrigger(){
            return this.triggers.get(0).build();
    }

    public BuildTriggerPolicy buildLastTrigger(){
            return this.triggers.get(triggers.size() - 1).build();
    }

    public BuildTriggerPolicy buildMatchingTrigger(io.fabric8.kubernetes.api.builder.Predicate<BuildTriggerPolicyBuilder> predicate){
            for (BuildTriggerPolicyBuilder item: triggers) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withTriggers(List<BuildTriggerPolicy> triggers){
            if (this.triggers != null) { _visitables.removeAll(this.triggers);}
            if (triggers != null) {this.triggers = new ArrayList<BuildTriggerPolicyBuilder>(); for (BuildTriggerPolicy item : triggers){this.addToTriggers(item);}} else { this.triggers = new ArrayList<BuildTriggerPolicyBuilder>();} return (A) this;
    }

    public A withTriggers(BuildTriggerPolicy... triggers){
            if (this.triggers != null) {this.triggers.clear();}
            if (triggers != null) {for (BuildTriggerPolicy item :triggers){ this.addToTriggers(item);}} return (A) this;
    }

    public Boolean hasTriggers(){
            return triggers != null && !triggers.isEmpty();
    }

    public BuildConfigSpecFluent.TriggersNested<A> addNewTrigger(){
            return new TriggersNestedImpl();
    }

    public BuildConfigSpecFluent.TriggersNested<A> addNewTriggerLike(BuildTriggerPolicy item){
            return new TriggersNestedImpl(-1, item);
    }

    public BuildConfigSpecFluent.TriggersNested<A> setNewTriggerLike(int index,BuildTriggerPolicy item){
            return new TriggersNestedImpl(index, item);
    }

    public BuildConfigSpecFluent.TriggersNested<A> editTrigger(int index){
            if (triggers.size() <= index) throw new RuntimeException("Can't edit triggers. Index exceeds size.");
            return setNewTriggerLike(index, buildTrigger(index));
    }

    public BuildConfigSpecFluent.TriggersNested<A> editFirstTrigger(){
            if (triggers.size() == 0) throw new RuntimeException("Can't edit first triggers. The list is empty.");
            return setNewTriggerLike(0, buildTrigger(0));
    }

    public BuildConfigSpecFluent.TriggersNested<A> editLastTrigger(){
            int index = triggers.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last triggers. The list is empty.");
            return setNewTriggerLike(index, buildTrigger(index));
    }

    public BuildConfigSpecFluent.TriggersNested<A> editMatchingTrigger(io.fabric8.kubernetes.api.builder.Predicate<BuildTriggerPolicyBuilder> predicate){
            int index = -1;
            for (int i=0;i<triggers.size();i++) { 
            if (predicate.apply(triggers.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching triggers. No match found.");
            return setNewTriggerLike(index, buildTrigger(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildConfigSpecFluentImpl that = (BuildConfigSpecFluentImpl) o;
            if (completionDeadlineSeconds != null ? !completionDeadlineSeconds.equals(that.completionDeadlineSeconds) :that.completionDeadlineSeconds != null) return false;
            if (failedBuildsHistoryLimit != null ? !failedBuildsHistoryLimit.equals(that.failedBuildsHistoryLimit) :that.failedBuildsHistoryLimit != null) return false;
            if (nodeSelector != null ? !nodeSelector.equals(that.nodeSelector) :that.nodeSelector != null) return false;
            if (output != null ? !output.equals(that.output) :that.output != null) return false;
            if (postCommit != null ? !postCommit.equals(that.postCommit) :that.postCommit != null) return false;
            if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
            if (revision != null ? !revision.equals(that.revision) :that.revision != null) return false;
            if (runPolicy != null ? !runPolicy.equals(that.runPolicy) :that.runPolicy != null) return false;
            if (serviceAccount != null ? !serviceAccount.equals(that.serviceAccount) :that.serviceAccount != null) return false;
            if (source != null ? !source.equals(that.source) :that.source != null) return false;
            if (strategy != null ? !strategy.equals(that.strategy) :that.strategy != null) return false;
            if (successfulBuildsHistoryLimit != null ? !successfulBuildsHistoryLimit.equals(that.successfulBuildsHistoryLimit) :that.successfulBuildsHistoryLimit != null) return false;
            if (triggers != null ? !triggers.equals(that.triggers) :that.triggers != null) return false;
            return true;
    }


    public class OutputNestedImpl<N> extends BuildOutputFluentImpl<BuildConfigSpecFluent.OutputNested<N>> implements BuildConfigSpecFluent.OutputNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildOutputBuilder builder;
    
            OutputNestedImpl(BuildOutput item){
                    this.builder = new BuildOutputBuilder(this, item);
            }
            OutputNestedImpl(){
                    this.builder = new BuildOutputBuilder(this);
            }
    
    public N and(){
            return (N) BuildConfigSpecFluentImpl.this.withOutput(builder.build());
    }
    public N endOutput(){
            return and();
    }

}
    public class PostCommitNestedImpl<N> extends BuildPostCommitSpecFluentImpl<BuildConfigSpecFluent.PostCommitNested<N>> implements BuildConfigSpecFluent.PostCommitNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildPostCommitSpecBuilder builder;
    
            PostCommitNestedImpl(BuildPostCommitSpec item){
                    this.builder = new BuildPostCommitSpecBuilder(this, item);
            }
            PostCommitNestedImpl(){
                    this.builder = new BuildPostCommitSpecBuilder(this);
            }
    
    public N and(){
            return (N) BuildConfigSpecFluentImpl.this.withPostCommit(builder.build());
    }
    public N endPostCommit(){
            return and();
    }

}
    public class ResourcesNestedImpl<N> extends ResourceRequirementsFluentImpl<BuildConfigSpecFluent.ResourcesNested<N>> implements BuildConfigSpecFluent.ResourcesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceRequirementsBuilder builder;
    
            ResourcesNestedImpl(ResourceRequirements item){
                    this.builder = new ResourceRequirementsBuilder(this, item);
            }
            ResourcesNestedImpl(){
                    this.builder = new ResourceRequirementsBuilder(this);
            }
    
    public N and(){
            return (N) BuildConfigSpecFluentImpl.this.withResources(builder.build());
    }
    public N endResources(){
            return and();
    }

}
    public class RevisionNestedImpl<N> extends SourceRevisionFluentImpl<BuildConfigSpecFluent.RevisionNested<N>> implements BuildConfigSpecFluent.RevisionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SourceRevisionBuilder builder;
    
            RevisionNestedImpl(SourceRevision item){
                    this.builder = new SourceRevisionBuilder(this, item);
            }
            RevisionNestedImpl(){
                    this.builder = new SourceRevisionBuilder(this);
            }
    
    public N and(){
            return (N) BuildConfigSpecFluentImpl.this.withRevision(builder.build());
    }
    public N endRevision(){
            return and();
    }

}
    public class SourceNestedImpl<N> extends BuildSourceFluentImpl<BuildConfigSpecFluent.SourceNested<N>> implements BuildConfigSpecFluent.SourceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildSourceBuilder builder;
    
            SourceNestedImpl(BuildSource item){
                    this.builder = new BuildSourceBuilder(this, item);
            }
            SourceNestedImpl(){
                    this.builder = new BuildSourceBuilder(this);
            }
    
    public N and(){
            return (N) BuildConfigSpecFluentImpl.this.withSource(builder.build());
    }
    public N endSource(){
            return and();
    }

}
    public class StrategyNestedImpl<N> extends BuildStrategyFluentImpl<BuildConfigSpecFluent.StrategyNested<N>> implements BuildConfigSpecFluent.StrategyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildStrategyBuilder builder;
    
            StrategyNestedImpl(BuildStrategy item){
                    this.builder = new BuildStrategyBuilder(this, item);
            }
            StrategyNestedImpl(){
                    this.builder = new BuildStrategyBuilder(this);
            }
    
    public N and(){
            return (N) BuildConfigSpecFluentImpl.this.withStrategy(builder.build());
    }
    public N endStrategy(){
            return and();
    }

}
    public class TriggersNestedImpl<N> extends BuildTriggerPolicyFluentImpl<BuildConfigSpecFluent.TriggersNested<N>> implements BuildConfigSpecFluent.TriggersNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildTriggerPolicyBuilder builder;
        private final int index;
    
            TriggersNestedImpl(int index,BuildTriggerPolicy item){
                    this.index = index;
                    this.builder = new BuildTriggerPolicyBuilder(this, item);
            }
            TriggersNestedImpl(){
                    this.index = -1;
                    this.builder = new BuildTriggerPolicyBuilder(this);
            }
    
    public N and(){
            return (N) BuildConfigSpecFluentImpl.this.setToTriggers(index, builder.build());
    }
    public N endTrigger(){
            return and();
    }

}


}
