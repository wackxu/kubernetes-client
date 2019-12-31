package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.model.EnvVarBuilder;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import io.fabric8.kubernetes.api.model.EnvVar;
import java.util.Collection;
import io.fabric8.kubernetes.api.model.EnvVarFluentImpl;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class DockerStrategyOptionsFluentImpl<A extends DockerStrategyOptionsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements DockerStrategyOptionsFluent<A>{

    private List<EnvVarBuilder> buildArgs;
    private Boolean noCache;

    public DockerStrategyOptionsFluentImpl(){
    }
    public DockerStrategyOptionsFluentImpl(DockerStrategyOptions instance){
            this.withBuildArgs(instance.getBuildArgs()); 
            this.withNoCache(instance.getNoCache()); 
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

    public DockerStrategyOptionsFluent.BuildArgsNested<A> addNewBuildArg(){
            return new BuildArgsNestedImpl();
    }

    public DockerStrategyOptionsFluent.BuildArgsNested<A> addNewBuildArgLike(EnvVar item){
            return new BuildArgsNestedImpl(-1, item);
    }

    public DockerStrategyOptionsFluent.BuildArgsNested<A> setNewBuildArgLike(int index,EnvVar item){
            return new BuildArgsNestedImpl(index, item);
    }

    public DockerStrategyOptionsFluent.BuildArgsNested<A> editBuildArg(int index){
            if (buildArgs.size() <= index) throw new RuntimeException("Can't edit buildArgs. Index exceeds size.");
            return setNewBuildArgLike(index, buildBuildArg(index));
    }

    public DockerStrategyOptionsFluent.BuildArgsNested<A> editFirstBuildArg(){
            if (buildArgs.size() == 0) throw new RuntimeException("Can't edit first buildArgs. The list is empty.");
            return setNewBuildArgLike(0, buildBuildArg(0));
    }

    public DockerStrategyOptionsFluent.BuildArgsNested<A> editLastBuildArg(){
            int index = buildArgs.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last buildArgs. The list is empty.");
            return setNewBuildArgLike(index, buildBuildArg(index));
    }

    public DockerStrategyOptionsFluent.BuildArgsNested<A> editMatchingBuildArg(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            int index = -1;
            for (int i=0;i<buildArgs.size();i++) { 
            if (predicate.apply(buildArgs.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching buildArgs. No match found.");
            return setNewBuildArgLike(index, buildBuildArg(index));
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            DockerStrategyOptionsFluentImpl that = (DockerStrategyOptionsFluentImpl) o;
            if (buildArgs != null ? !buildArgs.equals(that.buildArgs) :that.buildArgs != null) return false;
            if (noCache != null ? !noCache.equals(that.noCache) :that.noCache != null) return false;
            return true;
    }


    public class BuildArgsNestedImpl<N> extends EnvVarFluentImpl<DockerStrategyOptionsFluent.BuildArgsNested<N>> implements DockerStrategyOptionsFluent.BuildArgsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

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
            return (N) DockerStrategyOptionsFluentImpl.this.setToBuildArgs(index, builder.build());
    }
    public N endBuildArg(){
            return and();
    }

}


}
