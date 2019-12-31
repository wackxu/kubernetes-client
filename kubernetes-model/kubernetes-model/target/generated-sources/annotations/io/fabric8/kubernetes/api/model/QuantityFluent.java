package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface QuantityFluent<A extends QuantityFluent<A>> extends Fluent<A>{


    public String getAmount();
    public A withAmount(String amount);
    public Boolean hasAmount();
    public String getFormat();
    public A withFormat(String format);
    public Boolean hasFormat();



}
