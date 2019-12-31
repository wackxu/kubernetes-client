package io.fabric8.kubernetes.api.model.rbac;

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

public class PolicyRuleFluentImpl<A extends PolicyRuleFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PolicyRuleFluent<A>{

    private List<String> apiGroups;
    private List<String> nonResourceURLs;
    private List<String> resourceNames;
    private List<String> resources;
    private List<String> verbs;

    public PolicyRuleFluentImpl(){
    }
    public PolicyRuleFluentImpl(PolicyRule instance){
            this.withApiGroups(instance.getApiGroups()); 
            this.withNonResourceURLs(instance.getNonResourceURLs()); 
            this.withResourceNames(instance.getResourceNames()); 
            this.withResources(instance.getResources()); 
            this.withVerbs(instance.getVerbs()); 
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

    public A addToNonResourceURLs(int index,String item){
            if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
            this.nonResourceURLs.add(index, item);
            return (A)this;
    }

    public A setToNonResourceURLs(int index,String item){
            if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
            this.nonResourceURLs.set(index, item); return (A)this;
    }

    public A addToNonResourceURLs(String... items){
            if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
            for (String item : items) {this.nonResourceURLs.add(item);} return (A)this;
    }

    public A addAllToNonResourceURLs(Collection<String> items){
            if (this.nonResourceURLs == null) {this.nonResourceURLs = new ArrayList<String>();}
            for (String item : items) {this.nonResourceURLs.add(item);} return (A)this;
    }

    public A removeFromNonResourceURLs(String... items){
            for (String item : items) {if (this.nonResourceURLs!= null){ this.nonResourceURLs.remove(item);}} return (A)this;
    }

    public A removeAllFromNonResourceURLs(Collection<String> items){
            for (String item : items) {if (this.nonResourceURLs!= null){ this.nonResourceURLs.remove(item);}} return (A)this;
    }

    public List<String> getNonResourceURLs(){
            return this.nonResourceURLs;
    }

    public String getNonResourceURL(int index){
            return this.nonResourceURLs.get(index);
    }

    public String getFirstNonResourceURL(){
            return this.nonResourceURLs.get(0);
    }

    public String getLastNonResourceURL(){
            return this.nonResourceURLs.get(nonResourceURLs.size() - 1);
    }

    public String getMatchingNonResourceURL(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: nonResourceURLs) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withNonResourceURLs(List<String> nonResourceURLs){
            if (this.nonResourceURLs != null) { _visitables.removeAll(this.nonResourceURLs);}
            if (nonResourceURLs != null) {this.nonResourceURLs = new ArrayList<String>(); for (String item : nonResourceURLs){this.addToNonResourceURLs(item);}} else { this.nonResourceURLs = new ArrayList<String>();} return (A) this;
    }

    public A withNonResourceURLs(String... nonResourceURLs){
            if (this.nonResourceURLs != null) {this.nonResourceURLs.clear();}
            if (nonResourceURLs != null) {for (String item :nonResourceURLs){ this.addToNonResourceURLs(item);}} return (A) this;
    }

    public Boolean hasNonResourceURLs(){
            return nonResourceURLs != null && !nonResourceURLs.isEmpty();
    }

    public A addToResourceNames(int index,String item){
            if (this.resourceNames == null) {this.resourceNames = new ArrayList<String>();}
            this.resourceNames.add(index, item);
            return (A)this;
    }

    public A setToResourceNames(int index,String item){
            if (this.resourceNames == null) {this.resourceNames = new ArrayList<String>();}
            this.resourceNames.set(index, item); return (A)this;
    }

    public A addToResourceNames(String... items){
            if (this.resourceNames == null) {this.resourceNames = new ArrayList<String>();}
            for (String item : items) {this.resourceNames.add(item);} return (A)this;
    }

    public A addAllToResourceNames(Collection<String> items){
            if (this.resourceNames == null) {this.resourceNames = new ArrayList<String>();}
            for (String item : items) {this.resourceNames.add(item);} return (A)this;
    }

    public A removeFromResourceNames(String... items){
            for (String item : items) {if (this.resourceNames!= null){ this.resourceNames.remove(item);}} return (A)this;
    }

    public A removeAllFromResourceNames(Collection<String> items){
            for (String item : items) {if (this.resourceNames!= null){ this.resourceNames.remove(item);}} return (A)this;
    }

    public List<String> getResourceNames(){
            return this.resourceNames;
    }

    public String getResourceName(int index){
            return this.resourceNames.get(index);
    }

    public String getFirstResourceName(){
            return this.resourceNames.get(0);
    }

    public String getLastResourceName(){
            return this.resourceNames.get(resourceNames.size() - 1);
    }

    public String getMatchingResourceName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: resourceNames) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withResourceNames(List<String> resourceNames){
            if (this.resourceNames != null) { _visitables.removeAll(this.resourceNames);}
            if (resourceNames != null) {this.resourceNames = new ArrayList<String>(); for (String item : resourceNames){this.addToResourceNames(item);}} else { this.resourceNames = new ArrayList<String>();} return (A) this;
    }

