package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
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

public interface RBDVolumeSourceFluent<A extends RBDVolumeSourceFluent<A>> extends Fluent<A>{


    public String getFsType();
    public A withFsType(String fsType);
    public Boolean hasFsType();
    public String getImage();
    public A withImage(String image);
    public Boolean hasImage();
    public String getKeyring();
    public A withKeyring(String keyring);
    public Boolean hasKeyring();
    public A addToMonitors(int index,String item);
    public A setToMonitors(int index,String item);
    public A addToMonitors(String... items);
    public A addAllToMonitors(Collection<String> items);
    public A removeFromMonitors(String... items);
    public A removeAllFromMonitors(Collection<String> items);
    public List<String> getMonitors();
    public String getMonitor(int index);
    public String getFirstMonitor();
    public String getLastMonitor();
    public String getMatchingMonitor(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withMonitors(List<String> monitors);
    public A withMonitors(String... monitors);
    public Boolean hasMonitors();
    public String getPool();
    public A withPool(String pool);
    public Boolean hasPool();
    public Boolean isReadOnly();
    public A withReadOnly(Boolean readOnly);
    public Boolean hasReadOnly();
    public A withNewReadOnly(String arg1);
    public A withNewReadOnly(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public LocalObjectReference getSecretRef();
    public LocalObjectReference buildSecretRef();
    public A withSecretRef(LocalObjectReference secretRef);
    public Boolean hasSecretRef();
    public A withNewSecretRef(String name);
    public RBDVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public RBDVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(LocalObjectReference item);
    public RBDVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public RBDVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public RBDVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(LocalObjectReference item);
    public String getUser();
    public A withUser(String user);
    public Boolean hasUser();

    public interface SecretRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,LocalObjectReferenceFluent<RBDVolumeSourceFluent.SecretRefNested<N>>{

        
    public N and();    public N endSecretRef();
}


}
