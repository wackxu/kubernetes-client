package io.fabric8.kubernetes.api.model.version;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;

public interface InfoFluent<A extends InfoFluent<A>> extends Fluent<A>{


    public String getBuildDate();
    public A withBuildDate(String buildDate);
    public Boolean hasBuildDate();
    public String getCompiler();
    public A withCompiler(String compiler);
    public Boolean hasCompiler();
    public String getGitCommit();
    public A withGitCommit(String gitCommit);
    public Boolean hasGitCommit();
    public String getGitTreeState();
    public A withGitTreeState(String gitTreeState);
    public Boolean hasGitTreeState();
    public String getGitVersion();
    public A withGitVersion(String gitVersion);
    public Boolean hasGitVersion();
    public String getGoVersion();
    public A withGoVersion(String goVersion);
    public Boolean hasGoVersion();
    public String getMajor();
    public A withMajor(String major);
    public Boolean hasMajor();
    public String getMinor();
    public A withMinor(String minor);
    public Boolean hasMinor();
    public String getPlatform();
    public A withPlatform(String platform);
    public Boolean hasPlatform();



}
