package com.javahi;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class sampleconfiguration {
    @NotNull
    private String name;

    @Min(1)
    @Max(105)
    private int age;

    @JsonProperty(value = "Pradeep")
    private String getName() {
        return name;
    }

    @JsonProperty
    public void setName(String name) {
        this.name = getName();
    }

    @JsonProperty(value = "24")
    private int getAge() {
        return age;
    }

    @JsonProperty
    public void setAge(int age) {
        this.age = getAge();
    }
}
   class configuration extends sampleconfiguration{
       @NotNull
       @Valid
       private DataSourceFactory dataSourceFactory
               = new DataSourceFactory();


       /**
        * A getter for the database factory.
        *
        * @return An instance of database factory deserialized from the
        * configuration file passed as a command-line argument to the application.
        */
       @JsonProperty("database")
       public DataSourceFactory getDataSourceFactory() {
           return dataSourceFactory;

   }}