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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.privatelink.transform.v20200415.GetVpcEndpointAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVpcEndpointAttributeResponse extends AcsResponse {

	private String payer;

	private String endpointDomain;

	private String requestId;

	private String createTime;

	private Boolean resourceOwner;

	private String endpointBusinessStatus;

	private String endpointDescription;

	private String serviceId;

	private String endpointStatus;

	private String vpcId;

	private String endpointName;

	private Long zonePrivateIpAddressCount;

	private String endpointType;

	private String serviceName;

	private Integer bandwidth;

	private String endpointId;

	private String regionId;

	private String connectionStatus;

	private Boolean zoneAffinityEnabled;

	private String privateServiceName;

	public String getPayer() {
		return this.payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getEndpointDomain() {
		return this.endpointDomain;
	}

	public void setEndpointDomain(String endpointDomain) {
		this.endpointDomain = endpointDomain;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Boolean getResourceOwner() {
		return this.resourceOwner;
	}

	public void setResourceOwner(Boolean resourceOwner) {
		this.resourceOwner = resourceOwner;
	}

	public String getEndpointBusinessStatus() {
		return this.endpointBusinessStatus;
	}

	public void setEndpointBusinessStatus(String endpointBusinessStatus) {
		this.endpointBusinessStatus = endpointBusinessStatus;
	}

	public String getEndpointDescription() {
		return this.endpointDescription;
	}

	public void setEndpointDescription(String endpointDescription) {
		this.endpointDescription = endpointDescription;
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getEndpointStatus() {
		return this.endpointStatus;
	}

	public void setEndpointStatus(String endpointStatus) {
		this.endpointStatus = endpointStatus;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getEndpointName() {
		return this.endpointName;
	}

	public void setEndpointName(String endpointName) {
		this.endpointName = endpointName;
	}

	public Long getZonePrivateIpAddressCount() {
		return this.zonePrivateIpAddressCount;
	}

	public void setZonePrivateIpAddressCount(Long zonePrivateIpAddressCount) {
		this.zonePrivateIpAddressCount = zonePrivateIpAddressCount;
	}

	public String getEndpointType() {
		return this.endpointType;
	}

	public void setEndpointType(String endpointType) {
		this.endpointType = endpointType;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getEndpointId() {
		return this.endpointId;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getConnectionStatus() {
		return this.connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	public Boolean getZoneAffinityEnabled() {
		return this.zoneAffinityEnabled;
	}

	public void setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
		this.zoneAffinityEnabled = zoneAffinityEnabled;
	}

	public String getPrivateServiceName() {
		return this.privateServiceName;
	}

	public void setPrivateServiceName(String privateServiceName) {
		this.privateServiceName = privateServiceName;
	}

	@Override
	public GetVpcEndpointAttributeResponse getInstance(UnmarshallerContext context) {
		return	GetVpcEndpointAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
