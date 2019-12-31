package io.fabric8.kubernetes.api.model.extensions;

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

public interface IngressTLSFluent<A extends IngressTLSFluent<A>> extends Fluent<A>{


    public A addToHosts(int index,String item);
    public A setToHosts(int index,String item);
    public A addToHosts(String... items);
    public A addAllToHosts(Collection<String> items);
    public A removeFromHosts(String... items);
    public A removeAllFromHosts(Collection<String> items);
    public List<String> getHosts();
    public String getHost(int index);
    public String getFirstHost();
    public String getLastHost();
    public String getMatchingHost(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withHosts(List<String> hosts);
    public A withHosts(String... hosts);
    public Boolean hasHosts();
    public String getSecretName();
    public A withSecretName(String secretName);
    public Boolean hasSecretName();



}
