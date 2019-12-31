package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Integer;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface FCVolumeSourceFluent<A extends FCVolumeSourceFluent<A>> extends Fluent<A>{


    public String getFsType();
    public A withFsType(String fsType);
    public Boolean hasFsType();
    public Integer getLun();
    public A withLun(Integer lun);
    public Boolean hasLun();
    public Boolean isReadOnly();
    public A withReadOnly(Boolean readOnly);
    public Boolean hasReadOnly();
    public A withNewReadOnly(String arg1);
    public A withNewReadOnly(boolean arg1);
    public A addToTargetWWNs(int index,String item);
    public A setToTargetWWNs(int index,String item);
    public A addToTargetWWNs(String... items);
    public A addAllToTargetWWNs(Collection<String> items);
    public A removeFromTargetWWNs(String... items);
    public A removeAllFromTargetWWNs(Collection<String> items);
    public List<String> getTargetWWNs();
    public String getTargetWWN(int index);
    public String getFirstTargetWWN();
    public String getLastTargetWWN();
    public String getMatchingTargetWWN(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withTargetWWNs(List<String> targetWWNs);
    public A withTargetWWNs(String... targetWWNs);
    public Boolean hasTargetWWNs();
    public A addToWwids(int index,String item);
    public A setToWwids(int index,String item);
    public A addToWwids(String... items);
    public A addAllToWwids(Collection<String> items);
    public A removeFromWwids(String... items);
    public A removeAllFromWwids(Collection<String> items);
    public List<String> getWwids();
    public String getWwid(int index);
    public String getFirstWwid();
    public String getLastWwid();
    public String getMatchingWwid(io.fabric8.kubernetes.api.builder.Predicate<String> predicate);
    public A withWwids(List<String> wwids);
    public A withWwids(String... wwids);
    public Boolean hasWwids();



}
