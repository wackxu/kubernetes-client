package io.fabric8.kubernetes.api.model.admissionregistration;

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

public class RuleWithOperationsFluentImpl<A extends RuleWithOperationsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements RuleWithOperationsFluent<A>{

    private List<String> apiGroups;
    private List<String> apiVersions;
    private List<String> operations;
    private List<String> resources;

    public RuleWithOperationsFluentImpl(){
    }
    public RuleWithOperationsFluentImpl(RuleWithOperations instance){
            this.withApiGroups(instance.getApiGroups()); 
            this.withApiVersions(instance.getApiVersions()); 
            this.withOperations(instance.getOperations()); 
            this.withResources(instance.getResources()); 
    }

    public A addToApiGroups(int index,String item){
            if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
            this.apiGroups.add(index, item);
            return (A)this;
    }

    public A setToApiGroups(int index,String item){
            if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
            this.apiGroups.set(index, item); return (A)this;
    }

    public A addToApiGroups(String... items){
            if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
            for (String item : items) {this.apiGroups.add(item);} return (A)this;
    }

    public A addAllToApiGroups(Collection<String> items){
            if (this.apiGroups == null) {this.apiGroups = new ArrayList<String>();}
            for (String item : items) {this.apiGroups.add(item);} return (A)this;
    }

    public A removeFromApiGroups(String... items){
            for (String item : items) {if (this.apiGroups!= null){ this.apiGroups.remove(item);}} return (A)this;
    }

    public A removeAllFromApiGroups(Collection<String> items){
            for (String item : items) {if (this.apiGroups!= null){ this.apiGroups.remove(item);}} return (A)this;
    }

    public List<String> getApiGroups(){
            return this.apiGroups;
    }

    public String getApiGroup(int index){
            return this.apiGroups.get(index);
    }

    public String getFirstApiGroup(){
            return this.apiGroups.get(0);
    }

    public String getLastApiGroup(){
            return this.apiGroups.get(apiGroups.size() - 1);
    }

