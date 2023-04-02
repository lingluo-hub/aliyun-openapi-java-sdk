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

package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.SetDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetDomainResponseUnmarshaller {

	public static SetDomainResponse unmarshall(SetDomainResponse setDomainResponse, UnmarshallerContext _ctx) {
		
		setDomainResponse.setRequestId(_ctx.stringValue("SetDomainResponse.RequestId"));
		setDomainResponse.setDomainLegalStatus(_ctx.stringValue("SetDomainResponse.DomainLegalStatus"));
		setDomainResponse.setGroupId(_ctx.stringValue("SetDomainResponse.GroupId"));
		setDomainResponse.setSubDomain(_ctx.stringValue("SetDomainResponse.SubDomain"));
		setDomainResponse.setDomainName(_ctx.stringValue("SetDomainResponse.DomainName"));
		setDomainResponse.setDomainBindingStatus(_ctx.stringValue("SetDomainResponse.DomainBindingStatus"));
		setDomainResponse.setDomainRemark(_ctx.stringValue("SetDomainResponse.DomainRemark"));
		setDomainResponse.setDomainWebSocketStatus(_ctx.stringValue("SetDomainResponse.DomainWebSocketStatus"));
	 
	 	return setDomainResponse;
	}
}