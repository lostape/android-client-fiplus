package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class Activity {
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("description")
  private String description = null;
  @JsonProperty("max_attendees")
  private Integer max_attendees = null;
  @JsonProperty("creator")
  private String creator = null;
  @JsonProperty("tagged_interests")
  private List<String> tagged_interests = new ArrayList<String>();
  @JsonProperty("suggested_times")
  private List<Long> suggested_times = new ArrayList<Long>();
  @JsonProperty("suggested_locations")
  private List<Float> suggested_locations = new ArrayList<Float>();
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getMax_attendees() {
    return max_attendees;
  }
  public void setMax_attendees(Integer max_attendees) {
    this.max_attendees = max_attendees;
  }

  public String getCreator() {
    return creator;
  }
  public void setCreator(String creator) {
    this.creator = creator;
  }

  public List<String> getTagged_interests() {
    return tagged_interests;
  }
  public void setTagged_interests(List<String> tagged_interests) {
    this.tagged_interests = tagged_interests;
  }

  public List<Long> getSuggested_times() {
    return suggested_times;
  }
  public void setSuggested_times(List<Long> suggested_times) {
    this.suggested_times = suggested_times;
  }

  public List<Float> getSuggested_locations() {
    return suggested_locations;
  }
  public void setSuggested_locations(List<Float> suggested_locations) {
    this.suggested_locations = suggested_locations;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  max_attendees: ").append(max_attendees).append("\n");
    sb.append("  creator: ").append(creator).append("\n");
    sb.append("  tagged_interests: ").append(tagged_interests).append("\n");
    sb.append("  suggested_times: ").append(suggested_times).append("\n");
    sb.append("  suggested_locations: ").append(suggested_locations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
