package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class TopologySelectorLabelRequirementFluentImpl<A extends TopologySelectorLabelRequirementFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TopologySelectorLabelRequirementFluent<A>{

    private String key;
    private List<String> values;

    public TopologySelectorLabelRequirementFluentImpl(){
    }
    public TopologySelectorLabelRequirementFluentImpl(TopologySelectorLabelRequirement instance){
            this.withKey(instance.getKey()); 
            this.withValues(instance.getValues()); 
    }

    public String getKey(){
            return this.key;
    }

    public A withKey(String key){
            this.key=key; return (A) this;
    }

    public Boolean hasKey(){
            return this.key != null;
    }

    public A addToValues(int index,String item){
            if (this.values == null) {this.values = new ArrayList<String>();}
            this.values.add(index, item);
            return (A)this;
    }

    public A setToValues(int index,String item){
            if (this.values == null) {this.values = new ArrayList<String>();}
            this.values.set(index, item); return (A)this;
    }

    public A addToValues(String... items){
            if (this.values == null) {this.values = new ArrayList<String>();}
            for (String item : items) {this.values.add(item);} return (A)this;
    }

    public A addAllToValues(Collection<String> items){
            if (this.values == null) {this.values = new ArrayList<String>();}
            for (String item : items) {this.values.add(item);} return (A)this;
    }

    public A removeFromValues(String... items){
            for (String item : items) {if (this.values!= null){ this.values.remove(item);}} return (A)this;
    }

    public A removeAllFromValues(Collection<String> items){
            for (String item : items) {if (this.values!= null){ this.values.remove(item);}} return (A)this;
    }

    public List<String> getValues(){
            return this.values;
    }

    public String getValue(int index){
            return this.values.get(index);
    }

    public String getFirstValue(){
            return this.values.get(0);
    }

    public String getLastValue(){
            return this.values.get(values.size() - 1);
    }

    public String getMatchingValue(io.fabric8.kubernetes.api.builder.Predicate<String> predicate){
            for (String item: values) { if(predicate.apply(item)){return item;} } return null;
    }

    public A withValues(List<String> values){
            if (this.values != null) { _visitables.removeAll(this.values);}
            if (values != null) {this.values = new ArrayList<String>(); for (String item : values){this.addToValues(item);}} else { this.values = new ArrayList<String>();} return (A) this;
    }

    public A withValues(String... values){
            if (this.values != null) {this.values.clear();}
            if (values != null) {for (String item :values){ this.addToValues(item);}} return (A) this;
    }

    public Boolean hasValues(){
            return values != null && !values.isEmpty();
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TopologySelectorLabelRequirementFluentImpl that = (TopologySelectorLabelRequirementFluentImpl) o;
            if (key != null ? !key.equals(that.key) :that.key != null) return false;
            if (values != null ? !values.equals(that.values) :that.values != null) return false;
            return true;
    }




}
