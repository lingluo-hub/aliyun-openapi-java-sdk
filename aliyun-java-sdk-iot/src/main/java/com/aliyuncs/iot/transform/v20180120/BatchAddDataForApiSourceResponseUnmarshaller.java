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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.BatchAddDataForApiSourceResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchAddDataForApiSourceResponseUnmarshaller {

	public static BatchAddDataForApiSourceResponse unmarshall(BatchAddDataForApiSourceResponse batchAddDataForApiSourceResponse, UnmarshallerContext _ctx) {
		
		batchAddDataForApiSourceResponse.setRequestId(_ctx.stringValue("BatchAddDataForApiSourceResponse.RequestId"));
		batchAddDataForApiSourceResponse.setSuccess(_ctx.booleanValue("BatchAddDataForApiSourceResponse.Success"));
		batchAddDataForApiSourceResponse.setCode(_ctx.stringValue("BatchAddDataForApiSourceResponse.Code"));
		batchAddDataForApiSourceResponse.setErrorMessage(_ctx.stringValue("BatchAddDataForApiSourceResponse.ErrorMessage"));
		batchAddDataForApiSourceResponse.setData(_ctx.mapValue("BatchAddDataForApiSourceResponse.Data"));
	 
	 	return batchAddDataForApiSourceResponse;
	}
}