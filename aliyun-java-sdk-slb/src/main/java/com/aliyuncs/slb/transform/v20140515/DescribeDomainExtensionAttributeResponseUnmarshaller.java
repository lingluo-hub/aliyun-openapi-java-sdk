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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeDomainExtensionAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeDomainExtensionAttributeResponse.Certificate;
import com.aliyuncs.slb.model.v20140515.DescribeDomainExtensionAttributeResponse.ServerCertificate;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainExtensionAttributeResponseUnmarshaller {

	public static DescribeDomainExtensionAttributeResponse unmarshall(DescribeDomainExtensionAttributeResponse describeDomainExtensionAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDomainExtensionAttributeResponse.setRequestId(_ctx.stringValue("DescribeDomainExtensionAttributeResponse.RequestId"));
		describeDomainExtensionAttributeResponse.setDomain(_ctx.stringValue("DescribeDomainExtensionAttributeResponse.Domain"));
		describeDomainExtensionAttributeResponse.setLoadBalancerId(_ctx.stringValue("DescribeDomainExtensionAttributeResponse.LoadBalancerId"));
		describeDomainExtensionAttributeResponse.setListenerPort(_ctx.integerValue("DescribeDomainExtensionAttributeResponse.ListenerPort"));
		describeDomainExtensionAttributeResponse.setServerCertificateId(_ctx.stringValue("DescribeDomainExtensionAttributeResponse.ServerCertificateId"));
		describeDomainExtensionAttributeResponse.setDomainExtensionId(_ctx.stringValue("DescribeDomainExtensionAttributeResponse.DomainExtensionId"));

		List<Certificate> certificates = new ArrayList<Certificate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainExtensionAttributeResponse.Certificates.Length"); i++) {
			Certificate certificate = new Certificate();
			certificate.setEncryptionAlgorithm(_ctx.stringValue("DescribeDomainExtensionAttributeResponse.Certificates["+ i +"].EncryptionAlgorithm"));
			certificate.setCertificateId(_ctx.stringValue("DescribeDomainExtensionAttributeResponse.Certificates["+ i +"].CertificateId"));

			certificates.add(certificate);
		}
		describeDomainExtensionAttributeResponse.setCertificates(certificates);

		List<ServerCertificate> serverCertificates = new ArrayList<ServerCertificate>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainExtensionAttributeResponse.ServerCertificates.Length"); i++) {
			ServerCertificate serverCertificate = new ServerCertificate();
			serverCertificate.setEncryptionAlgorithm(_ctx.stringValue("DescribeDomainExtensionAttributeResponse.ServerCertificates["+ i +"].EncryptionAlgorithm"));
			serverCertificate.setStandardType(_ctx.stringValue("DescribeDomainExtensionAttributeResponse.ServerCertificates["+ i +"].StandardType"));
			serverCertificate.setBindingType(_ctx.stringValue("DescribeDomainExtensionAttributeResponse.ServerCertificates["+ i +"].BindingType"));
			serverCertificate.setCertificateId(_ctx.stringValue("DescribeDomainExtensionAttributeResponse.ServerCertificates["+ i +"].CertificateId"));

			serverCertificates.add(serverCertificate);
		}
		describeDomainExtensionAttributeResponse.setServerCertificates(serverCertificates);
	 
	 	return describeDomainExtensionAttributeResponse;
	}
}