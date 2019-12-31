package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface ServiceAccountTokenProjectionFluent<A extends ServiceAccountTokenProjectionFluent<A>> extends Fluent<A>{


    public String getAudience();
    public A withAudience(String audience);
    public Boolean hasAudience();
    public Long getExpirationSeconds();
    public A withExpirationSeconds(Long expirationSeconds);
    public Boolean hasExpirationSeconds();
    public A withNewExpirationSeconds(String arg1);
    public A withNewExpirationSeconds(long arg1);
    public String getPath();
    public A withPath(String path);
    public Boolean hasPath();



}
