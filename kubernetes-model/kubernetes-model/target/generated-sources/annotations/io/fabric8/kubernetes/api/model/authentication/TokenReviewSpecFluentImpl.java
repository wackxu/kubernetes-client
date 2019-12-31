package io.fabric8.kubernetes.api.model.authentication;

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

public class TokenReviewSpecFluentImpl<A extends TokenReviewSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TokenReviewSpecFluent<A>{

    private List<String> audiences;
    private String token;

    public TokenReviewSpecFluentImpl(){
    }
    public TokenReviewSpecFluentImpl(TokenReviewSpec instance){
            this.withAudiences(instance.getAudiences()); 
            this.withToken(instance.getToken()); 
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

    public String getToken(){
            return this.token;
    }

    public A withToken(String token){
            this.token=token; return (A) this;
    }

    public Boolean hasToken(){
            return this.token != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TokenReviewSpecFluentImpl that = (TokenReviewSpecFluentImpl) o;
            if (audiences != null ? !audiences.equals(that.audiences) :that.audiences != null) return false;
            if (token != null ? !token.equals(that.token) :that.token != null) return false;
            return true;
    }




}
