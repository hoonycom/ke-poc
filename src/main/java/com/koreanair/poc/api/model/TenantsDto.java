package com.koreanair.poc.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TenantsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class TenantsDto   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("registerdate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime registerdate;

  @JsonProperty("updateddate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updateddate;

  public TenantsDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(example = "1", value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TenantsDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "test 2022", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TenantsDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(example = "for test", value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TenantsDto registerdate(OffsetDateTime registerdate) {
    this.registerdate = registerdate;
    return this;
  }

  /**
   * Tenant register date/time
   * @return registerdate
  */
  @ApiModelProperty(example = "2022-07-28T05:01:43+09:00", value = "Tenant register date/time")

  @Valid

  public OffsetDateTime getRegisterdate() {
    return registerdate;
  }

  public void setRegisterdate(OffsetDateTime registerdate) {
    this.registerdate = registerdate;
  }

  public TenantsDto updateddate(OffsetDateTime updateddate) {
    this.updateddate = updateddate;
    return this;
  }

  /**
   * Tenant update date/time
   * @return updateddate
  */
  @ApiModelProperty(example = "2022-07-28T05:01:43+09:00", value = "Tenant update date/time")

  @Valid

  public OffsetDateTime getUpdateddate() {
    return updateddate;
  }

  public void setUpdateddate(OffsetDateTime updateddate) {
    this.updateddate = updateddate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantsDto tenantsDto = (TenantsDto) o;
    return Objects.equals(this.id, tenantsDto.id) &&
        Objects.equals(this.name, tenantsDto.name) &&
        Objects.equals(this.description, tenantsDto.description) &&
        Objects.equals(this.registerdate, tenantsDto.registerdate) &&
        Objects.equals(this.updateddate, tenantsDto.updateddate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, registerdate, updateddate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantsDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    registerdate: ").append(toIndentedString(registerdate)).append("\n");
    sb.append("    updateddate: ").append(toIndentedString(updateddate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

