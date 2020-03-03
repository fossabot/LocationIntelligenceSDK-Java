/**
 * Location Intelligence APIs
 * Incorporate our extensive geodata into everyday applications, business processes and workflows.
 *
 * OpenAPI spec version: 8.5.0
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
import pb.locationintelligence.model.Geometry;


/**
 * GeoTaxLocations
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T15:28:20.703+05:30")
public class GeoTaxLocations   {
  @SerializedName("geometry")
  private Geometry geometry = null;

  @SerializedName("purchaseAmount")
  private String purchaseAmount = null;

  @SerializedName("objectId")
  private String objectId = null;

  public GeoTaxLocations geometry(Geometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }

  public GeoTaxLocations purchaseAmount(String purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
    return this;
  }

   /**
   * Get purchaseAmount
   * @return purchaseAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPurchaseAmount() {
    return purchaseAmount;
  }

  public void setPurchaseAmount(String purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
  }

  public GeoTaxLocations objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoTaxLocations geoTaxLocations = (GeoTaxLocations) o;
    return Objects.equals(this.geometry, geoTaxLocations.geometry) &&
        Objects.equals(this.purchaseAmount, geoTaxLocations.purchaseAmount) &&
        Objects.equals(this.objectId, geoTaxLocations.objectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometry, purchaseAmount, objectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoTaxLocations {\n");
    
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    purchaseAmount: ").append(toIndentedString(purchaseAmount)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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

