package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.ObjectReferenceFluent;
import java.lang.Deprecated;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.model.ObjectReferenceBuilder;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface DeploymentTriggerImageChangeParamsFluent<A extends DeploymentTriggerImageChangeParamsFluent<A>> extends Fluent<A>{


    public Boolean isAutomatic();
    public A withAutomatic(Boolean automatic);
    public Boolean hasAutomatic();
    public A withNewAutomatic(String arg1);
    public A withNewAutomatic(boolean arg1);
    public A addToContainerNames(int index,String item);
    public A setToContainerNames(int index,String item);
    public A addToContainerNames(String... items);
    public A addAllToContainerNames(Collection<String> items);
    public A removeFromContainerNames(String... items);
    public A removeAllFromContainerNames(Collection<String> items);
    public List<String> getContainerNames();
    public String getContainerName(int index);
    public String getFirstContainerName();
    public String getLastContainerName();
    public String getMatchingContainerName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withContainerNames(List<String> containerNames);
    public A withContainerNames(String... containerNames);
    public Boolean hasContainerNames();
    
/**
 * This method has been deprecated, please use method buildFrom instead.
 * @return The buildable object.
 */
@Deprecated public ObjectReference getFrom();
    public ObjectReference buildFrom();
    public A withFrom(ObjectReference from);
    public Boolean hasFrom();
    public DeploymentTriggerImageChangeParamsFluent.FromNested<A> withNewFrom();
    public DeploymentTriggerImageChangeParamsFluent.FromNested<A> withNewFromLike(ObjectReference item);
    public DeploymentTriggerImageChangeParamsFluent.FromNested<A> editFrom();
    public DeploymentTriggerImageChangeParamsFluent.FromNested<A> editOrNewFrom();
    public DeploymentTriggerImageChangeParamsFluent.FromNested<A> editOrNewFromLike(ObjectReference item);
    public String getLastTriggeredImage();
    public A withLastTriggeredImage(String lastTriggeredImage);
    public Boolean hasLastTriggeredImage();

    public interface FromNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,ObjectReferenceFluent<DeploymentTriggerImageChangeParamsFluent.FromNested<N>>{

        
    public N and();    public N endFrom();
}


}
