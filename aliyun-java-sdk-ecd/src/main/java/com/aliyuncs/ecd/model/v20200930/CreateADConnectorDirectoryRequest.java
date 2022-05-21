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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateADConnectorDirectoryRequest extends RpcAcsRequest<CreateADConnectorDirectoryResponse> {
	   

	private List<String> subDomainDnsAddresss;

	private String subDomainName;

	private String domainPassword;

	private Boolean enableAdminAccess;

	private String desktopAccessType;

	private String domainName;

	private Long specification;

	private String directoryName;

	private List<String> vSwitchIds;

	private Boolean mfaEnabled;

	private String domainUserName;

	private List<String> dnsAddresss;
	public CreateADConnectorDirectoryRequest() {
		super("ecd", "2020-09-30", "CreateADConnectorDirectory");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getSubDomainDnsAddresss() {
		return this.subDomainDnsAddresss;
	}

	public void setSubDomainDnsAddresss(List<String> subDomainDnsAddresss) {
		this.subDomainDnsAddresss = subDomainDnsAddresss;	
		if (subDomainDnsAddresss != null) {
			for (int i = 0; i < subDomainDnsAddresss.size(); i++) {
				putQueryParameter("SubDomainDnsAddress." + (i + 1) , subDomainDnsAddresss.get(i));
			}
		}	
	}

	public String getSubDomainName() {
		return this.subDomainName;
	}

	public void setSubDomainName(String subDomainName) {
		this.subDomainName = subDomainName;
		if(subDomainName != null){
			putQueryParameter("SubDomainName", subDomainName);
		}
	}

	public String getDomainPassword() {
		return this.domainPassword;
	}

	public void setDomainPassword(String domainPassword) {
		this.domainPassword = domainPassword;
		if(domainPassword != null){
			putQueryParameter("DomainPassword", domainPassword);
		}
	}

	public Boolean getEnableAdminAccess() {
		return this.enableAdminAccess;
	}

	public void setEnableAdminAccess(Boolean enableAdminAccess) {
		this.enableAdminAccess = enableAdminAccess;
		if(enableAdminAccess != null){
			putQueryParameter("EnableAdminAccess", enableAdminAccess.toString());
		}
	}

	public String getDesktopAccessType() {
		return this.desktopAccessType;
	}

	public void setDesktopAccessType(String desktopAccessType) {
		this.desktopAccessType = desktopAccessType;
		if(desktopAccessType != null){
			putQueryParameter("DesktopAccessType", desktopAccessType);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getSpecification() {
		return this.specification;
	}

	public void setSpecification(Long specification) {
		this.specification = specification;
		if(specification != null){
			putQueryParameter("Specification", specification.toString());
		}
	}

	public String getDirectoryName() {
		return this.directoryName;
	}

	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
		if(directoryName != null){
			putQueryParameter("DirectoryName", directoryName);
		}
	}

	public List<String> getVSwitchIds() {
		return this.vSwitchIds;
	}

	public void setVSwitchIds(List<String> vSwitchIds) {
		this.vSwitchIds = vSwitchIds;	
		if (vSwitchIds != null) {
			for (int i = 0; i < vSwitchIds.size(); i++) {
				putQueryParameter("VSwitchId." + (i + 1) , vSwitchIds.get(i));
			}
		}	
	}

	public Boolean getMfaEnabled() {
		return this.mfaEnabled;
	}

	public void setMfaEnabled(Boolean mfaEnabled) {
		this.mfaEnabled = mfaEnabled;
		if(mfaEnabled != null){
			putQueryParameter("MfaEnabled", mfaEnabled.toString());
		}
	}

	public String getDomainUserName() {
		return this.domainUserName;
	}

	public void setDomainUserName(String domainUserName) {
		this.domainUserName = domainUserName;
		if(domainUserName != null){
			putQueryParameter("DomainUserName", domainUserName);
		}
	}

	public List<String> getDnsAddresss() {
		return this.dnsAddresss;
	}

	public void setDnsAddresss(List<String> dnsAddresss) {
		this.dnsAddresss = dnsAddresss;	
		if (dnsAddresss != null) {
			for (int i = 0; i < dnsAddresss.size(); i++) {
				putQueryParameter("DnsAddress." + (i + 1) , dnsAddresss.get(i));
			}
		}	
	}

	@Override
	public Class<CreateADConnectorDirectoryResponse> getResponseClass() {
		return CreateADConnectorDirectoryResponse.class;
	}

}
