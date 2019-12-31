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

public interface CustomBuildStrategyFluent<A extends CustomBuildStrategyFluent<A>> extends Fluent<A>{


    public String getBuildAPIVersion();
    public A withBuildAPIVersion(String buildAPIVersion);
    public Boolean hasBuildAPIVersion();
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
    public CustomBuildStrategyFluent.EnvNested<A> addNewEnv();
    public CustomBuildStrategyFluent.EnvNested<A> addNewEnvLike(EnvVar item);
    public CustomBuildStrategyFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item);
    public CustomBuildStrategyFluent.EnvNested<A> editEnv(int index);
    public CustomBuildStrategyFluent.EnvNested<A> editFirstEnv();
    public CustomBuildStrategyFluent.EnvNested<A> editLastEnv();
    public CustomBuildStrategyFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate);
    public Boolean isExposeDockerSocket();
    public A withExposeDockerSocket(Boolean exposeDockerSocket);
    public Boolean hasExposeDockerSocket();
    public A withNewExposeDockerSocket(String arg1);
    public A withNewExposeDockerSocket(boolean arg1);
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
    public CustomBuildStrategyFluent.FromNested<A> withNewFrom();
    public CustomBuildStrategyFluent.FromNested<A> withNewFromLike(ObjectReference item);
    public CustomBuildStrategyFluent.FromNested<A> editFrom();
    public CustomBuildStrategyFluent.FromNested<A> editOrNewFrom();
    public CustomBuildStrategyFluent.FromNested<A> editOrNewFromLike(ObjectReference item);
    
/**
 * This method has been deprecated, please use method buildPullSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getPullSecret();
    public LocalObjectReference buildPullSecret();
    public A withPullSecret(LocalObjectReference pullSecret);
    public Boolean hasPullSecret();
    public A withNewPullSecret(String name);
    public CustomBuildStrategyFluent.PullSecretNested<A> withNewPullSecret();
    public CustomBuildStrategyFluent.PullSecretNested<A> withNewPullSecretLike(LocalObjectReference item);
    public CustomBuildStrategyFluent.PullSecretNested<A> editPullSecret();
    public CustomBuildStrategyFluent.PullSecretNested<A> editOrNewPullSecret();
    public CustomBuildStrategyFluent.PullSecretNested<A> editOrNewPullSecretLike(LocalObjectReference item);
    public A addToSecrets(int index,SecretSpec item);
    public A setToSecrets(int index,SecretSpec item);
    public A addToSecrets(SecretSpec... items);
    public A addAllToSecrets(Collection<SecretSpec> items);
    public A removeFromSecrets(SecretSpec... items);
    public A removeAllFromSecrets(Collection<SecretSpec> items);
    
/**
 * This method has been deprecated, please use method buildSecrets instead.
 * @return The buildable object.
 */
@Deprecated public List<SecretSpec> getSecrets();
    public List<SecretSpec> buildSecrets();
    public SecretSpec buildSecret(int index);
    public SecretSpec buildFirstSecret();
    public SecretSpec buildLastSecret();
    public SecretSpec buildMatchingSecret(io.fabric8.kubernetes.api.builder.Predicate<SecretSpecBuilder> predicate);
    public A withSecrets(List<SecretSpec> secrets);
    public A withSecrets(SecretSpec... secrets);
    public Boolean hasSecrets();
    public CustomBuildStrategyFluent.SecretsNested<A> addNewSecret();
    public CustomBuildStrategyFluent.SecretsNested<A> addNewSecretLike(SecretSpec item);
    public CustomBuildStrategyFluent.SecretsNested<A> setNewSecretLike(int index,SecretSpec item);
    public CustomBuildStrategyFluent.SecretsNested<A> editSecret(int index);
    public CustomBuildStrategyFluent.SecretsNested<A> editFirstSecret();
    public CustomBuildStrategyFluent.SecretsNested<A> editLastSecret();
    public CustomBuildStrategyFluent.SecretsNested<A> editMatchingSecret(io.fabric8.kubernetes.api.builder.Predicate<SecretSpecBuilder> predicate);

    public interface EnvNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,EnvVarFluent<CustomBuildStrategyFluent.EnvNested<N>>{

        
    public N and();    public N endEnv();
}
    public interface FromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<CustomBuildStrategyFluent.FromNested<N>>{

        
    public N and();    public N endFrom();
}
    public interface PullSecretNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<CustomBuildStrategyFluent.PullSecretNested<N>>{

        
    public N and();    public N endPullSecret();
}
    public interface SecretsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretSpecFluent<CustomBuildStrategyFluent.SecretsNested<N>>{

        
    public N and();    public N endSecret();
}


}
