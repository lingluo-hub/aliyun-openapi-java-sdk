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

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.ListServicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServicesResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String errorMsg;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private String clusterIP;

	private List<ServiceInstance> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getClusterIP() {
		return this.clusterIP;
	}

	public void setClusterIP(String clusterIP) {
		this.clusterIP = clusterIP;
	}

	public List<ServiceInstance> getData() {
		return this.data;
	}

	public void setData(List<ServiceInstance> data) {
		this.data = data;
	}

	public static class ServiceInstance {

		private Boolean headless;

		private Long appId;

		private Long serviceId;

		private String k8sServiceId;

		private String serviceType;

		private Long envId;

		private String name;

		private String clusterIP;

		private List<ServicePortMapping> portMappings;

		public Boolean getHeadless() {
			return this.headless;
		}

		public void setHeadless(Boolean headless) {
			this.headless = headless;
		}

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public Long getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(Long serviceId) {
			this.serviceId = serviceId;
		}

		public String getK8sServiceId() {
			return this.k8sServiceId;
		}

		public void setK8sServiceId(String k8sServiceId) {
			this.k8sServiceId = k8sServiceId;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public Long getEnvId() {
			return this.envId;
		}

		public void setEnvId(Long envId) {
			this.envId = envId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getClusterIP() {
			return this.clusterIP;
		}

		public void setClusterIP(String clusterIP) {
			this.clusterIP = clusterIP;
		}

		public List<ServicePortMapping> getPortMappings() {
			return this.portMappings;
		}

		public void setPortMappings(List<ServicePortMapping> portMappings) {
			this.portMappings = portMappings;
		}

		public static class ServicePortMapping {

			private String targetPort;

			private Integer nodePort;

			private Integer port;

			private String name;

			private String protocol;

			public String getTargetPort() {
				return this.targetPort;
			}

			public void setTargetPort(String targetPort) {
				this.targetPort = targetPort;
			}

			public Integer getNodePort() {
				return this.nodePort;
			}

			public void setNodePort(Integer nodePort) {
				this.nodePort = nodePort;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}
		}
	}

	@Override
	public ListServicesResponse getInstance(UnmarshallerContext context) {
		return	ListServicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
