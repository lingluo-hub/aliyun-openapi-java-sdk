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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.DeleteServiceResponse;
import com.aliyuncs.viapi_regen.model.v20211119.DeleteServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteServiceResponseUnmarshaller {

	public static DeleteServiceResponse unmarshall(DeleteServiceResponse deleteServiceResponse, UnmarshallerContext _ctx) {
		
		deleteServiceResponse.setRequestId(_ctx.stringValue("DeleteServiceResponse.RequestId"));
		deleteServiceResponse.setMessage(_ctx.stringValue("DeleteServiceResponse.Message"));
		deleteServiceResponse.setCode(_ctx.stringValue("DeleteServiceResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("DeleteServiceResponse.Data.Id"));
		deleteServiceResponse.setData(data);
	 
	 	return deleteServiceResponse;
	}
}