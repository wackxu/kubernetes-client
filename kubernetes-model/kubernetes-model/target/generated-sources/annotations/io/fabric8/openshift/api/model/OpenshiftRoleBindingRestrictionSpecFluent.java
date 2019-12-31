package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Map;

public interface OpenshiftRoleBindingRestrictionSpecFluent<A extends OpenshiftRoleBindingRestrictionSpecFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildGrouprestriction instead.
 * @return The buildable object.
 */
@Deprecated public GroupRestriction getGrouprestriction();
    public GroupRestriction buildGrouprestriction();
    public A withGrouprestriction(GroupRestriction grouprestriction);
    public Boolean hasGrouprestriction();
    public OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<A> withNewGrouprestriction();
    public OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<A> withNewGrouprestrictionLike(GroupRestriction item);
    public OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<A> editGrouprestriction();
    public OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<A> editOrNewGrouprestriction();
    public OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<A> editOrNewGrouprestrictionLike(GroupRestriction item);
    
/**
 * This method has been deprecated, please use method buildServiceaccountrestriction instead.
 * @return The buildable object.
 */
@Deprecated public ServiceAccountRestriction getServiceaccountrestriction();
    public ServiceAccountRestriction buildServiceaccountrestriction();
    public A withServiceaccountrestriction(ServiceAccountRestriction serviceaccountrestriction);
    public Boolean hasServiceaccountrestriction();
    public OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<A> withNewServiceaccountrestriction();
    public OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<A> withNewServiceaccountrestrictionLike(ServiceAccountRestriction item);
    public OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<A> editServiceaccountrestriction();
    public OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<A> editOrNewServiceaccountrestriction();
    public OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<A> editOrNewServiceaccountrestrictionLike(ServiceAccountRestriction item);
    
/**
 * This method has been deprecated, please use method buildUserrestriction instead.
 * @return The buildable object.
 */
@Deprecated public UserRestriction getUserrestriction();
    public UserRestriction buildUserrestriction();
    public A withUserrestriction(UserRestriction userrestriction);
    public Boolean hasUserrestriction();
    public OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<A> withNewUserrestriction();
    public OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<A> withNewUserrestrictionLike(UserRestriction item);
    public OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<A> editUserrestriction();
    public OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<A> editOrNewUserrestriction();
    public OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<A> editOrNewUserrestrictionLike(UserRestriction item);

    public interface GrouprestrictionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,GroupRestrictionFluent<OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<N>>{

        
    public N and();    public N endGrouprestriction();
}
    public interface ServiceaccountrestrictionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ServiceAccountRestrictionFluent<OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<N>>{

        
    public N and();    public N endServiceaccountrestriction();
}
    public interface UserrestrictionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserRestrictionFluent<OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<N>>{

        
    public N and();    public N endUserrestriction();
}


}
