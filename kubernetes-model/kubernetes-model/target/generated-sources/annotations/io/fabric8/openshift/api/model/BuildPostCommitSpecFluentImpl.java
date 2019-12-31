package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class BuildPostCommitSpecFluentImpl<A extends BuildPostCommitSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements BuildPostCommitSpecFluent<A>{

    private List<String> args;
    private List<String> command;
    private String script;

    public BuildPostCommitSpecFluentImpl(){
    }
    public BuildPostCommitSpecFluentImpl(BuildPostCommitSpec instance){
            this.withArgs(instance.getArgs()); 
            this.withCommand(instance.getCommand()); 
            this.withScript(instance.getScript()); 
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

    public String getScript(){
            return this.script;
    }

    public A withScript(String script){
            this.script=script; return (A) this;
    }

    public Boolean hasScript(){
            return this.script != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            BuildPostCommitSpecFluentImpl that = (BuildPostCommitSpecFluentImpl) o;
            if (args != null ? !args.equals(that.args) :that.args != null) return false;
            if (command != null ? !command.equals(that.command) :that.command != null) return false;
            if (script != null ? !script.equals(that.script) :that.script != null) return false;
            return true;
    }




}
