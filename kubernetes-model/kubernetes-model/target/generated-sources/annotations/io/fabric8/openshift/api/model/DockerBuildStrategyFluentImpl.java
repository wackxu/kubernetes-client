package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.EnvVarBuilder;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.EnvVar;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluentImpl;
import io.fabric8.kubernetes.api.model.LocalObjectReferenceBuilder;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import java.util.Collection;
import io.fabric8.kubernetes.api.model.EnvVarFluentImpl;
import java.lang.Object;

public class DockerBuildStrategyFluentImpl<A extends DockerBuildStrategyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DockerBuildStrategyFluent<A>{

    private List<EnvVarBuilder> buildArgs;
    private String dockerfilePath;
    private List<EnvVarBuilder> env;
    private Boolean forcePull;
    private ObjectReferenceBuilder from;
    private String imageOptimizationPolicy;
    private Boolean noCache;
    private LocalObjectReferenceBuilder pullSecret;

    public DockerBuildStrategyFluentImpl(){
    }
    public DockerBuildStrategyFluentImpl(DockerBuildStrategy instance){
            this.withBuildArgs(instance.getBuildArgs()); 
            this.withDockerfilePath(instance.getDockerfilePath()); 
            this.withEnv(instance.getEnv()); 
            this.withForcePull(instance.getForcePull()); 
            this.withFrom(instance.getFrom()); 
            this.withImageOptimizationPolicy(instance.getImageOptimizationPolicy()); 
            this.withNoCache(instance.getNoCache()); 
            this.withPullSecret(instance.getPullSecret()); 
    }

