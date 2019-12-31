package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;

public class BuildStatusFluentImpl<A extends BuildStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildStatusFluent<A>{

    private Boolean cancelled;
    private String completionTimestamp;
    private ObjectReferenceBuilder config;
    private Long duration;
    private String logSnippet;
    private String message;
    private BuildStatusOutputBuilder output;
    private String outputDockerImageReference;
    private String phase;
    private String reason;
    private List<StageInfoBuilder> stages;
    private String startTimestamp;

    public BuildStatusFluentImpl(){
    }
    public BuildStatusFluentImpl(BuildStatus instance){
            this.withCancelled(instance.getCancelled()); 
            this.withCompletionTimestamp(instance.getCompletionTimestamp()); 
            this.withConfig(instance.getConfig()); 
            this.withDuration(instance.getDuration()); 
            this.withLogSnippet(instance.getLogSnippet()); 
            this.withMessage(instance.getMessage()); 
            this.withOutput(instance.getOutput()); 
            this.withOutputDockerImageReference(instance.getOutputDockerImageReference()); 
            this.withPhase(instance.getPhase()); 
            this.withReason(instance.getReason()); 
            this.withStages(instance.getStages()); 
            this.withStartTimestamp(instance.getStartTimestamp()); 
    }

    public Boolean isCancelled(){
            return this.cancelled;
    }

    public A withCancelled(Boolean cancelled){
            this.cancelled=cancelled; return (A) this;
    }

    public Boolean hasCancelled(){
            return this.cancelled != null;
    }

    public A withNewCancelled(String arg1){
            return (A)withCancelled(new Boolean(arg1));
    }

    public A withNewCancelled(boolean arg1){
            return (A)withCancelled(new Boolean(arg1));
    }

    public String getCompletionTimestamp(){
            return this.completionTimestamp;
    }

    public A withCompletionTimestamp(String completionTimestamp){
            this.completionTimestamp=completionTimestamp; return (A) this;
    }

    public Boolean hasCompletionTimestamp(){
            return this.completionTimestamp != null;
    }

    
/**
 * This method has been deprecated, please use method buildConfig instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getConfig(){
            return this.config!=null?this.config.build():null;
    }

    public ObjectReference buildConfig(){
            return this.config!=null?this.config.build():null;
    }

    public A withConfig(ObjectReference config){
            _visitables.remove(this.config);
            if (config!=null){ this.config= new ObjectReferenceBuilder(config); _visitables.add(this.config);} return (A) this;
    }

    public Boolean hasConfig(){
            return this.config != null;
    }

    public BuildStatusFluent.ConfigNested<A> withNewConfig(){
            return new ConfigNestedImpl();
    }

    public BuildStatusFluent.ConfigNested<A> withNewConfigLike(ObjectReference item){
            return new ConfigNestedImpl(item);
    }

    public BuildStatusFluent.ConfigNested<A> editConfig(){
            return withNewConfigLike(getConfig());
    }

    public BuildStatusFluent.ConfigNested<A> editOrNewConfig(){
            return withNewConfigLike(getConfig() != null ? getConfig(): new ObjectReferenceBuilder().build());
    }

    public BuildStatusFluent.ConfigNested<A> editOrNewConfigLike(ObjectReference item){
            return withNewConfigLike(getConfig() != null ? getConfig(): item);
    }

    public Long getDuration(){
            return this.duration;
    }

    public A withDuration(Long duration){
            this.duration=duration; return (A) this;
    }

    public Boolean hasDuration(){
            return this.duration != null;
    }

    public A withNewDuration(String arg1){
            return (A)withDuration(new Long(arg1));
    }

    public A withNewDuration(long arg1){
            return (A)withDuration(new Long(arg1));
    }

    public String getLogSnippet(){
            return this.logSnippet;
    }

    public A withLogSnippet(String logSnippet){
            this.logSnippet=logSnippet; return (A) this;
    }

    public Boolean hasLogSnippet(){
            return this.logSnippet != null;
    }

    public String getMessage(){
            return this.message;
    }

    public A withMessage(String message){
            this.message=message; return (A) this;
    }

    public Boolean hasMessage(){
            return this.message != null;
    }

    
/**
 * This method has been deprecated, please use method buildOutput instead.
 * @return The buildable object.
 */
@Deprecated public BuildStatusOutput getOutput(){
            return this.output!=null?this.output.build():null;
    }

    public BuildStatusOutput buildOutput(){
            return this.output!=null?this.output.build():null;
    }

    public A withOutput(BuildStatusOutput output){
            _visitables.remove(this.output);
            if (output!=null){ this.output= new BuildStatusOutputBuilder(output); _visitables.add(this.output);} return (A) this;
    }

