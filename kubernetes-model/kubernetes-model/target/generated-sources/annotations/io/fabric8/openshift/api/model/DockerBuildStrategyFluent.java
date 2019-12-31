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

public interface DockerBuildStrategyFluent<A extends DockerBuildStrategyFluent<A>> extends Fluent<A>{


    public A addToBuildArgs(int index,EnvVar item);
    public A setToBuildArgs(int index,EnvVar item);
    public A addToBuildArgs(EnvVar... items);
    public A addAllToBuildArgs(Collection<EnvVar> items);
    public A removeFromBuildArgs(EnvVar... items);
    public A removeAllFromBuildArgs(Collection<EnvVar> items);
    
/**
 * This method has been deprecated, please use method buildBuildArgs instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getBuildArgs();
    public List<EnvVar> buildBuildArgs();
    public EnvVar buildBuildArg(int index);
    public EnvVar buildFirstBuildArg();
    public EnvVar buildLastBuildArg();
    public EnvVar buildMatchingBuildArg(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public A withBuildArgs(List<EnvVar> buildArgs);
    public A withBuildArgs(EnvVar... buildArgs);
    public Boolean hasBuildArgs();
    public DockerBuildStrategyFluent.BuildArgsNested<A> addNewBuildArg();
    public DockerBuildStrategyFluent.BuildArgsNested<A> addNewBuildArgLike(EnvVar item);
    public DockerBuildStrategyFluent.BuildArgsNested<A> setNewBuildArgLike(int index,EnvVar item);
    public DockerBuildStrategyFluent.BuildArgsNested<A> editBuildArg(int index);
    public DockerBuildStrategyFluent.BuildArgsNested<A> editFirstBuildArg();
    public DockerBuildStrategyFluent.BuildArgsNested<A> editLastBuildArg();
    public DockerBuildStrategyFluent.BuildArgsNested<A> editMatchingBuildArg(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public String getDockerfilePath();
    public A withDockerfilePath(String dockerfilePath);
    public Boolean hasDockerfilePath();
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
    public DockerBuildStrategyFluent.EnvNested<A> addNewEnv();
    public DockerBuildStrategyFluent.EnvNested<A> addNewEnvLike(EnvVar item);
    public DockerBuildStrategyFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item);
    public DockerBuildStrategyFluent.EnvNested<A> editEnv(int index);
    public DockerBuildStrategyFluent.EnvNested<A> editFirstEnv();
    public DockerBuildStrategyFluent.EnvNested<A> editLastEnv();
    public DockerBuildStrategyFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
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
    public DockerBuildStrategyFluent.FromNested<A> withNewFrom();
    public DockerBuildStrategyFluent.FromNested<A> withNewFromLike(ObjectReference item);
    public DockerBuildStrategyFluent.FromNested<A> editFrom();
    public DockerBuildStrategyFluent.FromNested<A> editOrNewFrom();
    public DockerBuildStrategyFluent.FromNested<A> editOrNewFromLike(ObjectReference item);
    public String getImageOptimizationPolicy();
    public A withImageOptimizationPolicy(String imageOptimizationPolicy);
    public Boolean hasImageOptimizationPolicy();
    public Boolean isNoCache();
    public A withNoCache(Boolean noCache);
    public Boolean hasNoCache();
    public A withNewNoCache(String arg1);
    public A withNewNoCache(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildPullSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getPullSecret();
    public LocalObjectReference buildPullSecret();
    public A withPullSecret(LocalObjectReference pullSecret);
    public Boolean hasPullSecret();
    public A withNewPullSecret(String name);
    public DockerBuildStrategyFluent.PullSecretNested<A> withNewPullSecret();
    public DockerBuildStrategyFluent.PullSecretNested<A> withNewPullSecretLike(LocalObjectReference item);
    public DockerBuildStrategyFluent.PullSecretNested<A> editPullSecret();
    public DockerBuildStrategyFluent.PullSecretNested<A> editOrNewPullSecret();
    public DockerBuildStrategyFluent.PullSecretNested<A> editOrNewPullSecretLike(LocalObjectReference item);

    public interface BuildArgsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<DockerBuildStrategyFluent.BuildArgsNested<N>>{

        
    public N and();    public N endBuildArg();
}
    public interface EnvNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<DockerBuildStrategyFluent.EnvNested<N>>{

        
    public N and();    public N endEnv();
}
    public interface FromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<DockerBuildStrategyFluent.FromNested<N>>{

        
    public N and();    public N endFrom();
}
    public interface PullSecretNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<DockerBuildStrategyFluent.PullSecretNested<N>>{

        
    public N and();    public N endPullSecret();
}


}
