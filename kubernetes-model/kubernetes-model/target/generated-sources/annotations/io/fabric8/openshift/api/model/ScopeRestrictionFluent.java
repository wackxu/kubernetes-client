package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface ScopeRestrictionFluent<A extends ScopeRestrictionFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildClusterRole instead.
 * @return The buildable object.
 */
@Deprecated public OpenshiftClusterRoleScopeRestriction getClusterRole();
    public OpenshiftClusterRoleScopeRestriction buildClusterRole();
    public A withClusterRole(OpenshiftClusterRoleScopeRestriction clusterRole);
    public Boolean hasClusterRole();
    public ScopeRestrictionFluent.ClusterRoleNested<A> withNewClusterRole();
    public ScopeRestrictionFluent.ClusterRoleNested<A> withNewClusterRoleLike(OpenshiftClusterRoleScopeRestriction item);
    public ScopeRestrictionFluent.ClusterRoleNested<A> editClusterRole();
    public ScopeRestrictionFluent.ClusterRoleNested<A> editOrNewClusterRole();
    public ScopeRestrictionFluent.ClusterRoleNested<A> editOrNewClusterRoleLike(OpenshiftClusterRoleScopeRestriction item);
    public A addToLiterals(int index,String item);
    public A setToLiterals(int index,String item);
    public A addToLiterals(String... items);
    public A addAllToLiterals(Collection<String> items);
    public A removeFromLiterals(String... items);
    public A removeAllFromLiterals(Collection<String> items);
    public List<String> getLiterals();
    public String getLiteral(int index);
    public String getFirstLiteral();
    public String getLastLiteral();
    public String getMatchingLiteral(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withLiterals(List<String> literals);
    public A withLiterals(String... literals);
    public Boolean hasLiterals();

    public interface ClusterRoleNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,OpenshiftClusterRoleScopeRestrictionFluent<ScopeRestrictionFluent.ClusterRoleNested<N>>{

        
    public N and();    public N endClusterRole();
}


}
