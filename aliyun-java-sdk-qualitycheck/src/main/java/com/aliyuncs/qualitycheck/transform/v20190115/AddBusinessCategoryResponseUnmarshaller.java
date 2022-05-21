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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.AddBusinessCategoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddBusinessCategoryResponseUnmarshaller {

	public static AddBusinessCategoryResponse unmarshall(AddBusinessCategoryResponse addBusinessCategoryResponse, UnmarshallerContext _ctx) {
		
		addBusinessCategoryResponse.setRequestId(_ctx.stringValue("AddBusinessCategoryResponse.RequestId"));
		addBusinessCategoryResponse.setCode(_ctx.stringValue("AddBusinessCategoryResponse.Code"));
		addBusinessCategoryResponse.setMessage(_ctx.stringValue("AddBusinessCategoryResponse.Message"));
		addBusinessCategoryResponse.setData(_ctx.stringValue("AddBusinessCategoryResponse.Data"));
		addBusinessCategoryResponse.setSuccess(_ctx.booleanValue("AddBusinessCategoryResponse.Success"));
	 
	 	return addBusinessCategoryResponse;
	}
}