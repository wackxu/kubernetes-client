package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Boolean;
import javax.validation.Valid;
import java.lang.Object;

public class OpenshiftRoleBindingRestrictionSpecFluentImpl<A extends OpenshiftRoleBindingRestrictionSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements OpenshiftRoleBindingRestrictionSpecFluent<A>{

    private GroupRestrictionBuilder grouprestriction;
    private ServiceAccountRestrictionBuilder serviceaccountrestriction;
    private UserRestrictionBuilder userrestriction;

    public OpenshiftRoleBindingRestrictionSpecFluentImpl(){
    }
    public OpenshiftRoleBindingRestrictionSpecFluentImpl(OpenshiftRoleBindingRestrictionSpec instance){
            this.withGrouprestriction(instance.getGrouprestriction()); 
            this.withServiceaccountrestriction(instance.getServiceaccountrestriction()); 
            this.withUserrestriction(instance.getUserrestriction()); 
    }

    
/**
 * This method has been deprecated, please use method buildGrouprestriction instead.
 * @return The buildable object.
 */
@Deprecated public GroupRestriction getGrouprestriction(){
            return this.grouprestriction!=null?this.grouprestriction.build():null;
    }

    public GroupRestriction buildGrouprestriction(){
            return this.grouprestriction!=null?this.grouprestriction.build():null;
    }

    public A withGrouprestriction(GroupRestriction grouprestriction){
            _visitables.remove(this.grouprestriction);
            if (grouprestriction!=null){ this.grouprestriction= new GroupRestrictionBuilder(grouprestriction); _visitables.add(this.grouprestriction);} return (A) this;
    }

