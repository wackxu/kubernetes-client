package io.fabric8.openshift.client;

import java.lang.Integer;
import okhttp3.TlsVersion;
import io.fabric8.kubernetes.client.Config;
import java.lang.Long;
import java.util.List;
import java.lang.String;
import io.sundr.builder.annotations.BuildableReference;
import java.lang.Boolean;
import io.fabric8.kubernetes.client.ConfigFluent;
import java.util.Map;
import io.sundr.builder.annotations.Buildable;

public interface OpenShiftConfigFluent<A extends OpenShiftConfigFluent<A>> extends ConfigFluent<A>{


    public String getOapiVersion();
    public A withOapiVersion(String oapiVersion);
    public Boolean hasOapiVersion();
    public String getOpenShiftUrl();
    public A withOpenShiftUrl(String openShiftUrl);
    public Boolean hasOpenShiftUrl();
    public boolean isDisableApiGroupCheck();
    public A withDisableApiGroupCheck(boolean disableApiGroupCheck);
    public Boolean hasDisableApiGroupCheck();
    public long getBuildTimeout();
    public A withBuildTimeout(long buildTimeout);
    public Boolean hasBuildTimeout();



}
