package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface BuildStatusFluent<A extends BuildStatusFluent<A>> extends Fluent<A>{


    public Boolean isCancelled();
    public A withCancelled(Boolean cancelled);
    public Boolean hasCancelled();
    public A withNewCancelled(String arg1);
    public A withNewCancelled(boolean arg1);
    public String getCompletionTimestamp();
    public A withCompletionTimestamp(String completionTimestamp);
    public Boolean hasCompletionTimestamp();
    
/**
 * This method has been deprecated, please use method buildConfig instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getConfig();
    public ObjectReference buildConfig();
    public A withConfig(ObjectReference config);
    public Boolean hasConfig();
    public BuildStatusFluent.ConfigNested<A> withNewConfig();
    public BuildStatusFluent.ConfigNested<A> withNewConfigLike(ObjectReference item);
    public BuildStatusFluent.ConfigNested<A> editConfig();
    public BuildStatusFluent.ConfigNested<A> editOrNewConfig();
    public BuildStatusFluent.ConfigNested<A> editOrNewConfigLike(ObjectReference item);
    public Long getDuration();
    public A withDuration(Long duration);
    public Boolean hasDuration();
    public A withNewDuration(String arg1);
    public A withNewDuration(long arg1);
    public String getLogSnippet();
    public A withLogSnippet(String logSnippet);
    public Boolean hasLogSnippet();
    public String getMessage();
    public A withMessage(String message);
    public Boolean hasMessage();
    
/**
 * This method has been deprecated, please use method buildOutput instead.
 * @return The buildable object.
 */
@Deprecated public BuildStatusOutput getOutput();
    public BuildStatusOutput buildOutput();
    public A withOutput(BuildStatusOutput output);
    public Boolean hasOutput();
    public BuildStatusFluent.OutputNested<A> withNewOutput();
    public BuildStatusFluent.OutputNested<A> withNewOutputLike(BuildStatusOutput item);
    public BuildStatusFluent.OutputNested<A> editOutput();
    public BuildStatusFluent.OutputNested<A> editOrNewOutput();
    public BuildStatusFluent.OutputNested<A> editOrNewOutputLike(BuildStatusOutput item);
    public String getOutputDockerImageReference();
    public A withOutputDockerImageReference(String outputDockerImageReference);
    public Boolean hasOutputDockerImageReference();
    public String getPhase();
    public A withPhase(String phase);
    public Boolean hasPhase();
    public String getReason();
    public A withReason(String reason);
    public Boolean hasReason();
    public A addToStages(int index,StageInfo item);
    public A setToStages(int index,StageInfo item);
    public A addToStages(StageInfo... items);
    public A addAllToStages(Collection<StageInfo> items);
    public A removeFromStages(StageInfo... items);
    public A removeAllFromStages(Collection<StageInfo> items);
    
/**
 * This method has been deprecated, please use method buildStages instead.
 * @return The buildable object.
 */
@Deprecated public List<StageInfo> getStages();
    public List<StageInfo> buildStages();
    public StageInfo buildStage(int index);
    public StageInfo buildFirstStage();
    public StageInfo buildLastStage();
    public StageInfo buildMatchingStage(io.fabric8.kubernetes.api.builder.Predicate<StageInfoBuilder> predicate);
    public A withStages(List<StageInfo> stages);
    public A withStages(StageInfo... stages);
    public Boolean hasStages();
    public BuildStatusFluent.StagesNested<A> addNewStage();
    public BuildStatusFluent.StagesNested<A> addNewStageLike(StageInfo item);
    public BuildStatusFluent.StagesNested<A> setNewStageLike(int index,StageInfo item);
    public BuildStatusFluent.StagesNested<A> editStage(int index);
    public BuildStatusFluent.StagesNested<A> editFirstStage();
    public BuildStatusFluent.StagesNested<A> editLastStage();
    public BuildStatusFluent.StagesNested<A> editMatchingStage(io.fabric8.kubernetes.api.builder.Predicate<StageInfoBuilder> predicate);
    public String getStartTimestamp();
    public A withStartTimestamp(String startTimestamp);
    public Boolean hasStartTimestamp();

    public interface ConfigNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<BuildStatusFluent.ConfigNested<N>>{

        
    public N and();    public N endConfig();
}
    public interface OutputNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,BuildStatusOutputFluent<BuildStatusFluent.OutputNested<N>>{

        
    public N and();    public N endOutput();
}
    public interface StagesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,StageInfoFluent<BuildStatusFluent.StagesNested<N>>{

        
    public N and();    public N endStage();
}


}
