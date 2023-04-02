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

package com.aliyuncs.es_serverless.model.v20220822;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteDataStreamRequest extends RoaAcsRequest<DeleteDataStreamResponse> {
	   

	private String appName;

	private String dataStreamName;
	public DeleteDataStreamRequest() {
		super("es-serverless", "2022-08-22", "DeleteDataStream", "elkxops");
		setUriPattern("/openapi/xops/instances/[appName]/data-streams/[dataStreamName]");
		setMethod(MethodType.DELETE);
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putPathParameter("appName", appName);
		}
	}

	public String getDataStreamName() {
		return this.dataStreamName;
	}

	public void setDataStreamName(String dataStreamName) {
		this.dataStreamName = dataStreamName;
		if(dataStreamName != null){
			putPathParameter("dataStreamName", dataStreamName);
		}
	}

	@Override
	public Class<DeleteDataStreamResponse> getResponseClass() {
		return DeleteDataStreamResponse.class;
	}

}