    public Boolean hasOutput(){
            return this.output != null;
    }

    public BuildStatusFluent.OutputNested<A> withNewOutput(){
            return new OutputNestedImpl();
    }

    public BuildStatusFluent.OutputNested<A> withNewOutputLike(BuildStatusOutput item){
            return new OutputNestedImpl(item);
    }

    public BuildStatusFluent.OutputNested<A> editOutput(){
            return withNewOutputLike(getOutput());
    }

    public BuildStatusFluent.OutputNested<A> editOrNewOutput(){
            return withNewOutputLike(getOutput() != null ? getOutput(): new BuildStatusOutputBuilder().build());
    }

    public BuildStatusFluent.OutputNested<A> editOrNewOutputLike(BuildStatusOutput item){
            return withNewOutputLike(getOutput() != null ? getOutput(): item);
    }

    public String getOutputDockerImageReference(){
            return this.outputDockerImageReference;
    }

    public A withOutputDockerImageReference(String outputDockerImageReference){
            this.outputDockerImageReference=outputDockerImageReference; return (A) this;
    }

    public Boolean hasOutputDockerImageReference(){
            return this.outputDockerImageReference != null;
    }

    public String getPhase(){
            return this.phase;
    }

    public A withPhase(String phase){
            this.phase=phase; return (A) this;
    }

    public Boolean hasPhase(){
            return this.phase != null;
    }

    public String getReason(){
            return this.reason;
    }

    public A withReason(String reason){
            this.reason=reason; return (A) this;
    }

    public Boolean hasReason(){
            return this.reason != null;
    }

    public A addToStages(int index,StageInfo item){
            if (this.stages == null) {this.stages = new ArrayList<StageInfoBuilder>();}
            StageInfoBuilder builder = new StageInfoBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.stages.add(index >= 0 ? index : stages.size(), builder); return (A)this;
    }

