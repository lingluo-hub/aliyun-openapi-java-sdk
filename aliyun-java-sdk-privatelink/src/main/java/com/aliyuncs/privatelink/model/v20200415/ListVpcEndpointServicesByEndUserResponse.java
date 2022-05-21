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

package com.aliyuncs.privatelink.model.v20200415;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.privatelink.transform.v20200415.ListVpcEndpointServicesByEndUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVpcEndpointServicesByEndUserResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private String maxResults;

	private List<Service> services;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public List<Service> getServices() {
		return this.services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public static class Service {

		private String payer;

		private String serviceDomain;

		private String serviceId;

		private String serviceName;

		private String serviceType;

		private String serviceDescription;

		private String privateServiceName;

		private List<String> zones;

		public String getPayer() {
			return this.payer;
		}

		public void setPayer(String payer) {
			this.payer = payer;
		}

		public String getServiceDomain() {
			return this.serviceDomain;
		}

		public void setServiceDomain(String serviceDomain) {
			this.serviceDomain = serviceDomain;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getServiceDescription() {
			return this.serviceDescription;
		}

		public void setServiceDescription(String serviceDescription) {
			this.serviceDescription = serviceDescription;
		}

		public String getPrivateServiceName() {
			return this.privateServiceName;
		}

		public void setPrivateServiceName(String privateServiceName) {
			this.privateServiceName = privateServiceName;
		}

		public List<String> getZones() {
			return this.zones;
		}

		public void setZones(List<String> zones) {
			this.zones = zones;
		}
	}

	@Override
	public ListVpcEndpointServicesByEndUserResponse getInstance(UnmarshallerContext context) {
		return	ListVpcEndpointServicesByEndUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
