package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class QuantityFluentImpl<A extends QuantityFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements QuantityFluent<A>{

    private String amount;
    private String format;

    public QuantityFluentImpl(){
    }
    public QuantityFluentImpl(Quantity instance){
            this.withAmount(instance.getAmount()); 
            this.withFormat(instance.getFormat());

    }

    public String getAmount(){
            return this.amount;
    }

    public A withAmount(String amount){
            this.amount=amount; return (A) this;
    }

    public Boolean hasAmount(){
            return this.amount != null;
    }

    public String getFormat(){
            return this.format;
    }

    public A withFormat(String format){
            this.format=format; return (A) this;
    }

    public Boolean hasFormat(){
            return this.format != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            QuantityFluentImpl that = (QuantityFluentImpl) o;
            if (amount != null ? !amount.equals(that.amount) :that.amount != null) return false;
            if (format != null ? !format.equals(that.format) :that.format != null) return false;
            return true;
    }




}
