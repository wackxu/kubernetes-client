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

public class JenkinsPipelineBuildStrategyFluentImpl<A extends JenkinsPipelineBuildStrategyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements JenkinsPipelineBuildStrategyFluent<A>{

    private List<EnvVarBuilder> env;
    private String jenkinsfile;
    private String jenkinsfilePath;

    public JenkinsPipelineBuildStrategyFluentImpl(){
    }
    public JenkinsPipelineBuildStrategyFluentImpl(JenkinsPipelineBuildStrategy instance){
            this.withEnv(instance.getEnv()); 
            this.withJenkinsfile(instance.getJenkinsfile()); 
            this.withJenkinsfilePath(instance.getJenkinsfilePath()); 
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

    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> addNewEnv(){
            return new EnvNestedImpl();
    }

    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> addNewEnvLike(EnvVar item){
            return new EnvNestedImpl(-1, item);
    }

    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item){
            return new EnvNestedImpl(index, item);
    }

    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> editEnv(int index){
            if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> editFirstEnv(){
            if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
            return setNewEnvLike(0, buildEnv(0));
    }

    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> editLastEnv(){
            int index = env.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public JenkinsPipelineBuildStrategyFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            int index = -1;
            for (int i=0;i<env.size();i++) { 
            if (predicate.apply(env.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public String getJenkinsfile(){
            return this.jenkinsfile;
    }

    public A withJenkinsfile(String jenkinsfile){
            this.jenkinsfile=jenkinsfile; return (A) this;
    }

    public Boolean hasJenkinsfile(){
            return this.jenkinsfile != null;
    }

    public String getJenkinsfilePath(){
            return this.jenkinsfilePath;
    }

    public A withJenkinsfilePath(String jenkinsfilePath){
            this.jenkinsfilePath=jenkinsfilePath; return (A) this;
    }

    public Boolean hasJenkinsfilePath(){
            return this.jenkinsfilePath != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            JenkinsPipelineBuildStrategyFluentImpl that = (JenkinsPipelineBuildStrategyFluentImpl) o;
            if (env != null ? !env.equals(that.env) :that.env != null) return false;
            if (jenkinsfile != null ? !jenkinsfile.equals(that.jenkinsfile) :that.jenkinsfile != null) return false;
            if (jenkinsfilePath != null ? !jenkinsfilePath.equals(that.jenkinsfilePath) :that.jenkinsfilePath != null) return false;
            return true;
    }


    public class EnvNestedImpl<N> extends EnvVarFluentImpl<JenkinsPipelineBuildStrategyFluent.EnvNested<N>> implements JenkinsPipelineBuildStrategyFluent.EnvNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

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
            return (N) JenkinsPipelineBuildStrategyFluentImpl.this.setToEnv(index, builder.build());
    }
    public N endEnv(){
            return and();
    }

}


}
