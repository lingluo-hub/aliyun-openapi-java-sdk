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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.DeleteDomainResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.DeleteDomainResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDomainResponseUnmarshaller {

	public static DeleteDomainResponse unmarshall(DeleteDomainResponse deleteDomainResponse, UnmarshallerContext _ctx) {
		
		deleteDomainResponse.setRequestId(_ctx.stringValue("DeleteDomainResponse.RequestId"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("DeleteDomainResponse.Data.AppId"));
		data.setApplied(_ctx.booleanValue("DeleteDomainResponse.Data.Applied"));
		data.setDeleted(_ctx.booleanValue("DeleteDomainResponse.Data.Deleted"));
		data.setDomain(_ctx.stringValue("DeleteDomainResponse.Data.Domain"));
		data.setEnvId(_ctx.stringValue("DeleteDomainResponse.Data.EnvId"));
		data.setPath(_ctx.stringValue("DeleteDomainResponse.Data.Path"));
		data.setDomainType(_ctx.stringValue("DeleteDomainResponse.Data.DomainType"));
		deleteDomainResponse.setData(data);
	 
	 	return deleteDomainResponse;
	}
}