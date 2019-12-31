package io.fabric8.kubernetes.api.model.authentication;

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

public interface TokenReviewStatusFluent<A extends TokenReviewStatusFluent<A>> extends Fluent<A>{


    public A addToAudiences(int index,String item);
    public A setToAudiences(int index,String item);
    public A addToAudiences(String... items);
    public A addAllToAudiences(Collection<String> items);
    public A removeFromAudiences(String... items);
    public A removeAllFromAudiences(Collection<String> items);
    public List<String> getAudiences();
    public String getAudience(int index);
    public String getFirstAudience();
    public String getLastAudience();
    public String getMatchingAudience(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withAudiences(List<String> audiences);
    public A withAudiences(String... audiences);
    public Boolean hasAudiences();
    public Boolean isAuthenticated();
    public A withAuthenticated(Boolean authenticated);
    public Boolean hasAuthenticated();
    public A withNewAuthenticated(String arg1);
    public A withNewAuthenticated(boolean arg1);
    public String getError();
    public A withError(String error);
    public Boolean hasError();
    
/**
 * This method has been deprecated, please use method buildUser instead.
 * @return The buildable object.
 */
@Deprecated public UserInfo getUser();
    public UserInfo buildUser();
    public A withUser(UserInfo user);
    public Boolean hasUser();
    public TokenReviewStatusFluent.UserNested<A> withNewUser();
    public TokenReviewStatusFluent.UserNested<A> withNewUserLike(UserInfo item);
    public TokenReviewStatusFluent.UserNested<A> editUser();
    public TokenReviewStatusFluent.UserNested<A> editOrNewUser();
    public TokenReviewStatusFluent.UserNested<A> editOrNewUserLike(UserInfo item);

    public interface UserNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,UserInfoFluent<TokenReviewStatusFluent.UserNested<N>>{

        
    public N and();    public N endUser();
}


}
