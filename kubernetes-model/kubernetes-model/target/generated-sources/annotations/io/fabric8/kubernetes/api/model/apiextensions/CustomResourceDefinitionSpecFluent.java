package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import java.util.List;
import java.lang.Boolean;
import io.fabric8.kubernetes.api.builder.Fluent;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface CustomResourceDefinitionSpecFluent<A extends CustomResourceDefinitionSpecFluent<A>> extends Fluent<A>{


    public A addToAdditionalPrinterColumns(int index,CustomResourceColumnDefinition item);
    public A setToAdditionalPrinterColumns(int index,CustomResourceColumnDefinition item);
    public A addToAdditionalPrinterColumns(CustomResourceColumnDefinition... items);
    public A addAllToAdditionalPrinterColumns(Collection<CustomResourceColumnDefinition> items);
    public A removeFromAdditionalPrinterColumns(CustomResourceColumnDefinition... items);
    public A removeAllFromAdditionalPrinterColumns(Collection<CustomResourceColumnDefinition> items);
    
/**
 * This method has been deprecated, please use method buildAdditionalPrinterColumns instead.
 * @return The buildable object.
 */
@Deprecated public List<CustomResourceColumnDefinition> getAdditionalPrinterColumns();
    public List<CustomResourceColumnDefinition> buildAdditionalPrinterColumns();
    public CustomResourceColumnDefinition buildAdditionalPrinterColumn(int index);
    public CustomResourceColumnDefinition buildFirstAdditionalPrinterColumn();
    public CustomResourceColumnDefinition buildLastAdditionalPrinterColumn();
    public CustomResourceColumnDefinition buildMatchingAdditionalPrinterColumn(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceColumnDefinitionBuilder> predicate);
    public A withAdditionalPrinterColumns(List<CustomResourceColumnDefinition> additionalPrinterColumns);
    public A withAdditionalPrinterColumns(CustomResourceColumnDefinition... additionalPrinterColumns);
    public Boolean hasAdditionalPrinterColumns();
    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumn();
    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumnLike(CustomResourceColumnDefinition item);
    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> setNewAdditionalPrinterColumnLike(int index,CustomResourceColumnDefinition item);
    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editAdditionalPrinterColumn(int index);
    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editFirstAdditionalPrinterColumn();
    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editLastAdditionalPrinterColumn();
    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editMatchingAdditionalPrinterColumn(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceColumnDefinitionBuilder> predicate);
    
/**
 * This method has been deprecated, please use method buildConversion instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceConversion getConversion();
    public CustomResourceConversion buildConversion();
    public A withConversion(CustomResourceConversion conversion);
    public Boolean hasConversion();
    public CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversion();
    public CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversionLike(CustomResourceConversion item);
    public CustomResourceDefinitionSpecFluent.ConversionNested<A> editConversion();
    public CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversion();
    public CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversionLike(CustomResourceConversion item);
    public String getGroup();
    public A withGroup(String group);
    public Boolean hasGroup();
    
/**
 * This method has been deprecated, please use method buildNames instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionNames getNames();
    public CustomResourceDefinitionNames buildNames();
    public A withNames(CustomResourceDefinitionNames names);
    public Boolean hasNames();
    public CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNames();
    public CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNamesLike(CustomResourceDefinitionNames item);
    public CustomResourceDefinitionSpecFluent.NamesNested<A> editNames();
    public CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNames();
    public CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNamesLike(CustomResourceDefinitionNames item);
    public String getScope();
    public A withScope(String scope);
    public Boolean hasScope();
    
/**
 * This method has been deprecated, please use method buildSubresources instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceSubresources getSubresources();
    public CustomResourceSubresources buildSubresources();
    public A withSubresources(CustomResourceSubresources subresources);
    public Boolean hasSubresources();
    public CustomResourceDefinitionSpecFluent.SubresourcesNested<A> withNewSubresources();
    public CustomResourceDefinitionSpecFluent.SubresourcesNested<A> withNewSubresourcesLike(CustomResourceSubresources item);
    public CustomResourceDefinitionSpecFluent.SubresourcesNested<A> editSubresources();
    public CustomResourceDefinitionSpecFluent.SubresourcesNested<A> editOrNewSubresources();
    public CustomResourceDefinitionSpecFluent.SubresourcesNested<A> editOrNewSubresourcesLike(CustomResourceSubresources item);
    
/**
 * This method has been deprecated, please use method buildValidation instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceValidation getValidation();
    public CustomResourceValidation buildValidation();
    public A withValidation(CustomResourceValidation validation);
    public Boolean hasValidation();
    public CustomResourceDefinitionSpecFluent.ValidationNested<A> withNewValidation();
    public CustomResourceDefinitionSpecFluent.ValidationNested<A> withNewValidationLike(CustomResourceValidation item);
    public CustomResourceDefinitionSpecFluent.ValidationNested<A> editValidation();
    public CustomResourceDefinitionSpecFluent.ValidationNested<A> editOrNewValidation();
    public CustomResourceDefinitionSpecFluent.ValidationNested<A> editOrNewValidationLike(CustomResourceValidation item);
    public String getVersion();
    public A withVersion(String version);
    public Boolean hasVersion();
    public A addToVersions(int index,CustomResourceDefinitionVersion item);
    public A setToVersions(int index,CustomResourceDefinitionVersion item);
    public A addToVersions(CustomResourceDefinitionVersion... items);
    public A addAllToVersions(Collection<CustomResourceDefinitionVersion> items);
    public A removeFromVersions(CustomResourceDefinitionVersion... items);
    public A removeAllFromVersions(Collection<CustomResourceDefinitionVersion> items);
    
/**
 * This method has been deprecated, please use method buildVersions instead.
 * @return The buildable object.
 */
@Deprecated public List<CustomResourceDefinitionVersion> getVersions();
    public List<CustomResourceDefinitionVersion> buildVersions();
    public CustomResourceDefinitionVersion buildVersion(int index);
    public CustomResourceDefinitionVersion buildFirstVersion();
    public CustomResourceDefinitionVersion buildLastVersion();
    public CustomResourceDefinitionVersion buildMatchingVersion(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceDefinitionVersionBuilder> predicate);
    public A withVersions(List<CustomResourceDefinitionVersion> versions);
    public A withVersions(CustomResourceDefinitionVersion... versions);
    public Boolean hasVersions();
    public CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersion();
    public CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersionLike(CustomResourceDefinitionVersion item);
    public CustomResourceDefinitionSpecFluent.VersionsNested<A> setNewVersionLike(int index,CustomResourceDefinitionVersion item);
    public CustomResourceDefinitionSpecFluent.VersionsNested<A> editVersion(int index);
    public CustomResourceDefinitionSpecFluent.VersionsNested<A> editFirstVersion();
    public CustomResourceDefinitionSpecFluent.VersionsNested<A> editLastVersion();
    public CustomResourceDefinitionSpecFluent.VersionsNested<A> editMatchingVersion(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceDefinitionVersionBuilder> predicate);

    public interface AdditionalPrinterColumnsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceColumnDefinitionFluent<CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<N>>{

        
    public N and();    public N endAdditionalPrinterColumn();
}
    public interface ConversionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceConversionFluent<CustomResourceDefinitionSpecFluent.ConversionNested<N>>{

        
    public N and();    public N endConversion();
}
    public interface NamesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionNamesFluent<CustomResourceDefinitionSpecFluent.NamesNested<N>>{

        
    public N and();    public N endNames();
}
    public interface SubresourcesNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceSubresourcesFluent<CustomResourceDefinitionSpecFluent.SubresourcesNested<N>>{

        
    public N and();    public N endSubresources();
}
    public interface ValidationNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceValidationFluent<CustomResourceDefinitionSpecFluent.ValidationNested<N>>{

        
    public N and();    public N endValidation();
}
    public interface VersionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,CustomResourceDefinitionVersionFluent<CustomResourceDefinitionSpecFluent.VersionsNested<N>>{

        
    public N and();    public N endVersion();
}


}
