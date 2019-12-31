package io.fabric8.kubernetes.api.model.apiextensions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.List;
import java.lang.Boolean;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;

public class CustomResourceDefinitionSpecFluentImpl<A extends CustomResourceDefinitionSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements CustomResourceDefinitionSpecFluent<A>{

    private List<CustomResourceColumnDefinitionBuilder> additionalPrinterColumns;
    private CustomResourceConversionBuilder conversion;
    private String group;
    private CustomResourceDefinitionNamesBuilder names;
    private String scope;
    private CustomResourceSubresourcesBuilder subresources;
    private CustomResourceValidationBuilder validation;
    private String version;
    private List<CustomResourceDefinitionVersionBuilder> versions;

    public CustomResourceDefinitionSpecFluentImpl(){
    }
    public CustomResourceDefinitionSpecFluentImpl(CustomResourceDefinitionSpec instance){
            this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns()); 
            this.withConversion(instance.getConversion()); 
            this.withGroup(instance.getGroup()); 
            this.withNames(instance.getNames()); 
            this.withScope(instance.getScope()); 
            this.withSubresources(instance.getSubresources()); 
            this.withValidation(instance.getValidation()); 
            this.withVersion(instance.getVersion()); 
            this.withVersions(instance.getVersions()); 
    }

    public A addToAdditionalPrinterColumns(int index,CustomResourceColumnDefinition item){
            if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinitionBuilder>();}
            CustomResourceColumnDefinitionBuilder builder = new CustomResourceColumnDefinitionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.additionalPrinterColumns.add(index >= 0 ? index : additionalPrinterColumns.size(), builder); return (A)this;
    }

    public A setToAdditionalPrinterColumns(int index,CustomResourceColumnDefinition item){
            if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinitionBuilder>();}
            CustomResourceColumnDefinitionBuilder builder = new CustomResourceColumnDefinitionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= additionalPrinterColumns.size()) { additionalPrinterColumns.add(builder); } else { additionalPrinterColumns.set(index, builder);}
             return (A)this;
    }

    public A addToAdditionalPrinterColumns(CustomResourceColumnDefinition... items){
            if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinitionBuilder>();}
            for (CustomResourceColumnDefinition item : items) {CustomResourceColumnDefinitionBuilder builder = new CustomResourceColumnDefinitionBuilder(item);_visitables.add(builder);this.additionalPrinterColumns.add(builder);} return (A)this;
    }

    public A addAllToAdditionalPrinterColumns(Collection<CustomResourceColumnDefinition> items){
            if (this.additionalPrinterColumns == null) {this.additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinitionBuilder>();}
            for (CustomResourceColumnDefinition item : items) {CustomResourceColumnDefinitionBuilder builder = new CustomResourceColumnDefinitionBuilder(item);_visitables.add(builder);this.additionalPrinterColumns.add(builder);} return (A)this;
    }

    public A removeFromAdditionalPrinterColumns(CustomResourceColumnDefinition... items){
            for (CustomResourceColumnDefinition item : items) {CustomResourceColumnDefinitionBuilder builder = new CustomResourceColumnDefinitionBuilder(item);_visitables.remove(builder);if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.remove(builder);}} return (A)this;
    }

    public A removeAllFromAdditionalPrinterColumns(Collection<CustomResourceColumnDefinition> items){
            for (CustomResourceColumnDefinition item : items) {CustomResourceColumnDefinitionBuilder builder = new CustomResourceColumnDefinitionBuilder(item);_visitables.remove(builder);if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildAdditionalPrinterColumns instead.
 * @return The buildable object.
 */
@Deprecated public List<CustomResourceColumnDefinition> getAdditionalPrinterColumns(){
            return build(additionalPrinterColumns);
    }

    public List<CustomResourceColumnDefinition> buildAdditionalPrinterColumns(){
            return build(additionalPrinterColumns);
    }

    public CustomResourceColumnDefinition buildAdditionalPrinterColumn(int index){
            return this.additionalPrinterColumns.get(index).build();
    }

    public CustomResourceColumnDefinition buildFirstAdditionalPrinterColumn(){
            return this.additionalPrinterColumns.get(0).build();
    }

    public CustomResourceColumnDefinition buildLastAdditionalPrinterColumn(){
            return this.additionalPrinterColumns.get(additionalPrinterColumns.size() - 1).build();
    }

    public CustomResourceColumnDefinition buildMatchingAdditionalPrinterColumn(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceColumnDefinitionBuilder> predicate){
            for (CustomResourceColumnDefinitionBuilder item: additionalPrinterColumns) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withAdditionalPrinterColumns(List<CustomResourceColumnDefinition> additionalPrinterColumns){
            if (this.additionalPrinterColumns != null) { _visitables.removeAll(this.additionalPrinterColumns);}
            if (additionalPrinterColumns != null) {this.additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinitionBuilder>(); for (CustomResourceColumnDefinition item : additionalPrinterColumns){this.addToAdditionalPrinterColumns(item);}} else { this.additionalPrinterColumns = new ArrayList<CustomResourceColumnDefinitionBuilder>();} return (A) this;
    }

    public A withAdditionalPrinterColumns(CustomResourceColumnDefinition... additionalPrinterColumns){
            if (this.additionalPrinterColumns != null) {this.additionalPrinterColumns.clear();}
            if (additionalPrinterColumns != null) {for (CustomResourceColumnDefinition item :additionalPrinterColumns){ this.addToAdditionalPrinterColumns(item);}} return (A) this;
    }

    public Boolean hasAdditionalPrinterColumns(){
            return additionalPrinterColumns != null && !additionalPrinterColumns.isEmpty();
    }

    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumn(){
            return new AdditionalPrinterColumnsNestedImpl();
    }

    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> addNewAdditionalPrinterColumnLike(CustomResourceColumnDefinition item){
            return new AdditionalPrinterColumnsNestedImpl(-1, item);
    }

    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> setNewAdditionalPrinterColumnLike(int index,CustomResourceColumnDefinition item){
            return new AdditionalPrinterColumnsNestedImpl(index, item);
    }

    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editAdditionalPrinterColumn(int index){
            if (additionalPrinterColumns.size() <= index) throw new RuntimeException("Can't edit additionalPrinterColumns. Index exceeds size.");
            return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
    }

    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editFirstAdditionalPrinterColumn(){
            if (additionalPrinterColumns.size() == 0) throw new RuntimeException("Can't edit first additionalPrinterColumns. The list is empty.");
            return setNewAdditionalPrinterColumnLike(0, buildAdditionalPrinterColumn(0));
    }

    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editLastAdditionalPrinterColumn(){
            int index = additionalPrinterColumns.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last additionalPrinterColumns. The list is empty.");
            return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
    }

    public CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<A> editMatchingAdditionalPrinterColumn(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceColumnDefinitionBuilder> predicate){
            int index = -1;
            for (int i=0;i<additionalPrinterColumns.size();i++) { 
            if (predicate.apply(additionalPrinterColumns.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching additionalPrinterColumns. No match found.");
            return setNewAdditionalPrinterColumnLike(index, buildAdditionalPrinterColumn(index));
    }

    
/**
 * This method has been deprecated, please use method buildConversion instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceConversion getConversion(){
            return this.conversion!=null?this.conversion.build():null;
    }

    public CustomResourceConversion buildConversion(){
            return this.conversion!=null?this.conversion.build():null;
    }

    public A withConversion(CustomResourceConversion conversion){
            _visitables.remove(this.conversion);
            if (conversion!=null){ this.conversion= new CustomResourceConversionBuilder(conversion); _visitables.add(this.conversion);} return (A) this;
    }

    public Boolean hasConversion(){
            return this.conversion != null;
    }

    public CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversion(){
            return new ConversionNestedImpl();
    }

    public CustomResourceDefinitionSpecFluent.ConversionNested<A> withNewConversionLike(CustomResourceConversion item){
            return new ConversionNestedImpl(item);
    }

    public CustomResourceDefinitionSpecFluent.ConversionNested<A> editConversion(){
            return withNewConversionLike(getConversion());
    }

    public CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversion(){
            return withNewConversionLike(getConversion() != null ? getConversion(): new CustomResourceConversionBuilder().build());
    }

    public CustomResourceDefinitionSpecFluent.ConversionNested<A> editOrNewConversionLike(CustomResourceConversion item){
            return withNewConversionLike(getConversion() != null ? getConversion(): item);
    }

    public String getGroup(){
            return this.group;
    }

    public A withGroup(String group){
            this.group=group; return (A) this;
    }

    public Boolean hasGroup(){
            return this.group != null;
    }

    
/**
 * This method has been deprecated, please use method buildNames instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceDefinitionNames getNames(){
            return this.names!=null?this.names.build():null;
    }

    public CustomResourceDefinitionNames buildNames(){
            return this.names!=null?this.names.build():null;
    }

    public A withNames(CustomResourceDefinitionNames names){
            _visitables.remove(this.names);
            if (names!=null){ this.names= new CustomResourceDefinitionNamesBuilder(names); _visitables.add(this.names);} return (A) this;
    }

    public Boolean hasNames(){
            return this.names != null;
    }

    public CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNames(){
            return new NamesNestedImpl();
    }

    public CustomResourceDefinitionSpecFluent.NamesNested<A> withNewNamesLike(CustomResourceDefinitionNames item){
            return new NamesNestedImpl(item);
    }

    public CustomResourceDefinitionSpecFluent.NamesNested<A> editNames(){
            return withNewNamesLike(getNames());
    }

    public CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNames(){
            return withNewNamesLike(getNames() != null ? getNames(): new CustomResourceDefinitionNamesBuilder().build());
    }

    public CustomResourceDefinitionSpecFluent.NamesNested<A> editOrNewNamesLike(CustomResourceDefinitionNames item){
            return withNewNamesLike(getNames() != null ? getNames(): item);
    }

    public String getScope(){
            return this.scope;
    }

    public A withScope(String scope){
            this.scope=scope; return (A) this;
    }

    public Boolean hasScope(){
            return this.scope != null;
    }

    
/**
 * This method has been deprecated, please use method buildSubresources instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceSubresources getSubresources(){
            return this.subresources!=null?this.subresources.build():null;
    }

    public CustomResourceSubresources buildSubresources(){
            return this.subresources!=null?this.subresources.build():null;
    }

    public A withSubresources(CustomResourceSubresources subresources){
            _visitables.remove(this.subresources);
            if (subresources!=null){ this.subresources= new CustomResourceSubresourcesBuilder(subresources); _visitables.add(this.subresources);} return (A) this;
    }

    public Boolean hasSubresources(){
            return this.subresources != null;
    }

    public CustomResourceDefinitionSpecFluent.SubresourcesNested<A> withNewSubresources(){
            return new SubresourcesNestedImpl();
    }

    public CustomResourceDefinitionSpecFluent.SubresourcesNested<A> withNewSubresourcesLike(CustomResourceSubresources item){
            return new SubresourcesNestedImpl(item);
    }

    public CustomResourceDefinitionSpecFluent.SubresourcesNested<A> editSubresources(){
            return withNewSubresourcesLike(getSubresources());
    }

    public CustomResourceDefinitionSpecFluent.SubresourcesNested<A> editOrNewSubresources(){
            return withNewSubresourcesLike(getSubresources() != null ? getSubresources(): new CustomResourceSubresourcesBuilder().build());
    }

    public CustomResourceDefinitionSpecFluent.SubresourcesNested<A> editOrNewSubresourcesLike(CustomResourceSubresources item){
            return withNewSubresourcesLike(getSubresources() != null ? getSubresources(): item);
    }

    
/**
 * This method has been deprecated, please use method buildValidation instead.
 * @return The buildable object.
 */
@Deprecated public CustomResourceValidation getValidation(){
            return this.validation!=null?this.validation.build():null;
    }

    public CustomResourceValidation buildValidation(){
            return this.validation!=null?this.validation.build():null;
    }

    public A withValidation(CustomResourceValidation validation){
            _visitables.remove(this.validation);
            if (validation!=null){ this.validation= new CustomResourceValidationBuilder(validation); _visitables.add(this.validation);} return (A) this;
    }

    public Boolean hasValidation(){
            return this.validation != null;
    }

    public CustomResourceDefinitionSpecFluent.ValidationNested<A> withNewValidation(){
            return new ValidationNestedImpl();
    }

    public CustomResourceDefinitionSpecFluent.ValidationNested<A> withNewValidationLike(CustomResourceValidation item){
            return new ValidationNestedImpl(item);
    }

    public CustomResourceDefinitionSpecFluent.ValidationNested<A> editValidation(){
            return withNewValidationLike(getValidation());
    }

    public CustomResourceDefinitionSpecFluent.ValidationNested<A> editOrNewValidation(){
            return withNewValidationLike(getValidation() != null ? getValidation(): new CustomResourceValidationBuilder().build());
    }

    public CustomResourceDefinitionSpecFluent.ValidationNested<A> editOrNewValidationLike(CustomResourceValidation item){
            return withNewValidationLike(getValidation() != null ? getValidation(): item);
    }

    public String getVersion(){
            return this.version;
    }

    public A withVersion(String version){
            this.version=version; return (A) this;
    }

    public Boolean hasVersion(){
            return this.version != null;
    }

    public A addToVersions(int index,CustomResourceDefinitionVersion item){
            if (this.versions == null) {this.versions = new ArrayList<CustomResourceDefinitionVersionBuilder>();}
            CustomResourceDefinitionVersionBuilder builder = new CustomResourceDefinitionVersionBuilder(item);_visitables.add(index >= 0 ? index : _visitables.size(), builder);this.versions.add(index >= 0 ? index : versions.size(), builder); return (A)this;
    }

    public A setToVersions(int index,CustomResourceDefinitionVersion item){
            if (this.versions == null) {this.versions = new ArrayList<CustomResourceDefinitionVersionBuilder>();}
            CustomResourceDefinitionVersionBuilder builder = new CustomResourceDefinitionVersionBuilder(item);
            if (index < 0 || index >= _visitables.size()) { _visitables.add(builder); } else { _visitables.set(index, builder);}
            if (index < 0 || index >= versions.size()) { versions.add(builder); } else { versions.set(index, builder);}
             return (A)this;
    }

    public A addToVersions(CustomResourceDefinitionVersion... items){
            if (this.versions == null) {this.versions = new ArrayList<CustomResourceDefinitionVersionBuilder>();}
            for (CustomResourceDefinitionVersion item : items) {CustomResourceDefinitionVersionBuilder builder = new CustomResourceDefinitionVersionBuilder(item);_visitables.add(builder);this.versions.add(builder);} return (A)this;
    }

    public A addAllToVersions(Collection<CustomResourceDefinitionVersion> items){
            if (this.versions == null) {this.versions = new ArrayList<CustomResourceDefinitionVersionBuilder>();}
            for (CustomResourceDefinitionVersion item : items) {CustomResourceDefinitionVersionBuilder builder = new CustomResourceDefinitionVersionBuilder(item);_visitables.add(builder);this.versions.add(builder);} return (A)this;
    }

    public A removeFromVersions(CustomResourceDefinitionVersion... items){
            for (CustomResourceDefinitionVersion item : items) {CustomResourceDefinitionVersionBuilder builder = new CustomResourceDefinitionVersionBuilder(item);_visitables.remove(builder);if (this.versions != null) {this.versions.remove(builder);}} return (A)this;
    }

    public A removeAllFromVersions(Collection<CustomResourceDefinitionVersion> items){
            for (CustomResourceDefinitionVersion item : items) {CustomResourceDefinitionVersionBuilder builder = new CustomResourceDefinitionVersionBuilder(item);_visitables.remove(builder);if (this.versions != null) {this.versions.remove(builder);}} return (A)this;
    }

    
/**
 * This method has been deprecated, please use method buildVersions instead.
 * @return The buildable object.
 */
@Deprecated public List<CustomResourceDefinitionVersion> getVersions(){
            return build(versions);
    }

    public List<CustomResourceDefinitionVersion> buildVersions(){
            return build(versions);
    }

    public CustomResourceDefinitionVersion buildVersion(int index){
            return this.versions.get(index).build();
    }

    public CustomResourceDefinitionVersion buildFirstVersion(){
            return this.versions.get(0).build();
    }

    public CustomResourceDefinitionVersion buildLastVersion(){
            return this.versions.get(versions.size() - 1).build();
    }

    public CustomResourceDefinitionVersion buildMatchingVersion(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceDefinitionVersionBuilder> predicate){
            for (CustomResourceDefinitionVersionBuilder item: versions) { if(predicate.apply(item)){return item.build();} } return null;
    }

    public A withVersions(List<CustomResourceDefinitionVersion> versions){
            if (this.versions != null) { _visitables.removeAll(this.versions);}
            if (versions != null) {this.versions = new ArrayList<CustomResourceDefinitionVersionBuilder>(); for (CustomResourceDefinitionVersion item : versions){this.addToVersions(item);}} else { this.versions = new ArrayList<CustomResourceDefinitionVersionBuilder>();} return (A) this;
    }

    public A withVersions(CustomResourceDefinitionVersion... versions){
            if (this.versions != null) {this.versions.clear();}
            if (versions != null) {for (CustomResourceDefinitionVersion item :versions){ this.addToVersions(item);}} return (A) this;
    }

    public Boolean hasVersions(){
            return versions != null && !versions.isEmpty();
    }

    public CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersion(){
            return new VersionsNestedImpl();
    }

    public CustomResourceDefinitionSpecFluent.VersionsNested<A> addNewVersionLike(CustomResourceDefinitionVersion item){
            return new VersionsNestedImpl(-1, item);
    }

    public CustomResourceDefinitionSpecFluent.VersionsNested<A> setNewVersionLike(int index,CustomResourceDefinitionVersion item){
            return new VersionsNestedImpl(index, item);
    }

    public CustomResourceDefinitionSpecFluent.VersionsNested<A> editVersion(int index){
            if (versions.size() <= index) throw new RuntimeException("Can't edit versions. Index exceeds size.");
            return setNewVersionLike(index, buildVersion(index));
    }

    public CustomResourceDefinitionSpecFluent.VersionsNested<A> editFirstVersion(){
            if (versions.size() == 0) throw new RuntimeException("Can't edit first versions. The list is empty.");
            return setNewVersionLike(0, buildVersion(0));
    }

    public CustomResourceDefinitionSpecFluent.VersionsNested<A> editLastVersion(){
            int index = versions.size() - 1;
            if (index < 0) throw new RuntimeException("Can't edit last versions. The list is empty.");
            return setNewVersionLike(index, buildVersion(index));
    }

    public CustomResourceDefinitionSpecFluent.VersionsNested<A> editMatchingVersion(io.fabric8.kubernetes.api.builder.Predicate<CustomResourceDefinitionVersionBuilder> predicate){
            int index = -1;
            for (int i=0;i<versions.size();i++) { 
            if (predicate.apply(versions.get(i))) {index = i; break;}
            } 
            if (index < 0) throw new RuntimeException("Can't edit matching versions. No match found.");
            return setNewVersionLike(index, buildVersion(index));
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            CustomResourceDefinitionSpecFluentImpl that = (CustomResourceDefinitionSpecFluentImpl) o;
            if (additionalPrinterColumns != null ? !additionalPrinterColumns.equals(that.additionalPrinterColumns) :that.additionalPrinterColumns != null) return false;
            if (conversion != null ? !conversion.equals(that.conversion) :that.conversion != null) return false;
            if (group != null ? !group.equals(that.group) :that.group != null) return false;
            if (names != null ? !names.equals(that.names) :that.names != null) return false;
            if (scope != null ? !scope.equals(that.scope) :that.scope != null) return false;
            if (subresources != null ? !subresources.equals(that.subresources) :that.subresources != null) return false;
            if (validation != null ? !validation.equals(that.validation) :that.validation != null) return false;
            if (version != null ? !version.equals(that.version) :that.version != null) return false;
            if (versions != null ? !versions.equals(that.versions) :that.versions != null) return false;
            return true;
    }


    public class AdditionalPrinterColumnsNestedImpl<N> extends CustomResourceColumnDefinitionFluentImpl<CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<N>> implements CustomResourceDefinitionSpecFluent.AdditionalPrinterColumnsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceColumnDefinitionBuilder builder;
        private final int index;
    
            AdditionalPrinterColumnsNestedImpl(int index,CustomResourceColumnDefinition item){
                    this.index = index;
                    this.builder = new CustomResourceColumnDefinitionBuilder(this, item);
            }
            AdditionalPrinterColumnsNestedImpl(){
                    this.index = -1;
                    this.builder = new CustomResourceColumnDefinitionBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionSpecFluentImpl.this.setToAdditionalPrinterColumns(index, builder.build());
    }
    public N endAdditionalPrinterColumn(){
            return and();
    }

}
    public class ConversionNestedImpl<N> extends CustomResourceConversionFluentImpl<CustomResourceDefinitionSpecFluent.ConversionNested<N>> implements CustomResourceDefinitionSpecFluent.ConversionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceConversionBuilder builder;
    
            ConversionNestedImpl(CustomResourceConversion item){
                    this.builder = new CustomResourceConversionBuilder(this, item);
            }
            ConversionNestedImpl(){
                    this.builder = new CustomResourceConversionBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionSpecFluentImpl.this.withConversion(builder.build());
    }
    public N endConversion(){
            return and();
    }

}
    public class NamesNestedImpl<N> extends CustomResourceDefinitionNamesFluentImpl<CustomResourceDefinitionSpecFluent.NamesNested<N>> implements CustomResourceDefinitionSpecFluent.NamesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionNamesBuilder builder;
    
            NamesNestedImpl(CustomResourceDefinitionNames item){
                    this.builder = new CustomResourceDefinitionNamesBuilder(this, item);
            }
            NamesNestedImpl(){
                    this.builder = new CustomResourceDefinitionNamesBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionSpecFluentImpl.this.withNames(builder.build());
    }
    public N endNames(){
            return and();
    }

}
    public class SubresourcesNestedImpl<N> extends CustomResourceSubresourcesFluentImpl<CustomResourceDefinitionSpecFluent.SubresourcesNested<N>> implements CustomResourceDefinitionSpecFluent.SubresourcesNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceSubresourcesBuilder builder;
    
            SubresourcesNestedImpl(CustomResourceSubresources item){
                    this.builder = new CustomResourceSubresourcesBuilder(this, item);
            }
            SubresourcesNestedImpl(){
                    this.builder = new CustomResourceSubresourcesBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionSpecFluentImpl.this.withSubresources(builder.build());
    }
    public N endSubresources(){
            return and();
    }

}
    public class ValidationNestedImpl<N> extends CustomResourceValidationFluentImpl<CustomResourceDefinitionSpecFluent.ValidationNested<N>> implements CustomResourceDefinitionSpecFluent.ValidationNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceValidationBuilder builder;
    
            ValidationNestedImpl(CustomResourceValidation item){
                    this.builder = new CustomResourceValidationBuilder(this, item);
            }
            ValidationNestedImpl(){
                    this.builder = new CustomResourceValidationBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionSpecFluentImpl.this.withValidation(builder.build());
    }
    public N endValidation(){
            return and();
    }

}
    public class VersionsNestedImpl<N> extends CustomResourceDefinitionVersionFluentImpl<CustomResourceDefinitionSpecFluent.VersionsNested<N>> implements CustomResourceDefinitionSpecFluent.VersionsNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

            private final CustomResourceDefinitionVersionBuilder builder;
        private final int index;
    
            VersionsNestedImpl(int index,CustomResourceDefinitionVersion item){
                    this.index = index;
                    this.builder = new CustomResourceDefinitionVersionBuilder(this, item);
            }
            VersionsNestedImpl(){
                    this.index = -1;
                    this.builder = new CustomResourceDefinitionVersionBuilder(this);
            }
    
    public N and(){
            return (N) CustomResourceDefinitionSpecFluentImpl.this.setToVersions(index, builder.build());
    }
    public N endVersion(){
            return and();
    }

}


}