    public A addToBuildArgs(int index,EnvVar item){
            if (this.buildArgs == null) {this.buildArgs = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.buildArgs.add(index >= 0 ? index : buildArgs.size(), builder); return (A)this;
    }

    public A setToBuildArgs(int index,EnvVar item){
            if (this.buildArgs == null) {this.buildArgs = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= buildArgs.size()) { buildArgs.add(builder); } else { buildArgs.set(index, builder);}
             return (A)this;
    }

    public A addToBuildArgs(EnvVar... items){
            if (this.buildArgs == null) {this.buildArgs = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.buildArgs.add(builder);} return (A)this;
    }

    public A addAllToBuildArgs(Collection<EnvVar> items){
            if (this.buildArgs == null) {this.buildArgs = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.buildArgs.add(builder);} return (A)this;
    }

    public A removeFromBuildArgs(EnvVar... items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.buildArgs != null) {this.buildArgs.remove(builder);}} return (A)this;
    }

    public A removeAllFromBuildArgs(Collection<EnvVar> items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.buildArgs != null) {this.buildArgs.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildBuildArgs instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getBuildArgs(){
            return build(buildArgs);
    }

    public List<EnvVar> buildBuildArgs(){
            return build(buildArgs);
    }

    public EnvVar buildBuildArg(int index){
            return this.buildArgs.get(index).build();
    }

    public EnvVar buildFirstBuildArg(){
            return this.buildArgs.get(0).build();
    }

    public EnvVar buildLastBuildArg(){
            return this.buildArgs.get(buildArgs.size() - 1).build();
    }

    public EnvVar buildMatchingBuildArg(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            for (EnvVarBuilder item: buildArgs) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withBuildArgs(List<EnvVar> buildArgs){
            if (this.buildArgs != null) { _visitables.removeAll(this.buildArgs);}
            if (buildArgs != null) {this.buildArgs = new ArrayList<EnvVarBuilder>(); for (EnvVar item : buildArgs){this.addToBuildArgs(item);}} else { this.buildArgs = new ArrayList<EnvVarBuilder>();} return (A) this;
    }

    public A withBuildArgs(EnvVar... buildArgs){
            if (this.buildArgs != null) {this.buildArgs.clear();}
            if (buildArgs != null) {for (EnvVar item :buildArgs){ this.addToBuildArgs(item);}} return (A) this;
    }

    public Boolean hasBuildArgs(){
            return buildArgs != null && !buildArgs.isEmpty();
    }

    public DockerBuildStrategyFluent.BuildArgsNested<A> addNewBuildArg(){
            return new BuildArgsNestedImpl();
    }

    public DockerBuildStrategyFluent.BuildArgsNested<A> addNewBuildArgLike(EnvVar item){
            return new BuildArgsNestedImpl(-1, item);
    }

    public DockerBuildStrategyFluent.BuildArgsNested<A> setNewBuildArgLike(int index,EnvVar item){
            return new BuildArgsNestedImpl(index, item);
    }

    public DockerBuildStrategyFluent.BuildArgsNested<A> editBuildArg(int index){
            if (buildArgs.size() <= index) throw new RuntimeException("Can't edit buildArgs. Index exceeds size.");
            return setNewBuildArgLike(index, buildBuildArg(index));
    }

    public DockerBuildStrategyFluent.BuildArgsNested<A> editFirstBuildArg(){
            if (buildArgs.size() == 0) throw new RuntimeException("Can't edit first buildArgs. The list is empty.");
            return setNewBuildArgLike(0, buildBuildArg(0));
    }

    public DockerBuildStrategyFluent.BuildArgsNested<A> editLastBuildArg(){
            int index = buildArgs.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last buildArgs. The list is empty.");
            return setNewBuildArgLike(index, buildBuildArg(index));
    }

    public DockerBuildStrategyFluent.BuildArgsNested<A> editMatchingBuildArg(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            int index = -1;
            for (int i=0;i<buildArgs.size();i++) { 
            if (predicate.apply(buildArgs.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching buildArgs. No match found.");
            return setNewBuildArgLike(index, buildBuildArg(index));
    }

    public String getDockerfilePath(){
            return this.dockerfilePath;
    }

    public A withDockerfilePath(String dockerfilePath){
            this.dockerfilePath=dockerfilePath; return (A) this;
    }

    public Boolean hasDockerfilePath(){
            return this.dockerfilePath != null;
    }

    public A addToEnv(int index,EnvVar item){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.env.add(index >= 0 ? index : env.size(), builder); return (A)this;
    }

    public A setToEnv(int index,EnvVar item){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= env.size()) { env.add(builder); } else { env.set(index, builder);}
             return (A)this;
    }

    public A addToEnv(EnvVar... items){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.env.add(builder);} return (A)this;
    }

    public A addAllToEnv(Collection<EnvVar> items){
            if (this.env == null) {this.env = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.env.add(builder);} return (A)this;
    }

    public A removeFromEnv(EnvVar... items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
    }

    public A removeAllFromEnv(Collection<EnvVar> items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildEnv instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getEnv(){
            return build(env);
    }

    public List<EnvVar> buildEnv(){
            return build(env);
    }

    public EnvVar buildEnv(int index){
            return this.env.get(index).build();
    }

    public EnvVar buildFirstEnv(){
            return this.env.get(0).build();
    }

    public EnvVar buildLastEnv(){
            return this.env.get(env.size() - 1).build();
    }

    public EnvVar buildMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            for (EnvVarBuilder item: env) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withEnv(List<EnvVar> env){
            if (this.env != null) { _visitables.removeAll(this.env);}
            if (env != null) {this.env = new ArrayList<EnvVarBuilder>(); for (EnvVar item : env){this.addToEnv(item);}} else { this.env = new ArrayList<EnvVarBuilder>();} return (A) this;
    }

    public A withEnv(EnvVar... env){
            if (this.env != null) {this.env.clear();}
            if (env != null) {for (EnvVar item :env){ this.addToEnv(item);}} return (A) this;
    }

    public Boolean hasEnv(){
            return env != null && !env.isEmpty();
    }

    public DockerBuildStrategyFluent.EnvNested<A> addNewEnv(){
            return new EnvNestedImpl();
    }

    public DockerBuildStrategyFluent.EnvNested<A> addNewEnvLike(EnvVar item){
            return new EnvNestedImpl(-1, item);
    }

    public DockerBuildStrategyFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item){
            return new EnvNestedImpl(index, item);
    }

    public DockerBuildStrategyFluent.EnvNested<A> editEnv(int index){
            if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public DockerBuildStrategyFluent.EnvNested<A> editFirstEnv(){
            if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
            return setNewEnvLike(0, buildEnv(0));
    }

    public DockerBuildStrategyFluent.EnvNested<A> editLastEnv(){
            int index = env.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public DockerBuildStrategyFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            int index = -1;
            for (int i=0;i<env.size();i++) { 
            if (predicate.apply(env.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public Boolean isForcePull(){
            return this.forcePull;
    }

    public A withForcePull(Boolean forcePull){
            this.forcePull=forcePull; return (A) this;
    }

    public Boolean hasForcePull(){
            return this.forcePull != null;
    }

    public A withNewForcePull(String arg1){
            return (A)withForcePull(new Boolean(arg1));
    }

    public A withNewForcePull(boolean arg1){
            return (A)withForcePull(new Boolean(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom(){
            return this.from!=null?this.from.build():null;
    }

    public ObjectReference buildFrom(){
            return this.from!=null?this.from.build():null;
    }

    public A withFrom(ObjectReference from){
            _visitables.remove(this.from);
            if (from!=null){ this.from= new ObjectReferenceBuilder(from); _visitables.add(this.from);} return (A) this;
    }

    public Boolean hasFrom(){
            return this.from != null;
    }

    public DockerBuildStrategyFluent.FromNested<A> withNewFrom(){
            return new FromNestedImpl();
    }

    public DockerBuildStrategyFluent.FromNested<A> withNewFromLike(ObjectReference item){
            return new FromNestedImpl(item);
    }

    public DockerBuildStrategyFluent.FromNested<A> editFrom(){
            return withNewFromLike(getFrom());
    }

    public DockerBuildStrategyFluent.FromNested<A> editOrNewFrom(){
            return withNewFromLike(getFrom() != null ? getFrom(): new ObjectReferenceBuilder().build());
    }

    public DockerBuildStrategyFluent.FromNested<A> editOrNewFromLike(ObjectReference item){
            return withNewFromLike(getFrom() != null ? getFrom(): item);
    }

    public String getImageOptimizationPolicy(){
            return this.imageOptimizationPolicy;
    }

    public A withImageOptimizationPolicy(String imageOptimizationPolicy){
            this.imageOptimizationPolicy=imageOptimizationPolicy; return (A) this;
    }

    public Boolean hasImageOptimizationPolicy(){
            return this.imageOptimizationPolicy != null;
    }

    public Boolean isNoCache(){
            return this.noCache;
    }

    public A withNoCache(Boolean noCache){
            this.noCache=noCache; return (A) this;
    }

    public Boolean hasNoCache(){
            return this.noCache != null;
    }

    public A withNewNoCache(String arg1){
            return (A)withNoCache(new Boolean(arg1));
    }

    public A withNewNoCache(boolean arg1){
            return (A)withNoCache(new Boolean(arg1));
    }

    
/**
 * This method has been deprecated, please use method buildPullSecret instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getPullSecret(){
            return this.pullSecret!=null?this.pullSecret.build():null;
    }

    public LocalObjectReference buildPullSecret(){
            return this.pullSecret!=null?this.pullSecret.build():null;
    }

    public A withPullSecret(LocalObjectReference pullSecret){
            _visitables.remove(this.pullSecret);
            if (pullSecret!=null){ this.pullSecret= new LocalObjectReferenceBuilder(pullSecret); _visitables.add(this.pullSecret);} return (A) this;
    }

    public Boolean hasPullSecret(){
            return this.pullSecret != null;
    }

    public A withNewPullSecret(String name){
            return (A)withPullSecret(new LocalObjectReference(name));
    }

    public DockerBuildStrategyFluent.PullSecretNested<A> withNewPullSecret(){
            return new PullSecretNestedImpl();
    }

    public DockerBuildStrategyFluent.PullSecretNested<A> withNewPullSecretLike(LocalObjectReference item){
            return new PullSecretNestedImpl(item);
    }

    public DockerBuildStrategyFluent.PullSecretNested<A> editPullSecret(){
            return withNewPullSecretLike(getPullSecret());
    }

    public DockerBuildStrategyFluent.PullSecretNested<A> editOrNewPullSecret(){
            return withNewPullSecretLike(getPullSecret() != null ? getPullSecret(): new LocalObjectReferenceBuilder().build());
    }

    public DockerBuildStrategyFluent.PullSecretNested<A> editOrNewPullSecretLike(LocalObjectReference item){
            return withNewPullSecretLike(getPullSecret() != null ? getPullSecret(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DockerBuildStrategyFluentImpl that = (DockerBuildStrategyFluentImpl) o;
            if (buildArgs != null ? !buildArgs.equals(that.buildArgs) :that.buildArgs != null) return false;
            if (dockerfilePath != null ? !dockerfilePath.equals(that.dockerfilePath) :that.dockerfilePath != null) return false;
            if (env != null ? !env.equals(that.env) :that.env != null) return false;
            if (forcePull != null ? !forcePull.equals(that.forcePull) :that.forcePull != null) return false;
            if (from != null ? !from.equals(that.from) :that.from != null) return false;
            if (imageOptimizationPolicy != null ? !imageOptimizationPolicy.equals(that.imageOptimizationPolicy) :that.imageOptimizationPolicy != null) return false;
            if (noCache != null ? !noCache.equals(that.noCache) :that.noCache != null) return false;
            if (pullSecret != null ? !pullSecret.equals(that.pullSecret) :that.pullSecret != null) return false;
            return true;
    }


    public class BuildArgsNestedImpl<N> extends EnvVarFluentImpl<DockerBuildStrategyFluent.BuildArgsNested<N>> implements DockerBuildStrategyFluent.BuildArgsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvVarBuilder builder;
        private final int index;
    
            BuildArgsNestedImpl(int index,EnvVar item){
                    this.index = index;
                    this.builder = new EnvVarBuilder(this, item);
            }
            BuildArgsNestedImpl(){
                    this.index = -1;
                    this.builder = new EnvVarBuilder(this);
            }
    
    public N and(){
            return (N) DockerBuildStrategyFluentImpl.this.setToBuildArgs(index, builder.build());
    }
    public N endBuildArg(){
            return and();
    }

}
    public class EnvNestedImpl<N> extends EnvVarFluentImpl<DockerBuildStrategyFluent.EnvNested<N>> implements DockerBuildStrategyFluent.EnvNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvVarBuilder builder;
        private final int index;
    
            EnvNestedImpl(int index,EnvVar item){
                    this.index = index;
                    this.builder = new EnvVarBuilder(this, item);
            }
            EnvNestedImpl(){
                    this.index = -1;
                    this.builder = new EnvVarBuilder(this);
            }
    
    public N and(){
            return (N) DockerBuildStrategyFluentImpl.this.setToEnv(index, builder.build());
    }
    public N endEnv(){
            return and();
    }

}
    public class FromNestedImpl<N> extends ObjectReferenceFluentImpl<DockerBuildStrategyFluent.FromNested<N>> implements DockerBuildStrategyFluent.FromNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ObjectReferenceBuilder builder;
    
            FromNestedImpl(ObjectReference item){
                    this.builder = new ObjectReferenceBuilder(this, item);
            }
            FromNestedImpl(){
                    this.builder = new ObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) DockerBuildStrategyFluentImpl.this.withFrom(builder.build());
    }
    public N endFrom(){
            return and();
    }

}
    public class PullSecretNestedImpl<N> extends LocalObjectReferenceFluentImpl<DockerBuildStrategyFluent.PullSecretNested<N>> implements DockerBuildStrategyFluent.PullSecretNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final LocalObjectReferenceBuilder builder;
    
            PullSecretNestedImpl(LocalObjectReference item){
                    this.builder = new LocalObjectReferenceBuilder(this, item);
            }
            PullSecretNestedImpl(){
                    this.builder = new LocalObjectReferenceBuilder(this);
            }
    
    public N and(){
            return (N) DockerBuildStrategyFluentImpl.this.withPullSecret(builder.build());
    }
    public N endPullSecret(){
            return and();
    }

}


}
