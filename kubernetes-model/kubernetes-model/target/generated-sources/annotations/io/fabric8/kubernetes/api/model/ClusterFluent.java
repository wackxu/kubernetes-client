package io.fabric8.kubernetes.api.model;

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

public interface ClusterFluent<A extends ClusterFluent<A>> extends Fluent<A>{


    public String getCertificateAuthority();
    public A withCertificateAuthority(String certificateAuthority);
    public Boolean hasCertificateAuthority();
    public String getCertificateAuthorityData();
    public A withCertificateAuthorityData(String certificateAuthorityData);
    public Boolean hasCertificateAuthorityData();
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
    public ClusterFluent.ExtensionsNested<A> addNewExtension();
    public ClusterFluent.ExtensionsNested<A> addNewExtensionLike(NamedExtension item);
    public ClusterFluent.ExtensionsNested<A> setNewExtensionLike(int index,NamedExtension item);
    public ClusterFluent.ExtensionsNested<A> editExtension(int index);
    public ClusterFluent.ExtensionsNested<A> editFirstExtension();
    public ClusterFluent.ExtensionsNested<A> editLastExtension();
    public ClusterFluent.ExtensionsNested<A> editMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate);
    public Boolean isInsecureSkipTlsVerify();
    public A withInsecureSkipTlsVerify(Boolean insecureSkipTlsVerify);
    public Boolean hasInsecureSkipTlsVerify();
    public A withNewInsecureSkipTlsVerify(String arg1);
    public A withNewInsecureSkipTlsVerify(boolean arg1);
    public String getServer();
    public A withServer(String server);
    public Boolean hasServer();

    public interface ExtensionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedExtensionFluent<ClusterFluent.ExtensionsNested<N>>{

        
    public N and();    public N endExtension();
}


}
