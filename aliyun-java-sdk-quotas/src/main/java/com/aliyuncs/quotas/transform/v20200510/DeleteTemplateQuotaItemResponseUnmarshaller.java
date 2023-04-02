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

package com.aliyuncs.quotas.transform.v20200510;

import com.aliyuncs.quotas.model.v20200510.DeleteTemplateQuotaItemResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTemplateQuotaItemResponseUnmarshaller {

	public static DeleteTemplateQuotaItemResponse unmarshall(DeleteTemplateQuotaItemResponse deleteTemplateQuotaItemResponse, UnmarshallerContext _ctx) {
		
		deleteTemplateQuotaItemResponse.setRequestId(_ctx.stringValue("DeleteTemplateQuotaItemResponse.RequestId"));
		deleteTemplateQuotaItemResponse.setId(_ctx.stringValue("DeleteTemplateQuotaItemResponse.Id"));
	 
	 	return deleteTemplateQuotaItemResponse;
	}
}