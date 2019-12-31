package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class ScopeRestrictionFluentImpl<A extends ScopeRestrictionFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ScopeRestrictionFluent<A>{

    private OpenshiftClusterRoleScopeRestrictionBuilder clusterRole;
    private List<String> literals;

    public ScopeRestrictionFluentImpl(){
    }
    public ScopeRestrictionFluentImpl(ScopeRestriction instance){
            this.withClusterRole(instance.getClusterRole()); 
            this.withLiterals(instance.getLiterals()); 
    }

    
/**
 * This method has been deprecated, please use method buildClusterRole instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftClusterRoleScopeRestriction getClusterRole(){
            return this.clusterRole!=null?this.clusterRole.build():null;
    }

    public OpenshiftClusterRoleScopeRestriction buildClusterRole(){
            return this.clusterRole!=null?this.clusterRole.build():null;
    }

    public A withClusterRole(OpenshiftClusterRoleScopeRestriction clusterRole){
            _visitables.remove(this.clusterRole);
            if (clusterRole!=null){ this.clusterRole= new OpenshiftClusterRoleScopeRestrictionBuilder(clusterRole); _visitables.add(this.clusterRole);} return (A) this;
    }

    public Boolean hasClusterRole(){
            return this.clusterRole != null;
    }

    public ScopeRestrictionFluent.ClusterRoleNested<A> withNewClusterRole(){
            return new ClusterRoleNestedImpl();
    }

    public ScopeRestrictionFluent.ClusterRoleNested<A> withNewClusterRoleLike(OpenshiftClusterRoleScopeRestriction item){
            return new ClusterRoleNestedImpl(item);
    }

    public ScopeRestrictionFluent.ClusterRoleNested<A> editClusterRole(){
            return withNewClusterRoleLike(getClusterRole());
    }

    public ScopeRestrictionFluent.ClusterRoleNested<A> editOrNewClusterRole(){
            return withNewClusterRoleLike(getClusterRole() != null ? getClusterRole(): new OpenshiftClusterRoleScopeRestrictionBuilder().build());
    }

    public ScopeRestrictionFluent.ClusterRoleNested<A> editOrNewClusterRoleLike(OpenshiftClusterRoleScopeRestriction item){
            return withNewClusterRoleLike(getClusterRole() != null ? getClusterRole(): item);
    }

    public A addToLiterals(int index,String item){
            if (this.literals == null) {this.literals = new ArrayList<String>();}
            this.literals.add(index, item);
            return (A)this;
    }

    public A setToLiterals(int index,String item){
            if (this.literals == null) {this.literals = new ArrayList<String>();}
            this.literals.set(index, item); return (A)this;
    }

    public A addToLiterals(String... items){
            if (this.literals == null) {this.literals = new ArrayList<String>();}
            for (String item : items) {this.literals.add(item);} return (A)this;
    }

    public A addAllToLiterals(Collection<String> items){
            if (this.literals == null) {this.literals = new ArrayList<String>();}
            for (String item : items) {this.literals.add(item);} return (A)this;
    }

    public A removeFromLiterals(String... items){
            for (String item : items) {if (this.literals!= null){ this.literals.remove(item);}} return (A)this;
    }

    public A removeAllFromLiterals(Collection<String> items){
            for (String item : items) {if (this.literals!= null){ this.literals.remove(item);}} return (A)this;
    }

    public List<String> getLiterals(){
            return this.literals;
    }

    public String getLiteral(int index){
            return this.literals.get(index);
    }

    public String getFirstLiteral(){
            return this.literals.get(0);
    }

    public String getLastLiteral(){
            return this.literals.get(literals.size() - 1);
    }

    public String getMatchingLiteral(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: literals) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withLiterals(List<String> literals){
            if (this.literals != null) { _visitables.removeAll(this.literals);}
            if (literals != null) {this.literals = new ArrayList<String>(); for (String item : literals){this.addToLiterals(item);}} else { this.literals = new ArrayList<String>();} return (A) this;
    }

    public A withLiterals(String... literals){
            if (this.literals != null) {this.literals.clear();}
            if (literals != null) {for (String item :literals){ this.addToLiterals(item);}} return (A) this;
    }

    public Boolean hasLiterals(){
            return literals != null && !literals.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ScopeRestrictionFluentImpl that = (ScopeRestrictionFluentImpl) o;
            if (clusterRole != null ? !clusterRole.equals(that.clusterRole) :that.clusterRole != null) return false;
            if (literals != null ? !literals.equals(that.literals) :that.literals != null) return false;
            return true;
    }


    public class ClusterRoleNestedImpl<N> extends OpenshiftClusterRoleScopeRestrictionFluentImpl<ScopeRestrictionFluent.ClusterRoleNested<N>> implements ScopeRestrictionFluent.ClusterRoleNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final OpenshiftClusterRoleScopeRestrictionBuilder builder;
    
            ClusterRoleNestedImpl(OpenshiftClusterRoleScopeRestriction item){
                    this.builder = new OpenshiftClusterRoleScopeRestrictionBuilder(this, item);
            }
            ClusterRoleNestedImpl(){
                    this.builder = new OpenshiftClusterRoleScopeRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) ScopeRestrictionFluentImpl.this.withClusterRole(builder.build());
    }
    public N endClusterRole(){
            return and();
    }

}


}
