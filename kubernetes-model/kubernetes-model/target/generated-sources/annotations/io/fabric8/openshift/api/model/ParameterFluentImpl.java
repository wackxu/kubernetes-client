package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ParameterFluentImpl<A extends ParameterFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ParameterFluent<A>{

    private String description;
    private String displayName;
    private String from;
    private String generate;
    private String name;
    private Boolean required;
    private String value;

    public ParameterFluentImpl(){
    }
    public ParameterFluentImpl(Parameter instance){
            this.withDescription(instance.getDescription()); 
            this.withDisplayName(instance.getDisplayName()); 
            this.withFrom(instance.getFrom()); 
            this.withGenerate(instance.getGenerate()); 
            this.withName(instance.getName()); 
            this.withRequired(instance.getRequired()); 
            this.withValue(instance.getValue()); 
    }

    public String getDescription(){
            return this.description;
    }

    public A withDescription(String description){
            this.description=description; return (A) this;
    }

    public Boolean hasDescription(){
            return this.description != null;
    }

    public String getDisplayName(){
            return this.displayName;
    }

    public A withDisplayName(String displayName){
            this.displayName=displayName; return (A) this;
    }

    public Boolean hasDisplayName(){
            return this.displayName != null;
    }

    public String getFrom(){
            return this.from;
    }

    public A withFrom(String from){
            this.from=from; return (A) this;
    }

    public Boolean hasFrom(){
            return this.from != null;
    }

    public String getGenerate(){
            return this.generate;
    }

    public A withGenerate(String generate){
            this.generate=generate; return (A) this;
    }

    public Boolean hasGenerate(){
            return this.generate != null;
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public Boolean isRequired(){
            return this.required;
    }

    public A withRequired(Boolean required){
            this.required=required; return (A) this;
    }

    public Boolean hasRequired(){
            return this.required != null;
    }

    public A withNewRequired(String arg1){
            return (A)withRequired(new Boolean(arg1));
    }

    public A withNewRequired(boolean arg1){
            return (A)withRequired(new Boolean(arg1));
    }

    public String getValue(){
            return this.value;
    }

    public A withValue(String value){
            this.value=value; return (A) this;
    }

    public Boolean hasValue(){
            return this.value != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ParameterFluentImpl that = (ParameterFluentImpl) o;
            if (description != null ? !description.equals(that.description) :that.description != null) return false;
            if (displayName != null ? !displayName.equals(that.displayName) :that.displayName != null) return false;
            if (from != null ? !from.equals(that.from) :that.from != null) return false;
            if (generate != null ? !generate.equals(that.generate) :that.generate != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (required != null ? !required.equals(that.required) :that.required != null) return false;
            if (value != null ? !value.equals(that.value) :that.value != null) return false;
            return true;
    }




}
