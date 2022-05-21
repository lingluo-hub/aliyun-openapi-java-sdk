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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.DeleteModelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteModelResponseUnmarshaller {

	public static DeleteModelResponse unmarshall(DeleteModelResponse deleteModelResponse, UnmarshallerContext _ctx) {
		
		deleteModelResponse.setRequestId(_ctx.stringValue("DeleteModelResponse.RequestId"));
		deleteModelResponse.setSuccess(_ctx.booleanValue("DeleteModelResponse.Success"));
		deleteModelResponse.setCode(_ctx.stringValue("DeleteModelResponse.Code"));
		deleteModelResponse.setErrorMessage(_ctx.stringValue("DeleteModelResponse.ErrorMessage"));
	 
	 	return deleteModelResponse;
	}
}