/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 8.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package pb.locationintelligence.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * CandidateRangeUnit
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-09T11:29:24.666+05:30")
public class CandidateRangeUnit   {
  @SerializedName("placeName")
  private String placeName = null;

  @SerializedName("unitType")
  private String unitType = null;

  @SerializedName("highUnitValue")
  private String highUnitValue = null;

  @SerializedName("lowUnitValue")
  private String lowUnitValue = null;

  @SerializedName("customValues")
  private Map<String, Object> customValues = new HashMap<String, Object>();

  public CandidateRangeUnit placeName(String placeName) {
    this.placeName = placeName;
    return this;
  }

   /**
   * Get placeName
   * @return placeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlaceName() {
    return placeName;
  }

  public void setPlaceName(String placeName) {
    this.placeName = placeName;
  }

  public CandidateRangeUnit unitType(String unitType) {
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUnitType() {
    return unitType;
  }

  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }

  public CandidateRangeUnit highUnitValue(String highUnitValue) {
    this.highUnitValue = highUnitValue;
    return this;
  }

   /**
   * Get highUnitValue
   * @return highUnitValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHighUnitValue() {
    return highUnitValue;
  }

  public void setHighUnitValue(String highUnitValue) {
    this.highUnitValue = highUnitValue;
  }

  public CandidateRangeUnit lowUnitValue(String lowUnitValue) {
    this.lowUnitValue = lowUnitValue;
    return this;
  }

   /**
   * Get lowUnitValue
   * @return lowUnitValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLowUnitValue() {
    return lowUnitValue;
  }

  public void setLowUnitValue(String lowUnitValue) {
    this.lowUnitValue = lowUnitValue;
  }

  public CandidateRangeUnit customValues(Map<String, Object> customValues) {
    this.customValues = customValues;
    return this;
  }

   /**
   * Get customValues
   * @return customValues
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getCustomValues() {
    return customValues;
  }

  public void setCustomValues(Map<String, Object> customValues) {
    this.customValues = customValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateRangeUnit candidateRangeUnit = (CandidateRangeUnit) o;
    return Objects.equals(this.placeName, candidateRangeUnit.placeName) &&
        Objects.equals(this.unitType, candidateRangeUnit.unitType) &&
        Objects.equals(this.highUnitValue, candidateRangeUnit.highUnitValue) &&
        Objects.equals(this.lowUnitValue, candidateRangeUnit.lowUnitValue) &&
        Objects.equals(this.customValues, candidateRangeUnit.customValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeName, unitType, highUnitValue, lowUnitValue, customValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateRangeUnit {\n");
    
    sb.append("    placeName: ").append(toIndentedString(placeName)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    highUnitValue: ").append(toIndentedString(highUnitValue)).append("\n");
    sb.append("    lowUnitValue: ").append(toIndentedString(lowUnitValue)).append("\n");
    sb.append("    customValues: ").append(toIndentedString(customValues)).append("\n");
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
