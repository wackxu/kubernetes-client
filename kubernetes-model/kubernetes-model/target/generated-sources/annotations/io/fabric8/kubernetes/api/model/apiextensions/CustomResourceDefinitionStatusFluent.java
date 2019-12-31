package io.fabric8.kubernetes.api.model.apiextensions;

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

public interface CustomResourceDefinitionStatusFluent<A extends CustomResourceDefinitionStatusFluent<A>> extends Fluent<A>{


    
/**
 * This method has been deprecated, please use method buildAcceptedNames instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionNames getAcceptedNames();
    public CustomResourceDefinitionNames buildAcceptedNames();
    public A withAcceptedNames(CustomResourceDefinitionNames acceptedNames);
    public Boolean hasAcceptedNames();
    public CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNames();
    public CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNamesLike(CustomResourceDefinitionNames item);
    public CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editAcceptedNames();
    public CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editOrNewAcceptedNames();
    public CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editOrNewAcceptedNamesLike(CustomResourceDefinitionNames item);
    public A addToConditions(int index,CustomResourceDefinitionCondition item);
    public A setToConditions(int index,CustomResourceDefinitionCondition item);
    public A addToConditions(CustomResourceDefinitionCondition... items);
    public A addAllToConditions(Collection<CustomResourceDefinitionCondition> items);
    public A removeFromConditions(CustomResourceDefinitionCondition... items);
    public A removeAllFromConditions(Collection<CustomResourceDefinitionCondition> items);
    
/**
 * This method has been deprecated, please use method buildConditions instead.
 * @return The buildable object.
 */
@Deprecated public List<CustomResourceDefinitionCondition> getConditions();
    public List<CustomResourceDefinitionCondition> buildConditions();
    public CustomResourceDefinitionCondition buildCondition(int index);
    public CustomResourceDefinitionCondition buildFirstCondition();
    public CustomResourceDefinitionCondition buildLastCondition();
    public CustomResourceDefinitionCondition buildMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceDefinitionConditionBuilder> predicate);
    public A withConditions(List<CustomResourceDefinitionCondition> conditions);
    public A withConditions(CustomResourceDefinitionCondition... conditions);
    public Boolean hasConditions();
    public A addNewCondition(String lastTransitionTime,String message,String reason,String status,String type);
    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewCondition();
    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewConditionLike(CustomResourceDefinitionCondition item);
    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> setNewConditionLike(int index,CustomResourceDefinitionCondition item);
    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> editCondition(int index);
    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> editFirstCondition();
    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> editLastCondition();
    public CustomResourceDefinitionStatusFluent.ConditionsNested<A> editMatchingCondition(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceDefinitionConditionBuilder> predicate);
    public A addToStoredVersions(int index,String item);
    public A setToStoredVersions(int index,String item);
    public A addToStoredVersions(String... items);
    public A addAllToStoredVersions(Collection<String> items);
    public A removeFromStoredVersions(String... items);
    public A removeAllFromStoredVersions(Collection<String> items);
    public List<String> getStoredVersions();
    public String getStoredVersion(int index);
    public String getFirstStoredVersion();
    public String getLastStoredVersion();
    public String getMatchingStoredVersion(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withStoredVersions(List<String> storedVersions);
    public A withStoredVersions(String... storedVersions);
    public Boolean hasStoredVersions();

    public interface AcceptedNamesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionNamesFluent<CustomResourceDefinitionStatusFluent.AcceptedNamesNested<N>>{

        
    public N and();    public N endAcceptedNames();
}
    public interface ConditionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionConditionFluent<CustomResourceDefinitionStatusFluent.ConditionsNested<N>>{

        
    public N and();    public N endCondition();
}


}
