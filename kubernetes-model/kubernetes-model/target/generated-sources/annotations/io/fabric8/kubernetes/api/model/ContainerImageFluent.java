package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import javax.validation.Valid;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface ContainerImageFluent<A extends ContainerImageFluent<A>> extends Fluent<A>{


    public A addToNames(int index,String item);
    public A setToNames(int index,String item);
    public A addToNames(String... items);
    public A addAllToNames(Collection<String> items);
    public A removeFromNames(String... items);
    public A removeAllFromNames(Collection<String> items);
    public List<String> getNames();
    public String getName(int index);
    public String getFirstName();
    public String getLastName();
    public String getMatchingName(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withNames(List<String> names);
    public A withNames(String... names);
    public Boolean hasNames();
    public Long getSizeBytes();
    public A withSizeBytes(Long sizeBytes);
    public Boolean hasSizeBytes();
    public A withNewSizeBytes(String arg1);
    public A withNewSizeBytes(long arg1);



}
