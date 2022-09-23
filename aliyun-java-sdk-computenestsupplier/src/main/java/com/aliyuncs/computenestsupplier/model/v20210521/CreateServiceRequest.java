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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateServiceRequest extends RpcAcsRequest<CreateServiceResponse> {
	   

	private String alarmMetadata;

	private String clientToken;

	private String policyNames;

	private Long duration;

	private Long trialDuration;

	private String shareType;

	private List<Tag> tags;

	private List<RequestTag> requestTags;

	private String upgradeMetadata;

	private String saleMetadata;

	private String deployMetadata;

	private String serviceType;

	private Boolean isSupportOperated;

	private String tenantType;

	private List<ServiceInfo> serviceInfos;

	private String serviceId;

	private String versionName;

	private String deployType;
	public CreateServiceRequest() {
		super("ComputeNestSupplier", "2021-05-21", "CreateService");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAlarmMetadata() {
		return this.alarmMetadata;
	}

	public void setAlarmMetadata(String alarmMetadata) {
		this.alarmMetadata = alarmMetadata;
		if(alarmMetadata != null){
			putQueryParameter("AlarmMetadata", alarmMetadata);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getPolicyNames() {
		return this.policyNames;
	}

	public void setPolicyNames(String policyNames) {
		this.policyNames = policyNames;
		if(policyNames != null){
			putQueryParameter("PolicyNames", policyNames);
		}
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
		}
	}

	public Long getTrialDuration() {
		return this.trialDuration;
	}

	public void setTrialDuration(Long trialDuration) {
		this.trialDuration = trialDuration;
		if(trialDuration != null){
			putQueryParameter("TrialDuration", trialDuration.toString());
		}
	}

	public String getShareType() {
		return this.shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
		if(shareType != null){
			putQueryParameter("ShareType", shareType);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public List<RequestTag> getRequestTags() {
		return this.requestTags;
	}

	public void setRequestTags(List<RequestTag> requestTags) {
		this.requestTags = requestTags;	
		if (requestTags != null) {
			for (int depth1 = 0; depth1 < requestTags.size(); depth1++) {
				putQueryParameter("RequestTag." + (depth1 + 1) + ".Value" , requestTags.get(depth1).getValue());
				putQueryParameter("RequestTag." + (depth1 + 1) + ".Key" , requestTags.get(depth1).getKey());
			}
		}	
	}

	public String getUpgradeMetadata() {
		return this.upgradeMetadata;
	}

	public void setUpgradeMetadata(String upgradeMetadata) {
		this.upgradeMetadata = upgradeMetadata;
		if(upgradeMetadata != null){
			putQueryParameter("UpgradeMetadata", upgradeMetadata);
		}
	}

	public String getSaleMetadata() {
		return this.saleMetadata;
	}

	public void setSaleMetadata(String saleMetadata) {
		this.saleMetadata = saleMetadata;
		if(saleMetadata != null){
			putQueryParameter("SaleMetadata", saleMetadata);
		}
	}

	public String getDeployMetadata() {
		return this.deployMetadata;
	}

	public void setDeployMetadata(String deployMetadata) {
		this.deployMetadata = deployMetadata;
		if(deployMetadata != null){
			putQueryParameter("DeployMetadata", deployMetadata);
		}
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putQueryParameter("ServiceType", serviceType);
		}
	}

	public Boolean getIsSupportOperated() {
		return this.isSupportOperated;
	}

	public void setIsSupportOperated(Boolean isSupportOperated) {
		this.isSupportOperated = isSupportOperated;
		if(isSupportOperated != null){
			putQueryParameter("IsSupportOperated", isSupportOperated.toString());
		}
	}

	public String getTenantType() {
		return this.tenantType;
	}

	public void setTenantType(String tenantType) {
		this.tenantType = tenantType;
		if(tenantType != null){
			putQueryParameter("TenantType", tenantType);
		}
	}

	public List<ServiceInfo> getServiceInfos() {
		return this.serviceInfos;
	}

	public void setServiceInfos(List<ServiceInfo> serviceInfos) {
		this.serviceInfos = serviceInfos;	
		if (serviceInfos != null) {
			for (int depth1 = 0; depth1 < serviceInfos.size(); depth1++) {
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".ShortDescription" , serviceInfos.get(depth1).getShortDescription());
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".Image" , serviceInfos.get(depth1).getImage());
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".Name" , serviceInfos.get(depth1).getName());
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".Locale" , serviceInfos.get(depth1).getLocale());
			}
		}	
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
		if(versionName != null){
			putQueryParameter("VersionName", versionName);
		}
	}

	public String getDeployType() {
		return this.deployType;
	}

	public void setDeployType(String deployType) {
		this.deployType = deployType;
		if(deployType != null){
			putQueryParameter("DeployType", deployType);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class RequestTag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class ServiceInfo {

		private String shortDescription;

		private String image;

		private String name;

		private String locale;

		public String getShortDescription() {
			return this.shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocale() {
			return this.locale;
		}

		public void setLocale(String locale) {
			this.locale = locale;
		}
	}

	@Override
	public Class<CreateServiceResponse> getResponseClass() {
		return CreateServiceResponse.class;
	}

}
