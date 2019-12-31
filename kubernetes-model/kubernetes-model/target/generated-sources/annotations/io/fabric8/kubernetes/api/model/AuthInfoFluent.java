package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface AuthInfoFluent<A extends AuthInfoFluent<A>> extends Fluent<A>{


    public String getAs();
    public A withAs(String as);
    public Boolean hasAs();
    public A addToAsGroups(int index,String item);
    public A setToAsGroups(int index,String item);
    public A addToAsGroups(String... items);
    public A addAllToAsGroups(Collection<String> items);
    public A removeFromAsGroups(String... items);
    public A removeAllFromAsGroups(Collection<String> items);
    public List<String> getAsGroups();
    public String getAsGroup(int index);
    public String getFirstAsGroup();
    public String getLastAsGroup();
    public String getMatchingAsGroup(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withAsGroups(List<String> asGroups);
    public A withAsGroups(String... asGroups);
    public Boolean hasAsGroups();
    public A addToAsUserExtra(String key,ArrayList<String> value);
    public A addToAsUserExtra(Map<String,ArrayList<String>> map);
    public A removeFromAsUserExtra(String key);
    public A removeFromAsUserExtra(Map<String,ArrayList<String>> map);
    public Map<String,ArrayList<String>> getAsUserExtra();
    public A withAsUserExtra(Map<String,ArrayList<String>> asUserExtra);
    public Boolean hasAsUserExtra();
    
/**
 * This method has been deprecated, please use method buildAuthProvider instead.
 * @return The buildable object.
 */
@Deprecated public AuthProviderConfig getAuthProvider();
    public AuthProviderConfig buildAuthProvider();
    public A withAuthProvider(AuthProviderConfig authProvider);
    public Boolean hasAuthProvider();
    public AuthInfoFluent.AuthProviderNested<A> withNewAuthProvider();
    public AuthInfoFluent.AuthProviderNested<A> withNewAuthProviderLike(AuthProviderConfig item);
    public AuthInfoFluent.AuthProviderNested<A> editAuthProvider();
    public AuthInfoFluent.AuthProviderNested<A> editOrNewAuthProvider();
    public AuthInfoFluent.AuthProviderNested<A> editOrNewAuthProviderLike(AuthProviderConfig item);
    public String getClientCertificate();
    public A withClientCertificate(String clientCertificate);
    public Boolean hasClientCertificate();
    public String getClientCertificateData();
    public A withClientCertificateData(String clientCertificateData);
    public Boolean hasClientCertificateData();
    public String getClientKey();
    public A withClientKey(String clientKey);
    public Boolean hasClientKey();
    public String getClientKeyData();
    public A withClientKeyData(String clientKeyData);
    public Boolean hasClientKeyData();
    
/**
 * This method has been deprecated, please use method buildExec instead.
 * @return The buildable object.
 */
@Deprecated public ExecConfig getExec();
    public ExecConfig buildExec();
    public A withExec(ExecConfig exec);
    public Boolean hasExec();
    public AuthInfoFluent.ExecNested<A> withNewExec();
    public AuthInfoFluent.ExecNested<A> withNewExecLike(ExecConfig item);
    public AuthInfoFluent.ExecNested<A> editExec();
    public AuthInfoFluent.ExecNested<A> editOrNewExec();
    public AuthInfoFluent.ExecNested<A> editOrNewExecLike(ExecConfig item);
    public A addToExtensions(int index,NamedExtension item);
    public A setToExtensions(int index,NamedExtension item);
    public A addToExtensions(NamedExtension... items);
    public A addAllToExtensions(Collection<NamedExtension> items);
    public A removeFromExtensions(NamedExtension... items);
    public A removeAllFromExtensions(Collection<NamedExtension> items);
    
/**
 * This method has been deprecated, please use method buildExtensions instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedExtension> getExtensions();
    public List<NamedExtension> buildExtensions();
    public NamedExtension buildExtension(int index);
    public NamedExtension buildFirstExtension();
    public NamedExtension buildLastExtension();
    public NamedExtension buildMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate);
    public A withExtensions(List<NamedExtension> extensions);
    public A withExtensions(NamedExtension... extensions);
    public Boolean hasExtensions();
    public AuthInfoFluent.ExtensionsNested<A> addNewExtension();
    public AuthInfoFluent.ExtensionsNested<A> addNewExtensionLike(NamedExtension item);
    public AuthInfoFluent.ExtensionsNested<A> setNewExtensionLike(int index,NamedExtension item);
    public AuthInfoFluent.ExtensionsNested<A> editExtension(int index);
    public AuthInfoFluent.ExtensionsNested<A> editFirstExtension();
    public AuthInfoFluent.ExtensionsNested<A> editLastExtension();
    public AuthInfoFluent.ExtensionsNested<A> editMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate);
    public String getPassword();
    public A withPassword(String password);
    public Boolean hasPassword();
    public String getToken();
    public A withToken(String token);
    public Boolean hasToken();
    public String getTokenFile();
    public A withTokenFile(String tokenFile);
    public Boolean hasTokenFile();
    public String getUsername();
    public A withUsername(String username);
    public Boolean hasUsername();

    public interface AuthProviderNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,AuthProviderConfigFluent<AuthInfoFluent.AuthProviderNested<N>>{

        
    public N and();    public N endAuthProvider();
}
    public interface ExecNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ExecConfigFluent<AuthInfoFluent.ExecNested<N>>{

        
    public N and();    public N endExec();
}
    public interface ExtensionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedExtensionFluent<AuthInfoFluent.ExtensionsNested<N>>{

        
    public N and();    public N endExtension();
}


}
