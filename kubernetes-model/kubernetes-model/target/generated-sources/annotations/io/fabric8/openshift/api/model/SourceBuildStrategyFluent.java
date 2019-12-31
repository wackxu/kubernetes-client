package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.EnvVarBuilder;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.model.EnvVar;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluent;
import io.fabric8.kubernetes.api.model.EnvVarFluent;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface SourceBuildStrategyFluent<A extends SourceBuildStrategyFluent<A>> extends Fluent<A>{


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
    public SourceBuildStrategyFluent.EnvNested<A> addNewEnv();
    public SourceBuildStrategyFluent.EnvNested<A> addNewEnvLike(EnvVar item);
    public SourceBuildStrategyFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item);
    public SourceBuildStrategyFluent.EnvNested<A> editEnv(int index);
    public SourceBuildStrategyFluent.EnvNested<A> editFirstEnv();
    public SourceBuildStrategyFluent.EnvNested<A> editLastEnv();
    public SourceBuildStrategyFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public Boolean isForcePull();
    public A withForcePull(Boolean forcePull);
    public Boolean hasForcePull();
    public A withNewForcePull(String arg1);
    public A withNewForcePull(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom();
    public ObjectReference buildFrom();
    public A withFrom(ObjectReference from);
    public Boolean hasFrom();
    public SourceBuildStrategyFluent.FromNested<A> withNewFrom();
    public SourceBuildStrategyFluent.FromNested<A> withNewFromLike(ObjectReference item);
    public SourceBuildStrategyFluent.FromNested<A> editFrom();
    public SourceBuildStrategyFluent.FromNested<A> editOrNewFrom();
    public SourceBuildStrategyFluent.FromNested<A> editOrNewFromLike(ObjectReference item);
    public Boolean isIncremental();
    public A withIncremental(Boolean incremental);
    public Boolean hasIncremental();
    public A withNewIncremental(String arg1);
    public A withNewIncremental(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildPullSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getPullSecret();
    public LocalObjectReference buildPullSecret();
    public A withPullSecret(LocalObjectReference pullSecret);
    public Boolean hasPullSecret();
    public A withNewPullSecret(String name);
    public SourceBuildStrategyFluent.PullSecretNested<A> withNewPullSecret();
    public SourceBuildStrategyFluent.PullSecretNested<A> withNewPullSecretLike(LocalObjectReference item);
    public SourceBuildStrategyFluent.PullSecretNested<A> editPullSecret();
    public SourceBuildStrategyFluent.PullSecretNested<A> editOrNewPullSecret();
    public SourceBuildStrategyFluent.PullSecretNested<A> editOrNewPullSecretLike(LocalObjectReference item);
    public String getScripts();
    public A withScripts(String scripts);
    public Boolean hasScripts();

    public interface EnvNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<SourceBuildStrategyFluent.EnvNested<N>>{

        
    public N and();    public N endEnv();
}
    public interface FromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<SourceBuildStrategyFluent.FromNested<N>>{

        
    public N and();    public N endFrom();
}
    public interface PullSecretNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<SourceBuildStrategyFluent.PullSecretNested<N>>{

        
    public N and();    public N endPullSecret();
}


}
