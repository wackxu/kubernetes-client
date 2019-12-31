package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface ISCSIPersistentVolumeSourceFluent<A extends ISCSIPersistentVolumeSourceFluent<A>> extends Fluent<A>{


    public Boolean isChapAuthDiscovery();
    public A withChapAuthDiscovery(Boolean chapAuthDiscovery);
    public Boolean hasChapAuthDiscovery();
    public A withNewChapAuthDiscovery(String arg1);
    public A withNewChapAuthDiscovery(boolean arg1);
    public Boolean isChapAuthSession();
    public A withChapAuthSession(Boolean chapAuthSession);
    public Boolean hasChapAuthSession();
    public A withNewChapAuthSession(String arg1);
    public A withNewChapAuthSession(boolean arg1);
    public String getFsType();
    public A withFsType(String fsType);
    public Boolean hasFsType();
    public String getInitiatorName();
    public A withInitiatorName(String initiatorName);
    public Boolean hasInitiatorName();
    public String getIqn();
    public A withIqn(String iqn);
    public Boolean hasIqn();
    public String getIscsiInterface();
    public A withIscsiInterface(String iscsiInterface);
    public Boolean hasIscsiInterface();
    public Integer getLun();
    public A withLun(Integer lun);
    public Boolean hasLun();
    public A addToPortals(int index,String item);
    public A setToPortals(int index,String item);
    public A addToPortals(String... items);
    public A addAllToPortals(Collection<String> items);
    public A removeFromPortals(String... items);
    public A removeAllFromPortals(Collection<String> items);
    public List<String> getPortals();
    public String getPortal(int index);
    public String getFirstPortal();
    public String getLastPortal();
    public String getMatchingPortal(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withPortals(List<String> portals);
    public A withPortals(String... portals);
    public Boolean hasPortals();
    public Boolean isReadOnly();
    public A withReadOnly(Boolean readOnly);
    public Boolean hasReadOnly();
    public A withNewReadOnly(String arg1);
    public A withNewReadOnly(boolean arg1);
    
/**
 * This method has been deprecated, please use method buildSecretRef instead.
 * @return The buildable object.
 */
@Deprecated public SecretReference getSecretRef();
    public SecretReference buildSecretRef();
    public A withSecretRef(SecretReference secretRef);
    public Boolean hasSecretRef();
    public A withNewSecretRef(String name,String namespace);
    public ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
    public ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(SecretReference item);
    public ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
    public ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
    public ISCSIPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(SecretReference item);
    public String getTargetPortal();
    public A withTargetPortal(String targetPortal);
    public Boolean hasTargetPortal();

    public interface SecretRefNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,SecretReferenceFluent<ISCSIPersistentVolumeSourceFluent.SecretRefNested<N>>{

        
    public N and();    public N endSecretRef();
}


}