    public A withResourceNames(String... resourceNames){
            if (this.resourceNames != null) {this.resourceNames.clear();}
            if (resourceNames != null) {for (String item :resourceNames){ this.addToResourceNames(item);}} return (A) this;
    }

    public Boolean hasResourceNames(){
            return resourceNames != null && !resourceNames.isEmpty();
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

    public A addToVerbs(int index,String item){
            if (this.verbs == null) {this.verbs = new ArrayList<String>();}
            this.verbs.add(index, item);
            return (A)this;
    }

    public A setToVerbs(int index,String item){
            if (this.verbs == null) {this.verbs = new ArrayList<String>();}
            this.verbs.set(index, item); return (A)this;
    }

    public A addToVerbs(String... items){
            if (this.verbs == null) {this.verbs = new ArrayList<String>();}
            for (String item : items) {this.verbs.add(item);} return (A)this;
    }

    public A addAllToVerbs(Collection<String> items){
            if (this.verbs == null) {this.verbs = new ArrayList<String>();}
            for (String item : items) {this.verbs.add(item);} return (A)this;
    }

    public A removeFromVerbs(String... items){
            for (String item : items) {if (this.verbs!= null){ this.verbs.remove(item);}} return (A)this;
    }

    public A removeAllFromVerbs(Collection<String> items){
            for (String item : items) {if (this.verbs!= null){ this.verbs.remove(item);}} return (A)this;
    }

    public List<String> getVerbs(){
            return this.verbs;
    }

    public String getVerb(int index){
            return this.verbs.get(index);
    }

    public String getFirstVerb(){
            return this.verbs.get(0);
    }

    public String getLastVerb(){
            return this.verbs.get(verbs.size() - 1);
    }

    public String getMatchingVerb(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: verbs) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withVerbs(List<String> verbs){
            if (this.verbs != null) { _visitables.removeAll(this.verbs);}
            if (verbs != null) {this.verbs = new ArrayList<String>(); for (String item : verbs){this.addToVerbs(item);}} else { this.verbs = new ArrayList<String>();} return (A) this;
    }

    public A withVerbs(String... verbs){
            if (this.verbs != null) {this.verbs.clear();}
            if (verbs != null) {for (String item :verbs){ this.addToVerbs(item);}} return (A) this;
    }

    public Boolean hasVerbs(){
            return verbs != null && !verbs.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PolicyRuleFluentImpl that = (PolicyRuleFluentImpl) o;
            if (apiGroups != null ? !apiGroups.equals(that.apiGroups) :that.apiGroups != null) return false;
            if (nonResourceURLs != null ? !nonResourceURLs.equals(that.nonResourceURLs) :that.nonResourceURLs != null) return false;
            if (resourceNames != null ? !resourceNames.equals(that.resourceNames) :that.resourceNames != null) return false;
            if (resources != null ? !resources.equals(that.resources) :that.resources != null) return false;
            if (verbs != null ? !verbs.equals(that.verbs) :that.verbs != null) return false;
            return true;
    }




}
