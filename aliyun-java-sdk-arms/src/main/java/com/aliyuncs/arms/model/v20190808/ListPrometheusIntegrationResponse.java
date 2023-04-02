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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListPrometheusIntegrationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrometheusIntegrationResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer code;

	private List<Instance> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<Instance> getData() {
		return this.data;
	}

	public void setData(List<Instance> data) {
		this.data = data;
	}

	public static class Instance {

		private String clusterId;

		private Boolean showDescribe;

		private Boolean needUpgrade;

		private String instanceName;

		private String exporterType;

		private String integrationType;

		private Long instanceId;

		private String version;

		private String target;

		private Boolean canDelete;

		private Boolean canEditor;

		private String status;

		private String containerName;

		private String namespace;

		private String podName;

		private String describe;

		private Boolean showLog;

		private String param;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Boolean getShowDescribe() {
			return this.showDescribe;
		}

		public void setShowDescribe(Boolean showDescribe) {
			this.showDescribe = showDescribe;
		}

		public Boolean getNeedUpgrade() {
			return this.needUpgrade;
		}

		public void setNeedUpgrade(Boolean needUpgrade) {
			this.needUpgrade = needUpgrade;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getExporterType() {
			return this.exporterType;
		}

		public void setExporterType(String exporterType) {
			this.exporterType = exporterType;
		}

		public String getIntegrationType() {
			return this.integrationType;
		}

		public void setIntegrationType(String integrationType) {
			this.integrationType = integrationType;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public Boolean getCanDelete() {
			return this.canDelete;
		}

		public void setCanDelete(Boolean canDelete) {
			this.canDelete = canDelete;
		}

		public Boolean getCanEditor() {
			return this.canEditor;
		}

		public void setCanEditor(Boolean canEditor) {
			this.canEditor = canEditor;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getContainerName() {
			return this.containerName;
		}

		public void setContainerName(String containerName) {
			this.containerName = containerName;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getPodName() {
			return this.podName;
		}

		public void setPodName(String podName) {
			this.podName = podName;
		}

		public String getDescribe() {
			return this.describe;
		}

		public void setDescribe(String describe) {
			this.describe = describe;
		}

		public Boolean getShowLog() {
			return this.showLog;
		}

		public void setShowLog(Boolean showLog) {
			this.showLog = showLog;
		}

		public String getParam() {
			return this.param;
		}

		public void setParam(String param) {
			this.param = param;
		}
	}

	@Override
	public ListPrometheusIntegrationResponse getInstance(UnmarshallerContext context) {
		return	ListPrometheusIntegrationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
