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

package com.aliyuncs.qianzhou.transform.v20211111;

import com.aliyuncs.qianzhou.model.v20211111.HelloResponse;
import com.aliyuncs.qianzhou.model.v20211111.HelloResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class HelloResponseUnmarshaller {

	public static HelloResponse unmarshall(HelloResponse helloResponse, UnmarshallerContext _ctx) {
		
		helloResponse.setRequestId(_ctx.stringValue("HelloResponse.requestId"));
		helloResponse.setCode(_ctx.stringValue("HelloResponse.code"));
		helloResponse.setMsg(_ctx.stringValue("HelloResponse.msg"));

		Data data = new Data();
		data.setDate(_ctx.stringValue("HelloResponse.data.date"));
		data.setName(_ctx.stringValue("HelloResponse.data.name"));
		data.setSuccess(_ctx.booleanValue("HelloResponse.data.success"));
		helloResponse.setData(data);
	 
	 	return helloResponse;
	}
}