package io.fabric8.kubernetes.api.model;

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

public interface NamedAuthInfoFluent<A extends NamedAuthInfoFluent<A>> extends Fluent<A>{


    public String getName();
    public A withName(String name);
    public Boolean hasName();
    
/**
 * This method has been deprecated, please use method buildUser instead.
 * @return The buildable object.
 */
@Deprecated public AuthInfo getUser();
    public AuthInfo buildUser();
    public A withUser(AuthInfo user);
    public Boolean hasUser();
    public NamedAuthInfoFluent.UserNested<A> withNewUser();
    public NamedAuthInfoFluent.UserNested<A> withNewUserLike(AuthInfo item);
    public NamedAuthInfoFluent.UserNested<A> editUser();
    public NamedAuthInfoFluent.UserNested<A> editOrNewUser();
    public NamedAuthInfoFluent.UserNested<A> editOrNewUserLike(AuthInfo item);

    public interface UserNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AuthInfoFluent<NamedAuthInfoFluent.UserNested<N>>{

        
    public N and();    public N endUser();
}


}
