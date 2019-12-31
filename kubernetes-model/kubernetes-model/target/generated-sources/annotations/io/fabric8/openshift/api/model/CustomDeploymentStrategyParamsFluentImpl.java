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

public class CustomDeploymentStrategyParamsFluentImpl<A extends CustomDeploymentStrategyParamsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomDeploymentStrategyParamsFluent<A>{

    private List<String> command;
    private List<EnvVarBuilder> environment;
    private String image;

    public CustomDeploymentStrategyParamsFluentImpl(){
    }
    public CustomDeploymentStrategyParamsFluentImpl(CustomDeploymentStrategyParams instance){
            this.withCommand(instance.getCommand()); 
            this.withEnvironment(instance.getEnvironment()); 
            this.withImage(instance.getImage()); 
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

    public A addToEnvironment(int index,EnvVar item){
            if (this.environment == null) {this.environment = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.environment.add(index >= 0 ? index : environment.size(), builder); return (A)this;
    }

    public A setToEnvironment(int index,EnvVar item){
            if (this.environment == null) {this.environment = new ArrayList<EnvVarBuilder>();}
            EnvVarBuilder builder = new EnvVarBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= environment.size()) { environment.add(builder); } else { environment.set(index, builder);}
             return (A)this;
    }

    public A addToEnvironment(EnvVar... items){
            if (this.environment == null) {this.environment = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.environment.add(builder);} return (A)this;
    }

    public A addAllToEnvironment(Collection<EnvVar> items){
            if (this.environment == null) {this.environment = new ArrayList<EnvVarBuilder>();}
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.add(builder);this.environment.add(builder);} return (A)this;
    }

    public A removeFromEnvironment(EnvVar... items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.environment != null) {this.environment.remove(builder);}} return (A)this;
    }

    public A removeAllFromEnvironment(Collection<EnvVar> items){
            for (EnvVar item : items) {EnvVarBuilder builder = new EnvVarBuilder(item);_visitables.remove(builder);if (this.environment != null) {this.environment.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildEnvironment instead.
 * @return The buildable object.
 */
@Deprecated public List<EnvVar> getEnvironment(){
            return build(environment);
    }

    public List<EnvVar> buildEnvironment(){
            return build(environment);
    }

    public EnvVar buildEnvironment(int index){
            return this.environment.get(index).build();
    }

    public EnvVar buildFirstEnvironment(){
            return this.environment.get(0).build();
    }

    public EnvVar buildLastEnvironment(){
            return this.environment.get(environment.size() - 1).build();
    }

    public EnvVar buildMatchingEnvironment(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            for (EnvVarBuilder item: environment) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withEnvironment(List<EnvVar> environment){
            if (this.environment != null) { _visitables.removeAll(this.environment);}
            if (environment != null) {this.environment = new ArrayList<EnvVarBuilder>(); for (EnvVar item : environment){this.addToEnvironment(item);}} else { this.environment = new ArrayList<EnvVarBuilder>();} return (A) this;
    }

    public A withEnvironment(EnvVar... environment){
            if (this.environment != null) {this.environment.clear();}
            if (environment != null) {for (EnvVar item :environment){ this.addToEnvironment(item);}} return (A) this;
    }

    public Boolean hasEnvironment(){
            return environment != null && !environment.isEmpty();
    }

    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> addNewEnvironment(){
            return new EnvironmentNestedImpl();
    }

    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> addNewEnvironmentLike(EnvVar item){
            return new EnvironmentNestedImpl(-1, item);
    }

    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> setNewEnvironmentLike(int index,EnvVar item){
            return new EnvironmentNestedImpl(index, item);
    }

    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> editEnvironment(int index){
            if (environment.size() <= index) throw new RuntimeException("Can't edit environment. Index exceeds size.");
            return setNewEnvironmentLike(index, buildEnvironment(index));
    }

    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> editFirstEnvironment(){
            if (environment.size() == 0) throw new RuntimeException("Can't edit first environment. The list is empty.");
            return setNewEnvironmentLike(0, buildEnvironment(0));
    }

    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> editLastEnvironment(){
            int index = environment.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last environment. The list is empty.");
            return setNewEnvironmentLike(index, buildEnvironment(index));
    }

    public CustomDeploymentStrategyParamsFluent.EnvironmentNested<A> editMatchingEnvironment(io.fabric8.kubernetes.api.builder.Predicate<EnvVarBuilder> predicate){
            int index = -1;
            for (int i=0;i<environment.size();i++) { 
            if (predicate.apply(environment.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching environment. No match found.");
            return setNewEnvironmentLike(index, buildEnvironment(index));
    }

    public String getImage(){
            return this.image;
    }

    public A withImage(String image){
            this.image=image; return (A) this;
    }

    public Boolean hasImage(){
            return this.image != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomDeploymentStrategyParamsFluentImpl that = (CustomDeploymentStrategyParamsFluentImpl) o;
            if (command != null ? !command.equals(that.command) :that.command != null) return false;
            if (environment != null ? !environment.equals(that.environment) :that.environment != null) return false;
            if (image != null ? !image.equals(that.image) :that.image != null) return false;
            return true;
    }


    public class EnvironmentNestedImpl<N> extends EnvVarFluentImpl<CustomDeploymentStrategyParamsFluent.EnvironmentNested<N>> implements CustomDeploymentStrategyParamsFluent.EnvironmentNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final EnvVarBuilder builder;
        private final int index;
    
            EnvironmentNestedImpl(int index,EnvVar item){
                    this.index = index;
                    this.builder = new EnvVarBuilder(this, item);
            }
            EnvironmentNestedImpl(){
                    this.index = -1;
                    this.builder = new EnvVarBuilder(this);
            }
    
    public N and(){
            return (N) CustomDeploymentStrategyParamsFluentImpl.this.setToEnvironment(index, builder.build());
    }
    public N endEnvironment(){
            return and();
    }

}


}
