package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ZodObject
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-09T12:10:17.153Z")

public class ZodObject   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("lastUpdatedDate")
  private String lastUpdatedDate = null;

  public ZodObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ZodObject type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "km", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ZodObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "test km object", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ZodObject lastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

   /**
   * Get lastUpdatedDate
   * @return lastUpdatedDate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", required = true, value = "")
  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZodObject zodObject = (ZodObject) o;
    return Objects.equals(this.id, zodObject.id) &&
        Objects.equals(this.type, zodObject.type) &&
        Objects.equals(this.name, zodObject.name) &&
        Objects.equals(this.lastUpdatedDate, zodObject.lastUpdatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, lastUpdatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZodObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