    public A setToStages(int index,StageInfo item){
            if (this.stages == null) {this.stages = new ArrayList<StageInfoBuilder>();}
            StageInfoBuilder builder = new StageInfoBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= stages.size()) { stages.add(builder); } else { stages.set(index, builder);}
             return (A)this;
    }

    public A addToStages(StageInfo... items){
            if (this.stages == null) {this.stages = new ArrayList<StageInfoBuilder>();}
            for (StageInfo item : items) {StageInfoBuilder builder = new StageInfoBuilder(item);_visitables.add(builder);this.stages.add(builder);} return (A)this;
    }

    public A addAllToStages(Collection<StageInfo> items){
            if (this.stages == null) {this.stages = new ArrayList<StageInfoBuilder>();}
            for (StageInfo item : items) {StageInfoBuilder builder = new StageInfoBuilder(item);_visitables.add(builder);this.stages.add(builder);} return (A)this;
    }

    public A removeFromStages(StageInfo... items){
            for (StageInfo item : items) {StageInfoBuilder builder = new StageInfoBuilder(item);_visitables.remove(builder);if (this.stages != null) {this.stages.remove(builder);}} return (A)this;
    }

    public A removeAllFromStages(Collection<StageInfo> items){
            for (StageInfo item : items) {StageInfoBuilder builder = new StageInfoBuilder(item);_visitables.remove(builder);if (this.stages != null) {this.stages.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildStages instead.
 * @return The buildable object.
 */
@Deprecated public List<StageInfo> getStages(){
            return build(stages);
    }

    public List<StageInfo> buildStages(){
            return build(stages);
    }

    public StageInfo buildStage(int index){
            return this.stages.get(index).build();
    }

    public StageInfo buildFirstStage(){
            return this.stages.get(0).build();
    }

    public StageInfo buildLastStage(){
            return this.stages.get(stages.size() - 1).build();
    }

    public StageInfo buildMatchingStage(io.fabric8.kubernetes.api.builder.Predicate<StageInfoBuilder> predicate){
            for (StageInfoBuilder item: stages) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withStages(List<StageInfo> stages){
            if (this.stages != null) { _visitables.removeAll(this.stages);}
            if (stages != null) {this.stages = new ArrayList<StageInfoBuilder>(); for (StageInfo item : stages){this.addToStages(item);}} else { this.stages = new ArrayList<StageInfoBuilder>();} return (A) this;
    }

    public A withStages(StageInfo... stages){
            if (this.stages != null) {this.stages.clear();}
            if (stages != null) {for (StageInfo item :stages){ this.addToStages(item);}} return (A) this;
    }

    public Boolean hasStages(){
            return stages != null && !stages.isEmpty();
    }

    public BuildStatusFluent.StagesNested<A> addNewStage(){
            return new StagesNestedImpl();
    }

    public BuildStatusFluent.StagesNested<A> addNewStageLike(StageInfo item){
            return new StagesNestedImpl(-1, item);
    }

    public BuildStatusFluent.StagesNested<A> setNewStageLike(int index,StageInfo item){
            return new StagesNestedImpl(index, item);
    }

    public BuildStatusFluent.StagesNested<A> editStage(int index){
            if (stages.size() <= index) throw new RuntimeException("Can't edit stages. Index exceeds size.");
            return setNewStageLike(index, buildStage(index));
    }

    public BuildStatusFluent.StagesNested<A> editFirstStage(){
            if (stages.size() == 0) throw new RuntimeException("Can't edit first stages. The list is empty.");
            return setNewStageLike(0, buildStage(0));
    }

    public BuildStatusFluent.StagesNested<A> editLastStage(){
            int index = stages.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last stages. The list is empty.");
            return setNewStageLike(index, buildStage(index));
    }

    public BuildStatusFluent.StagesNested<A> editMatchingStage(io.fabric8.kubernetes.api.builder.Predicate<StageInfoBuilder> predicate){
            int index = -1;
            for (int i=0;i<stages.size();i++) { 
            if (predicate.apply(stages.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching stages. No match found.");
            return setNewStageLike(index, buildStage(index));
    }

    public String getStartTimestamp(){
            return this.startTimestamp;
    }

    public A withStartTimestamp(String startTimestamp){
            this.startTimestamp=startTimestamp; return (A) this;
    }

    public Boolean hasStartTimestamp(){
            return this.startTimestamp != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildStatusFluentImpl that = (BuildStatusFluentImpl) o;
            if (cancelled != null ? !cancelled.equals(that.cancelled) :that.cancelled != null) return false;
            if (completionTimestamp != null ? !completionTimestamp.equals(that.completionTimestamp) :that.completionTimestamp != null) return false;
            if (config != null ? !config.equals(that.config) :that.config != null) return false;
            if (duration != null ? !duration.equals(that.duration) :that.duration != null) return false;
            if (logSnippet != null ? !logSnippet.equals(that.logSnippet) :that.logSnippet != null) return false;
            if (message != null ? !message.equals(that.message) :that.message != null) return false;
            if (output != null ? !output.equals(that.output) :that.output != null) return false;
            if (outputDockerImageReference != null ? !outputDockerImageReference.equals(that.outputDockerImageReference) :that.outputDockerImageReference != null) return false;
            if (phase != null ? !phase.equals(that.phase) :that.phase != null) return false;
            if (reason != null ? !reason.equals(that.reason) :that.reason != null) return false;
            if (stages != null ? !stages.equals(that.stages) :that.stages != null) return false;
            if (startTimestamp != null ? !startTimestamp.equals(that.startTimestamp) :that.startTimestamp != null) return false;
            return true;
    }


    public class ConfigNestedImpl<N> extends ObjectReferenceFluentImpl<BuildStatusFluent.ConfigNested<N>> implements BuildStatusFluent.ConfigNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            ConfigNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            ConfigNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) BuildStatusFluentImpl.this.withConfig(builder.build());
    }
    public N endConfig(){
            return and();
    }

}
    public class OutputNestedImpl<N> extends BuildStatusOutputFluentImpl<BuildStatusFluent.OutputNested<N>> implements BuildStatusFluent.OutputNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final BuildStatusOutputBuilder builder;
    
            OutputNestedImpl(BuildStatusOutput item){
                    this.builder = new BuildStatusOutputBuilder(this, item);
            }
            OutputNestedImpl(){
                    this.builder = new BuildStatusOutputBuilder(this);
            }
    
    public N and(){
            return (N) BuildStatusFluentImpl.this.withOutput(builder.build());
    }
    public N endOutput(){
            return and();
    }

}
    public class StagesNestedImpl<N> extends StageInfoFluentImpl<BuildStatusFluent.StagesNested<N>> implements BuildStatusFluent.StagesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final StageInfoBuilder builder;
        private final int index;
    
            StagesNestedImpl(int index,StageInfo item){
                    this.index = index;
                    this.builder = new StageInfoBuilder(this, item);
            }
            StagesNestedImpl(){
                    this.index = -1;
                    this.builder = new StageInfoBuilder(this);
            }
    
    public N and(){
            return (N) BuildStatusFluentImpl.this.setToStages(index, builder.build());
    }
    public N endStage(){
            return and();
    }

}


}
