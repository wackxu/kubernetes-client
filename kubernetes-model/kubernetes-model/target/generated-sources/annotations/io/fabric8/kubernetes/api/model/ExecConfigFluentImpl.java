package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import javax.validation.constraints.NotNull;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class ExecConfigFluentImpl<A extends ExecConfigFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ExecConfigFluent<A>{

    private String apiVersion;
    private List<String> args;
    private String command;
    private List<ExecEnvVarBuilder> env;

    public ExecConfigFluentImpl(){
    }
    public ExecConfigFluentImpl(ExecConfig instance){
            this.withApiVersion(instance.getApiVersion()); 
            this.withArgs(instance.getArgs()); 
            this.withCommand(instance.getCommand()); 
            this.withEnv(instance.getEnv()); 
    }

    public String getApiVersion(){
            return this.apiVersion;
    }

    public A withApiVersion(String apiVersion){
            this.apiVersion=apiVersion; return (A) this;
    }

    public Boolean hasApiVersion(){
            return this.apiVersion != null;
    }

    public A addToArgs(int index,String item){
            if (this.args == null) {this.args = new ArrayList<String>();}
            this.args.add(index, item);
            return (A)this;
    }

    public A setToArgs(int index,String item){
            if (this.args == null) {this.args = new ArrayList<String>();}
            this.args.set(index, item); return (A)this;
    }

    public A addToArgs(String... items){
            if (this.args == null) {this.args = new ArrayList<String>();}
            for (String item : items) {this.args.add(item);} return (A)this;
    }

    public A addAllToArgs(Collection<String> items){
            if (this.args == null) {this.args = new ArrayList<String>();}
            for (String item : items) {this.args.add(item);} return (A)this;
    }

    public A removeFromArgs(String... items){
            for (String item : items) {if (this.args!= null){ this.args.remove(item);}} return (A)this;
    }

    public A removeAllFromArgs(Collection<String> items){
            for (String item : items) {if (this.args!= null){ this.args.remove(item);}} return (A)this;
    }

    public List<String> getArgs(){
            return this.args;
    }

    public String getArg(int index){
            return this.args.get(index);
    }

    public String getFirstArg(){
            return this.args.get(0);
    }

    public String getLastArg(){
            return this.args.get(args.size() - 1);
    }

    public String getMatchingArg(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: args) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withArgs(List<String> args){
            if (this.args != null) { _visitables.removeAll(this.args);}
            if (args != null) {this.args = new ArrayList<String>(); for (String item : args){this.addToArgs(item);}} else { this.args = new ArrayList<String>();} return (A) this;
    }

    public A withArgs(String... args){
            if (this.args != null) {this.args.clear();}
            if (args != null) {for (String item :args){ this.addToArgs(item);}} return (A) this;
    }

    public Boolean hasArgs(){
            return args != null && !args.isEmpty();
    }

    public String getCommand(){
            return this.command;
    }

    public A withCommand(String command){
            this.command=command; return (A) this;
    }

    public Boolean hasCommand(){
            return this.command != null;
    }

    public A addToEnv(int index,ExecEnvVar item){
            if (this.env == null) {this.env = new ArrayList<ExecEnvVarBuilder>();}
            ExecEnvVarBuilder builder = new ExecEnvVarBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.env.add(index >= 0 ? index : env.size(), builder); return (A)this;
    }

    public A setToEnv(int index,ExecEnvVar item){
            if (this.env == null) {this.env = new ArrayList<ExecEnvVarBuilder>();}
            ExecEnvVarBuilder builder = new ExecEnvVarBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= env.size()) { env.add(builder); } else { env.set(index, builder);}
             return (A)this;
    }

    public A addToEnv(ExecEnvVar... items){
            if (this.env == null) {this.env = new ArrayList<ExecEnvVarBuilder>();}
            for (ExecEnvVar item : items) {ExecEnvVarBuilder builder = new ExecEnvVarBuilder(item);_visitables.add(builder);this.env.add(builder);} return (A)this;
    }

    public A addAllToEnv(Collection<ExecEnvVar> items){
            if (this.env == null) {this.env = new ArrayList<ExecEnvVarBuilder>();}
            for (ExecEnvVar item : items) {ExecEnvVarBuilder builder = new ExecEnvVarBuilder(item);_visitables.add(builder);this.env.add(builder);} return (A)this;
    }

    public A removeFromEnv(ExecEnvVar... items){
            for (ExecEnvVar item : items) {ExecEnvVarBuilder builder = new ExecEnvVarBuilder(item);_visitables.remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
    }

    public A removeAllFromEnv(Collection<ExecEnvVar> items){
            for (ExecEnvVar item : items) {ExecEnvVarBuilder builder = new ExecEnvVarBuilder(item);_visitables.remove(builder);if (this.env != null) {this.env.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildEnv instead.
 * @return The buildable object.
 */
@Deprecated public List<ExecEnvVar> getEnv(){
            return build(env);
    }

    public List<ExecEnvVar> buildEnv(){
            return build(env);
    }

    public ExecEnvVar buildEnv(int index){
            return this.env.get(index).build();
    }

    public ExecEnvVar buildFirstEnv(){
            return this.env.get(0).build();
    }

    public ExecEnvVar buildLastEnv(){
            return this.env.get(env.size() - 1).build();
    }

    public ExecEnvVar buildMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<ExecEnvVarBuilder> predicate){
            for (ExecEnvVarBuilder item: env) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withEnv(List<ExecEnvVar> env){
            if (this.env != null) { _visitables.removeAll(this.env);}
            if (env != null) {this.env = new ArrayList<ExecEnvVarBuilder>(); for (ExecEnvVar item : env){this.addToEnv(item);}} else { this.env = new ArrayList<ExecEnvVarBuilder>();} return (A) this;
    }

    public A withEnv(ExecEnvVar... env){
            if (this.env != null) {this.env.clear();}
            if (env != null) {for (ExecEnvVar item :env){ this.addToEnv(item);}} return (A) this;
    }

    public Boolean hasEnv(){
            return env != null && !env.isEmpty();
    }

    public A addNewEnv(String name,String value){
            return (A)addToEnv(new ExecEnvVar(name, value));
    }

    public ExecConfigFluent.EnvNested<A> addNewEnv(){
            return new EnvNestedImpl();
    }

    public ExecConfigFluent.EnvNested<A> addNewEnvLike(ExecEnvVar item){
            return new EnvNestedImpl(-1, item);
    }

    public ExecConfigFluent.EnvNested<A> setNewEnvLike(int index,ExecEnvVar item){
            return new EnvNestedImpl(index, item);
    }

    public ExecConfigFluent.EnvNested<A> editEnv(int index){
            if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public ExecConfigFluent.EnvNested<A> editFirstEnv(){
            if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
            return setNewEnvLike(0, buildEnv(0));
    }

    public ExecConfigFluent.EnvNested<A> editLastEnv(){
            int index = env.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public ExecConfigFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<ExecEnvVarBuilder> predicate){
            int index = -1;
            for (int i=0;i<env.size();i++) { 
            if (predicate.apply(env.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExecConfigFluentImpl that = (ExecConfigFluentImpl) o;
            if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
            if (args != null ? !args.equals(that.args) :that.args != null) return false;
            if (command != null ? !command.equals(that.command) :that.command != null) return false;
            if (env != null ? !env.equals(that.env) :that.env != null) return false;
            return true;
    }


    public class EnvNestedImpl<N> extends ExecEnvVarFluentImpl<ExecConfigFluent.EnvNested<N>> implements ExecConfigFluent.EnvNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ExecEnvVarBuilder builder;
        private final int index;
    
            EnvNestedImpl(int index,ExecEnvVar item){
                    this.index = index;
                    this.builder = new ExecEnvVarBuilder(this, item);
            }
            EnvNestedImpl(){
                    this.index = -1;
                    this.builder = new ExecEnvVarBuilder(this);
            }
    
    public N and(){
            return (N) ExecConfigFluentImpl.this.setToEnv(index, builder.build());
    }
    public N endEnv(){
            return and();
    }

}


}
