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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeDomainExtensionAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainExtensionAttributeResponse extends AcsResponse {

	private String domain;

	private String requestId;

	private String loadBalancerId;

	private Integer listenerPort;

	private String serverCertificateId;

	private String domainExtensionId;

	private List<Certificate> certificates;

	private List<ServerCertificate> serverCertificates;

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
	}

	public String getServerCertificateId() {
		return this.serverCertificateId;
	}

	public void setServerCertificateId(String serverCertificateId) {
		this.serverCertificateId = serverCertificateId;
	}

	public String getDomainExtensionId() {
		return this.domainExtensionId;
	}

	public void setDomainExtensionId(String domainExtensionId) {
		this.domainExtensionId = domainExtensionId;
	}

	public List<Certificate> getCertificates() {
		return this.certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	public List<ServerCertificate> getServerCertificates() {
		return this.serverCertificates;
	}

	public void setServerCertificates(List<ServerCertificate> serverCertificates) {
		this.serverCertificates = serverCertificates;
	}

	public static class Certificate {

		private String encryptionAlgorithm;

		private String certificateId;

		public String getEncryptionAlgorithm() {
			return this.encryptionAlgorithm;
		}

		public void setEncryptionAlgorithm(String encryptionAlgorithm) {
			this.encryptionAlgorithm = encryptionAlgorithm;
		}

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}
	}

	public static class ServerCertificate {

		private String encryptionAlgorithm;

		private String standardType;

		private String bindingType;

		private String certificateId;

		public String getEncryptionAlgorithm() {
			return this.encryptionAlgorithm;
		}

		public void setEncryptionAlgorithm(String encryptionAlgorithm) {
			this.encryptionAlgorithm = encryptionAlgorithm;
		}

		public String getStandardType() {
			return this.standardType;
		}

		public void setStandardType(String standardType) {
			this.standardType = standardType;
		}

		public String getBindingType() {
			return this.bindingType;
		}

		public void setBindingType(String bindingType) {
			this.bindingType = bindingType;
		}

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}
	}

	@Override
	public DescribeDomainExtensionAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainExtensionAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
