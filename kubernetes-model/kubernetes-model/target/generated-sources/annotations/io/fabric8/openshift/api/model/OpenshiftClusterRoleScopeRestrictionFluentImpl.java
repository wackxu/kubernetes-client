package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class OpenshiftClusterRoleScopeRestrictionFluentImpl<A extends OpenshiftClusterRoleScopeRestrictionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements OpenshiftClusterRoleScopeRestrictionFluent<A>{

    private Boolean allowEscalation;
    private List<String> namespaces;
    private List<String> roleNames;

    public OpenshiftClusterRoleScopeRestrictionFluentImpl(){
    }
    public OpenshiftClusterRoleScopeRestrictionFluentImpl(OpenshiftClusterRoleScopeRestriction instance){
            this.withAllowEscalation(instance.getAllowEscalation()); 
            this.withNamespaces(instance.getNamespaces()); 
            this.withRoleNames(instance.getRoleNames()); 
    }

    public Boolean isAllowEscalation(){
            return this.allowEscalation;
    }

    public A withAllowEscalation(Boolean allowEscalation){
            this.allowEscalation=allowEscalation; return (A) this;
    }

    public Boolean hasAllowEscalation(){
            return this.allowEscalation != null;
    }

    public A withNewAllowEscalation(String arg1){
            return (A)withAllowEscalation(new Boolean(arg1));
    }

    public A withNewAllowEscalation(boolean arg1){
            return (A)withAllowEscalation(new Boolean(arg1));
    }

    public A addToNamespaces(int index,String item){
            if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
            this.namespaces.add(index, item);
            return (A)this;
    }

    public A setToNamespaces(int index,String item){
            if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
            this.namespaces.set(index, item); return (A)this;
    }

    public A addToNamespaces(String... items){
            if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
            for (String item : items) {this.namespaces.add(item);} return (A)this;
    }

    public A addAllToNamespaces(Collection<String> items){
            if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
            for (String item : items) {this.namespaces.add(item);} return (A)this;
    }

    public A removeFromNamespaces(String... items){
            for (String item : items) {if (this.namespaces!= null){ this.namespaces.remove(item);}} return (A)this;
    }

    public A removeAllFromNamespaces(Collection<String> items){
            for (String item : items) {if (this.namespaces!= null){ this.namespaces.remove(item);}} return (A)this;
    }

    public List<String> getNamespaces(){
            return this.namespaces;
    }

    public String getNamespace(int index){
            return this.namespaces.get(index);
    }

    public String getFirstNamespace(){
            return this.namespaces.get(0);
    }

    public String getLastNamespace(){
            return this.namespaces.get(namespaces.size() - 1);
    }

    public String getMatchingNamespace(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: namespaces) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withNamespaces(List<String> namespaces){
            if (this.namespaces != null) { _visitables.removeAll(this.namespaces);}
            if (namespaces != null) {this.namespaces = new ArrayList<String>(); for (String item : namespaces){this.addToNamespaces(item);}} else { this.namespaces = new ArrayList<String>();} return (A) this;
    }

    public A withNamespaces(String... namespaces){
            if (this.namespaces != null) {this.namespaces.clear();}
            if (namespaces != null) {for (String item :namespaces){ this.addToNamespaces(item);}} return (A) this;
    }

    public Boolean hasNamespaces(){
            return namespaces != null && !namespaces.isEmpty();
    }

    public A addToRoleNames(int index,String item){
            if (this.roleNames == null) {this.roleNames = new ArrayList<String>();}
            this.roleNames.add(index, item);
            return (A)this;
    }

    public A setToRoleNames(int index,String item){
            if (this.roleNames == null) {this.roleNames = new ArrayList<String>();}
            this.roleNames.set(index, item); return (A)this;
    }

    public A addToRoleNames(String... items){
            if (this.roleNames == null) {this.roleNames = new ArrayList<String>();}
            for (String item : items) {this.roleNames.add(item);} return (A)this;
    }

    public A addAllToRoleNames(Collection<String> items){
            if (this.roleNames == null) {this.roleNames = new ArrayList<String>();}
            for (String item : items) {this.roleNames.add(item);} return (A)this;
    }

    public A removeFromRoleNames(String... items){
            for (String item : items) {if (this.roleNames!= null){ this.roleNames.remove(item);}} return (A)this;
    }

    public A removeAllFromRoleNames(Collection<String> items){
            for (String item : items) {if (this.roleNames!= null){ this.roleNames.remove(item);}} return (A)this;
    }

    public List<String> getRoleNames(){
            return this.roleNames;
    }

    public String getRoleName(int index){
            return this.roleNames.get(index);
    }

    public String getFirstRoleName(){
            return this.roleNames.get(0);
    }

    public String getLastRoleName(){
            return this.roleNames.get(roleNames.size() - 1);
    }

    public String getMatchingRoleName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: roleNames) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withRoleNames(List<String> roleNames){
            if (this.roleNames != null) { _visitables.removeAll(this.roleNames);}
            if (roleNames != null) {this.roleNames = new ArrayList<String>(); for (String item : roleNames){this.addToRoleNames(item);}} else { this.roleNames = new ArrayList<String>();} return (A) this;
    }

    public A withRoleNames(String... roleNames){
            if (this.roleNames != null) {this.roleNames.clear();}
            if (roleNames != null) {for (String item :roleNames){ this.addToRoleNames(item);}} return (A) this;
    }

    public Boolean hasRoleNames(){
            return roleNames != null && !roleNames.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftClusterRoleScopeRestrictionFluentImpl that = (OpenshiftClusterRoleScopeRestrictionFluentImpl) o;
            if (allowEscalation != null ? !allowEscalation.equals(that.allowEscalation) :that.allowEscalation != null) return false;
            if (namespaces != null ? !namespaces.equals(that.namespaces) :that.namespaces != null) return false;
            if (roleNames != null ? !roleNames.equals(that.roleNames) :that.roleNames != null) return false;
            return true;
    }




}
