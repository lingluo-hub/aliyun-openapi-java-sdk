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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.CreateDcdnSLSRealTimeLogDeliveryResponse;
import com.aliyuncs.dcdn.model.v20180115.CreateDcdnSLSRealTimeLogDeliveryResponse.Domains;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDcdnSLSRealTimeLogDeliveryResponseUnmarshaller {

	public static CreateDcdnSLSRealTimeLogDeliveryResponse unmarshall(CreateDcdnSLSRealTimeLogDeliveryResponse createDcdnSLSRealTimeLogDeliveryResponse, UnmarshallerContext _ctx) {
		
		createDcdnSLSRealTimeLogDeliveryResponse.setRequestId(_ctx.stringValue("CreateDcdnSLSRealTimeLogDeliveryResponse.RequestId"));

		List<Domains> content = new ArrayList<Domains>();
		for (int i = 0; i < _ctx.lengthValue("CreateDcdnSLSRealTimeLogDeliveryResponse.Content.Length"); i++) {
			Domains domains = new Domains();
			domains.setDomainName(_ctx.stringValue("CreateDcdnSLSRealTimeLogDeliveryResponse.Content["+ i +"].DomainName"));
			domains.setRegion(_ctx.stringValue("CreateDcdnSLSRealTimeLogDeliveryResponse.Content["+ i +"].Region"));
			domains.setStatus(_ctx.stringValue("CreateDcdnSLSRealTimeLogDeliveryResponse.Content["+ i +"].Status"));
			domains.setDesc(_ctx.stringValue("CreateDcdnSLSRealTimeLogDeliveryResponse.Content["+ i +"].Desc"));

			content.add(domains);
		}
		createDcdnSLSRealTimeLogDeliveryResponse.setContent(content);
	 
	 	return createDcdnSLSRealTimeLogDeliveryResponse;
	}
}