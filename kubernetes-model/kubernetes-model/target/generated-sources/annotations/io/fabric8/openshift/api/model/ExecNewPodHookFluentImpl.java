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

public class ExecNewPodHookFluentImpl<A extends ExecNewPodHookFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ExecNewPodHookFluent<A>{

    private List<String> command;
    private String containerName;
    private List<EnvVarBuilder> env;
    private List<String> volumes;

    public ExecNewPodHookFluentImpl(){
    }
    public ExecNewPodHookFluentImpl(ExecNewPodHook instance){
            this.withCommand(instance.getCommand()); 
            this.withContainerName(instance.getContainerName()); 
            this.withEnv(instance.getEnv()); 
            this.withVolumes(instance.getVolumes()); 
    }

    public A addToCommand(int index,String item){
            if (this.command == null) {this.command = new ArrayList<String>();}
            this.command.add(index, item);
            return (A)this;
    }

    public A setToCommand(int index,String item){
            if (this.command == null) {this.command = new ArrayList<String>();}
            this.command.set(index, item); return (A)this;
    }

    public A addToCommand(String... items){
            if (this.command == null) {this.command = new ArrayList<String>();}
            for (String item : items) {this.command.add(item);} return (A)this;
    }

    public A addAllToCommand(Collection<String> items){
            if (this.command == null) {this.command = new ArrayList<String>();}
            for (String item : items) {this.command.add(item);} return (A)this;
    }

    public A removeFromCommand(String... items){
            for (String item : items) {if (this.command!= null){ this.command.remove(item);}} return (A)this;
    }

    public A removeAllFromCommand(Collection<String> items){
            for (String item : items) {if (this.command!= null){ this.command.remove(item);}} return (A)this;
    }

    public List<String> getCommand(){
            return this.command;
    }

    public String getCommand(int index){
            return this.command.get(index);
    }

    public String getFirstCommand(){
            return this.command.get(0);
    }

    public String getLastCommand(){
            return this.command.get(command.size() - 1);
    }

    public String getMatchingCommand(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: command) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withCommand(List<String> command){
            if (this.command != null) { _visitables.removeAll(this.command);}
            if (command != null) {this.command = new ArrayList<String>(); for (String item : command){this.addToCommand(item);}} else { this.command = new ArrayList<String>();} return (A) this;
    }

    public A withCommand(String... command){
            if (this.command != null) {this.command.clear();}
            if (command != null) {for (String item :command){ this.addToCommand(item);}} return (A) this;
    }

    public Boolean hasCommand(){
            return command != null && !command.isEmpty();
    }

    public String getContainerName(){
            return this.containerName;
    }

    public A withContainerName(String containerName){
            this.containerName=containerName; return (A) this;
    }

    public Boolean hasContainerName(){
            return this.containerName != null;
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

    public ExecNewPodHookFluent.EnvNested<A> addNewEnv(){
            return new EnvNestedImpl();
    }

    public ExecNewPodHookFluent.EnvNested<A> addNewEnvLike(EnvVar item){
            return new EnvNestedImpl(-1, item);
    }

    public ExecNewPodHookFluent.EnvNested<A> setNewEnvLike(int index,EnvVar item){
            return new EnvNestedImpl(index, item);
    }

    public ExecNewPodHookFluent.EnvNested<A> editEnv(int index){
            if (env.size() <= index) throw new RuntimeException("Can't edit env. Index exceeds size.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public ExecNewPodHookFluent.EnvNested<A> editFirstEnv(){
            if (env.size() == 0) throw new RuntimeException("Can't edit first env. The list is empty.");
            return setNewEnvLike(0, buildEnv(0));
    }

    public ExecNewPodHookFluent.EnvNested<A> editLastEnv(){
            int index = env.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last env. The list is empty.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public ExecNewPodHookFluent.EnvNested<A> editMatchingEnv(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            int index = -1;
            for (int i=0;i<env.size();i++) { 
            if (predicate.apply(env.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching env. No match found.");
            return setNewEnvLike(index, buildEnv(index));
    }

    public A addToVolumes(int index,String item){
            if (this.volumes == null) {this.volumes = new ArrayList<String>();}
            this.volumes.add(index, item);
            return (A)this;
    }

    public A setToVolumes(int index,String item){
            if (this.volumes == null) {this.volumes = new ArrayList<String>();}
            this.volumes.set(index, item); return (A)this;
    }

    public A addToVolumes(String... items){
            if (this.volumes == null) {this.volumes = new ArrayList<String>();}
            for (String item : items) {this.volumes.add(item);} return (A)this;
    }

    public A addAllToVolumes(Collection<String> items){
            if (this.volumes == null) {this.volumes = new ArrayList<String>();}
            for (String item : items) {this.volumes.add(item);} return (A)this;
    }

    public A removeFromVolumes(String... items){
            for (String item : items) {if (this.volumes!= null){ this.volumes.remove(item);}} return (A)this;
    }

    public A removeAllFromVolumes(Collection<String> items){
            for (String item : items) {if (this.volumes!= null){ this.volumes.remove(item);}} return (A)this;
    }

    public List<String> getVolumes(){
            return this.volumes;
    }

    public String getVolume(int index){
            return this.volumes.get(index);
    }

    public String getFirstVolume(){
            return this.volumes.get(0);
    }

    public String getLastVolume(){
            return this.volumes.get(volumes.size() - 1);
    }

    public String getMatchingVolume(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: volumes) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withVolumes(List<String> volumes){
            if (this.volumes != null) { _visitables.removeAll(this.volumes);}
            if (volumes != null) {this.volumes = new ArrayList<String>(); for (String item : volumes){this.addToVolumes(item);}} else { this.volumes = new ArrayList<String>();} return (A) this;
    }

    public A withVolumes(String... volumes){
            if (this.volumes != null) {this.volumes.clear();}
            if (volumes != null) {for (String item :volumes){ this.addToVolumes(item);}} return (A) this;
    }

    public Boolean hasVolumes(){
            return volumes != null && !volumes.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExecNewPodHookFluentImpl that = (ExecNewPodHookFluentImpl) o;
            if (command != null ? !command.equals(that.command) :that.command != null) return false;
            if (containerName != null ? !containerName.equals(that.containerName) :that.containerName != null) return false;
            if (env != null ? !env.equals(that.env) :that.env != null) return false;
            if (volumes != null ? !volumes.equals(that.volumes) :that.volumes != null) return false;
            return true;
    }


    public class EnvNestedImpl<N> extends EnvVarFluentImpl<ExecNewPodHookFluent.EnvNested<N>> implements ExecNewPodHookFluent.EnvNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

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
            return (N) ExecNewPodHookFluentImpl.this.setToEnv(index, builder.build());
    }
    public N endEnv(){
            return and();
    }

}


}
