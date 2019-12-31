package io.fabric8.kubernetes.api.model.authentication;

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

public class TokenReviewStatusFluentImpl<A extends TokenReviewStatusFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TokenReviewStatusFluent<A>{

    private List<String> audiences;
    private Boolean authenticated;
    private String error;
    private UserInfoBuilder user;

    public TokenReviewStatusFluentImpl(){
    }
    public TokenReviewStatusFluentImpl(TokenReviewStatus instance){
            this.withAudiences(instance.getAudiences()); 
            this.withAuthenticated(instance.getAuthenticated()); 
            this.withError(instance.getError()); 
            this.withUser(instance.getUser()); 
    }

    public A addToAudiences(int index,String item){
            if (this.audiences == null) {this.audiences = new ArrayList<String>();}
            this.audiences.add(index, item);
            return (A)this;
    }

    public A setToAudiences(int index,String item){
            if (this.audiences == null) {this.audiences = new ArrayList<String>();}
            this.audiences.set(index, item); return (A)this;
    }

    public A addToAudiences(String... items){
            if (this.audiences == null) {this.audiences = new ArrayList<String>();}
            for (String item : items) {this.audiences.add(item);} return (A)this;
    }

    public A addAllToAudiences(Collection<String> items){
            if (this.audiences == null) {this.audiences = new ArrayList<String>();}
            for (String item : items) {this.audiences.add(item);} return (A)this;
    }

    public A removeFromAudiences(String... items){
            for (String item : items) {if (this.audiences!= null){ this.audiences.remove(item);}} return (A)this;
    }

    public A removeAllFromAudiences(Collection<String> items){
            for (String item : items) {if (this.audiences!= null){ this.audiences.remove(item);}} return (A)this;
    }

    public List<String> getAudiences(){
            return this.audiences;
    }

    public String getAudience(int index){
            return this.audiences.get(index);
    }

    public String getFirstAudience(){
            return this.audiences.get(0);
    }

    public String getLastAudience(){
            return this.audiences.get(audiences.size() - 1);
    }

    public String getMatchingAudience(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: audiences) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withAudiences(List<String> audiences){
            if (this.audiences != null) { _visitables.removeAll(this.audiences);}
            if (audiences != null) {this.audiences = new ArrayList<String>(); for (String item : audiences){this.addToAudiences(item);}} else { this.audiences = new ArrayList<String>();} return (A) this;
    }

    public A withAudiences(String... audiences){
            if (this.audiences != null) {this.audiences.clear();}
            if (audiences != null) {for (String item :audiences){ this.addToAudiences(item);}} return (A) this;
    }

    public Boolean hasAudiences(){
            return audiences != null && !audiences.isEmpty();
    }

    public Boolean isAuthenticated(){
            return this.authenticated;
    }

    public A withAuthenticated(Boolean authenticated){
            this.authenticated=authenticated; return (A) this;
    }

    public Boolean hasAuthenticated(){
            return this.authenticated != null;
    }

    public A withNewAuthenticated(String arg1){
            return (A)withAuthenticated(new Boolean(arg1));
    }

    public A withNewAuthenticated(boolean arg1){
            return (A)withAuthenticated(new Boolean(arg1));
    }

    public String getError(){
            return this.error;
    }

    public A withError(String error){
            this.error=error; return (A) this;
    }

    public Boolean hasError(){
            return this.error != null;
    }

    
/**
 * This method has been deprecated, please use method buildUser instead.
 * @return The buildable object.
 */
@Deprecated public UserInfo getUser(){
            return this.user!=null?this.user.build():null;
    }

    public UserInfo buildUser(){
            return this.user!=null?this.user.build():null;
    }

    public A withUser(UserInfo user){
            _visitables.remove(this.user);
            if (user!=null){ this.user= new UserInfoBuilder(user); _visitables.add(this.user);} return (A) this;
    }

    public Boolean hasUser(){
            return this.user != null;
    }

    public TokenReviewStatusFluent.UserNested<A> withNewUser(){
            return new UserNestedImpl();
    }

    public TokenReviewStatusFluent.UserNested<A> withNewUserLike(UserInfo item){
            return new UserNestedImpl(item);
    }

    public TokenReviewStatusFluent.UserNested<A> editUser(){
            return withNewUserLike(getUser());
    }

    public TokenReviewStatusFluent.UserNested<A> editOrNewUser(){
            return withNewUserLike(getUser() != null ? getUser(): new UserInfoBuilder().build());
    }

    public TokenReviewStatusFluent.UserNested<A> editOrNewUserLike(UserInfo item){
            return withNewUserLike(getUser() != null ? getUser(): item);
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TokenReviewStatusFluentImpl that = (TokenReviewStatusFluentImpl) o;
            if (audiences != null ? !audiences.equals(that.audiences) :that.audiences != null) return false;
            if (authenticated != null ? !authenticated.equals(that.authenticated) :that.authenticated != null) return false;
            if (error != null ? !error.equals(that.error) :that.error != null) return false;
            if (user != null ? !user.equals(that.user) :that.user != null) return false;
            return true;
    }


    public class UserNestedImpl<N> extends UserInfoFluentImpl<TokenReviewStatusFluent.UserNested<N>> implements TokenReviewStatusFluent.UserNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final UserInfoBuilder builder;
    
            UserNestedImpl(UserInfo item){
                    this.builder = new UserInfoBuilder(this, item);
            }
            UserNestedImpl(){
                    this.builder = new UserInfoBuilder(this);
            }
    
    public N and(){
            return (N) TokenReviewStatusFluentImpl.this.withUser(builder.build());
    }
    public N endUser(){
            return and();
    }

}


}
