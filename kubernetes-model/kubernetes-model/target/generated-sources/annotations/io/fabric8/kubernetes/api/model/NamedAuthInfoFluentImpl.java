package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Nested;
import java.lang.String;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class NamedAuthInfoFluentImpl<A extends NamedAuthInfoFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements NamedAuthInfoFluent<A>{

    private String name;
    private AuthInfoBuilder user;

    public NamedAuthInfoFluentImpl(){
    }
    public NamedAuthInfoFluentImpl(NamedAuthInfo instance){
            this.withName(instance.getName()); 
            this.withUser(instance.getUser()); 
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    
/**
 * This method has been deprecated, please use method buildUser instead.
 * @return The buildable object.
 */
@Deprecated public AuthInfo getUser(){
            return this.user!=null?this.user.build():null;
    }

    public AuthInfo buildUser(){
            return this.user!=null?this.user.build():null;
    }

    public A withUser(AuthInfo user){
            _visitables.remove(this.user);
            if (user!=null){ this.user= new AuthInfoBuilder(user); _visitables.add(this.user);} return (A) this;
    }

    public Boolean hasUser(){
            return this.user != null;
    }

    public NamedAuthInfoFluent.UserNested<A> withNewUser(){
            return new UserNestedImpl();
    }

    public NamedAuthInfoFluent.UserNested<A> withNewUserLike(AuthInfo item){
            return new UserNestedImpl(item);
    }

    public NamedAuthInfoFluent.UserNested<A> editUser(){
            return withNewUserLike(getUser());
    }

    public NamedAuthInfoFluent.UserNested<A> editOrNewUser(){
            return withNewUserLike(getUser() != null ? getUser(): new AuthInfoBuilder().build());
    }

    public NamedAuthInfoFluent.UserNested<A> editOrNewUserLike(AuthInfo item){
            return withNewUserLike(getUser() != null ? getUser(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            NamedAuthInfoFluentImpl that = (NamedAuthInfoFluentImpl) o;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (user != null ? !user.equals(that.user) :that.user != null) return false;
            return true;
    }


    public class UserNestedImpl<N> extends AuthInfoFluentImpl<NamedAuthInfoFluent.UserNested<N>> implements NamedAuthInfoFluent.UserNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final AuthInfoBuilder builder;
    
            UserNestedImpl(AuthInfo item){
                    this.builder = new AuthInfoBuilder(this, item);
            }
            UserNestedImpl(){
                    this.builder = new AuthInfoBuilder(this);
            }
    
    public N and(){
            return (N) NamedAuthInfoFluentImpl.this.withUser(builder.build());
    }
    public N endUser(){
            return and();
    }

}


}
