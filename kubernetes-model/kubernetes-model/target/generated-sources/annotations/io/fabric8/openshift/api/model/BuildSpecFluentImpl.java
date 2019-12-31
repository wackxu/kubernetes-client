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

public class BuildSpecFluentImpl<A extends BuildSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildSpecFluent<A>{

    private Long completionDeadlineSeconds;
    private Map<String,String> nodeSelector;
    private BuildOutputBuilder output;
    private BuildPostCommitSpecBuilder postCommit;
    private ResourceRequirementsBuilder resources;
    private SourceRevisionBuilder revision;
    private String serviceAccount;
    private BuildSourceBuilder source;
    private BuildStrategyBuilder strategy;
    private List<BuildTriggerCauseBuilder> triggeredBy;

    public BuildSpecFluentImpl(){
    }
    public BuildSpecFluentImpl(BuildSpec instance){
            this.withCompletionDeadlineSeconds(instance.getCompletionDeadlineSeconds()); 
            this.withNodeSelector(instance.getNodeSelector()); 
            this.withOutput(instance.getOutput()); 
            this.withPostCommit(instance.getPostCommit()); 
            this.withResources(instance.getResources()); 
            this.withRevision(instance.getRevision()); 
            this.withServiceAccount(instance.getServiceAccount()); 
            this.withSource(instance.getSource()); 
            this.withStrategy(instance.getStrategy()); 
            this.withTriggeredBy(instance.getTriggeredBy()); 
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

    public BuildSpecFluent.OutputNested<A> withNewOutput(){
            return new OutputNestedImpl();
    }

    public BuildSpecFluent.OutputNested<A> withNewOutputLike(BuildOutput item){
            return new OutputNestedImpl(item);
    }

    public BuildSpecFluent.OutputNested<A> editOutput(){
            return withNewOutputLike(getOutput());
    }

    public BuildSpecFluent.OutputNested<A> editOrNewOutput(){
            return withNewOutputLike(getOutput() != null ? getOutput(): new BuildOutputBuilder().build());
    }

    public BuildSpecFluent.OutputNested<A> editOrNewOutputLike(BuildOutput item){
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

    public BuildSpecFluent.PostCommitNested<A> withNewPostCommit(){
            return new PostCommitNestedImpl();
    }

    public BuildSpecFluent.PostCommitNested<A> withNewPostCommitLike(BuildPostCommitSpec item){
            return new PostCommitNestedImpl(item);
    }

    public BuildSpecFluent.PostCommitNested<A> editPostCommit(){
            return withNewPostCommitLike(getPostCommit());
    }

    public BuildSpecFluent.PostCommitNested<A> editOrNewPostCommit(){
            return withNewPostCommitLike(getPostCommit() != null ? getPostCommit(): new BuildPostCommitSpecBuilder().build());
    }

    public BuildSpecFluent.PostCommitNested<A> editOrNewPostCommitLike(BuildPostCommitSpec item){
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

    public BuildSpecFluent.ResourcesNested<A> withNewResources(){
            return new ResourcesNestedImpl();
    }

    public BuildSpecFluent.ResourcesNested<A> withNewResourcesLike(ResourceRequirements item){
            return new ResourcesNestedImpl(item);
    }

    public BuildSpecFluent.ResourcesNested<A> editResources(){
            return withNewResourcesLike(getResources());
    }

    public BuildSpecFluent.ResourcesNested<A> editOrNewResources(){
            return withNewResourcesLike(getResources() != null ? getResources(): new ResourceRequirementsBuilder().build());
    }

    public BuildSpecFluent.ResourcesNested<A> editOrNewResourcesLike(ResourceRequirements item){
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

    public BuildSpecFluent.RevisionNested<A> withNewRevision(){
            return new RevisionNestedImpl();
    }

    public BuildSpecFluent.RevisionNested<A> withNewRevisionLike(SourceRevision item){
            return new RevisionNestedImpl(item);
    }

    public BuildSpecFluent.RevisionNested<A> editRevision(){
            return withNewRevisionLike(getRevision());
    }

    public BuildSpecFluent.RevisionNested<A> editOrNewRevision(){
            return withNewRevisionLike(getRevision() != null ? getRevision(): new SourceRevisionBuilder().build());
    }

    public BuildSpecFluent.RevisionNested<A> editOrNewRevisionLike(SourceRevision item){
            return withNewRevisionLike(getRevision() != null ? getRevision(): item);
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

    public BuildSpecFluent.SourceNested<A> withNewSource(){
            return new SourceNestedImpl();
    }

    public BuildSpecFluent.SourceNested<A> withNewSourceLike(BuildSource item){
            return new SourceNestedImpl(item);
    }

    public BuildSpecFluent.SourceNested<A> editSource(){
            return withNewSourceLike(getSource());
    }

    public BuildSpecFluent.SourceNested<A> editOrNewSource(){
            return withNewSourceLike(getSource() != null ? getSource(): new BuildSourceBuilder().build());
    }

    public BuildSpecFluent.SourceNested<A> editOrNewSourceLike(BuildSource item){
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

    public BuildSpecFluent.StrategyNested<A> withNewStrategy(){
            return new StrategyNestedImpl();
    }

    public BuildSpecFluent.StrategyNested<A> withNewStrategyLike(BuildStrategy item){
            return new StrategyNestedImpl(item);
    }

    public BuildSpecFluent.StrategyNested<A> editStrategy(){
            return withNewStrategyLike(getStrategy());
    }

    public BuildSpecFluent.StrategyNested<A> editOrNewStrategy(){
            return withNewStrategyLike(getStrategy() != null ? getStrategy(): new BuildStrategyBuilder().build());
    }

    public BuildSpecFluent.StrategyNested<A> editOrNewStrategyLike(BuildStrategy item){
            return withNewStrategyLike(getStrategy() != null ? getStrategy(): item);
    }

    public A addToTriggeredBy(int index,BuildTriggerCause item){
            if (this.triggeredBy == null) {this.triggeredBy = new ArrayList<BuildTriggerCauseBuilder>();}
            BuildTriggerCauseBuilder builder = new BuildTriggerCauseBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.triggeredBy.add(index >= 0 ? index : triggeredBy.size(), builder); return (A)this;
    }

    public A setToTriggeredBy(int index,BuildTriggerCause item){
            if (this.triggeredBy == null) {this.triggeredBy = new ArrayList<BuildTriggerCauseBuilder>();}
            BuildTriggerCauseBuilder builder = new BuildTriggerCauseBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= triggeredBy.size()) { triggeredBy.add(builder); } else { triggeredBy.set(index, builder);}
             return (A)this;
    }

    public A addToTriggeredBy(BuildTriggerCause... items){
            if (this.triggeredBy == null) {this.triggeredBy = new ArrayList<BuildTriggerCauseBuilder>();}
            for (BuildTriggerCause item : items) {BuildTriggerCauseBuilder builder = new BuildTriggerCauseBuilder(item);_visitables.add(builder);this.triggeredBy.add(builder);} return (A)this;
    }

    public A addAllToTriggeredBy(Collection<BuildTriggerCause> items){
            if (this.triggeredBy == null) {this.triggeredBy = new ArrayList<BuildTriggerCauseBuilder>();}
            for (BuildTriggerCause item : items) {BuildTriggerCauseBuilder builder = new BuildTriggerCauseBuilder(item);_visitables.add(builder);this.triggeredBy.add(builder);} return (A)this;
    }

    public A removeFromTriggeredBy(BuildTriggerCause... items){
            for (BuildTriggerCause item : items) {BuildTriggerCauseBuilder builder = new BuildTriggerCauseBuilder(item);_visitables.remove(builder);if (this.triggeredBy != null) {this.triggeredBy.remove(builder);}} return (A)this;
    }

    public A removeAllFromTriggeredBy(Collection<BuildTriggerCause> items){
            for (BuildTriggerCause item : items) {BuildTriggerCauseBuilder builder = new BuildTriggerCauseBuilder(item);_visitables.remove(builder);if (this.triggeredBy != null) {this.triggeredBy.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildTriggeredBy instead.
 * @return The buildable object.
 */
@Deprecated public List<BuildTriggerCause> getTriggeredBy(){
            return build(triggeredBy);
    }

    public List<BuildTriggerCause> buildTriggeredBy(){
            return build(triggeredBy);
    }

    public BuildTriggerCause buildTriggeredBy(int index){
            return this.triggeredBy.get(index).build();
    }

    public BuildTriggerCause buildFirstTriggeredBy(){
            return this.triggeredBy.get(0).build();
    }

    public BuildTriggerCause buildLastTriggeredBy(){
            return this.triggeredBy.get(triggeredBy.size() - 1).build();
    }

    public BuildTriggerCause buildMatchingTriggeredBy(io.fabric8.kubernetes.api.builder.Predicate<BuildTriggerCauseBuilder> predicate){
            for (BuildTriggerCauseBuilder item: triggeredBy) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withTriggeredBy(List<BuildTriggerCause> triggeredBy){
            if (this.triggeredBy != null) { _visitables.removeAll(this.triggeredBy);}
            if (triggeredBy != null) {this.triggeredBy = new ArrayList<BuildTriggerCauseBuilder>(); for (BuildTriggerCause item : triggeredBy){this.addToTriggeredBy(item);}} else { this.triggeredBy = new ArrayList<BuildTriggerCauseBuilder>();} return (A) this;
    }

    public A withTriggeredBy(BuildTriggerCause... triggeredBy){
            if (this.triggeredBy != null) {this.triggeredBy.clear();}
            if (triggeredBy != null) {for (BuildTriggerCause item :triggeredBy){ this.addToTriggeredBy(item);}} return (A) this;
    }

    public Boolean hasTriggeredBy(){
            return triggeredBy != null && !triggeredBy.isEmpty();
    }

    public BuildSpecFluent.TriggeredByNested<A> addNewTriggeredBy(){
            return new TriggeredByNestedImpl();
    }

    public BuildSpecFluent.TriggeredByNested<A> addNewTriggeredByLike(BuildTriggerCause item){
            return new TriggeredByNestedImpl(-1, item);
    }

    public BuildSpecFluent.TriggeredByNested<A> setNewTriggeredByLike(int index,BuildTriggerCause item){
            return new TriggeredByNestedImpl(index, item);
    }

    public BuildSpecFluent.TriggeredByNested<A> editTriggeredBy(int index){
            if (triggeredBy.size() <= index) throw new RuntimeException("Can't edit triggeredBy. Index exceeds size.");
            return setNewTriggeredByLike(index, buildTriggeredBy(index));
    }

    public BuildSpecFluent.TriggeredByNested<A> editFirstTriggeredBy(){
            if (triggeredBy.size() == 0) throw new RuntimeException("Can't edit first triggeredBy. The list is empty.");
            return setNewTriggeredByLike(0, buildTriggeredBy(0));
    }

    public BuildSpecFluent.TriggeredByNested<A> editLastTriggeredBy(){
            int index = triggeredBy.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last triggeredBy. The list is empty.");
            return setNewTriggeredByLike(index, buildTriggeredBy(index));
    }

    public BuildSpecFluent.TriggeredByNested<A> editMatchingTriggeredBy(io.fabric8.kubernetes.api.builder.Predicate<BuildTriggerCauseBuilder> predicate){
            int index = -1;
            for (int i=0;i<triggeredBy.size();i++) { 
            if (predicate.apply(triggeredBy.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching triggeredBy. No match found.");
            return setNewTriggeredByLike(index, buildTriggeredBy(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildSpecFluentImpl that = (BuildSpecFluentImpl) o;
            if (completionDeadlineSeconds != null ? !completionDeadlineSeconds.equals(that.completionDeadlineSeconds) :that.completionDeadlineSeconds != null) return false;
            if (nodeSelector != null ? !nodeSelector.equals(that.nodeSelector) :that.nodeSelector != null) return false;
            if (output != null ? !output.equals(that.output) :that.output != null) return false;
            if (postCommit != null ? !postCommit.equals(that.postCommit) :that.postCommit != null) return false;
            if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
            if (revision != null ? !revision.equals(that.revision) :that.revision != null) return false;
            if (serviceAccount != null ? !serviceAccount.equals(that.serviceAccount) :that.serviceAccount != null) return false;
            if (source != null ? !source.equals(that.source) :that.source != null) return false;
            if (strategy != null ? !strategy.equals(that.strategy) :that.strategy != null) return false;
            if (triggeredBy != null ? !triggeredBy.equals(that.triggeredBy) :that.triggeredBy != null) return false;
            return true;
    }


    public class OutputNestedImpl<N> extends BuildOutputFluentImpl<BuildSpecFluent.OutputNested<N>> implements BuildSpecFluent.OutputNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildOutputBuilder builder;
    
            OutputNestedImpl(BuildOutput item){
                    this.builder = new BuildOutputBuilder(this, item);
            }
            OutputNestedImpl(){
                    this.builder = new BuildOutputBuilder(this);
            }
    
    public N and(){
            return (N) BuildSpecFluentImpl.this.withOutput(builder.build());
    }
    public N endOutput(){
            return and();
    }

}
    public class PostCommitNestedImpl<N> extends BuildPostCommitSpecFluentImpl<BuildSpecFluent.PostCommitNested<N>> implements BuildSpecFluent.PostCommitNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildPostCommitSpecBuilder builder;
    
            PostCommitNestedImpl(BuildPostCommitSpec item){
                    this.builder = new BuildPostCommitSpecBuilder(this, item);
            }
            PostCommitNestedImpl(){
                    this.builder = new BuildPostCommitSpecBuilder(this);
            }
    
    public N and(){
            return (N) BuildSpecFluentImpl.this.withPostCommit(builder.build());
    }
    public N endPostCommit(){
            return and();
    }

}
    public class ResourcesNestedImpl<N> extends ResourceRequirementsFluentImpl<BuildSpecFluent.ResourcesNested<N>> implements BuildSpecFluent.ResourcesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ResourceRequirementsBuilder builder;
    
            ResourcesNestedImpl(ResourceRequirements item){
                    this.builder = new ResourceRequirementsBuilder(this, item);
            }
            ResourcesNestedImpl(){
                    this.builder = new ResourceRequirementsBuilder(this);
            }
    
    public N and(){
            return (N) BuildSpecFluentImpl.this.withResources(builder.build());
    }
    public N endResources(){
            return and();
    }

}
    public class RevisionNestedImpl<N> extends SourceRevisionFluentImpl<BuildSpecFluent.RevisionNested<N>> implements BuildSpecFluent.RevisionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final SourceRevisionBuilder builder;
    
            RevisionNestedImpl(SourceRevision item){
                    this.builder = new SourceRevisionBuilder(this, item);
            }
            RevisionNestedImpl(){
                    this.builder = new SourceRevisionBuilder(this);
            }
    
    public N and(){
            return (N) BuildSpecFluentImpl.this.withRevision(builder.build());
    }
    public N endRevision(){
            return and();
    }

}
    public class SourceNestedImpl<N> extends BuildSourceFluentImpl<BuildSpecFluent.SourceNested<N>> implements BuildSpecFluent.SourceNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildSourceBuilder builder;
    
            SourceNestedImpl(BuildSource item){
                    this.builder = new BuildSourceBuilder(this, item);
            }
            SourceNestedImpl(){
                    this.builder = new BuildSourceBuilder(this);
            }
    
    public N and(){
            return (N) BuildSpecFluentImpl.this.withSource(builder.build());
    }
    public N endSource(){
            return and();
    }

}
    public class StrategyNestedImpl<N> extends BuildStrategyFluentImpl<BuildSpecFluent.StrategyNested<N>> implements BuildSpecFluent.StrategyNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildStrategyBuilder builder;
    
            StrategyNestedImpl(BuildStrategy item){
                    this.builder = new BuildStrategyBuilder(this, item);
            }
            StrategyNestedImpl(){
                    this.builder = new BuildStrategyBuilder(this);
            }
    
    public N and(){
            return (N) BuildSpecFluentImpl.this.withStrategy(builder.build());
    }
    public N endStrategy(){
            return and();
    }

}
    public class TriggeredByNestedImpl<N> extends BuildTriggerCauseFluentImpl<BuildSpecFluent.TriggeredByNested<N>> implements BuildSpecFluent.TriggeredByNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildTriggerCauseBuilder builder;
        private final int index;
    
            TriggeredByNestedImpl(int index,BuildTriggerCause item){
                    this.index = index;
                    this.builder = new BuildTriggerCauseBuilder(this, item);
            }
            TriggeredByNestedImpl(){
                    this.index = -1;
                    this.builder = new BuildTriggerCauseBuilder(this);
            }
    
    public N and(){
            return (N) BuildSpecFluentImpl.this.setToTriggeredBy(index, builder.build());
    }
    public N endTriggeredBy(){
            return and();
    }

}


}
