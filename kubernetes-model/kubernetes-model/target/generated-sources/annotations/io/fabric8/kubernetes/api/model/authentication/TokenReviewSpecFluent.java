package io.fabric8.kubernetes.api.model.authentication;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface TokenReviewSpecFluent<A extends TokenReviewSpecFluent<A>> extends Fluent<A>{


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
    public String getToken();
    public A withToken(String token);
    public Boolean hasToken();



}
