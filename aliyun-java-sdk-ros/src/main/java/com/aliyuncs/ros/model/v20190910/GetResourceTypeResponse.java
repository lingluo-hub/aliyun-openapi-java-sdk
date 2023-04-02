/*
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

package com.aliyuncs.ros.model.v20190910;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetResourceTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResourceTypeResponse extends AcsResponse {

	private String requestId;

	private Map<Object,Object> attributes;

	private String resourceType;

	private Map<Object,Object> properties;

	private Boolean supportDriftDetection;

	private Boolean supportScratchDetection;

	private String entityType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(Map<Object,Object> attributes) {
		this.attributes = attributes;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public Map<Object,Object> getProperties() {
		return this.properties;
	}

	public void setProperties(Map<Object,Object> properties) {
		this.properties = properties;
	}

	public Boolean getSupportDriftDetection() {
		return this.supportDriftDetection;
	}

	public void setSupportDriftDetection(Boolean supportDriftDetection) {
		this.supportDriftDetection = supportDriftDetection;
	}

	public Boolean getSupportScratchDetection() {
		return this.supportScratchDetection;
	}

	public void setSupportScratchDetection(Boolean supportScratchDetection) {
		this.supportScratchDetection = supportScratchDetection;
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	@Override
	public GetResourceTypeResponse getInstance(UnmarshallerContext context) {
		return	GetResourceTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