    public String getMatchingApiGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: apiGroups) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withApiGroups(List<String> apiGroups){
            if (this.apiGroups != null) { _visitables.removeAll(this.apiGroups);}
            if (apiGroups != null) {this.apiGroups = new ArrayList<String>(); for (String item : apiGroups){this.addToApiGroups(item);}} else { this.apiGroups = new ArrayList<String>();} return (A) this;
    }

    public A withApiGroups(String... apiGroups){
            if (this.apiGroups != null) {this.apiGroups.clear();}
            if (apiGroups != null) {for (String item :apiGroups){ this.addToApiGroups(item);}} return (A) this;
    }

    public Boolean hasApiGroups(){
            return apiGroups != null && !apiGroups.isEmpty();
    }

    public A addToApiVersions(int index,String item){
            if (this.apiVersions == null) {this.apiVersions = new ArrayList<String>();}
            this.apiVersions.add(index, item);
            return (A)this;
    }

    public A setToApiVersions(int index,String item){
            if (this.apiVersions == null) {this.apiVersions = new ArrayList<String>();}
            this.apiVersions.set(index, item); return (A)this;
    }

    public A addToApiVersions(String... items){
            if (this.apiVersions == null) {this.apiVersions = new ArrayList<String>();}
            for (String item : items) {this.apiVersions.add(item);} return (A)this;
    }

    public A addAllToApiVersions(Collection<String> items){
            if (this.apiVersions == null) {this.apiVersions = new ArrayList<String>();}
            for (String item : items) {this.apiVersions.add(item);} return (A)this;
    }

    public A removeFromApiVersions(String... items){
            for (String item : items) {if (this.apiVersions!= null){ this.apiVersions.remove(item);}} return (A)this;
    }

    public A removeAllFromApiVersions(Collection<String> items){
            for (String item : items) {if (this.apiVersions!= null){ this.apiVersions.remove(item);}} return (A)this;
    }

    public List<String> getApiVersions(){
            return this.apiVersions;
    }

    public String getApiVersion(int index){
            return this.apiVersions.get(index);
    }

    public String getFirstApiVersion(){
            return this.apiVersions.get(0);
    }

    public String getLastApiVersion(){
            return this.apiVersions.get(apiVersions.size() - 1);
    }

    public String getMatchingApiVersion(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: apiVersions) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withApiVersions(List<String> apiVersions){
            if (this.apiVersions != null) { _visitables.removeAll(this.apiVersions);}
            if (apiVersions != null) {this.apiVersions = new ArrayList<String>(); for (String item : apiVersions){this.addToApiVersions(item);}} else { this.apiVersions = new ArrayList<String>();} return (A) this;
    }

    public A withApiVersions(String... apiVersions){
            if (this.apiVersions != null) {this.apiVersions.clear();}
            if (apiVersions != null) {for (String item :apiVersions){ this.addToApiVersions(item);}} return (A) this;
    }

    public Boolean hasApiVersions(){
            return apiVersions != null && !apiVersions.isEmpty();
    }

    public A addToOperations(int index,String item){
            if (this.operations == null) {this.operations = new ArrayList<String>();}
            this.operations.add(index, item);
            return (A)this;
    }

    public A setToOperations(int index,String item){
            if (this.operations == null) {this.operations = new ArrayList<String>();}
            this.operations.set(index, item); return (A)this;
    }

    public A addToOperations(String... items){
            if (this.operations == null) {this.operations = new ArrayList<String>();}
            for (String item : items) {this.operations.add(item);} return (A)this;
    }

    public A addAllToOperations(Collection<String> items){
            if (this.operations == null) {this.operations = new ArrayList<String>();}
            for (String item : items) {this.operations.add(item);} return (A)this;
    }

    public A removeFromOperations(String... items){
            for (String item : items) {if (this.operations!= null){ this.operations.remove(item);}} return (A)this;
    }

    public A removeAllFromOperations(Collection<String> items){
            for (String item : items) {if (this.operations!= null){ this.operations.remove(item);}} return (A)this;
    }

    public List<String> getOperations(){
            return this.operations;
    }

    public String getOperation(int index){
            return this.operations.get(index);
    }

    public String getFirstOperation(){
            return this.operations.get(0);
    }

    public String getLastOperation(){
            return this.operations.get(operations.size() - 1);
    }

    public String getMatchingOperation(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: operations) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withOperations(List<String> operations){
            if (this.operations != null) { _visitables.removeAll(this.operations);}
            if (operations != null) {this.operations = new ArrayList<String>(); for (String item : operations){this.addToOperations(item);}} else { this.operations = new ArrayList<String>();} return (A) this;
    }

    public A withOperations(String... operations){
            if (this.operations != null) {this.operations.clear();}
            if (operations != null) {for (String item :operations){ this.addToOperations(item);}} return (A) this;
    }

    public Boolean hasOperations(){
            return operations != null && !operations.isEmpty();
    }

    public A addToResources(int index,String item){
            if (this.resources == null) {this.resources = new ArrayList<String>();}
            this.resources.add(index, item);
            return (A)this;
    }

    public A setToResources(int index,String item){
            if (this.resources == null) {this.resources = new ArrayList<String>();}
            this.resources.set(index, item); return (A)this;
    }

    public A addToResources(String... items){
            if (this.resources == null) {this.resources = new ArrayList<String>();}
            for (String item : items) {this.resources.add(item);} return (A)this;
    }

    public A addAllToResources(Collection<String> items){
            if (this.resources == null) {this.resources = new ArrayList<String>();}
            for (String item : items) {this.resources.add(item);} return (A)this;
    }

    public A removeFromResources(String... items){
            for (String item : items) {if (this.resources!= null){ this.resources.remove(item);}} return (A)this;
    }

    public A removeAllFromResources(Collection<String> items){
            for (String item : items) {if (this.resources!= null){ this.resources.remove(item);}} return (A)this;
    }

    public List<String> getResources(){
            return this.resources;
    }

    public String getResource(int index){
            return this.resources.get(index);
    }

    public String getFirstResource(){
            return this.resources.get(0);
    }

    public String getLastResource(){
            return this.resources.get(resources.size() - 1);
    }

    public String getMatchingResource(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: resources) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withResources(List<String> resources){
            if (this.resources != null) { _visitables.removeAll(this.resources);}
            if (resources != null) {this.resources = new ArrayList<String>(); for (String item : resources){this.addToResources(item);}} else { this.resources = new ArrayList<String>();} return (A) this;
    }

    public A withResources(String... resources){
            if (this.resources != null) {this.resources.clear();}
            if (resources != null) {for (String item :resources){ this.addToResources(item);}} return (A) this;
    }

    public Boolean hasResources(){
            return resources != null && !resources.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            RuleWithOperationsFluentImpl that = (RuleWithOperationsFluentImpl) o;
            if (apiGroups != null ? !apiGroups.equals(that.apiGroups) :that.apiGroups != null) return false;
            if (apiVersions != null ? !apiVersions.equals(that.apiVersions) :that.apiVersions != null) return false;
            if (operations != null ? !operations.equals(that.operations) :that.operations != null) return false;
            if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
            return true;
    }




}
