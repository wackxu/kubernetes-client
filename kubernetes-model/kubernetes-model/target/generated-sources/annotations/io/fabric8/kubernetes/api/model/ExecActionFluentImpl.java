package io.fabric8.kubernetes.api.model;

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

public class ExecActionFluentImpl<A extends ExecActionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ExecActionFluent<A>{

    private List<String> command;

    public ExecActionFluentImpl(){
    }
    public ExecActionFluentImpl(ExecAction instance){
            this.withCommand(instance.getCommand()); 
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ExecActionFluentImpl that = (ExecActionFluentImpl) o;
            if (command != null ? !command.equals(that.command) :that.command != null) return false;
            return true;
    }




}
