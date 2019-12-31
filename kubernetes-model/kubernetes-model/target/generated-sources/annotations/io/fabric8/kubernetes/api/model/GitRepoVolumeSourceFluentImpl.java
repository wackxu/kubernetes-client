package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class GitRepoVolumeSourceFluentImpl<A extends GitRepoVolumeSourceFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GitRepoVolumeSourceFluent<A>{

    private String directory;
    private String repository;
    private String revision;

    public GitRepoVolumeSourceFluentImpl(){
    }
    public GitRepoVolumeSourceFluentImpl(GitRepoVolumeSource instance){
            this.withDirectory(instance.getDirectory()); 
            this.withRepository(instance.getRepository()); 
            this.withRevision(instance.getRevision()); 
    }

    public String getDirectory(){
            return this.directory;
    }

    public A withDirectory(String directory){
            this.directory=directory; return (A) this;
    }

    public Boolean hasDirectory(){
            return this.directory != null;
    }

    public String getRepository(){
            return this.repository;
    }

    public A withRepository(String repository){
            this.repository=repository; return (A) this;
    }

    public Boolean hasRepository(){
            return this.repository != null;
    }

    public String getRevision(){
            return this.revision;
    }

    public A withRevision(String revision){
            this.revision=revision; return (A) this;
    }

    public Boolean hasRevision(){
            return this.revision != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GitRepoVolumeSourceFluentImpl that = (GitRepoVolumeSourceFluentImpl) o;
            if (directory != null ? !directory.equals(that.directory) :that.directory != null) return false;
            if (repository != null ? !repository.equals(that.repository) :that.repository != null) return false;
            if (revision != null ? !revision.equals(that.revision) :that.revision != null) return false;
            return true;
    }




}