    public Boolean hasGrouprestriction(){
            return this.grouprestriction != null;
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<A> withNewGrouprestriction(){
            return new GrouprestrictionNestedImpl();
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<A> withNewGrouprestrictionLike(GroupRestriction item){
            return new GrouprestrictionNestedImpl(item);
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<A> editGrouprestriction(){
            return withNewGrouprestrictionLike(getGrouprestriction());
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<A> editOrNewGrouprestriction(){
            return withNewGrouprestrictionLike(getGrouprestriction() != null ? getGrouprestriction(): new GroupRestrictionBuilder().build());
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<A> editOrNewGrouprestrictionLike(GroupRestriction item){
            return withNewGrouprestrictionLike(getGrouprestriction() != null ? getGrouprestriction(): item);
    }

    
/**
 * This method has been deprecated, please use method buildServiceaccountrestriction instead.
 * @return The buildable object.
 */
@Deprecated public ServiceAccountRestriction getServiceaccountrestriction(){
            return this.serviceaccountrestriction!=null?this.serviceaccountrestriction.build():null;
    }

    public ServiceAccountRestriction buildServiceaccountrestriction(){
            return this.serviceaccountrestriction!=null?this.serviceaccountrestriction.build():null;
    }

    public A withServiceaccountrestriction(ServiceAccountRestriction serviceaccountrestriction){
            _visitables.remove(this.serviceaccountrestriction);
            if (serviceaccountrestriction!=null){ this.serviceaccountrestriction= new ServiceAccountRestrictionBuilder(serviceaccountrestriction); _visitables.add(this.serviceaccountrestriction);} return (A) this;
    }

    public Boolean hasServiceaccountrestriction(){
            return this.serviceaccountrestriction != null;
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<A> withNewServiceaccountrestriction(){
            return new ServiceaccountrestrictionNestedImpl();
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<A> withNewServiceaccountrestrictionLike(ServiceAccountRestriction item){
            return new ServiceaccountrestrictionNestedImpl(item);
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<A> editServiceaccountrestriction(){
            return withNewServiceaccountrestrictionLike(getServiceaccountrestriction());
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<A> editOrNewServiceaccountrestriction(){
            return withNewServiceaccountrestrictionLike(getServiceaccountrestriction() != null ? getServiceaccountrestriction(): new ServiceAccountRestrictionBuilder().build());
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<A> editOrNewServiceaccountrestrictionLike(ServiceAccountRestriction item){
            return withNewServiceaccountrestrictionLike(getServiceaccountrestriction() != null ? getServiceaccountrestriction(): item);
    }

    
/**
 * This method has been deprecated, please use method buildUserrestriction instead.
 * @return The buildable object.
 */
@Deprecated public UserRestriction getUserrestriction(){
            return this.userrestriction!=null?this.userrestriction.build():null;
    }

    public UserRestriction buildUserrestriction(){
            return this.userrestriction!=null?this.userrestriction.build():null;
    }

    public A withUserrestriction(UserRestriction userrestriction){
            _visitables.remove(this.userrestriction);
            if (userrestriction!=null){ this.userrestriction= new UserRestrictionBuilder(userrestriction); _visitables.add(this.userrestriction);} return (A) this;
    }

    public Boolean hasUserrestriction(){
            return this.userrestriction != null;
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<A> withNewUserrestriction(){
            return new UserrestrictionNestedImpl();
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<A> withNewUserrestrictionLike(UserRestriction item){
            return new UserrestrictionNestedImpl(item);
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<A> editUserrestriction(){
            return withNewUserrestrictionLike(getUserrestriction());
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<A> editOrNewUserrestriction(){
            return withNewUserrestrictionLike(getUserrestriction() != null ? getUserrestriction(): new UserRestrictionBuilder().build());
    }

    public OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<A> editOrNewUserrestrictionLike(UserRestriction item){
            return withNewUserrestrictionLike(getUserrestriction() != null ? getUserrestriction(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            OpenshiftRoleBindingRestrictionSpecFluentImpl that = (OpenshiftRoleBindingRestrictionSpecFluentImpl) o;
            if (grouprestriction != null ? !grouprestriction.equals(that.grouprestriction) :that.grouprestriction != null) return false;
            if (serviceaccountrestriction != null ? !serviceaccountrestriction.equals(that.serviceaccountrestriction) :that.serviceaccountrestriction != null) return false;
            if (userrestriction != null ? !userrestriction.equals(that.userrestriction) :that.userrestriction != null) return false;
            return true;
    }


    public class GrouprestrictionNestedImpl<N> extends GroupRestrictionFluentImpl<OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<N>> implements OpenshiftRoleBindingRestrictionSpecFluent.GrouprestrictionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final GroupRestrictionBuilder builder;
    
            GrouprestrictionNestedImpl(GroupRestriction item){
                    this.builder = new GroupRestrictionBuilder(this, item);
            }
            GrouprestrictionNestedImpl(){
                    this.builder = new GroupRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) OpenshiftRoleBindingRestrictionSpecFluentImpl.this.withGrouprestriction(builder.build());
    }
    public N endGrouprestriction(){
            return and();
    }

}
    public class ServiceaccountrestrictionNestedImpl<N> extends ServiceAccountRestrictionFluentImpl<OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<N>> implements OpenshiftRoleBindingRestrictionSpecFluent.ServiceaccountrestrictionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final ServiceAccountRestrictionBuilder builder;
    
            ServiceaccountrestrictionNestedImpl(ServiceAccountRestriction item){
                    this.builder = new ServiceAccountRestrictionBuilder(this, item);
            }
            ServiceaccountrestrictionNestedImpl(){
                    this.builder = new ServiceAccountRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) OpenshiftRoleBindingRestrictionSpecFluentImpl.this.withServiceaccountrestriction(builder.build());
    }
    public N endServiceaccountrestriction(){
            return and();
    }

}
    public class UserrestrictionNestedImpl<N> extends UserRestrictionFluentImpl<OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<N>> implements OpenshiftRoleBindingRestrictionSpecFluent.UserrestrictionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserRestrictionBuilder builder;
    
            UserrestrictionNestedImpl(UserRestriction item){
                    this.builder = new UserRestrictionBuilder(this, item);
            }
            UserrestrictionNestedImpl(){
                    this.builder = new UserRestrictionBuilder(this);
            }
    
    public N and(){
            return (N) OpenshiftRoleBindingRestrictionSpecFluentImpl.this.withUserrestriction(builder.build());
    }
    public N endUserrestriction(){
            return and();
    }

}


}
